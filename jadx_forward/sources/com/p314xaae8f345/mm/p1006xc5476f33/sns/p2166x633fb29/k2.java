package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class k2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f245881h = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f245882i = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245883d;

    /* renamed from: e, reason: collision with root package name */
    public final long f245884e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245885f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f245886g;

    public k2(long j17, int i17, java.lang.String str) {
        this.f245884e = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g76();
        lVar.f152198b = new r45.h76();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsadobjectdetail";
        lVar.f152200d = 683;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("ad_detail_session");
        java.lang.String sb7 = sb6.toString();
        this.f245886g = sb7;
        int E = ca4.z0.E();
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, -1);
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245883d = a17;
        com.p314xaae8f345.mm.p944x882e457a.m mVar = a17.f152243a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = mVar.f152217a;
        ((r45.g76) fVar).f456493d = j17;
        ((r45.g76) fVar).f456495f = x51.j1.a(N);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = mVar.f152217a;
        ((r45.g76) fVar2).f456494e = i17;
        ((r45.g76) fVar2).f456498i = E;
        if (str != null && str.length() > 0) {
            ((r45.g76) mVar.f152217a).f456497h = x51.j1.h(str, true);
        }
        r45.g76 g76Var = (r45.g76) mVar.f152217a;
        if (g76Var != null) {
            if (l44.h3.e()) {
                g76Var.f456502p = l44.e.b();
            }
            java.lang.String e17 = m54.j.e();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                g76Var.f456503q = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "the snsADObjectDetailRequest vangogh version is " + g76Var.f456503q);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "SupportCapability is " + g76Var.f456502p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 32);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("NetSceneSnsAdObjectDetial, snsId=");
        sb8.append(ca4.z0.t0(j17));
        sb8.append(", scene=");
        sb8.append(i17);
        sb8.append(", buf is null?");
        sb8.append(N == null);
        sb8.append(", syncBuf=");
        sb8.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", sb8.toString());
    }

    public static boolean H(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.List list = f245882i;
        if (list.contains(valueOf)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return false;
        }
        list.add(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAtDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    public static boolean I(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f245882i.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAtDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    public static boolean J(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        f245881h.remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDetialId", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        this.f245885f = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f245883d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        return 683;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] d17;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        r45.du5 du5Var;
        boolean z18;
        r45.du5 du5Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
        java.lang.String t07 = ca4.z0.t0(this.f245884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "onGYNetEnd, errType " + i18 + " errCode " + i19 + ", snsId=" + t07);
        boolean z19 = true;
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == 1 && (d17 = x51.j1.d(((r45.h76) this.f245883d.f152244b.f152233a).f457454e)) != null) {
                com.p314xaae8f345.mm.vfs.w6.h(this.f245886g);
                com.p314xaae8f345.mm.vfs.w6.S(this.f245886g, d17, 0, d17.length);
            }
            z19 = false;
        }
        if (!z19) {
            this.f245885f.mo815x76e0bfae(i18, i19, str, this);
            if (((r45.g76) this.f245883d.f152243a.f152217a).f456494e == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 0);
            }
            J(this.f245884e);
            I(this.f245884e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 27);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        byte[] d18 = x51.j1.d(((r45.h76) this.f245883d.f152244b.f152233a).f457454e);
        if (d18 != null) {
            com.p314xaae8f345.mm.vfs.w6.h(this.f245886g);
            com.p314xaae8f345.mm.vfs.w6.S(this.f245886g, d18, 0, d18.length);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f245883d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        r45.f76 f76Var = ((r45.h76) fVar).f457453d;
        r45.cu5 cu5Var = ((r45.h76) fVar).f457456g;
        int i27 = ((r45.g76) oVar.f152243a.f152217a).f456494e;
        if (f76Var != null) {
            str2 = "detail, isValid=";
            str3 = "detail, graySwitch=";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "snsdetail scene=" + i27 + ", snsXml=" + x51.j1.f(f76Var.f455609d.f38990xb6613a90));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adxml=");
            sb6.append(f76Var.f455610e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "dynamicData=" + x51.j1.f(cu5Var));
        } else {
            str2 = "detail, isValid=";
            str3 = "detail, graySwitch=";
        }
        if (f76Var != null && (c19806x4c372b72 = f76Var.f455609d) != null && c19806x4c372b72.f38966xdff907d7 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", ca4.z0.t0(f76Var.f455609d.Id) + " will remove by get detail ");
            J(this.f245884e);
            I(this.f245884e);
            a84.n.d(f76Var.f455609d.Id);
            i64.u1.b(22, 1, 101);
            this.f245885f.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
            return;
        }
        if (f76Var != null && (c19806x4c372b7 = f76Var.f455609d) != null) {
            java.util.LinkedList<r45.e86> linkedList = c19806x4c372b7.f38963x20c46e68;
            int size = linkedList == null ? 0 : linkedList.size();
            java.util.LinkedList<r45.e86> linkedList2 = f76Var.f455609d.f38984xe83113e0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "detail comment.size=" + size + " liked.size=" + (linkedList2 == null ? 0 : linkedList2.size()) + ", likeFlag=" + f76Var.f455609d.f38983x458ee3c3 + ", snsId=" + ca4.z0.t0(f76Var.f455609d.Id));
        }
        if (i27 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "get atDetail %s", t07);
            r45.g5 g5Var = ((r45.h76) this.f245883d.f152244b.f152233a).f457457h;
            r45.f76 f76Var2 = g5Var != null ? g5Var.f456418d : null;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246278a) {
                try {
                    boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.h() == 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, graySwitch=" + z27);
                    if (!z27 || f76Var2 == null || (du5Var2 = f76Var2.f455612g) == null || android.text.TextUtils.isEmpty(x51.j1.g(du5Var2))) {
                        z18 = false;
                    } else {
                        z18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.v(g5Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "atDetail, isValid=" + z18);
                        if (z18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 4);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 5);
                        }
                    }
                    if (g5Var != null) {
                        int i28 = (!z27 || z18) ? z27 ? 2 : 0 : 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "recv at adInfoXml=" + x51.j1.g(g5Var.f456419e) + ", replaceMode=" + i28);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.q(g5Var, i28);
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(g5Var.f456418d.f455609d.Id);
                            if (y07 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70301x450e1efa = y07.m70301x450e1efa();
                                if (m70301x450e1efa == null) {
                                    m70301x450e1efa = y07.m70299x10413e67();
                                }
                                n74.v1.d(y07.m70311x485d7(), y07.m70300x74235b3e(), m70301x450e1efa, 3);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "preDownloadAdLandingPagesForAtMsg, id=" + t07);
                                java.lang.String str4 = y07.f67593x28cf0d8f;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                } else {
                                    ((ku5.t0) ku5.t0.f394148d).g(new za4.d1(m70301x450e1efa, str4));
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preDownloadAdLandingPagesForAtMsg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "TimeLineAdPreloadHelper->checkPreloadAdResource exp=" + th6.toString());
                            ca4.q.c("TimeLineAdPreloadHelper", th6);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "remindObject == null");
                    }
                } finally {
                }
            }
        } else {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246278a) {
                try {
                    boolean z28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.h() == 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", str3 + z28);
                    java.lang.String str5 = "";
                    if (!z28 || f76Var == null || (du5Var = f76Var.f455612g) == null || android.text.TextUtils.isEmpty(x51.j1.g(du5Var))) {
                        z17 = false;
                    } else {
                        str5 = f76Var.f455612g.f454289d;
                        z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.z(f76Var);
                        if (z17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 6);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 7);
                        }
                    }
                    int i29 = z28 ? 2 : 0;
                    if (z28 && !z17) {
                        i29 = 1;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", str2 + z17 + ", replaceMode=" + i29 + ", dynamicAdinfo=" + str5);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.t(f76Var, cu5Var, str5, i29);
                } finally {
                }
            }
        }
        this.f245885f.mo815x76e0bfae(i18, i19, str, this);
        J(this.f245884e);
        I(this.f245884e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdObjectDetial");
    }

    public k2(long j17, int i17, r45.mo5 mo5Var) {
        this(j17, i17, "");
        ((r45.g76) this.f245883d.f152243a.f152217a).f456499m = mo5Var;
        if (mo5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, remindFriendsInfo==null");
            return;
        }
        r45.cu5 cu5Var = mo5Var.f462250h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsAdObjectDetial", "NetSceneSnsAdObjectDetial, scene=" + i17 + ", ADGroupId64=" + mo5Var.f462251i + ", ADGroupId=" + mo5Var.f462246d + ", extInfo=" + (cu5Var != null ? x51.j1.f(cu5Var) : null));
    }
}
