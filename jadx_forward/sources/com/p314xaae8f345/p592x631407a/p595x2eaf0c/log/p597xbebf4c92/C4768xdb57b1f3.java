package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92;

/* renamed from: com.tencent.midas.comm.log.processor.APLogEncryptor */
/* loaded from: classes13.dex */
public class C4768xdb57b1f3 {

    /* renamed from: ENCRYPT_KEY */
    private static java.lang.String f20352x95686545 = "}VjZtoJF;dE+7iJs";

    /* renamed from: MAGIC_END */
    private static final byte f20353x250a5f09 = 0;

    /* renamed from: MAGIC_START */
    private static final byte f20354xcb6c310 = 2;

    /* renamed from: PROTOCOL_VERSION */
    private static byte f20355xc744b611 = 1;

    /* renamed from: header */
    private static byte[] f20356xb734e28d = new byte[7];

    /* renamed from: encryptCipher */
    private javax.crypto.Cipher f20357xbcabe4d0 = null;

    /* renamed from: assembleHeader */
    private static byte[] m41698xe4d2e6ff(int i17) {
        java.lang.System.arraycopy(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4770x2340d39e.m41711xc615b828(i17), 0, f20356xb734e28d, 3, 4);
        return f20356xb734e28d;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3 m41699xaf65a0fc() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3 c4768xdb57b1f3 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3();
        c4768xdb57b1f3.m41700x316510();
        return c4768xdb57b1f3;
    }

    /* renamed from: init */
    private void m41700x316510() {
        try {
            byte[] bArr = f20356xb734e28d;
            bArr[0] = 2;
            bArr[1] = f20355xc744b611;
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(f20352x95686545.getBytes(), "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/NoPadding");
            this.f20357xbcabe4d0 = cipher;
            cipher.init(1, secretKeySpec);
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
        }
    }

    /* renamed from: setEncryptKey */
    public static void m41701xc23ba3bc(java.lang.String str) {
        f20352x95686545 = str;
    }

    /* renamed from: setProtocolVersion */
    public static void m41702x83b2765e(byte b17) {
        f20355xc744b611 = b17;
    }

    /* renamed from: close */
    public void m41703x5a5ddf8() {
        this.f20357xbcabe4d0 = null;
    }

    /* renamed from: encrypt */
    public byte[] m41704xa0333265(byte[] bArr) {
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
        bArr = this.f20357xbcabe4d0.doFinal(bArr);
        byte[] m41698xe4d2e6ff = m41698xe4d2e6ff(length);
        int length2 = m41698xe4d2e6ff.length + bArr.length + 1;
        byte[] bArr3 = new byte[length2];
        java.lang.System.arraycopy(m41698xe4d2e6ff, 0, bArr3, 0, m41698xe4d2e6ff.length);
        java.lang.System.arraycopy(bArr, 0, bArr3, m41698xe4d2e6ff.length, bArr.length);
        bArr3[length2 - 1] = 0;
        return bArr3;
    }
}
