package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI */
/* loaded from: classes9.dex */
public class ActivityC19119xf1f23950 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f261608d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f261609e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f261610f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f261611g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f261612h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f261613i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f261614m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261615n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f261616o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f261617p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261618q;

    public ActivityC19119xf1f23950() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f261615n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.1
            {
                this.f39173x3fe91575 = 323604482;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.this;
                activityC19119xf1f23950.f261615n.mo48814x2efc64();
                int i17 = c6256xb3fb7c12.f136506g.f87653a;
                if (i17 != -1 && i17 != 0) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WalletPwdConfirmUI", "WalletPwdConfirmUI finish");
                activityC19119xf1f23950.finish();
                return false;
            }
        };
        this.f261616o = false;
        this.f261617p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i7(this), false);
        this.f261618q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6251x90cd085b>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.7
            {
                this.f39173x3fe91575 = -1940712853;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6251x90cd085b c6251x90cd085b) {
                if (c6251x90cd085b instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6251x90cd085b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.this;
                    activityC19119xf1f23950.f261616o = false;
                    activityC19119xf1f23950.U6();
                }
                return false;
            }
        };
    }

    public final void U6() {
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        m83105x7498fe14.putBoolean("intent_bind_end", true);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: getCancelable */
    public boolean mo73849x5ed8aeca() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261611g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f261612h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pen);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f261611g);
        if (m83108x2b5a5a39() != null) {
            "ModifyPwdProcess".equals(m83108x2b5a5a39().e());
        }
        this.f261612h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kzp);
        this.f261609e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hdj);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(m83110xfb85bbae(0))) {
            this.f261609e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
        } else {
            this.f261609e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kzs);
        }
        this.f261609e.setVisibility(0);
        this.f261609e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f7(this));
        this.f261609e.setEnabled(false);
        this.f261609e.setClickable(false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.f261608d = viewOnFocusChangeListenerC22906x9d30fd14;
        qp5.p.b(viewOnFocusChangeListenerC22906x9d30fd14);
        this.f261608d.m83162x631d8491(6);
        if (this.f261613i) {
            this.f261608d.m83164xdcb508b4(this.f261614m);
        }
        this.f261608d.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g7(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.aiq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m83113x77af3ad7();
        m83125x8f91b80(this.f261608d, 0, false);
        m83139x8022ec1f();
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h7(this, (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2)));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return !(m83108x2b5a5a39() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        this.f261610f = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) m83105x7498fe14().getParcelable("key_pay_info");
        android.os.Bundle m83105x7498fe14 = m83105x7498fe14();
        if (m83105x7498fe14 != null) {
            boolean z17 = m83105x7498fe14.getBoolean("isNeedSm2Encrypt", false);
            this.f261613i = z17;
            if (z17) {
                int i17 = m83105x7498fe14.getInt("Sm2EncryptType", 1);
                this.f261614m = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletPwdConfirmUI", "pwd encrypt type need smc, type:%d", java.lang.Integer.valueOf(i17));
            }
        }
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.d(this, m83105x7498fe14(), 6);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.e7(this));
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
        }
        this.f261615n.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f261615n.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f261618q.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f261608d.requestFocus();
        super.onResume();
        this.f261618q.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        m83105x7498fe14().putString("key_pwd1", this.f261608d.m83161xfb85ada3());
        if (m1Var instanceof ss4.e0) {
            if (!this.f261616o) {
                U6();
            }
        } else if (com.p314xaae8f345.mm.p2802xd031a825.a.g(this) == null || !com.p314xaae8f345.mm.p2802xd031a825.a.g(this).t(this, null)) {
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this, m83105x7498fe14());
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = this.f261610f;
            m83096xe7b1ccf7(new ss4.e0(c19760x34448d56 != null ? c19760x34448d56.f273647m : "", 22));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6252x7c181ba0 c6252x7c181ba0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6252x7c181ba0();
            if (com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6252x7c181ba0.class)) {
                this.f261616o = true;
                c6252x7c181ba0.e();
            }
            this.f261617p.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.u.class);
    }
}
