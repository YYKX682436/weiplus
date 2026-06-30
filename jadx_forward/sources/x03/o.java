package x03;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532615d;

    public o(x03.i0 i0Var) {
        this.f532615d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        x03.i0 i0Var = this.f532615d;
        i0Var.f532589m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new x03.n(i0Var), true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = i0Var.f532589m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var2);
        boolean e17 = b4Var2.e();
        if (i0Var.f532585i && e17 && (b4Var = i0Var.f532589m) != null) {
            b4Var.c(500L, 500L);
        }
    }
}
