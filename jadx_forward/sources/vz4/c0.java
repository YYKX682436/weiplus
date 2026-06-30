package vz4;

/* loaded from: classes8.dex */
public final class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f523256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.j f523257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f523258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda f523259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f523260g;

    public c0(java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, vz4.j jVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda, long j17) {
        this.f523254a = str;
        this.f523255b = str2;
        this.f523256c = c0Var;
        this.f523257d = jVar;
        this.f523258e = z17;
        this.f523259f = c19543x781c5eda;
        this.f523260g = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.i
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.sa7 sa7Var;
        r45.sa7 sa7Var2;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi error errType = " + i17 + " errCode = " + i18 + " pkgId = " + this.f523254a + " appId = " + this.f523255b);
            java.lang.Object obj = vz4.d0.f523263b;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f523256c;
            vz4.j jVar = this.f523257d;
            synchronized (obj) {
                if (!c0Var.f391645d) {
                    c0Var.f391645d = true;
                    jVar.a("checkwepkgversion cgi error errType = " + i17 + " errCode = " + i18);
                }
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckWepkgVersionResponse");
        r45.d30 d30Var = (r45.d30) fVar;
        java.util.LinkedList linkedList = d30Var.f453564d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi response.PkgList isNullOrEmpty() pkgId = " + this.f523254a + " appId = " + this.f523255b);
            java.lang.Object obj2 = vz4.d0.f523263b;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f523256c;
            vz4.j jVar2 = this.f523257d;
            synchronized (obj2) {
                if (!c0Var2.f391645d) {
                    c0Var2.f391645d = true;
                    jVar2.a("checkwepkgversion cgi response.PkgList isNullOrEmpty()");
                }
            }
            return;
        }
        java.util.LinkedList<r45.k85> PkgList = d30Var.f453564d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PkgList, "PkgList");
        java.lang.String str2 = this.f523254a;
        boolean z17 = this.f523258e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = this.f523259f;
        java.lang.String str3 = this.f523255b;
        long j17 = this.f523260g;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = this.f523256c;
        vz4.j jVar3 = this.f523257d;
        for (r45.k85 k85Var : PkgList) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, k85Var.f460023d)) {
                if (!z17 && c19543x781c5eda != null) {
                    r45.va7 va7Var = k85Var.f460024e;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((va7Var == null || (sa7Var2 = va7Var.f469590e) == null) ? null : sa7Var2.f467134d, c19543x781c5eda.f269909f)) {
                        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 Bj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str3);
                        if (Bj != null) {
                            vz4.d0.a(vz4.d0.f523262a, c19543x781c5eda, str3, Bj.f14368xd0d13783);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,callBack.onSuccess()");
                            synchronized (vz4.d0.f523263b) {
                                if (!c0Var3.f391645d) {
                                    c0Var3.f391645d = true;
                                    jVar3.mo64503xe05b4124(str3);
                                }
                            }
                            return;
                        }
                        vz4.d0.a(vz4.d0.f523262a, c19543x781c5eda, str3, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi response.PkgList isNullOrEmpty() pkgId = " + str2 + " appId = " + str3);
                        synchronized (vz4.d0.f523263b) {
                            if (!c0Var3.f391645d) {
                                c0Var3.f391645d = true;
                                jVar3.a("version is same dont have liteAppInfo appid =" + str3);
                            }
                        }
                        return;
                    }
                }
                r45.ra7 ra7Var = k85Var.f460026g;
                if (ra7Var != null && ra7Var.f466233d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(k85Var.f460023d, 2, 3);
                }
                r45.va7 va7Var2 = k85Var.f460024e;
                if ((va7Var2 != null ? va7Var2.f469590e : null) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi call back PkgConfig is null pkgId = " + str2 + " appId = " + str3);
                    synchronized (vz4.d0.f523263b) {
                        if (!c0Var3.f391645d) {
                            c0Var3.f391645d = true;
                            jVar3.a("checkwepkgversion cgi call back PkgConfig is null");
                        }
                    }
                    return;
                }
                java.lang.String str4 = (va7Var2 == null || (sa7Var = va7Var2.f469590e) == null) ? null : sa7Var.f467134d;
                if (str4 == null || str4.length() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.f(k85Var.f460023d, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,CurrentEnabledVersion is null ,disable Wepkg pkgId = " + str2 + " appId = " + str3);
                    synchronized (vz4.d0.f523263b) {
                        if (!c0Var3.f391645d) {
                            c0Var3.f391645d = true;
                            jVar3.a("checkwepkgversion CurrentEnabledVersion is null ,disable Wepkg");
                        }
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o0.i(str2, k85Var.f460024e.f469590e.f467135e, r0.f467136f, r0.f467137g);
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e34072 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
                c19540x47e34072.f269876h = 3009;
                c19540x47e34072.f269877i.f269907d = str2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    c19540x47e34072.z();
                } else {
                    c19540x47e34072.s();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072 c19540x47e340722 = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19540x47e34072();
                c19540x47e340722.f269876h = com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7530xe5db58ec;
                c19540x47e340722.f269880o.f269896e = str2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    c19540x47e340722.z();
                } else {
                    c19540x47e340722.s();
                }
                r45.ra7 ra7Var2 = k85Var.f460026g;
                if (ra7Var2 != null && ra7Var2.f466234e) {
                    ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd.f269861e).add(k85Var.f460023d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.C19535x1bd057dd.a();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                vz4.z zVar = new vz4.z(str2, h0Var, c0Var3, jVar3, str3);
                h0Var.f391656d = zVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.add(new java.lang.ref.WeakReference(zVar));
                ((ku5.t0) ku5.t0.f394148d).l(new vz4.a0(h0Var, c0Var3, str2, str3, jVar3), j17 * 1000, "MicroMsg.WePkgUpdateManager");
                ((ku5.t0) ku5.t0.f394148d).g(new vz4.b0(k85Var));
                return;
            }
        }
    }
}
