package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI */
/* loaded from: classes9.dex */
public class ActivityC19111xd5a60886 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f261507h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r3 f261508d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f261509e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261510f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f261511g;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        this.f261511g.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5z;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261509e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f261510f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pen);
        this.f261511g = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f261509e);
        m83113x77af3ad7();
        qp5.p.b(this.f261511g);
        this.f261511g.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.q3(this));
        m83125x8f91b80(this.f261511g, 0, false);
        m83139x8022ec1f();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCheckPwdNewUI", "scene: %s", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 3) {
            this.f261508d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l0(this);
        } else if (intExtra == 4) {
            this.f261508d = new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.b4(this);
        } else {
            this.f261508d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e0(this);
        }
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54450xbf7c1df6("");
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        mo43517x10010bd5();
        this.f261508d.mo67483x3e5a77bb();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p3(this));
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
                return;
            }
            try {
                if (b3.l.m9698x3fed0563(mo55332x76847179(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                    getWindow().setHideOverlayWindows(true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCheckPwdNewUI", "no permission");
                    jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletCheckPwdNewUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f261508d.mo67484xac79a11b();
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
        boolean mo67485x76e0bfae = this.f261508d.mo67485x76e0bfae(i17, i18, str, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCheckPwdNewUI", "controller ret: %s", java.lang.Boolean.valueOf(mo67485x76e0bfae));
        return mo67485x76e0bfae;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setContentViewVisibility */
    public void mo67598xf0aced2e(int i17) {
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.w.class);
    }
}
