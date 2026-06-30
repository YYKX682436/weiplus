package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class x0 extends com.tencent.mm.plugin.appbrand.appusage.k3 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b1 f76629m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ft.i f76630n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f76631o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f76632p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f76633q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f76634r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f76635s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f76636t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.c1 f76637u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.appbrand.appusage.c1 c1Var, int i17, int i18, int i19, int i27, int i28, java.lang.String str, r45.ut4 ut4Var, r45.fd4 fd4Var, java.lang.String str2, com.tencent.mm.plugin.appbrand.appusage.b1 b1Var, ft.i iVar, int i29, int i37, boolean z17, android.os.Bundle bundle, long j17, boolean z18, long j18) {
        super(i17, i18, i19, i27, i28, str, ut4Var, fd4Var, str2);
        this.f76637u = c1Var;
        this.f76629m = b1Var;
        this.f76630n = iVar;
        this.f76631o = i29;
        this.f76632p = i37;
        this.f76633q = z17;
        this.f76634r = bundle;
        this.f76635s = j17;
        this.f76636t = z18;
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void x(final int i17, final int i18, final java.lang.String str, final r45.dt3 dt3Var, final com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String format;
        com.tencent.mm.plugin.appbrand.appusage.x0 x0Var;
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        boolean z27;
        if (gm0.j1.a()) {
            if (java.lang.Thread.currentThread().getId() == gm0.j1.e().c()) {
                ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appusage.x0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.appusage.x0.this.x(i17, i18, str, dt3Var, m1Var);
                    }
                });
                return;
            }
            int i19 = 2;
            if (dt3Var == null) {
                format = "null";
            } else {
                java.util.Locale locale = java.util.Locale.US;
                java.lang.Object[] objArr = new java.lang.Object[3];
                java.util.LinkedList linkedList3 = dt3Var.f372741e;
                objArr[0] = java.lang.Integer.valueOf(linkedList3 == null ? -1 : linkedList3.size());
                java.util.LinkedList linkedList4 = dt3Var.f372742f;
                objArr[1] = java.lang.Integer.valueOf(linkedList4 != null ? linkedList4.size() : -1);
                objArr[2] = java.lang.Integer.valueOf(dt3Var.f372743g);
                format = java.lang.String.format(locale, "%d %d %d", objArr);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "onCgiBack, errType %d, errCode %d, errMsg %s, resp %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, format);
            if (dt3Var == null) {
                com.tencent.mm.plugin.appbrand.appusage.b1 b1Var = this.f76629m;
                if (b1Var != null) {
                    b1Var.a(false, "cgi response is null");
                }
                ft.i iVar = this.f76630n;
                if (iVar != null) {
                    ((com.tencent.mm.plugin.taskbar.ui.y1) iVar).a(false, false);
                }
                x0Var = this;
            } else if (i17 == 0 && i18 == 0) {
                if ((this.f76631o & 4) > 0) {
                    com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC;
                    if (!c17.o(u3Var, false) && (dt3Var.f372743g & 8) > 0) {
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    }
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, java.lang.Boolean.valueOf((dt3Var.f372743g & 4) > 0));
                int i27 = dt3Var.f372743g;
                int i28 = this.f76632p;
                if (gm0.j1.a()) {
                    com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                    com.tencent.mm.plugin.appbrand.appusage.r0.f((i27 & 2) > 0, i28 != 4, "");
                    c18.x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, java.lang.Boolean.valueOf((i27 & 1) > 0));
                }
                if (com.tencent.mm.sdk.platformtools.t8.L0(dt3Var.f372742f)) {
                    x0Var = this;
                    com.tencent.mm.plugin.appbrand.appusage.b1 b1Var2 = x0Var.f76629m;
                    if (b1Var2 != null) {
                        b1Var2.a(true, "");
                    }
                } else {
                    com.tencent.mm.plugin.appbrand.appusage.f3 hj6 = com.tencent.mm.plugin.appbrand.app.r9.hj();
                    java.util.LinkedList<r45.pc7> linkedList5 = dt3Var.f372742f;
                    hj6.getClass();
                    com.tencent.mm.plugin.appbrand.appusage.c3 c3Var = new com.tencent.mm.plugin.appbrand.appusage.c3();
                    java.util.LinkedList linkedList6 = new java.util.LinkedList();
                    java.util.LinkedList linkedList7 = new java.util.LinkedList();
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
                    l75.k0 k0Var = hj6.f76434e;
                    long F = k0Var.F(valueOf);
                    for (r45.pc7 pc7Var : linkedList5) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(pc7Var.f382944d)) {
                            java.lang.String str2 = pc7Var.f382944d;
                            c3Var.field_brandId = str2;
                            c3Var.field_versionType = pc7Var.f382946f;
                            c3Var.field_scene = i19;
                            java.lang.String str3 = pc7Var.f382951n;
                            c3Var.field_appPath = str3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUsageStorage", "username:%s, field_appPath:%s", str2, str3);
                            com.tencent.mm.plugin.appbrand.appusage.d3 d3Var = hj6.f76433d;
                            if (d3Var.get(c3Var, new java.lang.String[0])) {
                                c3Var.field_updateTime = java.lang.Math.max(pc7Var.f382945e, c3Var.field_updateTime);
                                c3Var.field_usedInThirdPartyAppRecently = pc7Var.f382948h;
                                c3Var.field_thirdPartyAppUsingDesc = pc7Var.f382949i;
                                if (d3Var.update(c3Var, new java.lang.String[0])) {
                                    linkedList7.add(java.lang.String.valueOf(c3Var.field_recordId));
                                }
                            } else {
                                c3Var.field_updateTime = pc7Var.f382945e;
                                c3Var.field_usedInThirdPartyAppRecently = pc7Var.f382948h;
                                c3Var.field_thirdPartyAppUsingDesc = pc7Var.f382949i;
                                if (hj6.J0(c3Var)) {
                                    linkedList6.add(java.lang.String.valueOf(c3Var.field_recordId));
                                }
                            }
                            i19 = 2;
                        }
                    }
                    k0Var.w(java.lang.Long.valueOf(F));
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList6)) {
                        hj6.doNotify("batch", 2, linkedList6);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList7)) {
                        hj6.doNotify("batch", 3, linkedList7);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.L0(dt3Var.f372742f)) {
                        x0Var = this;
                    } else {
                        int i29 = ((r45.pc7) dt3Var.f372742f.getFirst()).f382945e;
                        java.util.Iterator it = dt3Var.f372742f.iterator();
                        while (it.hasNext()) {
                            i29 = java.lang.Math.min(i29, ((r45.pc7) it.next()).f382945e);
                        }
                        x0Var = this;
                        if (!x0Var.f76633q && i29 > 0) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG, java.lang.Long.valueOf(i29));
                        }
                    }
                    com.tencent.mm.plugin.appbrand.appusage.a3.a(x0Var.f76632p, x0Var.f76634r, dt3Var.f372742f, new com.tencent.mm.plugin.appbrand.appusage.y0(x0Var));
                }
                com.tencent.mm.plugin.appbrand.appusage.x2.i(x0Var.f76632p, i17, i18, str, (com.tencent.mm.modelbase.o) m1Var.getReqResp(), java.lang.Long.valueOf(x0Var.f76635s));
                if (x0Var.f76636t) {
                    int i37 = x0Var.f76632p;
                    com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) m1Var.getReqResp();
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(x0Var.f76635s);
                    ft.i iVar2 = x0Var.f76630n;
                    if (oVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCommonUsedAppLogic", "onResp, NULL CommReqResp");
                        if (iVar2 != null) {
                            ((com.tencent.mm.plugin.taskbar.ui.y1) iVar2).a(false, false);
                        }
                    } else if ((((r45.ct3) oVar.f70710a.f70684a).f371821e & 8) == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCommonUsedAppLogic", "onResp, condition not fetch handle common used_list");
                        if (iVar2 != null) {
                            ((com.tencent.mm.plugin.taskbar.ui.y1) iVar2).a(false, false);
                        }
                    } else {
                        r45.dt3 dt3Var2 = (r45.dt3) oVar.f70711b.f70700a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onParseResp, errType %d, errCode %d, errMsg %s, ticket %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, valueOf2);
                        com.tencent.mm.plugin.appbrand.appusage.j0.f76474h = false;
                        if (i17 != 0 || i18 != 0 || dt3Var2 == null || com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class) == null) {
                            z18 = true;
                            z19 = false;
                        } else {
                            r45.z50 z50Var = dt3Var2.f372745i;
                            if (z50Var == null || (linkedList2 = z50Var.f391721d) == null || linkedList2.size() <= 0) {
                                r45.z50 z50Var2 = dt3Var2.f372745i;
                                if (z50Var2 == null || !((linkedList = z50Var2.f391721d) == null || linkedList.size() == 0)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetch common used data fail");
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "clean common used data");
                                    ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).y0(null, valueOf2, true, i37, null);
                                    com.tencent.mm.plugin.appbrand.appusage.j0.a(null);
                                }
                                z18 = true;
                                z19 = false;
                            } else {
                                r45.a60 a60Var = dt3Var2.f372745i.f391722e;
                                if (a60Var != null) {
                                    z27 = a60Var.f369759g;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "server return refreshImmediately:%b", java.lang.Boolean.valueOf(z27));
                                } else {
                                    z27 = true;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "update common used data refreshImmediately:%b，update_loading_wait_ms：%d", java.lang.Boolean.valueOf(z27), java.lang.Integer.valueOf(dt3Var2.f372745i.f391722e.f369762m));
                                if (!z27) {
                                    com.tencent.mm.plugin.appbrand.appusage.j0.f76474h = true;
                                }
                                ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).y0(dt3Var2.f372745i.f391721d, valueOf2, z27, i37, new com.tencent.mm.plugin.appbrand.appusage.h0(iVar2, z27));
                                com.tencent.mm.plugin.appbrand.appusage.j0.a(dt3Var2.f372745i.f391722e);
                                z19 = z27;
                                z18 = false;
                            }
                            com.tencent.mm.plugin.appbrand.appusage.j0.f76480n = com.tencent.mm.sdk.platformtools.t8.i1();
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.plugin.appbrand.appusage.j0.f76480n));
                        }
                        if (iVar2 != null && z18) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "ljd stopLoading");
                            ((com.tencent.mm.plugin.taskbar.ui.y1) iVar2).a(z19, com.tencent.mm.plugin.appbrand.appusage.j0.f76474h);
                        }
                    }
                }
            } else {
                x0Var = this;
                com.tencent.mm.plugin.appbrand.appusage.b1 b1Var3 = x0Var.f76629m;
                if (b1Var3 != null) {
                    z17 = false;
                    b1Var3.a(false, "cgi errorType:" + i17 + " errorCode:" + i18 + " errMsg:" + str);
                } else {
                    z17 = false;
                }
                ft.i iVar3 = x0Var.f76630n;
                if (iVar3 != null) {
                    ((com.tencent.mm.plugin.taskbar.ui.y1) iVar3).a(z17, z17);
                }
            }
            x0Var.f76637u.doNotify("batch", 3, java.lang.Long.valueOf(x0Var.f76635s));
        }
    }
}
