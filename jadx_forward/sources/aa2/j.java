package aa2;

/* loaded from: classes2.dex */
public final class j extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final r45.r03 f84037c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.e21 f84038d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f84039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.r03 r03Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f84037c = r03Var;
        this.f84038d = r03Var != null ? (r45.e21) r03Var.m75936x14adae67(16) : null;
    }

    public final r45.ht0 A() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.CharSequence text;
        r45.h21 h21Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.ht0 ht0Var = new r45.ht0();
        r45.e21 e21Var = this.f84038d;
        ht0Var.set(0, pm0.v.u(e21Var != null ? e21Var.m75942xfb822ef2(0) : 0L));
        if (e21Var == null || (str = e21Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        ht0Var.set(1, str);
        if (e21Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1)) == null || (str2 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
            str2 = "";
        }
        ht0Var.set(2, str2);
        ht0Var.set(4, java.lang.Long.valueOf(e21Var != null ? e21Var.m75942xfb822ef2(17) : 0L));
        if (e21Var == null || (h21Var = (r45.h21) e21Var.m75936x14adae67(18)) == null || (text = h21Var.m75945x2fec8307(8)) == null) {
            text = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getText(com.p314xaae8f345.mm.R.C30867xcad56011.cmu);
        }
        java.lang.String str3 = (java.lang.String) text;
        ht0Var.set(5, str3 != null ? str3 : "");
        return ht0Var;
    }

    @Override // v92.g
    public void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f293407o = new aa2.d(this);
        bottomSheet.f293417v = new aa2.e(this);
    }

    @Override // v92.g
    public android.view.View d() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activityC0065xcd7aa112).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.adw, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564094ht);
        java.lang.String string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4k, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2.concat(" "));
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(activityC0065xcd7aa112, com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        e17.setBounds(0, 0, (int) activityC0065xcd7aa112.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561955xh), (int) activityC0065xcd7aa112.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        spannableString.setSpan(new al5.w(e17, 1), spannableString.length() - 1, spannableString.length(), 17);
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string2, activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560796uf), activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new aa2.f(this)), string2.length() - 6, string2.length(), 17);
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC0065xcd7aa112));
        textView.setText(spannableString);
        return inflate;
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        s92.g.d(s92.g.f486539a, this.f515691a, menuView, "finder_forward_share_to_chat", 0, 8, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        s92.g.d(s92.g.f486539a, this.f515691a, menuView, "finder_forward_share_to_sns", 0, 8, null);
    }

    @Override // v92.g
    public boolean p() {
        r45.e21 e21Var = this.f84038d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e21Var != null ? e21Var.m75945x2fec8307(2) : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShare ");
        sb6.append(K0);
        sb6.append(", ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e21Var != null ? e21Var.m75945x2fec8307(2) : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityShareHandler", sb6.toString());
        return K0;
    }

    @Override // v92.g
    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        r45.e21 e21Var = this.f84038d;
        java.lang.String m75945x2fec8307 = e21Var != null ? e21Var.m75945x2fec8307(2) : null;
        long m75939xb282bd08 = e21Var != null ? e21Var.m75939xb282bd08(4) : 0L;
        java.lang.String m75945x2fec83072 = e21Var != null ? e21Var.m75945x2fec8307(5) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.J(n7Var, abstractActivityC21394xb3d2c0cf, m75945x2fec8307, 7, m75939xb282bd08, m75945x2fec83072, z(), null, 9, "", A(), null, null, 3072, null);
    }

    @Override // v92.g
    public void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        r45.e21 e21Var = this.f84038d;
        java.lang.String m75945x2fec8307 = e21Var != null ? e21Var.m75945x2fec8307(2) : null;
        long m75939xb282bd08 = e21Var != null ? e21Var.m75939xb282bd08(4) : 0L;
        java.lang.String m75945x2fec83072 = e21Var != null ? e21Var.m75945x2fec8307(5) : null;
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.K(n7Var, abstractActivityC21394xb3d2c0cf, m75945x2fec8307, 7, m75939xb282bd08, m75945x2fec83072, z(), null, 9, "", A(), null, null, 3072, null);
    }

    @Override // v92.g
    public boolean w() {
        r45.h21 h21Var;
        boolean z17 = false;
        r45.e21 e21Var = this.f84038d;
        if (e21Var != null && (h21Var = (r45.h21) e21Var.m75936x14adae67(18)) != null && !h21Var.m75933x41a8a7f2(6)) {
            z17 = true;
        }
        return true ^ z17;
    }

    public final java.lang.String z() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466.class)).f183354r;
        r45.e21 e21Var = this.f84038d;
        return hc2.a0.a(e21Var != null ? (r45.h21) e21Var.m75936x14adae67(18) : null, activity, i17);
    }
}
