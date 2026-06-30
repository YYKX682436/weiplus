package gf;

/* loaded from: classes7.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k1 f352729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f352730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(gf.k1 k1Var, gf.a2 a2Var) {
        super(1);
        this.f352729d = k1Var;
        this.f352730e = a2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        df.w1 m131409x327797a4;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m95789xf25c5088;
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        gf.k1 k1Var = this.f352729d;
        if (!(!k1Var.f352589p.isEmpty()) && (m131409x327797a4 = k1Var.m131409x327797a4()) != null && (m95789xf25c5088 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95789xf25c5088(m131409x327797a4.f311113d)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "[" + reason + "]sendViewportMetricsToFlutter, windowId:%d, width:%s, height:%s", this.f352730e.f352548g, java.lang.Integer.valueOf(k1Var.getWidth()), java.lang.Integer.valueOf(k1Var.getHeight()));
            gf.z m131393x5911f26b = k1Var.m131393x5911f26b();
            android.view.View view = m131393x5911f26b.f352728b;
            int width = view.getWidth();
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = m131393x5911f26b.f352727a;
            viewportMetrics.f71263x6be2dc6 = width;
            viewportMetrics.f71249xb7389127 = view.getHeight();
            viewportMetrics.f71246xacd5b81b = view.getResources().getDisplayMetrics().density;
            viewportMetrics.f71250xb11ec6c2 = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m95789xf25c5088.m138047x9c31e47b(viewportMetrics);
        }
        return jz5.f0.f384359a;
    }
}
