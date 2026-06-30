package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lh {
    private static java.lang.String a(java.lang.String str) {
        return com.tencent.map.tools.Util.getMD5String(str);
    }

    private static java.lang.String a(byte[] bArr) {
        return com.tencent.map.tools.Util.getMD5String(bArr);
    }

    public static java.lang.String a(java.io.File file) {
        int i17;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        byte[] bArr = new byte[1024];
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i18 = 0;
            for (i17 = 0; i17 < 16; i17++) {
                byte b17 = digest[i17];
                int i19 = i18 + 1;
                cArr2[i18] = cArr[(b17 >>> 4) & 15];
                i18 = i19 + 1;
                cArr2[i19] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
