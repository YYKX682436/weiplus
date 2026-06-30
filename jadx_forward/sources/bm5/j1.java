package bm5;

/* loaded from: classes5.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f104228d;

    public j1(java.lang.Throwable th6) {
        this.f104228d = th6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.o1 o1Var = bm5.o1.f104252a;
        java.lang.Throwable th6 = this.f104228d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerLogic", th6, "RepairerLogic was loaded too early!", new java.lang.Object[0]);
        if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            throw new java.lang.RuntimeException("RepairerLogic was loaded too early!", th6);
        }
    }
}
