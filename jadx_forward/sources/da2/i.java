package da2;

/* loaded from: classes2.dex */
public final class i extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final r45.r03 f309292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.r03 r03Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f309292c = r03Var;
    }

    public final long A() {
        r45.hj2 hj2Var;
        r45.r03 r03Var = this.f309292c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null) {
            return 0L;
        }
        return hj2Var.m75942xfb822ef2(0);
    }

    public final java.lang.String B() {
        r45.r03 r03Var = this.f309292c;
        return hc2.m0.c(r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null, this.f515691a, null);
    }

    public final void C(android.view.View view, java.lang.String str) {
        hc2.v0.e(view, str, 0, 0, false, false, null, new da2.h(this.f515691a.getIntent().getLongExtra("key_ref_feed_id", 0L)), 62, null);
    }

    public final boolean D() {
        r45.r03 r03Var = this.f309292c;
        r45.hj2 hj2Var = r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null;
        return hj2Var != null && hj2Var.m75939xb282bd08(14) == 1;
    }

    public final r45.ht0 E() {
        r45.ht0 ht0Var = new r45.ht0();
        ht0Var.set(0, pm0.v.u(A()));
        ht0Var.set(1, B());
        ht0Var.set(5, D() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.f573480lw2).toString() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.eqg).toString());
        return ht0Var;
    }

    @Override // v92.g
    public boolean f() {
        return A() == 0;
    }

    @Override // v92.g
    public void h() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        long A = A();
        boolean D = D();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f515691a;
        if (D) {
            bd2.b bVar = bd2.b.f100777a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(hc2.m0.b(context));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = h17 != null ? cu2.u.f303974a.p(h17) : null;
            bVar.l(context, bVar.h(context, 10009, kz5.c1.k(new jz5.l(dm.i4.f66865x76d1ec5a, pm0.v.u(p17 != null ? p17.mo2128x1ed62e84() : 0L)), new jz5.l("topic_id", pm0.v.u(A)))), false, null);
            return;
        }
        r45.r03 r03Var = this.f309292c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null || (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) == null || (str = zi2Var.m75945x2fec8307(12)) == null) {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&song_id=%s=&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{83, str, pm0.v.u(A)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        C(menuView, "finder_forward_share_to_chat");
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        C(menuView, "finder_forward_share_to_sns");
    }

    @Override // v92.g
    public boolean p() {
        return (B().length() == 0) || A() == 0;
    }

    @Override // v92.g
    public void r() {
        r45.hj2 hj2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        java.lang.String B = B();
        r45.r03 r03Var = this.f309292c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.J(n7Var, abstractActivityC21394xb3d2c0cf, B, 15, (r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null) ? 0L : hj2Var.m75939xb282bd08(4), hc2.m0.a(r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null, activityC0065xcd7aa112), z(), null, 9, "", E(), java.lang.Boolean.valueOf(D()), null, 2048, null);
    }

    @Override // v92.g
    public void t() {
        r45.hj2 hj2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        java.lang.String B = B();
        r45.r03 r03Var = this.f309292c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.K(n7Var, abstractActivityC21394xb3d2c0cf, B, 15, (r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null) ? 0L : hj2Var.m75939xb282bd08(4), hc2.m0.a(r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null, activityC0065xcd7aa112), z(), null, 9, "", E(), java.lang.Boolean.valueOf(D()), null, 2048, null);
    }

    public final java.lang.String z() {
        r45.hj2 hj2Var;
        java.lang.String str;
        r45.r03 r03Var = this.f309292c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null) {
            return "";
        }
        java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, hj2Var.m75939xb282bd08(4));
        int m75939xb282bd08 = hj2Var.m75939xb282bd08(5);
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(m75939xb282bd08);
        long m75939xb282bd082 = hj2Var.m75939xb282bd08(4);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        if (m75939xb282bd082 > 0) {
            str = "" + activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqm, g17);
        } else {
            str = "";
        }
        if (hj2Var.m75939xb282bd08(4) > 0 && hj2Var.m75939xb282bd08(5) > 0) {
            str = str + " · ";
        }
        if (hj2Var.m75939xb282bd08(5) > 0) {
            str = str + activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573477eq5, i17);
        }
        return str == null ? "" : str;
    }
}
