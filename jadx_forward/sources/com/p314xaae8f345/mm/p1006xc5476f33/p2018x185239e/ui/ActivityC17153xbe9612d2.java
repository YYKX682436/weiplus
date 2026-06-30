package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI */
/* loaded from: classes9.dex */
public class ActivityC17153xbe9612d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7 {

    /* renamed from: u2, reason: collision with root package name */
    public static final /* synthetic */ int f239128u2 = 0;

    /* renamed from: t2, reason: collision with root package name */
    public java.lang.String f239129t2;

    public final void C7() {
        gm0.j1.i();
        this.M = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, "");
        gm0.j1.i();
        this.N = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        gm0.j1.i();
        this.P = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void a7() {
        int i17 = this.f238976i;
        if (i17 == 0 || i17 == 2) {
            C7();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.M) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N)) {
                ss4.k0.H(true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k8(this));
            } else {
                ss4.k0.H(false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m8(this));
            }
            m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i(this.f238972g, this.W), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void b7(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf c5409x1e816faf) {
        c7(str, i17, str2, str3, str4, str5, str6, c5409x1e816faf, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(java.lang.String r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2.c7(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void d7() {
        int i17 = this.f238976i;
        if (i17 == 0 || i17 == 2) {
            m83099x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j(this.f238972g, this.W), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void e7(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "doUnionTransferPlaceOrder, userName:%s groupName:%s", this.f238972g, this.W);
        nr4.a aVar = this.f238966d;
        if (aVar != null) {
            aVar.b(3, java.lang.Integer.valueOf(this.f238982m), java.lang.Double.valueOf(this.f238968e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.o1(this.f238972g, this.W, this.f238968e, this.X, str, str2);
        if (this.f39902xe856ec83) {
            mo73913x2b33b77f();
            m83099x5406100e(o1Var, false);
        } else {
            m83098x5406100e(o1Var);
        }
        this.V = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "[onCreate]");
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("pageHasRestored", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "[onCreate] is restore status？: %s，needFinish？：%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).mj(z17, "3", "remittance")));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15386, 1, 1);
        m83090x14f40144(2783);
        m83090x14f40144(4465);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2783);
        m83121xf6ff5b27(4465);
        mo48627xce38d9a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pageHasRestored", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "[onSaveInstanceState]");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.i) m1Var;
            iVar.O(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p8(this, iVar));
            if (iVar.f295564i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceUI", "net error: %s", iVar);
            }
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j)) {
            return super.mo48630x76e0bfae(i17, i18, str, m1Var);
        }
        mo48627xce38d9a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j) m1Var;
        jVar.O(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r8(this, jVar));
        jVar.J(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q8(this, jVar));
        if (jVar.f295564i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceUI", "union net error: %s", jVar);
            r45.xx xxVar = jVar.f238394r;
            if (xxVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xxVar.f472105i)) {
                this.I1 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2x);
            } else {
                this.I1 = jVar.f238394r.f472105i;
            }
            j7();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void p7(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
        }
        db5.e1.G(abstractActivityC21394xb3d2c0cf, str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s8(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void q7() {
        db5.t7.m123882x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hye, 0).show();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: shouldEnsureSoterConnection */
    public boolean mo48648xabe27cf2() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17142x347c74c7
    public void x7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "7";
        c6241x543927b6.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j8(this, c6241x543927b6);
        c6241x543927b6.e();
    }
}
