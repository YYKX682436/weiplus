package zv2;

/* loaded from: classes10.dex */
public final class m extends zv2.b {

    /* renamed from: t, reason: collision with root package name */
    public static final zv2.c f557944t = new zv2.c(null);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f557945h;

    /* renamed from: i, reason: collision with root package name */
    public uc0.v f557946i;

    /* renamed from: m, reason: collision with root package name */
    public int f557947m;

    /* renamed from: n, reason: collision with root package name */
    public int f557948n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f557949o;

    /* renamed from: p, reason: collision with root package name */
    public sc2.m3 f557950p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f557951q;

    /* renamed from: r, reason: collision with root package name */
    public so2.i5 f557952r;

    /* renamed from: s, reason: collision with root package name */
    public final android.webkit.ValueCallback f557953s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557947m = -1;
        this.f557948n = -1;
        n(jumpView.getTipsTv(), "product_title_too_long_tips", -1);
        this.f557953s = new zv2.g(this);
    }

    public static final void m(zv2.m mVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        android.view.View view = mVar.f557949o;
        if (view == null || (c19786x6a1e2862 = mVar.f557930f) == null) {
            return;
        }
        in5.s0 s0Var = new in5.s0(view);
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        if (mVar.f557950p == null) {
            mVar.f557950p = new sc2.m3();
        }
        sc2.m3 m3Var = mVar.f557950p;
        if (m3Var != null) {
            m3Var.q(new so2.u1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079()), s0Var, view, p0Var, "");
        }
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        qs2.v vVar = qs2.v.f447860a;
        android.webkit.ValueCallback valueCallback = this.f557953s;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557951q;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f557928d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (c19786x6a1e2862 == null) {
            ip.j b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
            java.lang.String d17 = b17.d("FinderMiniAppShopAppId");
            if (d17 == null) {
                d17 = "wx2bff878c51bab23b";
            }
            java.lang.String str = d17;
            java.lang.String d18 = b17.d("FinderMiniAppShopAppPath");
            if (d18 == null) {
                d18 = "/pages/commodityToAdd/index.html?from=post";
            }
            qs2.v.h(vVar, context, str, d18, 0, valueCallback, 8, null);
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398570o = valueCallback;
        b1Var.M = true;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 m76505xea668b3e = c19786x6a1e2862.m76505xea668b3e();
        if (m76505xea668b3e != null && m76505xea668b3e.m77195xa4497fe6()) {
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534784m = b1Var;
        xc2.y2.i(xc2.y2.f534876a, context, p0Var, 0, null, 12, null);
    }

    @Override // zv2.b
    public boolean c() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 == null || c19786x6a1e2862 == null || c19786x6a1e2862.m76505xea668b3e() == null || c19786x6a1e2862.m76503x92bc3c07() != 1) {
            return false;
        }
        return c19786x6a1e2862.m76480xe2ee1ca3() == 1 || c19786x6a1e2862.m76478x7af36de7() == 1;
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            so2.i5 i5Var = this.f557952r;
            if (i5Var != null) {
                str = i5Var.f491957b;
            }
            str = null;
        } else {
            so2.i5 i5Var2 = this.f557952r;
            if (i5Var2 != null) {
                str = i5Var2.f491956a;
            }
            str = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.m62144x12ec1b74(str);
        java.lang.String m76523x98b23862 = jumpInfo.m76523x98b23862();
        if (m76523x98b23862 == null) {
            m76523x98b23862 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(c15305x8b2e5786, m76523x98b23862, false, 2, null);
        o(this.f557945h);
    }

    @Override // zv2.b
    public void e() {
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(this.f557928d), false, 2, null);
        this.f557951q = j37 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) j37.u0().m75936x14adae67(53) : null;
    }

    @Override // zv2.b
    public void f() {
        super.f();
        java.lang.String string = this.f557928d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eeq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.m62140x6fd9aa19(string);
        c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f81422x77dccf21);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f81420x94c7793d);
    }

    @Override // zv2.b
    public void j() {
        f557944t.a(this.f557928d, true, this.f557930f != null);
    }

    @Override // zv2.b
    public void k() {
        f557944t.a(this.f557928d, false, this.f557930f != null);
    }

    @Override // zv2.b
    public void l() {
        java.util.List k17 = kz5.c0.k(new ry2.f(1, 0, 0, new zv2.k(this), null, 22, null), new ry2.f(2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.csu, new zv2.l(this), null, 18, null));
        java.lang.String str = this.f557945h;
        if ((str != null ? str.length() : 0) > 15) {
            k17.add(1, new ry2.f(3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.eoo, new zv2.i(this), new zv2.j(this), 2, null));
        }
        ry2.j.f482931a.a(this.f557928d, k17, null);
    }

    public final void n(android.view.View view, java.lang.String str, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        if (i17 != -1) {
            aVar.ik(view, i17, 25496);
        }
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(this.f557928d);
        aVar.Ai(view, new zv2.f(Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null));
    }

    public final void o(java.lang.String str) {
        boolean z17 = (str != null ? str.length() : 0) > 15;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        if (!z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.f212704u;
            c15305x8b2e5786.a(null);
        } else {
            android.content.res.Resources resources = this.f557928d.getResources();
            c15305x8b2e5786.a(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.evt) : null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", c15305x8b2e5786.getTipsTv(), null, 25496);
        }
    }
}
