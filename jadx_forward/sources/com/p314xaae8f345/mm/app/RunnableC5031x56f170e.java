package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC5031x56f170e implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.io.File[] listFiles;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "deleteAnrHistory");
        java.io.File file = new java.io.File(new java.io.File(new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c), "history"), bm5.f1.a());
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (java.io.File file2 : listFiles) {
                file2.delete();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCrashReporter", "deleteAnrHistory, done");
        }
    }
}
