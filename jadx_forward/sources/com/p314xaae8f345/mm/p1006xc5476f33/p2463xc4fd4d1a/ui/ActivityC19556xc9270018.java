package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI */
/* loaded from: classes9.dex */
public class ActivityC19556xc9270018 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f270076g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.h f270077h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f270078i;

    /* renamed from: m, reason: collision with root package name */
    public d05.k f270079m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f270080n = false;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f270081o = new e05.r(this);

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368
    public boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof d05.d) {
                at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
                fj6.getClass();
                fj6.f95541q = java.lang.System.currentTimeMillis() / 1000;
                d05.k kVar = ((d05.d) m1Var).f307120d;
                this.f270079m = kVar;
                if (kVar != null && kVar.f307128a == 2) {
                    gm0.j1.i();
                    if (((java.lang.Boolean) gm0.j1.u().c().l(196658, java.lang.Boolean.FALSE)).booleanValue()) {
                        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
                        android.os.Bundle bundle = g17.f295334c;
                        bundle.putDouble("key_total_amount", this.f270079m.f307129b);
                        bundle.putBoolean("key_can_upgrade_amount", this.f270079m.f307133f);
                        g17.E(this, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa.class, bundle, 1);
                        return true;
                    }
                }
                if (X6()) {
                    mo67598xf0aced2e(0);
                    Y6();
                }
                return true;
            }
            if (m1Var instanceof d05.i) {
                V6().d(new ss4.e0(null, 0), true);
            } else if (m1Var instanceof ss4.e0) {
                finish();
            }
        }
        return false;
    }

    public final boolean X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f270078i;
        if (c19091x9511676c == null) {
            return false;
        }
        if (c19091x9511676c.f69220xb7753620 == 0) {
            return true;
        }
        int i17 = c19091x9511676c.f69263xe0badd12;
        d05.k kVar = this.f270079m;
        if (kVar != null) {
            i17 = kVar.f307128a;
        }
        if (i17 == 1) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95541q) > 300L ? 1 : (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95541q) == 300L ? 0 : -1)) > 0;
        }
        if (i17 == 3) {
            db5.e1.o(this, com.p314xaae8f345.mm.R.C30867xcad56011.l2d, -1, false, new e05.p(this));
            return false;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                return true;
            }
            this.f270077h.f295334c.putBoolean("key_can_unbind", false);
        }
        d05.k kVar2 = this.f270079m;
        if (kVar2 == null) {
            return true;
        }
        this.f270077h.f295334c.putString("key_repayment_url", kVar2.f307134g);
        com.p314xaae8f345.mm.p2802xd031a825.h hVar = this.f270077h;
        hVar.o(this, 1, hVar.f295334c);
        return false;
    }

    public final void Y6() {
        if (!this.f270080n) {
            mo43517x10010bd5();
        }
        if (this.f270079m != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.C19555x3c04b1ec c19555x3c04b1ec = (com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.C19555x3c04b1ec) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_header");
            c19555x3c04b1ec.N.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(this.f270079m.f307130c));
            java.lang.String str = this.f270078i.f69217xaef0808c;
            c19555x3c04b1ec.M.setText(c19555x3c04b1ec.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575175l35, this.f270079m.f307139l, str));
        }
        if (this.f270079m != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_total_amount").L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l2f, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(this.f270079m.f307129b)));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).m("wallet_wxcredit_change_amount", !this.f270079m.f307133f);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_bill");
            double d17 = this.f270079m.f307131d;
            if (d17 != 0.0d) {
                h17.H(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d17));
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_repayment");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_repayment_tips");
            double d18 = this.f270079m.f307132e;
            if (d18 > 0.0d) {
                h18.H(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d18));
                h19.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575173l33, this.f270079m.f307135h));
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).m("wallet_wxcredit_repayment_tips", false);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).m("wallet_wxcredit_repayment_tips", true);
            }
        }
        if (this.f270078i != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_bank_name").L(this.f270078i.f69217xaef0808c);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19554x3dc48b7a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).h("wallet_wxcredit_footer")).P = this.f270081o;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f270076g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576510d6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f270080n = true;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.l2e);
        this.f270076g = m79336x8b97809d();
        mo54448x9c8c0d33(new e05.q(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new e05.t(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        mo67598xf0aced2e(0);
        Y6();
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        V6().c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        V6().c(600);
        mo67598xf0aced2e(4);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        this.f270077h = g17;
        if (this.f270078i == null) {
            this.f270078i = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) g17.f295334c.getParcelable("key_bankcard");
        }
        if (X6()) {
            if (this.f295627e == null) {
                if (this.f295628f == null) {
                    this.f295628f = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
                }
                this.f295627e = this.f295628f.p(this, this.f295626d);
            }
            if (this.f295627e.c(this.f270078i)) {
                return;
            }
            mo67598xf0aced2e(0);
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        V6().i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de);
        V6().i(600);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        d05.k kVar;
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("wallet_wxcredit_change_amount".equals(str)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key_bankcard", this.f270078i);
            com.p314xaae8f345.mm.p2802xd031a825.a.j(this, c05.c.class, bundle, null);
            return true;
        }
        if ("wallet_wxcredit_bill".equals(str)) {
            if (this.f270079m != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("key_url", this.f270079m.f307138k);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, c05.e.class, bundle2, null);
            }
        } else if ("wallet_wxcredit_card_info".equals(str)) {
            if (this.f270079m != null) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("key_url", this.f270079m.f307136i);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, c05.e.class, bundle3, null);
            }
        } else if ("wallet_wxcredit_right".equals(str)) {
            d05.k kVar2 = this.f270079m;
            if (kVar2 != null) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this, kVar2.f307137j, false);
            }
        } else if ("wallet_wxcredit_repayment".equals(str)) {
            d05.k kVar3 = this.f270079m;
            if (kVar3 != null) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this, kVar3.f307134g, false);
            }
        } else if ("wallet_wxcredit_bank_name".equals(str) && (kVar = this.f270079m) != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.a0(this, kVar.f307141n.f307127a);
        }
        return false;
    }
}
