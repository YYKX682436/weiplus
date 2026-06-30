package uc4;

/* loaded from: classes4.dex */
public final class d1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final xc4.p f507920a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f507921b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f507922c;

    public d1(android.app.Activity activity, xc4.p info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f507920a = info;
        this.f507921b = "ImproveStatusIconClick";
        this.f507922c = new java.lang.ref.WeakReference(activity);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
        android.app.Activity activity = (android.app.Activity) this.f507922c.get();
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        we0.j1 j1Var = (we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class));
        if (j1Var.tj(activity, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507921b, "click iconSpan, showForbidToastWhenNotFoundStatus");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
            return;
        }
        xc4.p pVar = this.f507920a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L0 = pVar.L0();
        java.lang.String d17 = L0 != null ? L0.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String t07 = ca4.z0.t0(pVar.c1().f68891x29d1292e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ni, "requestSessionId(...)");
        j1Var.nj("sns_status_icon", "view_clk", new xe0.o0(d17, t07, Ni));
        j1Var.sj(activity, new bi4.h1(str, 14, 153L, false, false, new bi4.g1(bi4.f1.f102575e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStatusIconClick");
    }
}
