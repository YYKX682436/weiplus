package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$h */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallableC5045x56f1715 implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        com.p314xaae8f345.mm.app.n4 n4Var = new com.p314xaae8f345.mm.app.n4();
        try {
            n4Var.f135063a = android.os.Environment.getDataDirectory().getPath();
            android.os.StatFs statFs = new android.os.StatFs(n4Var.f135063a);
            n4Var.f135064b = statFs.getBlockSizeLong();
            n4Var.f135065c = statFs.getBlockCountLong();
            n4Var.f135066d = statFs.getAvailableBlocksLong();
        } catch (java.lang.Throwable unused) {
        }
        try {
            n4Var.f135067e = lp0.b.e0();
            android.os.StatFs statFs2 = new android.os.StatFs(n4Var.f135067e);
            n4Var.f135068f = statFs2.getBlockSizeLong();
            n4Var.f135069g = statFs2.getBlockCountLong();
            n4Var.f135070h = statFs2.getAvailableBlocksLong();
        } catch (java.lang.Throwable unused2) {
        }
        return n4Var;
    }
}
