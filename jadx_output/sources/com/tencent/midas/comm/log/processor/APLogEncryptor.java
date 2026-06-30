package com.tencent.midas.comm.log.processor;

/* loaded from: classes13.dex */
public class APLogEncryptor {
    private static java.lang.String ENCRYPT_KEY = "}VjZtoJF;dE+7iJs";
    private static final byte MAGIC_END = 0;
    private static final byte MAGIC_START = 2;
    private static byte PROTOCOL_VERSION = 1;
    private static byte[] header = new byte[7];
    private javax.crypto.Cipher encryptCipher = null;

    private static byte[] assembleHeader(int i17) {
        java.lang.System.arraycopy(com.tencent.midas.comm.log.util.APBytesUtil.int2bytes(i17), 0, header, 3, 4);
        return header;
    }

    public static com.tencent.midas.comm.log.processor.APLogEncryptor create() {
        com.tencent.midas.comm.log.processor.APLogEncryptor aPLogEncryptor = new com.tencent.midas.comm.log.processor.APLogEncryptor();
        aPLogEncryptor.init();
        return aPLogEncryptor;
    }

    private void init() {
        try {
            byte[] bArr = header;
            bArr[0] = 2;
            bArr[1] = PROTOCOL_VERSION;
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/NoPadding");
            this.encryptCipher = cipher;
            cipher.init(1, secretKeySpec);
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
        }
    }

    public static void setEncryptKey(java.lang.String str) {
        ENCRYPT_KEY = str;
    }

    public static void setProtocolVersion(byte b17) {
        PROTOCOL_VERSION = b17;
    }

    public void close() {
        this.encryptCipher = null;
    }

    public byte[] encrypt(byte[] bArr) {
        int length = bArr.length;
        int i17 = length % 16;
        if (i17 != 0) {
            try {
                byte[] bArr2 = new byte[(16 - i17) + length];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
                bArr = bArr2;
            } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException unused) {
            }
        }
        bArr = this.encryptCipher.doFinal(bArr);
        byte[] assembleHeader = assembleHeader(length);
        int length2 = assembleHeader.length + bArr.length + 1;
        byte[] bArr3 = new byte[length2];
        java.lang.System.arraycopy(assembleHeader, 0, bArr3, 0, assembleHeader.length);
        java.lang.System.arraycopy(bArr, 0, bArr3, assembleHeader.length, bArr.length);
        bArr3[length2 - 1] = 0;
        return bArr3;
    }
}
