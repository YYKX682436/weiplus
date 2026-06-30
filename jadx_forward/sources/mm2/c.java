package mm2;

/* loaded from: classes3.dex */
public final class c extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f410300f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f410301g;

    /* renamed from: h, reason: collision with root package name */
    public long f410302h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f410303i;

    static {
        new mm2.b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410300f = "";
        this.f410301g = "";
        this.f410302h = -1L;
    }

    public final java.lang.String N6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85246c4).mo141623x754a37bb()).r()).intValue() == 1 ? "debug_id" : this.f410301g;
    }

    public final void O6(r45.tv1 tv1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#updateAllowanceInfo package_id=");
        jz5.f0 f0Var = null;
        sb6.append(tv1Var != null ? tv1Var.m75945x2fec8307(0) : null);
        sb6.append(" remain_time=");
        sb6.append(tv1Var != null ? java.lang.Integer.valueOf(tv1Var.m75939xb282bd08(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AllowanceGiftSlice", sb6.toString());
        if (tv1Var != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410300f, tv1Var.m75945x2fec8307(0))) {
                java.lang.String m75945x2fec8307 = tv1Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                this.f410301g = m75945x2fec8307;
                this.f410302h = java.lang.Long.valueOf((tv1Var.m75939xb282bd08(1) * 1000) + java.lang.System.currentTimeMillis()).longValue();
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f410301g = "";
            this.f410302h = -1L;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f410301g = "";
        this.f410302h = -1L;
    }
}
