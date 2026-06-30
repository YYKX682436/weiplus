package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI */
/* loaded from: classes9.dex */
public class ActivityC17114xc078d367 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f238089i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f238090d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 f238091e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 f238092f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f238093g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238094h;

    public final void V6() {
        db5.e1.y(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), "", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569709jm, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ada);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.adi);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(textView, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.c(this), true), mo55332x76847179());
        return linearLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576368i;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        if (m79335xcc101dd9() != null) {
            int dimensionPixelSize = mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            m79335xcc101dd9().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            m79335xcc101dd9().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f238090d = m79336x8b97809d;
        this.f238091e = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("bank_mobile_remit_choose_bank");
        this.f238092f = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f238090d).h("bank_mobile_remit_choose_mobile");
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f474056 = this.f238091e;
        c16742x4f474056.M1 = true;
        c16742x4f474056.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.adk));
        this.f238091e.Q(0);
        this.f238091e.Y(8);
        this.f238091e.n0(this.f238090d);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f238091e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 c16742x4f4740562 = this.f238092f;
        c16742x4f4740562.M1 = true;
        c16742x4f4740562.O(getString(com.p314xaae8f345.mm.R.C30867xcad56011.adm));
        this.f238092f.Q(0);
        this.f238092f.Y(8);
        this.f238092f.n0(this.f238090d);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f238092f);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f238090d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f238093g = null;
        gm0.j1.d().q(2952, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onPreferenceTreeClick() key:%s", c21560x1fce98fb.f279313q);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("bank_mobile_remit_choose_bank", c21560x1fce98fb.f279313q)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("bank_mobile_remit_choose_mobile", c21560x1fce98fb.f279313q)) {
                return false;
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(22);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "doNetSceneMobileRemitGetHomePage() ");
            if (this.f238093g == null) {
                this.f238093g = db5.e1.O(mo55332x76847179(), null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.g(this));
            }
            gm0.j1.d().a(2952, this);
            gm0.j1.d().g(new sw3.d(false));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b c7056xe1fb940b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b();
            c7056xe1fb940b.f143654d = 4;
            c7056xe1fb940b.k();
            return true;
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(21);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_trans_to_bank_card_unrealname_intercept, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "clicfg_android_trans_to_bank_card_unrealname_intercept is open");
            if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "trans to bank card, intercept, jump to real name page");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo55332x76847179();
                abstractActivityC21394xb3d2c0cf.getIntent().putExtra("process_id", com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class.hashCode());
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("real_name_verify_mode", 0);
                bundle.putInt("entry_scene", 49);
                bundle.putInt("realname_verify_process_from_scene", 7);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a.class, bundle, null);
                return true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "clicfg_android_trans_to_bank_card_unrealname_intercept is closed");
        }
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_transfer_to_bank_mini_app_switch_android, false)) {
            if (!((h45.q) i95.n0.c(h45.q.class)).mo24852xdf2d02ae(null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.f(this))) {
                j45.l.h(mo55332x76847179(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            }
            return true;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = "wx0d0c604dfc7193ec";
        b1Var.f398555f = "pages/index/index.html?from=native";
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.c0.f34604x366c91de;
        b1Var.f398570o = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(mo55332x76847179(), b1Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d70 d70Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        android.app.Dialog dialog = this.f238093g;
        if (dialog != null && dialog.isShowing()) {
            this.f238093g.dismiss();
            this.f238093g = null;
        }
        if (m1Var instanceof sw3.d) {
            gm0.j1.d().q(2952, this);
            if (i17 != 0 && i18 != 0) {
                V6();
                return;
            }
            r45.np6 np6Var = ((sw3.d) m1Var).f494998t;
            if (np6Var == null) {
                np6Var = null;
            }
            android.content.Intent intent = new android.content.Intent();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f238094h)) {
                intent.putExtra("key_content", this.f238094h);
                this.f238094h = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mResponse.is_new_user: %s", java.lang.Boolean.valueOf(np6Var.f463119p));
            if (!np6Var.f463119p || (d70Var = np6Var.f463120q) == null) {
                j45.l.j(mo55332x76847179(), "remittance", ".mobile.ui.MobileRemitNumberInputUI", intent, null);
                return;
            }
            try {
                intent.putExtra("key_compliance_item ", d70Var.mo14344x5f01b1f6());
                j45.l.j(mo55332x76847179(), "remittance", ".mobile.ui.MobileRemitWelcomeUI", intent, null);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", " mResponse printStackTrace: %s", e17.toString());
                V6();
            }
        }
    }
}
