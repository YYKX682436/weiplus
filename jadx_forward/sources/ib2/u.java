package ib2;

/* loaded from: classes2.dex */
public final class u extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ib2.w wVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(activityC0065xcd7aa112);
        this.f371687c = wVar;
    }

    @Override // v92.g
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        ib2.w wVar = this.f371687c;
        wVar.E.getClass();
        if (!(this instanceof nr2.t)) {
            bottomSheet.f293409p = new ib2.l(wVar, bottomSheet);
        }
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            bottomSheet.f293418w = new ib2.o(wVar, O6);
        }
        bottomSheet.f293419x = new ib2.p(wVar, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        ib2.w wVar = this.f371687c;
        r45.vx0 vx0Var = wVar.f371689d;
        long m75942xfb822ef2 = vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L;
        android.app.Activity context = wVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{85, pm0.v.u(m75942xfb822ef2)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public int j() {
        return 0;
    }

    @Override // v92.g
    public void k(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_complaint", 0, 0, false, false, null, new ib2.q(this.f371687c), 62, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_chat", 0, 0, false, false, null, new ib2.r(this.f371687c), 62, null);
    }

    @Override // v92.g
    public void m(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_fav", 0, 0, false, false, null, new ib2.s(this.f371687c), 62, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_sns", 0, 0, false, false, null, new ib2.t(this.f371687c), 62, null);
    }

    @Override // v92.g
    public void r() {
        ib2.w wVar = this.f371687c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a, wVar.m80379x76847179(), O6, false, false, null, null, 56, null);
        }
    }

    @Override // v92.g
    public void s() {
        ib2.w wVar = this.f371687c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            so2.v0 v0Var = so2.v0.f492177a;
            r45.vx0 vx0Var = wVar.f371689d;
            android.app.Activity m80379x76847179 = wVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, O6, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179, null, null, 24, null);
        }
    }

    @Override // v92.g
    public void t() {
        ib2.w wVar = this.f371687c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.s(wVar.m80379x76847179(), O6, false);
        }
    }

    @Override // v92.g
    public void u() {
        super.u();
        ib2.w wVar = this.f371687c;
        java.util.Iterator it = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) wVar.E).Vi().iterator();
        while (it.hasNext()) {
            java.util.Map P6 = wVar.P6((java.lang.String) it.next());
            if (P6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("quick_forward_avatar", "view_exp", P6, 1, false);
            }
        }
    }
}
