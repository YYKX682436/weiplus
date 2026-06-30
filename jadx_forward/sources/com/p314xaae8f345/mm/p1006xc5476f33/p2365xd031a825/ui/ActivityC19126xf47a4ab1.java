package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI */
/* loaded from: classes9.dex */
public class ActivityC19126xf47a4ab1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f261659d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f261660e;

    /* renamed from: f, reason: collision with root package name */
    public at4.t f261661f = new at4.t();

    /* renamed from: g, reason: collision with root package name */
    public boolean f261662g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 f261663h = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z9(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1 activityC19126xf47a4ab1) {
        if (activityC19126xf47a4ab1.m83106x57340563() != null) {
            activityC19126xf47a4ab1.f261660e.m83161xfb85ada3();
            at4.z0 z0Var = new at4.z0();
            z0Var.f95556b = activityC19126xf47a4ab1.m83105x7498fe14().getString("key_pwd1");
            z0Var.f95568n = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19126xf47a4ab1.m83105x7498fe14().getParcelable("key_pay_info");
            z0Var.f95565k = 1;
            z0Var.f95567m = activityC19126xf47a4ab1.m83105x7498fe14().getString("key_cre_type");
            z0Var.f95566l = activityC19126xf47a4ab1.f261660e.m83161xfb85ada3();
            java.lang.String string = activityC19126xf47a4ab1.m83105x7498fe14().getString("kreq_token");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (string == null) {
                string = "";
            }
            z0Var.f95558d = string;
            int i17 = activityC19126xf47a4ab1.m83105x7498fe14().getInt("key_pay_flag", 0);
            if (i17 == 1) {
                z0Var.f95555a = "1";
            } else if (i17 != 2) {
                if (i17 == 3) {
                    if (activityC19126xf47a4ab1.m83105x7498fe14().getBoolean("key_is_oversea", false)) {
                        z0Var.f95555a = "6";
                    } else {
                        z0Var.f95555a = "3";
                    }
                }
            } else if (activityC19126xf47a4ab1.m83105x7498fe14().getBoolean("key_is_oversea", false)) {
                z0Var.f95555a = "5";
            } else {
                z0Var.f95555a = "2";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) activityC19126xf47a4ab1.m83105x7498fe14().getParcelable("key_bankcard");
            if (c19091x9511676c != null) {
                z0Var.f95559e = c19091x9511676c.f69223x58802fcb;
                z0Var.f95560f = c19091x9511676c.f69225xed6d60f6;
                java.lang.String str = c19091x9511676c.f69215x54da57dd;
                z0Var.f95562h = str != null ? str : "";
            } else {
                java.lang.String string2 = activityC19126xf47a4ab1.m83105x7498fe14().getString("key_bank_type");
                z0Var.f95559e = string2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    z0Var.f95559e = activityC19126xf47a4ab1.m83105x7498fe14().getString("key_bind_card_type", "");
                }
            }
            activityC19126xf47a4ab1.m83106x57340563().d(z0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8n;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261659d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569298pr4);
        this.f261660e = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.f569297pr3);
        java.lang.String string = m83105x7498fe14().getString("key_true_name");
        java.lang.String string2 = m83105x7498fe14().getString("key_cre_name");
        java.lang.String string3 = m83105x7498fe14().getString("key_cre_type");
        this.f261659d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmi, string, string2));
        this.f261660e.m83162x631d8491(4);
        this.f261660e.m83163xf2d0f07a(34.0f);
        this.f261660e.m83166x1270e8e7(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x9(this));
        if ("1".equals(string3)) {
            m83125x8f91b80(this.f261660e, 1, false);
        } else {
            m83125x8f91b80(this.f261660e, 1, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        this.f261661f = new at4.t(m83105x7498fe14());
        mo43517x10010bd5();
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null && (findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v)) != null) {
            findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        if (fp.h.c(21)) {
            if (fp.h.c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741));
            }
        }
        mo54450xbf7c1df6("");
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v9(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onPreSceneEnd */
    public boolean mo73852x5df1e913(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "onPreSceneEnd %s %s", java.lang.Integer.valueOf(i18), m1Var);
        if ((m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0) && i18 == 0) {
            this.f261662g = true;
            db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f575117ku2, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0)) {
            return false;
        }
        if (i18 == 0 || !((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0) m1Var).f295523f) {
            this.f261660e.a();
            return true;
        }
        db5.e1.G(mo55332x76847179(), str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y9(this));
        return true;
    }
}
