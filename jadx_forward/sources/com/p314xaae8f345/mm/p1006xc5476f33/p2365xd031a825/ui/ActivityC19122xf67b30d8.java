package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

@db5.a(m123858x6ac9171 = 1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI */
/* loaded from: classes9.dex */
public class ActivityC19122xf67b30d8 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f261629d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f261630e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261631f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f261632g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f261633h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.1
        {
            this.f39173x3fe91575 = 323604482;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8 activityC19122xf67b30d8 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.this;
            activityC19122xf67b30d8.f261633h.mo48814x2efc64();
            int i17 = c6256xb3fb7c12.f136506g.f87653a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WalletSetPasswordUI", "WalletSetPasswordUI finish");
            activityC19122xf67b30d8.finish();
            return false;
        }
    };

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
        this.f261632g = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        this.f261630e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f261631f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pen);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f261630e);
        if (m83105x7498fe14().getBoolean("key_is_forgot_process", false) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83105x7498fe14().getString("key_identity")) && m83105x7498fe14().getInt("key_id_type", -1) != -1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83105x7498fe14().getString("key_true_name"))) {
            this.f261631f.setVisibility(4);
        }
        if ((m83108x2b5a5a39() == null || !"ModifyPwdProcess".equals(m83108x2b5a5a39().e())) && m83108x2b5a5a39() != null && "ResetPwdProcessByToken".equals(m83108x2b5a5a39().e())) {
            java.lang.String string = m83105x7498fe14().getString("key_pwd_title");
            java.lang.String string2 = m83105x7498fe14().getString("key_pwd_desc");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                this.f261630e.setText(string);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                this.f261631f.setText(string2);
                this.f261631f.setVisibility(0);
            }
        }
        if (m83105x7498fe14().getInt("key_err_code", 0) == -1002) {
            this.f261631f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            this.f261631f.setText(c01.z1.I() ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzr) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzq));
            m83105x7498fe14().putInt("key_err_code", 0);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.f261629d = viewOnFocusChangeListenerC22906x9d30fd14;
        qp5.p.b(viewOnFocusChangeListenerC22906x9d30fd14);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.aiq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f261629d.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w8(this));
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y8(this));
        m83113x77af3ad7();
        m83125x8f91b80(this.f261629d, 0, false);
        m83139x8022ec1f();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return !(m83108x2b5a5a39() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.d(this, m83105x7498fe14(), 5);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v8(this));
        if (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.P()) {
            getWindow().addFlags(8192);
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) && android.os.Build.VERSION.SDK_INT >= 31) {
                try {
                    if (b3.l.m9698x3fed0563(mo55332x76847179(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                        getWindow().setHideOverlayWindows(true);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WalletSetPasswordUI", "no permission");
                        jx3.f.INSTANCE.mo68478xbd3cda5f(28867, "100");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WalletSetPasswordUI", e17, "", new java.lang.Object[0]);
                    return;
                }
            }
        }
        this.f261633h.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f261633h.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f261629d.requestFocus();
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
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.u.class);
    }
}
