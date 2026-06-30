package ls0;

/* loaded from: classes10.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f402414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ls0.r0 r0Var, long j17) {
        super(0);
        this.f402413d = r0Var;
        this.f402414e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ls0.r0 r0Var = this.f402413d;
        ds0.d0 d0Var = r0Var.E;
        if (d0Var != null) {
            d0Var.n();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mix audio used ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f402414e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.f402449t, sb6.toString());
        hs0.a aVar = r0Var.I;
        if (aVar != null) {
            aVar.d();
        }
        r0Var.g(false);
        return jz5.f0.f384359a;
    }
}
