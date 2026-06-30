package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.k3 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 f158162m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ft.i f158163n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f158164o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f158165p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f158166q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f158167r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f158168s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f158169t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 f158170u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 c1Var, int i17, int i18, int i19, int i27, int i28, java.lang.String str, r45.ut4 ut4Var, r45.fd4 fd4Var, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var, ft.i iVar, int i29, int i37, boolean z17, android.os.Bundle bundle, long j17, boolean z18, long j18) {
        super(i17, i18, i19, i27, i28, str, ut4Var, fd4Var, str2);
        this.f158170u = c1Var;
        this.f158162m = b1Var;
        this.f158163n = iVar;
        this.f158164o = i29;
        this.f158165p = i37;
        this.f158166q = z17;
        this.f158167r = bundle;
        this.f158168s = j17;
        this.f158169t = z18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void x(final int i17, final int i18, final java.lang.String str, final r45.dt3 dt3Var, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String format;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x0 x0Var;
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        boolean z27;
        if (gm0.j1.a()) {
            if (java.lang.Thread.currentThread().getId() == gm0.j1.e().c()) {
                ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appusage.x0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x0.this.x(i17, i18, str, dt3Var, m1Var);
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
                java.util.LinkedList linkedList3 = dt3Var.f454274e;
                objArr[0] = java.lang.Integer.valueOf(linkedList3 == null ? -1 : linkedList3.size());
                java.util.LinkedList linkedList4 = dt3Var.f454275f;
                objArr[1] = java.lang.Integer.valueOf(linkedList4 != null ? linkedList4.size() : -1);
                objArr[2] = java.lang.Integer.valueOf(dt3Var.f454276g);
                format = java.lang.String.format(locale, "%d %d %d", objArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "onCgiBack, errType %d, errCode %d, errMsg %s, resp %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, format);
            if (dt3Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var = this.f158162m;
                if (b1Var != null) {
                    b1Var.a(false, "cgi response is null");
                }
                ft.i iVar = this.f158163n;
                if (iVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar).a(false, false);
                }
                x0Var = this;
            } else if (i17 == 0 && i18 == 0) {
                if ((this.f158164o & 4) > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC;
                    if (!c17.o(u3Var, false) && (dt3Var.f454276g & 8) > 0) {
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                    }
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, java.lang.Boolean.valueOf((dt3Var.f454276g & 4) > 0));
                int i27 = dt3Var.f454276g;
                int i28 = this.f158165p;
                if (gm0.j1.a()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.f((i27 & 2) > 0, i28 != 4, "");
                    c18.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, java.lang.Boolean.valueOf((i27 & 1) > 0));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(dt3Var.f454275f)) {
                    x0Var = this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var2 = x0Var.f158162m;
                    if (b1Var2 != null) {
                        b1Var2.a(true, "");
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f3 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj();
                    java.util.LinkedList<r45.pc7> linkedList5 = dt3Var.f454275f;
                    hj6.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c3();
                    java.util.LinkedList linkedList6 = new java.util.LinkedList();
                    java.util.LinkedList linkedList7 = new java.util.LinkedList();
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
                    l75.k0 k0Var = hj6.f157967e;
                    long F = k0Var.F(valueOf);
                    for (r45.pc7 pc7Var : linkedList5) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pc7Var.f464477d)) {
                            java.lang.String str2 = pc7Var.f464477d;
                            c3Var.f65826x7cc83cbd = str2;
                            c3Var.f65832x94d24c6d = pc7Var.f464479f;
                            c3Var.f65828x29cbf907 = i19;
                            java.lang.String str3 = pc7Var.f464484n;
                            c3Var.f65825x453e07a1 = str3;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUsageStorage", "username:%s, field_appPath:%s", str2, str3);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d3 d3Var = hj6.f157966d;
                            if (d3Var.get(c3Var, new java.lang.String[0])) {
                                c3Var.f65830xa783a79b = java.lang.Math.max(pc7Var.f464478e, c3Var.f65830xa783a79b);
                                c3Var.f65831x73e938c3 = pc7Var.f464481h;
                                c3Var.f65829x773b0858 = pc7Var.f464482i;
                                if (d3Var.mo9952xce0038c9(c3Var, new java.lang.String[0])) {
                                    linkedList7.add(java.lang.String.valueOf(c3Var.f65827xee1faef1));
                                }
                            } else {
                                c3Var.f65830xa783a79b = pc7Var.f464478e;
                                c3Var.f65831x73e938c3 = pc7Var.f464481h;
                                c3Var.f65829x773b0858 = pc7Var.f464482i;
                                if (hj6.J0(c3Var)) {
                                    linkedList6.add(java.lang.String.valueOf(c3Var.f65827xee1faef1));
                                }
                            }
                            i19 = 2;
                        }
                    }
                    k0Var.w(java.lang.Long.valueOf(F));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList6)) {
                        hj6.mo142179xf35bbb4("batch", 2, linkedList6);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList7)) {
                        hj6.mo142179xf35bbb4("batch", 3, linkedList7);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(dt3Var.f454275f)) {
                        x0Var = this;
                    } else {
                        int i29 = ((r45.pc7) dt3Var.f454275f.getFirst()).f464478e;
                        java.util.Iterator it = dt3Var.f454275f.iterator();
                        while (it.hasNext()) {
                            i29 = java.lang.Math.min(i29, ((r45.pc7) it.next()).f464478e);
                        }
                        x0Var = this;
                        if (!x0Var.f158166q && i29 > 0) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG, java.lang.Long.valueOf(i29));
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a3.a(x0Var.f158165p, x0Var.f158167r, dt3Var.f454275f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y0(x0Var));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.i(x0Var.f158165p, i17, i18, str, (com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558(), java.lang.Long.valueOf(x0Var.f158168s));
                if (x0Var.f158169t) {
                    int i37 = x0Var.f158165p;
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558();
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(x0Var.f158168s);
                    ft.i iVar2 = x0Var.f158163n;
                    if (oVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCommonUsedAppLogic", "onResp, NULL CommReqResp");
                        if (iVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar2).a(false, false);
                        }
                    } else if ((((r45.ct3) oVar.f152243a.f152217a).f453354e & 8) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCommonUsedAppLogic", "onResp, condition not fetch handle common used_list");
                        if (iVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar2).a(false, false);
                        }
                    } else {
                        r45.dt3 dt3Var2 = (r45.dt3) oVar.f152244b.f152233a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "onParseResp, errType %d, errCode %d, errMsg %s, ticket %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, valueOf2);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158007h = false;
                        if (i17 != 0 || i18 != 0 || dt3Var2 == null || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class) == null) {
                            z18 = true;
                            z19 = false;
                        } else {
                            r45.z50 z50Var = dt3Var2.f454278i;
                            if (z50Var == null || (linkedList2 = z50Var.f473254d) == null || linkedList2.size() <= 0) {
                                r45.z50 z50Var2 = dt3Var2.f454278i;
                                if (z50Var2 == null || !((linkedList = z50Var2.f473254d) == null || linkedList.size() == 0)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetch common used data fail");
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "clean common used data");
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).y0(null, valueOf2, true, i37, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.a(null);
                                }
                                z18 = true;
                                z19 = false;
                            } else {
                                r45.a60 a60Var = dt3Var2.f454278i.f473255e;
                                if (a60Var != null) {
                                    z27 = a60Var.f451292g;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "server return refreshImmediately:%b", java.lang.Boolean.valueOf(z27));
                                } else {
                                    z27 = true;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "update common used data refreshImmediately:%b，update_loading_wait_ms：%d", java.lang.Boolean.valueOf(z27), java.lang.Integer.valueOf(dt3Var2.f454278i.f473255e.f451295m));
                                if (!z27) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158007h = true;
                                }
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).y0(dt3Var2.f454278i.f473254d, valueOf2, z27, i37, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h0(iVar2, z27));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.a(dt3Var2.f454278i.f473255e);
                                z19 = z27;
                                z18 = false;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n));
                        }
                        if (iVar2 != null && z18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "ljd stopLoading");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar2).a(z19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158007h);
                        }
                    }
                }
            } else {
                x0Var = this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var3 = x0Var.f158162m;
                if (b1Var3 != null) {
                    z17 = false;
                    b1Var3.a(false, "cgi errorType:" + i17 + " errorCode:" + i18 + " errMsg:" + str);
                } else {
                    z17 = false;
                }
                ft.i iVar3 = x0Var.f158163n;
                if (iVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar3).a(z17, z17);
                }
            }
            x0Var.f158170u.mo142179xf35bbb4("batch", 3, java.lang.Long.valueOf(x0Var.f158168s));
        }
    }
}
