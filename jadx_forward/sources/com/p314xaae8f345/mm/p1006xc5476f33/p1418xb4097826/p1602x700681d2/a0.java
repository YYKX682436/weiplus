package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class a0 extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f203785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var, o25.y1 y1Var) {
        super((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context);
        this.f203783c = context;
        this.f203784d = l0Var;
        this.f203785e = y1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    @Override // v92.g
    public boolean a() {
        return this.f203784d.f203871d.f();
    }

    @Override // v92.g
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        boolean a17 = a();
        android.content.Context context = this.f203783c;
        o25.y1 y1Var = this.f203785e;
        if (a17) {
            bottomSheet.f293409p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.r(y1Var, context, bottomSheet);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203784d;
        r45.ev2 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.g(l0Var);
        if (g17 != null) {
            bottomSheet.f293418w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.u(y1Var, l0Var, context, g17);
        }
        bottomSheet.f293419x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.v(y1Var, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        r45.vx0 vx0Var = this.f203784d.f203871d.h().f203818e;
        long m75942xfb822ef2 = vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L;
        android.content.Context context = this.f203783c;
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
        hc2.v0.e(menuView, "finder_forward_menu_complaint", 0, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w(this.f203784d), 62, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_chat", 0, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.x(this.f203784d), 62, null);
    }

    @Override // v92.g
    public void m(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_fav", 0, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y(this.f203784d), 62, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_sns", 0, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z(this.f203784d), 62, null);
    }

    @Override // v92.g
    public boolean o() {
        return this.f203784d.f203871d.h().f203817d;
    }

    @Override // v92.g
    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203784d;
        r45.ev2 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.g(l0Var);
        if (g17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.q(this.f203783c, g17, (r16 & 4) != 0 ? false : l0Var.w(), (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        }
    }

    @Override // v92.g
    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203784d;
        r45.ev2 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.g(l0Var);
        if (g17 != null) {
            so2.v0 v0Var = so2.v0.f492177a;
            r45.vx0 vx0Var = l0Var.f203871d.h().f203818e;
            android.content.Context context = this.f203783c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, g17, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, null, null, 24, null);
        }
    }

    @Override // v92.g
    public void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203784d;
        r45.ev2 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.g(l0Var);
        if (g17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.s(this.f203783c, g17, l0Var.w());
        }
    }

    @Override // v92.g
    public void u() {
        super.u();
        java.util.List Vi = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f203785e).Vi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203784d;
        java.util.Iterator it = Vi.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0.y(l0Var, "quick_forward_avatar", false, (java.lang.String) it.next(), 2, null);
        }
    }

    @Override // v92.g
    public boolean x() {
        return this.f203784d.f203871d.e();
    }
}
