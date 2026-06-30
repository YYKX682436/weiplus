package bz3;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f36796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f36797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f36798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f36799g;

    public j(com.tencent.mm.modelbase.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f36796d = m1Var;
        this.f36797e = i17;
        this.f36798f = i18;
        this.f36799g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.sdk.platformtools.o4 o4Var2;
        com.tencent.mm.sdk.platformtools.o4 o4Var3;
        com.tencent.mm.sdk.platformtools.o4 o4Var4;
        com.tencent.mm.modelbase.m1 m1Var = this.f36796d;
        if (m1Var != null && m1Var.getType() == 1812) {
            if (this.f36796d.isCanceled()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScanServerConfigManager", "onSceneEnd updateScanConfig is cancelled and ignore");
                return;
            }
            int i17 = this.f36797e;
            if (i17 != 0 || this.f36798f != 0) {
                bz3.l lVar = bz3.l.f36802d;
                int i18 = this.f36798f;
                java.lang.String str = this.f36799g;
                com.tencent.mm.modelbase.m1 m1Var2 = this.f36796d;
                if (m1Var2 instanceof com.tencent.mm.plugin.scanner.model.g0) {
                    int i19 = ((com.tencent.mm.plugin.scanner.model.g0) m1Var2).f158909f;
                    java.util.ArrayList arrayList = (java.util.ArrayList) bz3.l.f36803e.get(java.lang.Integer.valueOf(i19));
                    if (arrayList != null) {
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((com.tencent.mm.plugin.scanner.model.b1) ((bz3.i) it.next())).getClass();
                            com.tencent.mars.xlog.Log.e("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig onFailed errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                        }
                    }
                    bz3.l.f36803e.remove(java.lang.Integer.valueOf(i19));
                    bz3.l.f36804f.remove(java.lang.Integer.valueOf(i19));
                    return;
                }
                return;
            }
            com.tencent.mm.modelbase.m1 m1Var3 = this.f36796d;
            kotlin.jvm.internal.o.e(m1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneScanConfigSync");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.plugin.scanner.model.g0) m1Var3).f158908e.f70711b.f70700a;
            r45.ef4 ef4Var = fVar != null ? (r45.ef4) fVar : null;
            bz3.l lVar2 = bz3.l.f36802d;
            com.tencent.mm.modelbase.m1 m1Var4 = this.f36796d;
            if (m1Var4 instanceof com.tencent.mm.plugin.scanner.model.g0) {
                int i27 = ((com.tencent.mm.plugin.scanner.model.g0) m1Var4).f158909f;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) bz3.l.f36803e.get(java.lang.Integer.valueOf(i27));
                if (arrayList2 != null) {
                    arrayList2.size();
                }
                if (arrayList2 != null) {
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.scanner.model.b1 b1Var = (com.tencent.mm.plugin.scanner.model.b1) ((bz3.i) it6.next());
                        b1Var.getClass();
                        if (ef4Var != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanConfig onSuccess type: %d, version: %s, config: %s, guide: %s", java.lang.Integer.valueOf(ef4Var.f373391d), ef4Var.f373392e, ef4Var.f373393f, ef4Var.f373394g);
                            com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
                            int i28 = b1Var.f158819a;
                            d1Var.n(i28, java.lang.System.currentTimeMillis());
                            if (i28 == 2) {
                                java.lang.String str2 = ef4Var.f373393f;
                                if (!(str2 == null || str2.length() == 0) && (o4Var4 = com.tencent.mm.plugin.scanner.model.d1.f158851i) != null) {
                                    o4Var4.putString("scan_config_focus_engine_config", ef4Var.f373393f);
                                }
                            } else if (i28 != 3) {
                                if (i28 == 4) {
                                    java.lang.String str3 = ef4Var.f373393f;
                                    if (!(str3 == null || str3.length() == 0)) {
                                        java.lang.String str4 = ef4Var.f373393f;
                                        com.tencent.mm.plugin.scanner.model.d1.f158854l = str4 != null ? str4 : "";
                                        com.tencent.mm.sdk.platformtools.o4 o4Var5 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                                        if (o4Var5 != null) {
                                            o4Var5.putString("scan_config_phash_config", str4);
                                        }
                                    }
                                } else if (i28 == 6) {
                                    java.lang.String str5 = ef4Var.f373393f;
                                    if (!(str5 == null || str5.length() == 0)) {
                                        com.tencent.mm.sdk.platformtools.o4 o4Var6 = com.tencent.mm.plugin.scanner.model.d1.f158851i;
                                        if (o4Var6 != null) {
                                            o4Var6.putString("scan_config_scan_merge_engine_config", ef4Var.f373393f);
                                        }
                                        java.lang.String str6 = ef4Var.f373393f;
                                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.scanner.model.c1(str6 != null ? str6 : ""));
                                    }
                                    java.lang.String str7 = ef4Var.f373394g;
                                    if (!(str7 == null || str7.length() == 0) && (o4Var2 = com.tencent.mm.plugin.scanner.model.d1.f158851i) != null) {
                                        o4Var2.putString("scan_config_scan_merge_wording", ef4Var.f373394g);
                                    }
                                    java.lang.String str8 = ef4Var.f373395h;
                                    if (!(str8 == null || str8.length() == 0) && (o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i) != null) {
                                        o4Var.putString("scan_config_scan_retrieval_lite_succ_wording", ef4Var.f373395h);
                                    }
                                    int i29 = ef4Var.f373396i;
                                    if (i29 > 0) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateFrameLimitFromServer:" + i29);
                                        com.tencent.mm.plugin.scanner.model.d1.f158847e = i29;
                                    }
                                }
                            } else {
                                java.lang.String str9 = ef4Var.f373393f;
                                if (!(str9 == null || str9.length() == 0) && (o4Var3 = com.tencent.mm.plugin.scanner.model.d1.f158851i) != null) {
                                    o4Var3.putString("scan_config_guide_wording", ef4Var.f373393f);
                                }
                            }
                        }
                    }
                }
                bz3.l.f36803e.remove(java.lang.Integer.valueOf(i27));
                bz3.l.f36804f.remove(java.lang.Integer.valueOf(i27));
            }
        }
    }
}
