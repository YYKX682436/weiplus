package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI */
/* loaded from: classes9.dex */
public class ActivityC19044x4ece2457 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f260387d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f260388e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f260389f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f260390g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f260391h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f260392i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f260393m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f260394n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f260395o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f260396p;

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
        this.f260391h.removeAllViews();
        java.util.Vector vector = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295515g;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1 c17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c();
        c17.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b()) && c17.f295509a > 0) {
            this.f260389f.setVisibility(8);
            this.f260390g.setVisibility(0);
            this.f260387d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575119ku4);
            if (vector.size() == 0 || vector.size() == 1) {
                this.f260388e.setFillViewport(true);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f260390g.getLayoutParams();
                layoutParams.removeRule(3);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i65.a.b(mo55332x76847179(), 96);
                this.f260390g.setLayoutParams(layoutParams);
            } else {
                this.f260388e.setFillViewport(false);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f260390g.getLayoutParams();
                layoutParams2.removeRule(12);
                layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.be_);
                layoutParams2.topMargin = i65.a.b(mo55332x76847179(), 48);
                layoutParams2.bottomMargin = i65.a.b(mo55332x76847179(), 64);
                this.f260390g.setLayoutParams(layoutParams2);
            }
        } else {
            this.f260389f.setVisibility(0);
            this.f260390g.setVisibility(8);
            this.f260387d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kts);
            if (vector.size() == 0) {
                this.f260388e.setFillViewport(true);
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f260389f.getLayoutParams();
                layoutParams3.removeRule(3);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = i65.a.b(mo55332x76847179(), 96);
                this.f260389f.setLayoutParams(layoutParams3);
            } else {
                this.f260388e.setFillViewport(false);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) this.f260389f.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(3, com.p314xaae8f345.mm.R.id.be_);
                layoutParams4.topMargin = i65.a.b(mo55332x76847179(), 48);
                layoutParams4.bottomMargin = i65.a.b(mo55332x76847179(), 64);
                this.f260389f.setLayoutParams(layoutParams4);
            }
        }
        if (vector.size() == 0) {
            this.f260391h.setVisibility(8);
            this.f260392i.setVisibility(8);
            return;
        }
        this.f260391h.setVisibility(0);
        this.f260392i.setVisibility(0);
        java.util.Iterator it = vector.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1 o1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1) it.next();
            if (o1Var.f295494d <= 0) {
                android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.d5v, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.beb);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565132be3);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565569cs5);
                textView.setText(o1Var.f295491a);
                textView2.setText(o1Var.f295492b);
                textView3.setTag(o1Var);
                textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.z(this));
                this.f260391h.addView(inflate);
            }
        }
        if (this.f260391h.getChildCount() == 0) {
            this.f260392i.setVisibility(8);
        } else {
            this.f260392i.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d6d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565133be4);
        this.f260387d = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f260389f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566880he0);
        this.f260390g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565565cs0);
        this.f260391h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566883he3);
        this.f260392i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566884he4);
        this.f260389f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q(this));
        this.f260390g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t(this));
        this.f260388e = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.bee);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u(this));
        U6();
        this.f260393m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.be9);
        this.f260394n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.bea);
        this.f260395o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.be6);
        this.f260396p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.be7);
        this.f260395o.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v(this));
        this.f260396p.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (1 == i17 && i18 == -1) {
            boolean a17 = ((mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class))).a();
            re4.v a18 = re4.u.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigitalCertUI", "getSecurityInfo isOpenTouchPay: %b", java.lang.Boolean.valueOf(a17));
            m83099x5406100e(new gs4.q(false, a17, a18.f476086a, a18.f476087b), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(1654);
        m83090x14f40144(1568);
        m83090x14f40144(1669);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 1);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1654);
        m83121xf6ff5b27(1568);
        m83121xf6ff5b27(1669);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof gs4.q) {
            U6();
        } else if (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0) {
            if (i18 == 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                c7053xf3ca9650.f143649d = 2L;
                c7053xf3ca9650.f143650e = 2L;
                c7053xf3ca9650.k();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 11);
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().a(((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r0) m1Var).f295519d);
                android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(mo55332x76847179(), "", 0);
                android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktr));
                m125854x26a183b.setGravity(17, 0, 0);
                m125854x26a183b.setView(inflate);
                m125854x26a183b.show();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 12);
            }
            U6();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.b0.class);
    }
}
