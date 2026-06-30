package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI */
/* loaded from: classes9.dex */
public class ActivityC19040x4dc346d9 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260356d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f260357e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 f260358f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19039x74188f4d f260359g;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576501cx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.d(this));
        if (m79335xcc101dd9() != null) {
            m79335xcc101dd9().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f260356d = m79336x8b97809d;
        if (m79336x8b97809d != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).t();
        }
        this.f260358f = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).h("wallet_banlance_privacy_cb");
        this.f260357e = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(this, false, false, null);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new gs4.l());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78530x8b45058f();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19039x74188f4d c19039x74188f4d = this.f260359g;
        if (c19039x74188f4d != null) {
            java.util.HashMap hashMap = (java.util.HashMap) c19039x74188f4d.M;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).wi((java.lang.String) entry.getKey(), (k70.f0) entry.getValue());
            }
            hashMap.clear();
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2635, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2554, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c21560x1fce98fb.f279313q, "wallet_banlance_privacy_cb")) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b43 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43) c21560x1fce98fb;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "set balance privacy: %s", java.lang.Boolean.valueOf(c19038x11af1b43.N()));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new gs4.n(c19038x11af1b43.N()));
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2635, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2554, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (m1Var instanceof gs4.l) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "success get balance privacy detail");
                gs4.l lVar = (gs4.l) m1Var;
                if (this.f260356d == null || lVar.H() == null || lVar.H().f468921g == null) {
                    z17 = false;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "refresh() title_icon:%s,title:%s,switch_title:%s,switch_desc:%s,switch_state:%s", lVar.H().f468921g.f461705e, lVar.H().f468921g.f461704d, lVar.H().f468921g.f461706f, lVar.H().f468921g.f461707g, java.lang.Integer.valueOf(lVar.H().f468920f));
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).g(com.p314xaae8f345.mm.R.xml.f576501cx);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19039x74188f4d c19039x74188f4d = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19039x74188f4d) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).h("wallet_balance_privacy_header");
                    this.f260359g = c19039x74188f4d;
                    java.lang.String str2 = lVar.H().f468921g.f461705e;
                    c19039x74188f4d.getClass();
                    this.f260359g.L = lVar.H().f468921g.f461704d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b43 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).h("wallet_banlance_privacy_cb");
                    this.f260358f = c19038x11af1b43;
                    c19038x11af1b43.f279318v = false;
                    c19038x11af1b43.L(lVar.H().f468921g.f461706f);
                    this.f260358f.H(lVar.H().f468921g.f461707g);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b432 = this.f260358f;
                    int i19 = lVar.H().f468920f;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c19038x11af1b432.X = i19 == 1;
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).notifyDataSetChanged();
                    z17 = true;
                }
                android.app.Dialog dialog = this.f260357e;
                if (dialog != null && dialog.isShowing()) {
                    this.f260357e.dismiss();
                }
                if (!z17) {
                    db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyr), "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.e(this));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "fail get balance privacy detail");
                android.app.Dialog dialog2 = this.f260357e;
                if (dialog2 != null && dialog2.isShowing()) {
                    this.f260357e.dismiss();
                }
                db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyr), "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.f(this));
            }
        }
        if (m1Var instanceof gs4.n) {
            if (i17 != 0 || i18 != 0) {
                db5.t7.m123883x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyn), 1).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b433 = this.f260358f;
                if (c19038x11af1b433 == null) {
                    c19038x11af1b433.S(!c19038x11af1b433.N());
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.f36 f36Var = ((gs4.n) m1Var).f356653d;
                if (f36Var == null) {
                    f36Var = new r45.f36();
                }
                objArr[0] = java.lang.Integer.valueOf(f36Var.f455528d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "fail set balance privacy %s", objArr);
                return;
            }
            gs4.n nVar = (gs4.n) m1Var;
            r45.g36 g36Var = nVar.f356654e;
            if (g36Var == null) {
                g36Var = new r45.g36();
            }
            int i27 = g36Var.f456394f;
            if (this.f260358f == null) {
                this.f260358f = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260356d).h("wallet_banlance_privacy_cb");
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b434 = this.f260358f;
            objArr2[0] = c19038x11af1b434 != null ? java.lang.Boolean.valueOf(c19038x11af1b434.N()) : "null";
            objArr2[1] = java.lang.Integer.valueOf(i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalancePrivacyUI", "success set balance privacy detail:%s switchState:%s", objArr2);
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            r45.g36 g36Var2 = nVar.f356654e;
            if (g36Var2 == null) {
                g36Var2 = new r45.g36();
            }
            y07.f67070x94698091 = g36Var2.f456394f;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().mo880xb970c2b9(y07);
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            fj6.getClass();
            fj6.f95533i = new at4.u1(y07.f67065x3aaa9ebb, y07.f67070x94698091);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19038x11af1b43 c19038x11af1b435 = this.f260358f;
            if (c19038x11af1b435 != null) {
                c19038x11af1b435.S(i27 == 1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(or4.l.class);
    }
}
