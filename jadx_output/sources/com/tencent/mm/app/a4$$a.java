package com.tencent.mm.app;

/* loaded from: classes7.dex */
public final /* synthetic */ class a4$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] listFiles;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "deleteAnrHistory");
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), com.tencent.mm.app.MMBugReportContents.f53222c), "history"), bm5.f1.a());
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                file2.delete();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMCrashReporter", "deleteAnrHistory, done");
        }
    }
}
