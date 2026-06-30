package s65;

/* loaded from: classes11.dex */
public abstract class h0 {
    public static java.lang.String a(java.lang.String str) {
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
                java.lang.String c17 = kk.k.c(fileInputStream, (int) j17);
                fileInputStream.close();
                try {
                    fileInputStream.close();
                } catch (java.io.IOException unused) {
                }
                return c17;
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

    public static final boolean b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str != null && str2 != null && str3 != null) {
            java.io.File file = new java.io.File(str.concat(str2));
            java.io.File file2 = new java.io.File(str.concat(str3));
            if (file.exists()) {
                return file.renameTo(file2);
            }
        }
        return false;
    }
}
