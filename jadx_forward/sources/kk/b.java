package kk;

/* loaded from: classes13.dex */
public abstract class b {
    public static byte[] a(byte[] bArr, java.lang.String str) {
        byte[] decode = android.util.Base64.decode(str.getBytes(), 0);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(decode, "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(java.util.Arrays.copyOf(decode, decode.length)));
        return cipher.doFinal(bArr);
    }
}
