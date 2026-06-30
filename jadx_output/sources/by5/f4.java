package by5;

/* loaded from: classes12.dex */
public abstract class f4 {
    public static void a(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("/");
        if (split.length <= 1) {
            return;
        }
        for (int i17 = 0; i17 < split.length - 1; i17++) {
            str2 = str2 + split[i17] + "/";
            java.io.File file = new java.io.File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    public static void b(java.util.zip.ZipOutputStream zipOutputStream, java.io.File file, java.lang.String str) {
        if (file.isDirectory()) {
            for (java.io.File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(file.getName());
                        java.lang.String str2 = java.io.File.separator;
                        sb6.append(str2);
                        sb6.append(file2.getName());
                        sb6.append(str2);
                        b(zipOutputStream, file2, sb6.toString());
                    } else {
                        b(zipOutputStream, file2, str);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str + file.getName()));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                bufferedInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: IOException -> 0x00e2, TRY_LEAVE, TryCatch #3 {IOException -> 0x00e2, blocks: (B:63:0x00db, B:56:0x00e6), top: B:62:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.f4.c(java.lang.String, java.lang.String):boolean");
    }

    public static boolean d(java.io.File[] fileArr, java.lang.String str, int i17) {
        java.lang.StringBuilder sb6;
        boolean z17 = false;
        if (fileArr == null) {
            by5.c4.g("ZipUtil", "zipFilesEx, fs is null");
            return false;
        }
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(str)));
            try {
                zipOutputStream2.setLevel(i17);
                for (java.io.File file : fileArr) {
                    if (file != null && file.exists()) {
                        if (file.isDirectory()) {
                            b(zipOutputStream2, file, file.getName() + java.io.File.separator);
                        } else {
                            b(zipOutputStream2, file, "");
                        }
                    }
                }
                z17 = true;
                zipOutputStream2.flush();
            } catch (java.lang.Throwable th6) {
                th = th6;
                zipOutputStream = zipOutputStream2;
                try {
                    by5.c4.d("ZipUtil", "zipFilesEx, error", th);
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                        } catch (java.io.IOException e17) {
                            e = e17;
                            sb6 = new java.lang.StringBuilder("zipFilesEx, error:");
                            sb6.append(e);
                            by5.c4.c("ZipUtil", sb6.toString());
                            return z17;
                        }
                    }
                    return z17;
                } catch (java.lang.Throwable th7) {
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                        } catch (java.io.IOException e18) {
                            by5.c4.c("ZipUtil", "zipFilesEx, error:" + e18);
                        }
                    }
                    throw th7;
                }
            }
            try {
                zipOutputStream2.closeEntry();
                zipOutputStream2.close();
            } catch (java.io.IOException e19) {
                e = e19;
                sb6 = new java.lang.StringBuilder("zipFilesEx, error:");
                sb6.append(e);
                by5.c4.c("ZipUtil", sb6.toString());
                return z17;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
        return z17;
    }
}
