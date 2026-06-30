package uc4;

/* loaded from: classes4.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f507974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.v f507975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc4.p f507976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f507977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f507978h;

    public q(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, uc4.v vVar, xc4.p pVar, r45.e86 e86Var, android.view.View view) {
        this.f507974d = h0Var;
        this.f507975e = vVar;
        this.f507976f = pVar;
        this.f507977g = e86Var;
        this.f507978h = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
        int itemId = menuItem.getItemId();
        r45.e86 e86Var = this.f507977g;
        xc4.p pVar = this.f507976f;
        uc4.v vVar = this.f507975e;
        if (itemId == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f507974d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.f((java.lang.CharSequence) h0Var.f391656d)) {
                db5.e1.T(vVar.b(), vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                w04.a.INSTANCE.A9(4, pVar.a1() + ':' + e86Var.f454665m, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0((java.lang.String) h0Var.f391656d));
            } else {
                db5.e1.T(vVar.b(), vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571893ss));
            }
        } else if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(pVar.y0(), pVar.mo133058x3172ed() ? 6 : 4, e86Var);
            gm0.j1.n().f354821b.g(q2Var);
            android.content.Context context = vVar.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.class);
            java.lang.String string = vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            java.lang.String string2 = vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9z);
            uc4.p pVar2 = new uc4.p(q2Var);
            c18232x7592f55e.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.MainUIC", "showOpDialog: ");
            c18232x7592f55e.f250240s = db5.e1.Q(c18232x7592f55e.m80379x76847179(), string, string2, true, true, pVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            int i18 = e86Var.f454665m;
            java.lang.String str = e86Var.f454659d;
            ad4.g gVar = ad4.g.f84716a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            gVar.a(this.f507978h, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.I(pVar.c1(), i18, str, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1");
    }
}
