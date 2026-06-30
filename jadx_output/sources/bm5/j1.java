package bm5;

/* loaded from: classes5.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f22695d;

    public j1(java.lang.Throwable th6) {
        this.f22695d = th6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.o1 o1Var = bm5.o1.f22719a;
        java.lang.Throwable th6 = this.f22695d;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerLogic", th6, "RepairerLogic was loaded too early!", new java.lang.Object[0]);
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c) {
            throw new java.lang.RuntimeException("RepairerLogic was loaded too early!", th6);
        }
    }
}
