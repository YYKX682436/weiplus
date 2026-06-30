package bz3;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f118329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118332g;

    public j(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f118329d = m1Var;
        this.f118330e = i17;
        this.f118331f = i18;
        this.f118332g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var4;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f118329d;
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 1812) {
            if (this.f118329d.m48006xc9602be3()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanServerConfigManager", "onSceneEnd updateScanConfig is cancelled and ignore");
                return;
            }
            int i17 = this.f118330e;
            if (i17 != 0 || this.f118331f != 0) {
                bz3.l lVar = bz3.l.f118335d;
                int i18 = this.f118331f;
                java.lang.String str = this.f118332g;
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f118329d;
                if (m1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0) {
                    int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0) m1Var2).f240442f;
                    java.util.ArrayList arrayList = (java.util.ArrayList) bz3.l.f118336e.get(java.lang.Integer.valueOf(i19));
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b1) ((bz3.i) it.next())).getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig onFailed errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                        }
                    }
                    bz3.l.f118336e.remove(java.lang.Integer.valueOf(i19));
                    bz3.l.f118337f.remove(java.lang.Integer.valueOf(i19));
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var3 = this.f118329d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneScanConfigSync");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0) m1Var3).f240441e.f152244b.f152233a;
            r45.ef4 ef4Var = fVar != null ? (r45.ef4) fVar : null;
            bz3.l lVar2 = bz3.l.f118335d;
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var4 = this.f118329d;
            if (m1Var4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0) {
                int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g0) m1Var4).f240442f;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) bz3.l.f118336e.get(java.lang.Integer.valueOf(i27));
                if (arrayList2 != null) {
                    arrayList2.size();
                }
                if (arrayList2 != null) {
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b1) ((bz3.i) it6.next());
                        b1Var.getClass();
                        if (ef4Var != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig onSuccess type: %d, version: %s, config: %s, guide: %s", java.lang.Integer.valueOf(ef4Var.f454924d), ef4Var.f454925e, ef4Var.f454926f, ef4Var.f454927g);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
                            int i28 = b1Var.f240352a;
                            d1Var.n(i28, java.lang.System.currentTimeMillis());
                            if (i28 == 2) {
                                java.lang.String str2 = ef4Var.f454926f;
                                if (!(str2 == null || str2.length() == 0) && (o4Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i) != null) {
                                    o4Var4.putString("scan_config_focus_engine_config", ef4Var.f454926f);
                                }
                            } else if (i28 != 3) {
                                if (i28 == 4) {
                                    java.lang.String str3 = ef4Var.f454926f;
                                    if (!(str3 == null || str3.length() == 0)) {
                                        java.lang.String str4 = ef4Var.f454926f;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240387l = str4 != null ? str4 : "";
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                                        if (o4Var5 != null) {
                                            o4Var5.putString("scan_config_phash_config", str4);
                                        }
                                    }
                                } else if (i28 == 6) {
                                    java.lang.String str5 = ef4Var.f454926f;
                                    if (!(str5 == null || str5.length() == 0)) {
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                                        if (o4Var6 != null) {
                                            o4Var6.putString("scan_config_scan_merge_engine_config", ef4Var.f454926f);
                                        }
                                        java.lang.String str6 = ef4Var.f454926f;
                                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c1(str6 != null ? str6 : ""));
                                    }
                                    java.lang.String str7 = ef4Var.f454927g;
                                    if (!(str7 == null || str7.length() == 0) && (o4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i) != null) {
                                        o4Var2.putString("scan_config_scan_merge_wording", ef4Var.f454927g);
                                    }
                                    java.lang.String str8 = ef4Var.f454928h;
                                    if (!(str8 == null || str8.length() == 0) && (o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i) != null) {
                                        o4Var.putString("scan_config_scan_retrieval_lite_succ_wording", ef4Var.f454928h);
                                    }
                                    int i29 = ef4Var.f454929i;
                                    if (i29 > 0) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateFrameLimitFromServer:" + i29);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240380e = i29;
                                    }
                                }
                            } else {
                                java.lang.String str9 = ef4Var.f454926f;
                                if (!(str9 == null || str9.length() == 0) && (o4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i) != null) {
                                    o4Var3.putString("scan_config_guide_wording", ef4Var.f454926f);
                                }
                            }
                        }
                    }
                }
                bz3.l.f118336e.remove(java.lang.Integer.valueOf(i27));
                bz3.l.f118337f.remove(java.lang.Integer.valueOf(i27));
            }
        }
    }
}
