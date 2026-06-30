package yr5;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            try {
                byte[] b17 = bs5.p.b(str);
                if (b17.length < 16) {
                    return "";
                }
                byte[] bArr = new byte[16];
                java.lang.System.arraycopy(b17, 0, bArr, 0, 16);
                javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
                int length = b17.length - 16;
                byte[] bArr2 = new byte[length];
                java.lang.System.arraycopy(b17, 16, bArr2, 0, length);
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, b(str2), ivParameterSpec);
                byte[] doFinal = cipher.doFinal(bArr2);
                return doFinal == null ? "" : new java.lang.String(doFinal, java.nio.charset.Charset.forName(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    public static javax.crypto.spec.SecretKeySpec b(java.lang.String str) {
        int length = str.length();
        if (length < 16) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            for (int i17 = 0; i17 < 16 - length; i17++) {
                sb6.append("0");
            }
            str = sb6.toString();
        }
        return new javax.crypto.spec.SecretKeySpec(str.getBytes(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "AES");
    }
}
