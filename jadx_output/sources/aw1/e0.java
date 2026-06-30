package aw1;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final aw1.e0 f14515d = new aw1.e0();

    @Override // java.lang.Runnable
    public final void run() {
        aw1.l0 l0Var = aw1.l0.f14568a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CompressOriginalMediaService", "suspendTask");
        aw1.l0.f14571d = true;
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u && kotlin.jvm.internal.o.b(com.tencent.matrix.lifecycle.owners.f0.f52735q, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI")) {
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = -50000;
            objArr[1] = java.lang.Integer.valueOf(aw1.l0.f14574g ? 1 : -1);
            fVar.d(26980, objArr);
        }
    }
}
