package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class ca implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f261712d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f261713e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ba f261714f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa f261715g;

    public void a(android.content.Intent intent) {
        ss4.u uVar = new ss4.u();
        gm0.j1.i();
        gm0.j1.n().f354821b.g(uVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar = this.f261715g;
        if (aaVar != null) {
            aaVar.mo25350x58772ac(intent);
        }
    }

    public void b() {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2541, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(2791, this);
    }

    public void c() {
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2541, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(2791, this);
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar, boolean z17) {
        this.f261715g = aaVar;
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        if (!this.f261713e && booleanValue) {
            aaVar.mo25352x7eeae7cd();
            return;
        }
        boolean z18 = this.f261712d;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAgreementsHelper", "showProtoCol isShow %s", java.lang.Boolean.valueOf(z18));
            aaVar.mo25352x7eeae7cd();
        } else {
            if (!z17) {
                aaVar.mo25352x7eeae7cd();
                return;
            }
            this.f261712d = true;
            ss4.k kVar = new ss4.k();
            gm0.j1.i();
            gm0.j1.n().f354821b.g(kVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ss4.k)) {
            if ((m1Var instanceof ss4.u) && i17 == 0 && i18 == 0) {
                if (!this.f261713e) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAgreementsHelper", "agree Ok!");
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            ss4.k kVar = (ss4.k) m1Var;
            at4.d2.a();
            java.lang.String str2 = kVar.f493606f;
            if (this.f261713e) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("agreement_content", kVar.f493606f);
                j45.l.n(this.f261714f.mo25348x76847179(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent, this.f261714f.mo25349xc7cead47());
            } else if (at4.d2.a() && kVar.f493607g) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("agreement_content", kVar.f493606f);
                j45.l.n(this.f261714f.mo25348x76847179(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent2, this.f261714f.mo25349xc7cead47());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.aa aaVar = this.f261715g;
                if (aaVar != null) {
                    aaVar.mo25352x7eeae7cd();
                }
            }
        }
    }
}
