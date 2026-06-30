package l51;

/* loaded from: classes7.dex */
public abstract class e {
    public static java.lang.String a(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.FileInputStream fileInputStream2 = null;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                java.lang.String str = new java.lang.String(l51.c.a(messageDigest.digest()));
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("HdiffApk-MD5Utils", "getMD5, costtime = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "，file.size = " + file.length());
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused) {
                }
                return str;
            } catch (java.lang.Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream2 = fileInputStream;
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
}
