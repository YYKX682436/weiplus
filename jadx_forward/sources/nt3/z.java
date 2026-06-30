package nt3;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f421350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(nt3.a0 a0Var, long j17) {
        super(0);
        this.f421349d = a0Var;
        this.f421350e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nt3.a0 a0Var = this.f421349d;
        ds0.d0 d0Var = a0Var.f421262t;
        if (d0Var != null) {
            d0Var.n();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mix audio used ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f421350e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f421255m, sb6.toString());
        hs0.a aVar = a0Var.f421264v;
        if (aVar != null) {
            aVar.d();
        }
        a0Var.g(false);
        return jz5.f0.f384359a;
    }
}
