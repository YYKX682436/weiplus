package by5;

/* loaded from: classes11.dex */
public abstract class x {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        java.lang.String c17 = c(str);
        return (c17 == null || str2 == null || !str2.equalsIgnoreCase(c17)) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|10|(1:12)(1:37)|13|(11:15|16|(2:17|(1:19)(1:20))|21|(2:24|22)|25|26|27|28|29|30)|36|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.io.File r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L6f
            if (r7 <= 0) goto L6f
            boolean r1 = r6.exists()
            if (r1 != 0) goto Lc
            goto L6f
        Lc:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L69
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L69
            long r2 = (long) r7
            long r4 = r6.length()     // Catch: java.lang.Throwable -> L6a
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L1b
            goto L1f
        L1b:
            long r2 = r6.length()     // Catch: java.lang.Throwable -> L6a
        L1f:
            int r6 = (int) r2
            if (r6 > 0) goto L23
            goto L61
        L23:
            java.lang.String r7 = "MD5"
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3 = 32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L61
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L61
        L32:
            int r3 = r1.read(r6)     // Catch: java.lang.Throwable -> L61
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L3e
            r7.update(r6, r5, r3)     // Catch: java.lang.Throwable -> L61
            goto L32
        L3e:
            byte[] r6 = r7.digest()     // Catch: java.lang.Throwable -> L61
        L42:
            int r7 = r6.length     // Catch: java.lang.Throwable -> L61
            if (r5 >= r7) goto L5c
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L61
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 256
            r3 = 16
            java.lang.String r7 = java.lang.Integer.toString(r7, r3)     // Catch: java.lang.Throwable -> L61
            r3 = 1
            java.lang.String r7 = r7.substring(r3)     // Catch: java.lang.Throwable -> L61
            r2.append(r7)     // Catch: java.lang.Throwable -> L61
            int r5 = r5 + 1
            goto L42
        L5c:
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
            r6 = r0
        L62:
            r1.close()     // Catch: java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L68
        L68:
            return r6
        L69:
            r1 = r0
        L6a:
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.io.IOException -> L6f
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.x.b(java.io.File, int):java.lang.String");
    }

    public static java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            return b(file, 102400);
        }
        return null;
    }

    public static final java.lang.String d(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i17 = 0;
            for (byte b17 : digest) {
                int i18 = i17 + 1;
                cArr2[i17] = cArr[(b17 >>> 4) & 15];
                i17 = i18 + 1;
                cArr2[i18] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
