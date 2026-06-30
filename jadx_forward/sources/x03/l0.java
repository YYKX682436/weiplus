package x03;

/* loaded from: classes15.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f532602d;

    public l0(x03.u0 u0Var) {
        this.f532602d = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        x03.u0 u0Var = this.f532602d;
        u0Var.f532678m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new x03.k0(u0Var), true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = u0Var.f532678m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var2);
        boolean e17 = b4Var2.e();
        if (u0Var.f532675j && e17 && (b4Var = u0Var.f532678m) != null) {
            b4Var.c(500L, 500L);
        }
    }
}
