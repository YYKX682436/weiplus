package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI */
/* loaded from: classes9.dex */
public class ActivityC19049x13c7e4b8 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements qp5.i0, android.widget.TextView.OnEditorActionListener {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f260430m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f260431d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f260432e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f260433f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f260434g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f260435h;

    /* renamed from: i, reason: collision with root package name */
    public int f260436i = 1;

    public final void W6(boolean z17) {
        this.f39901x43041b74.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.a1(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: forceCancel */
    public void mo73851xc8398945() {
        m83094xccf10110();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5y;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f260431d = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f566836h83);
        this.f260432e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pbe);
        this.f260435h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.m7j);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pbm);
        this.f260433f = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f260431d.m83211x749e7e77(this);
        this.f260431d.m83209x37562b58(this);
        int b17 = i65.a.b(mo55332x76847179(), 19);
        int b18 = i65.a.b(mo55332x76847179(), 8);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(b17, b17);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = b18;
        layoutParams.leftMargin = b18;
        this.f260431d.m83173x1e821d71().setLayoutParams(layoutParams);
        this.f260431d.m83173x1e821d71().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e m83173x1e821d71 = this.f260431d.m83173x1e821d71();
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        m83173x1e821d71.f273574u = com.p314xaae8f345.mm.R.raw.f79679xe7836e52;
        m83173x1e821d71.f273575v = color;
        this.f260432e.setVisibility(4);
        this.f260434g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566881he1);
        qp5.p.e(this.f260431d);
        m83126x8f91b80(this.f260431d, 1, false, false, true);
        this.f260431d.m83169xe7297452().setSingleLine(false);
        android.widget.EditText m83169xe7297452 = this.f260431d.m83169xe7297452();
        this.f260431d.m83169xe7297452().setPadding(m83169xe7297452.getPaddingLeft(), m83169xe7297452.getPaddingTop(), m83169xe7297452.getPaddingLeft(), m78510xe15784dd().getPaddingBottom());
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f260434g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v0(this));
        this.f260436i = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().o();
        at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
        java.lang.String str = v1Var != null ? v1Var.f67041x8a2570f9 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", java.lang.Integer.valueOf(this.f260436i), str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.b(this, this.f260436i);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f260431d;
        int i17 = this.f260436i;
        rp5.b m83177x57f7af4d = viewOnFocusChangeListenerC22907xe18534c2.m83177x57f7af4d();
        if (m83177x57f7af4d instanceof qp5.n) {
            ((qp5.n) m83177x57f7af4d).f(i17);
        }
        this.f260431d.m83214xdc742163(str);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f260431d.m83186xefe232c4().getLayoutParams();
        layoutParams2.width = -2;
        this.f260431d.m83186xefe232c4().setLayoutParams(layoutParams2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f260431d.m83183xfb85ada3())) {
            this.f260434g.setEnabled(false);
        }
        this.f260431d.d();
        if (this.f260436i == 1) {
            m83126x8f91b80(this.f260431d, 1, false, false, true);
        } else {
            m83125x8f91b80(this.f260431d, 1, true);
        }
        this.f260431d.m83199x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktt, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.g0(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q())));
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w0(this));
        W6(this.f39901x43041b74.getVisibility() == 0);
        this.f260431d.m83218xe68631a1(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m83090x14f40144(fe1.o.f69744x366c91de);
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u0(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(fe1.o.f69744x366c91de);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        this.f260432e.setVisibility(4);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view = this.f39900xbab696ce;
        if (view == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View view2 = this.f39900xbab696ce;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/pwd/ui/WalletIdCardCheckUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onPreSceneEnd */
    public boolean mo73852x5df1e913(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0)) {
            return true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
        c7053xf3ca9650.f143649d = 1L;
        c7053xf3ca9650.f143650e = 2L;
        c7053xf3ca9650.k();
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(mo55332x76847179(), "", 0);
        android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ktw));
        m125854x26a183b.setGravity(17, 0, 0);
        m125854x26a183b.setView(inflate);
        m125854x26a183b.show();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.y0(this, m125854x26a183b);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(y0Var, 750L, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.b1.class);
    }
}
