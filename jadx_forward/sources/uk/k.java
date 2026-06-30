package uk;

/* loaded from: classes7.dex */
public abstract class k {
    public static final java.lang.String a(java.io.InputStream inputStream, int i17) {
        int i18;
        if (inputStream != null && i17 > 0) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
                byte[] bArr = new byte[i17];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                for (byte b17 : messageDigest.digest()) {
                    sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
                }
                return sb6.toString();
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static java.lang.String b(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        if (str == null) {
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(file);
            long j17 = 102400;
            try {
                if (j17 > file.length()) {
                    j17 = file.length();
                }
                java.lang.String a17 = a(fileInputStream, (int) j17);
                fileInputStream.close();
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused) {
                }
                return a17;
            } catch (java.lang.Exception unused2) {
                if (fileInputStream == null) {
                    return null;
                }
                try {
                    fileInputStream.close();
                    return null;
                } catch (java.io.IOException unused3) {
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                fileInputStream2 = fileInputStream;
                th = th6;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused5) {
            fileInputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final java.lang.String c(java.io.InputStream inputStream, int i17, int i18, int i19, byte[] bArr) {
        if (inputStream != null && i17 > 0 && i18 >= 0 && i19 > 0) {
            long j17 = i18;
            try {
                if (inputStream.skip(j17) < j17) {
                    return null;
                }
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
                byte[] bArr2 = new byte[i17];
                int i27 = 0;
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read == -1 || i27 >= i19) {
                        break;
                    }
                    int i28 = i27 + read;
                    if (i28 <= i19) {
                        messageDigest.update(bArr2, 0, read);
                        i27 = i28;
                    } else {
                        messageDigest.update(bArr2, 0, i19 - i27);
                        i27 = i19;
                    }
                }
                if (bArr != null && bArr.length > 0) {
                    messageDigest.update(bArr);
                }
                for (byte b17 : messageDigest.digest()) {
                    sb6.append(java.lang.Integer.toString((b17 & 255) + 256, 16).substring(1));
                }
                return sb6.toString();
            } catch (java.lang.Exception unused) {
            }
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
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
