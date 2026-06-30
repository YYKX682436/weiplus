package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class a4$$h implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        com.tencent.mm.app.n4 n4Var = new com.tencent.mm.app.n4();
        try {
            n4Var.f53530a = android.os.Environment.getDataDirectory().getPath();
            android.os.StatFs statFs = new android.os.StatFs(n4Var.f53530a);
            n4Var.f53531b = statFs.getBlockSizeLong();
            n4Var.f53532c = statFs.getBlockCountLong();
            n4Var.f53533d = statFs.getAvailableBlocksLong();
        } catch (java.lang.Throwable unused) {
        }
        try {
            n4Var.f53534e = lp0.b.e0();
            android.os.StatFs statFs2 = new android.os.StatFs(n4Var.f53534e);
            n4Var.f53535f = statFs2.getBlockSizeLong();
            n4Var.f53536g = statFs2.getBlockCountLong();
            n4Var.f53537h = statFs2.getAvailableBlocksLong();
        } catch (java.lang.Throwable unused2) {
        }
        return n4Var;
    }
}
