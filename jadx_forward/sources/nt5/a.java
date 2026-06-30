package nt5;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a(byte[] bArr) {
        byte[] bArr2;
        try {
            byte[] bArr3 = new byte[3];
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = i17 * 2;
                bArr3[i17] = java.lang.Integer.valueOf("4D4435".substring(i18, i18 + 2), 16).byteValue();
            }
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(new java.lang.String(bArr3));
            messageDigest.update(bArr);
            bArr2 = messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException unused) {
            bArr2 = null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr2.length);
        for (byte b17 : bArr2) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase(java.util.Locale.getDefault()));
        }
        return stringBuffer.toString();
    }
}
