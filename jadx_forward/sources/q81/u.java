package q81;

/* loaded from: classes7.dex */
public class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t81.c f442251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q81.x f442252b;

    public u(q81.x xVar, t81.c cVar) {
        this.f442252b = xVar;
        this.f442251a = cVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        final t81.c cVar = this.f442251a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "try record %s", cVar);
        ((java.util.concurrent.ConcurrentSkipListSet) this.f442252b.f442263f).add(cVar.f67698x28d45f97);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6(cVar.f67698x28d45f97, cVar.f67706xbae6789e, cVar.f67707xa1ecfcdb);
        try {
            c11667xc7e59dd6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v3.b(a6Var.m49244x9616526c(), 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", e17, "[Captured crash]", new java.lang.Object[0]);
            c11667xc7e59dd6 = null;
        }
        if (c11667xc7e59dd6 == null || c11667xc7e59dd6.f33456x1c82a56c < cVar.f67716x8987ca93) {
            if (!cVar.f67700xfc3d51d2) {
                cVar.f67700xfc3d51d2 = true;
                cVar.f67701xd252a11a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9952xce0038c9(cVar, new java.lang.String[0]);
            } else if (cVar.f67712x74b591e3 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s) retryTimes == 0, skip", a6Var.m49244x9616526c());
                ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9951xb06685ab(cVar, new java.lang.String[0]);
            } else if (cVar.f67701xd252a11a + cVar.f67711x33417908 > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryInterval %d, skip", a6Var.m49244x9616526c(), java.lang.Long.valueOf(cVar.f67711x33417908));
            } else {
                int i17 = cVar.f67710x17fc513d + 1;
                if (i17 > cVar.f67712x74b591e3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryTimes %d, skip", a6Var.m49244x9616526c(), java.lang.Integer.valueOf(cVar.f67712x74b591e3));
                    ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9951xb06685ab(cVar, new java.lang.String[0]);
                } else {
                    cVar.f67710x17fc513d = i17;
                    cVar.f67701xd252a11a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9952xce0038c9(cVar, new java.lang.String[0]);
                }
            }
            if (cVar.f67715x2262335f == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().l(a6Var.m49244x9616526c(), 0, cVar.f67716x8987ca93, cVar.f67708xb05c6f7, null);
                final km5.b b17 = km5.u.b();
                b17.b();
                new p81.j(cVar, new yz5.l() { // from class: q81.u$$a
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj2) {
                        int i18;
                        java.lang.Boolean bool = (java.lang.Boolean) obj2;
                        q81.u uVar = q81.u.this;
                        uVar.getClass();
                        boolean a17 = gm0.j1.a();
                        t81.c cVar2 = cVar;
                        if (a17) {
                            if (bool.booleanValue() && !android.text.TextUtils.isEmpty(cVar2.f67703x97cc69d6)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.c(cVar2);
                            } else if (!bool.booleanValue() && (((i18 = cVar2.f67712x74b591e3) <= 0 || cVar2.f67710x17fc513d + 1 > i18) && !android.text.TextUtils.isEmpty(cVar2.f67703x97cc69d6))) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.b(cVar2);
                            }
                            b17.mo143715xc84dc82d();
                        } else {
                            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "appId[%s] packageKey[%s] packageType[%d] version[%d]", cVar2.f67698x28d45f97, cVar2.f67706xbae6789e, java.lang.Integer.valueOf(cVar2.f67707xa1ecfcdb), java.lang.Integer.valueOf(cVar2.f67716x8987ca93));
                            uVar.f442252b.h();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "predownload normal pkg onResult AccountNotReady " + format);
                        }
                        return jz5.f0.f384359a;
                    }
                }).c();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6 n6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 D0 = n6Var.D0(cVar.f67698x28d45f97, cVar.f67715x2262335f, cVar.f67716x8987ca93);
                if (D0 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) integrated, decryptResult %b", cVar.f67698x28d45f97, java.lang.Integer.valueOf(cVar.f67715x2262335f), java.lang.Integer.valueOf(cVar.f67716x8987ca93), java.lang.Boolean.valueOf(q81.n.h(D0, q81.m.GET_CODE)));
                } else {
                    java.lang.String str = cVar.f67698x28d45f97;
                    int i18 = cVar.f67715x2262335f;
                    int i19 = cVar.f67716x8987ca93;
                    java.lang.String str2 = cVar.f67708xb05c6f7;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6();
                    m6Var.f67842x28d45f97 = str;
                    m6Var.f67845x2262335f = i18;
                    m6Var.f67846x8987ca93 = i19;
                    boolean z17 = n6Var.get(m6Var, new java.lang.String[0]);
                    m6Var.f67843xb05c6f7 = str2;
                    if (z17) {
                        n6Var.mo9952xce0038c9(m6Var, new java.lang.String[0]);
                    } else {
                        n6Var.mo880xb970c2b9(m6Var);
                    }
                    km5.b b18 = km5.u.b();
                    b18.b();
                    pq5.g b19 = pq5.h.b(cVar);
                    b19.H(new p81.e());
                    b19.K(new q81.v(this, b18));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "available pkg(%s %d) >= record(%s %d), skip", a6Var.m49244x9616526c(), java.lang.Integer.valueOf(c11667xc7e59dd6.f33456x1c82a56c), a6Var.m49244x9616526c(), java.lang.Integer.valueOf(cVar.f67716x8987ca93));
            ((t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class)).mo9951xb06685ab(cVar, new java.lang.String[0]);
        }
        return null;
    }
}
