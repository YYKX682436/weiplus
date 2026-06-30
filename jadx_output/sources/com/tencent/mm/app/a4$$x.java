package com.tencent.mm.app;

/* loaded from: classes11.dex */
public final /* synthetic */ class a4$$x implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] listFiles;
        java.io.BufferedInputStream bufferedInputStream;
        int length;
        byte[] bArr;
        int read;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "reportPreviousAnr");
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), com.tencent.mm.app.MMBugReportContents.f53222c), "history"), bm5.f1.a());
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                java.lang.String name = file2.getName();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "reportPreviousAnr, fileName = " + name);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (file2.exists()) {
                    try {
                        bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file2));
                        try {
                            length = (int) file2.length();
                            bArr = new byte[length];
                            read = bufferedInputStream.read(bArr);
                        } finally {
                            break;
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Util", e17, "", new java.lang.Object[0]);
                    }
                    if (read != length) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Util", "readFromFile error, size is not equal, path = %s, file length is %d, count is %d", file2.getAbsolutePath(), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(read));
                        bufferedInputStream.close();
                    } else {
                        bufferedInputStream.close();
                        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                        long parseLong = java.lang.Long.parseLong(name);
                        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
                        java.lang.String h17 = wVar.h();
                        java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                        jx3.f.INSTANCE.d(19664, str, h17, 20, java.lang.Integer.valueOf((!com.tencent.matrix.lifecycle.owners.f0.f52739u || wVar.f53889n) ? 1 : 0), bm5.f1.a(), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, parseLong / 1000), com.tencent.mm.sdk.platformtools.z.f193109e, "", 0, 0, 1, 0, com.tencent.mm.sdk.platformtools.z.f193111g, "", 0, 0, 0, "", "", "", "", "", 0, 1, "", com.tencent.mm.app.a4.f());
                        file2.delete();
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Util", "readFromFile error, file is not exit, path = %s", file2.getAbsolutePath());
                }
                bArr = null;
                java.lang.String str3 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
                long parseLong2 = java.lang.Long.parseLong(name);
                com.tencent.mm.app.w wVar2 = com.tencent.mm.app.w.INSTANCE;
                java.lang.String h172 = wVar2.h();
                java.lang.String str22 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                jx3.f.INSTANCE.d(19664, str3, h172, 20, java.lang.Integer.valueOf((!com.tencent.matrix.lifecycle.owners.f0.f52739u || wVar2.f53889n) ? 1 : 0), bm5.f1.a(), k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, parseLong2 / 1000), com.tencent.mm.sdk.platformtools.z.f193109e, "", 0, 0, 1, 0, com.tencent.mm.sdk.platformtools.z.f193111g, "", 0, 0, 0, "", "", "", "", "", 0, 1, "", com.tencent.mm.app.a4.f());
                file2.delete();
            }
        }
    }
}
