package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class tb extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f243103d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243103d = "";
        this.f243104e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sb(this));
    }

    public final void T6(android.widget.TextView textView, int i17, yz5.a aVar) {
        java.lang.String m158362x2fec8307 = m158362x2fec8307(i17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(m158362x2fec8307);
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rb(aVar), 0, m158362x2fec8307.length(), 18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(P6 != null ? P6.mo55332x76847179() : null));
        textView.setClickable(true);
        textView.setText(spannableStringBuilder);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enw;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailVerifyUI", "onActivityResult requestCode: " + i17 + ", resultCode: " + i18);
        if (i17 != 1 || (P6 = P6()) == null) {
            return;
        }
        P6.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f243103d = m158359x1e885992().getStringExtra("verify_email_address");
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailVerifyUI", "isVerifyEmailOverTime curTime: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + ", lastTime: " + t17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo64405x4dab7448(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = P6();
        if (P63 != null) {
            P63.mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ob(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        }
        jz5.g gVar = this.f243104e;
        em.z3 z3Var = (em.z3) ((jz5.n) gVar).mo141623x754a37bb();
        if (z3Var.f336522c == null) {
            z3Var.f336522c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) z3Var.f336520a.findViewById(com.p314xaae8f345.mm.R.id.vlh);
        }
        z3Var.f336522c.setImageResource(com.p314xaae8f345.mm.R.raw.f79032x574cb5f9);
        em.z3 z3Var2 = (em.z3) ((jz5.n) gVar).mo141623x754a37bb();
        if (z3Var2.f336523d == null) {
            z3Var2.f336523d = (android.widget.TextView) z3Var2.f336520a.findViewById(com.p314xaae8f345.mm.R.id.vli);
        }
        android.widget.TextView textView = z3Var2.f336523d;
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oh9, this.f243103d));
        em.z3 z3Var3 = (em.z3) ((jz5.n) gVar).mo141623x754a37bb();
        if (z3Var3.f336521b == null) {
            z3Var3.f336521b = (android.widget.TextView) z3Var3.f336520a.findViewById(com.p314xaae8f345.mm.R.id.f564908si0);
        }
        android.widget.TextView textView2 = z3Var3.f336521b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        T6(textView2, com.p314xaae8f345.mm.R.C30867xcad56011.oh7, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pb(this));
        em.z3 z3Var4 = (em.z3) ((jz5.n) gVar).mo141623x754a37bb();
        if (z3Var4.f336524e == null) {
            z3Var4.f336524e = (android.widget.TextView) z3Var4.f336520a.findViewById(com.p314xaae8f345.mm.R.id.f568182uz2);
        }
        android.widget.TextView textView3 = z3Var4.f336524e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        T6(textView3, com.p314xaae8f345.mm.R.C30867xcad56011.in8, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qb(this));
    }
}
