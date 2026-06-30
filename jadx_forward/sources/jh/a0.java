package jh;

/* loaded from: classes13.dex */
public abstract class a0 {
    public static java.io.File a(android.content.Context context) {
        java.io.File file = new java.io.File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/clean-up.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    public static java.lang.String b(jh.c0 c0Var) {
        return c0Var.f381206a.getFilesDir().getAbsolutePath() + "/wechat-backtrace/saving-cache/";
    }

    public static java.io.File c(android.content.Context context) {
        java.io.File file = new java.io.File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/disk-usage.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    public static void d(android.content.Context context, java.util.Map map) {
        java.io.File j17 = j(context);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry entry : map.entrySet()) {
            stringBuffer.append(((java.lang.String) entry.getKey()) + "|" + entry.getValue() + "\n");
        }
        m(j17, stringBuffer.toString());
    }

    public static void e(java.io.File file, android.os.CancellationSignal cancellationSignal, java.io.FileFilter fileFilter) {
        if (!file.isDirectory()) {
            fileFilter.accept(file);
            cancellationSignal.throwIfCanceled();
            return;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                e(file2, cancellationSignal, fileFilter);
                cancellationSignal.throwIfCanceled();
            }
        }
    }

    public static void f(android.content.Context context) {
        java.io.File c17 = c(context);
        try {
            c17.createNewFile();
            c17.setLastModified(java.lang.System.currentTimeMillis());
        } catch (java.io.IOException e17) {
            oj.j.d("Matrix.Backtrace.WarmUp", e17, "", new java.lang.Object[0]);
        }
    }

    public static boolean g(android.content.Context context) {
        java.io.File a17 = a(context);
        if (a17.exists()) {
            return java.lang.System.currentTimeMillis() - a17.lastModified() >= 172800000;
        }
        try {
            a17.createNewFile();
        } catch (java.io.IOException e17) {
            oj.j.d("Matrix.Backtrace.WarmUp", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        oj.j.d("Matrix.Backtrace.WarmUp", r8, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x005c: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:41:0x005c */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(java.io.File r8, int r9) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "Matrix.Backtrace.WarmUp"
            boolean r2 = r8.isFile()
            r3 = 0
            if (r2 == 0) goto L6a
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r5 = 4096(0x1000, float:5.74E-42)
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r8 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r8]     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5b
            r6 = r2
        L1d:
            int r7 = r5.read(r8)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5b
            if (r7 <= 0) goto L34
            r4.append(r8, r2, r7)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5b
            int r6 = r6 + r7
            if (r6 <= r9) goto L1d
            r5.close()     // Catch: java.io.IOException -> L2d
            goto L33
        L2d:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            oj.j.d(r1, r8, r0, r9)
        L33:
            return r3
        L34:
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L5b
            r5.close()     // Catch: java.io.IOException -> L3c
            goto L42
        L3c:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            oj.j.d(r1, r9, r0, r2)
        L42:
            return r8
        L43:
            r8 = move-exception
            goto L49
        L45:
            r8 = move-exception
            goto L5d
        L47:
            r8 = move-exception
            r5 = r3
        L49:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5b
            oj.j.d(r1, r8, r0, r9)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L54
            goto L6a
        L54:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            oj.j.d(r1, r8, r0, r9)
            goto L6a
        L5b:
            r8 = move-exception
            r3 = r5
        L5d:
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.io.IOException -> L63
            goto L69
        L63:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            oj.j.d(r1, r9, r0, r2)
        L69:
            throw r8
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.a0.h(java.io.File, int):java.lang.String");
    }

    public static boolean i(android.content.Context context) {
        java.io.File c17 = c(context);
        if (c17.exists()) {
            return java.lang.System.currentTimeMillis() - c17.lastModified() >= 259200000;
        }
        try {
            c17.createNewFile();
        } catch (java.io.IOException e17) {
            oj.j.d("Matrix.Backtrace.WarmUp", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public static java.io.File j(android.content.Context context) {
        java.io.File file = new java.io.File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/unfinished");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.Backtrace.WarmUp", e17, "", new java.lang.Object[0]);
            }
        }
        return file;
    }

    public static java.lang.String k(java.lang.String str, int i17) {
        return str + ":" + i17;
    }

    public static java.io.File l(android.content.Context context) {
        java.io.File file = new java.io.File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/warmed-up");
        file.getParentFile().mkdirs();
        return file;
    }

    public static boolean m(java.io.File file, java.lang.String str) {
        java.io.FileWriter fileWriter;
        if (file.isFile()) {
            java.io.FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new java.io.FileWriter(file);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                fileWriter.write(str);
                try {
                    fileWriter.close();
                    return true;
                } catch (java.io.IOException e18) {
                    oj.j.d("Matrix.Backtrace.WarmUp", e18, "", new java.lang.Object[0]);
                    return true;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                fileWriter2 = fileWriter;
                oj.j.d("Matrix.Backtrace.WarmUp", e, "", new java.lang.Object[0]);
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.close();
                    } catch (java.io.IOException e27) {
                        oj.j.d("Matrix.Backtrace.WarmUp", e27, "", new java.lang.Object[0]);
                    }
                }
                return false;
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.close();
                    } catch (java.io.IOException e28) {
                        oj.j.d("Matrix.Backtrace.WarmUp", e28, "", new java.lang.Object[0]);
                    }
                }
                throw th;
            }
        }
        return false;
    }
}
