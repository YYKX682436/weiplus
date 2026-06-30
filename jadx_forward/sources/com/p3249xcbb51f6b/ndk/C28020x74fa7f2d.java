package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.MessageDigestUtil */
/* loaded from: classes9.dex */
public class C28020x74fa7f2d {
    /* renamed from: bytesToHex */
    public static java.lang.String m121900x526410f5(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString.toUpperCase());
        }
        return sb6.toString();
    }

    /* renamed from: doSHA256 */
    private native byte[] m121901x15805e92(byte[] bArr);

    /* renamed from: getSHA256Hex */
    public java.lang.String m121902x984bccbe(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            byte[] m121901x15805e92 = m121901x15805e92(bArr);
            if (m121901x15805e92 != null) {
                return m121900x526410f5(m121901x15805e92);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
