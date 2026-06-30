package wl4;

/* loaded from: classes11.dex */
public final class h extends sl4.g {
    public final rl4.c A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rl4.c playAppConfig) {
        super(playAppConfig.b());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playAppConfig, "playAppConfig");
        this.A = playAppConfig;
    }

    @Override // sl4.a
    public void a() {
        this.A.a();
    }

    @Override // sl4.g, sl4.a
    public void f(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036) {
        super.f(c26845xac206036);
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e(context);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return this.A.e();
    }

    @Override // sl4.g
    public int h0() {
        return this.A.c();
    }

    @Override // sl4.g
    public boolean l0() {
        return this.A.b() != bw5.eq0.StandAlone;
    }

    @Override // sl4.g
    public boolean m0() {
        return this.A.d();
    }
}
