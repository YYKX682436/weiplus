package p55;

/* loaded from: classes12.dex */
public abstract class b {
    public static final java.io.File a(java.io.File dir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        java.io.File file = new java.io.File(lp0.b.g0());
        if (!file.isDirectory()) {
            return null;
        }
        java.util.List<java.io.File> y17 = q26.h0.y(q26.h0.i(new vz5.l(file, vz5.m.f523333d), p55.a.f433622d));
        if (y17.isEmpty()) {
            return null;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        } else if (!dir.isDirectory()) {
            throw new java.io.IOException(dir.getAbsolutePath() + " is not a directory");
        }
        java.io.File f17 = vz5.q.f(dir, "wechat-logs.zip");
        try {
            java.io.OutputStream fileOutputStream = new java.io.FileOutputStream(f17);
            java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(fileOutputStream instanceof java.io.BufferedOutputStream ? (java.io.BufferedOutputStream) fileOutputStream : new java.io.BufferedOutputStream(fileOutputStream, 8192));
            try {
                for (java.io.File file2 : y17) {
                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(r26.i0.u(vz5.q.g(file2, file), java.io.File.separatorChar, '/', false, 4, null));
                    zipEntry.setMethod(8);
                    zipOutputStream.putNextEntry(zipEntry);
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                    try {
                        vz5.a.b(fileInputStream, zipOutputStream, 0, 2, null);
                        vz5.b.a(fileInputStream, null);
                        zipOutputStream.closeEntry();
                    } finally {
                    }
                }
                vz5.b.a(zipOutputStream, null);
                return f17;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            if (f17.exists()) {
                f17.delete();
            }
            throw th6;
        }
    }
}
