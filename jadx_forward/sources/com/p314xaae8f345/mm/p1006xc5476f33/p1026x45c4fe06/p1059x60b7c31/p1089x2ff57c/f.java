package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f162588p = 0;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h f162589f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f162590g;

    /* renamed from: h, reason: collision with root package name */
    public final long f162591h;

    /* renamed from: i, reason: collision with root package name */
    public final long f162592i;

    /* renamed from: m, reason: collision with root package name */
    public final long f162593m;

    /* renamed from: n, reason: collision with root package name */
    public long f162594n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3 f162595o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h config) {
        super(rt6, config);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i iVar;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f162589f = config;
        java.lang.String appId = rt6.f156336n;
        this.f162590g = appId;
        this.f162591h = 314572800L;
        this.f162592i = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8;
        this.f162593m = 314572800L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = rt6.S2(false);
        if (S2 != null) {
            S2.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dir_space_statics_enable, 0) == 1) {
                z17 = true;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
                if (a17 != null) {
                    z17 = a17.getBoolean("appbrand_enable_file_storage_space_statistics_for_" + appId, false);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3(appId);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
                n3Var.f162643f = a18 != null && a18.getBoolean("enable_appbrand_file_size_statistics_debug", false);
                this.f162595o = n3Var;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init WxaStorageSpaceStatisticsService ?  ");
        sb6.append(this.f162595o != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeFileSystemRegistry", sb6.toString());
        java.util.LinkedList linkedList = this.f157722d;
        java.util.Map map = i81.j.f371125a;
        linkedList.addFirst(i81.i.f371123a);
        if (rt6.e3()) {
            java.util.LinkedList linkedList2 = this.f157722d;
            java.lang.String a19 = kk.v.a(rt6.u0().f128812x0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.h(a19, "magicbrushframedata"), "wxfile://magicbrushframedata");
            j3Var.f157760f = 10485760L;
            j3Var.mo49302x33ebcb90();
            linkedList2.addFirst(j3Var);
        }
        java.util.LinkedList linkedList3 = this.f157722d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getOrderedFileSystemList(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(appId, true);
        if (b17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList3.iterator();
            while (true) {
                jz5.l lVar = null;
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it.next();
                if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var;
                    n1Var.getClass();
                    lVar = new jz5.l("tmp", n1Var.f157809e);
                } else if (u1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) u1Var;
                    java.lang.String str = j3Var2.f157759e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPathPrefix(...)");
                    lVar = new jz5.l(r26.i0.t(str, "wxfile://", "", false), j3Var2.f157758d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "unknown type: %s", u1Var.getClass().getSimpleName());
                }
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.a(arrayList, appId, b17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157779b.clear();
        ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157780c).clear();
        java.util.LinkedList linkedList4 = this.f157722d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList4, "getOrderedFileSystemList(...)");
        java.util.Iterator it6 = linkedList4.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.i.f162603a;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) it6.next();
            boolean z18 = u1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3 n3Var2 = this.f162595o;
            java.lang.String appId2 = this.f162590g;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1 n1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var2;
                java.lang.String str2 = n1Var2.f157809e;
                if (str2 == null || str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n1Var2.f157810f, "wxfile://")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157778a;
                    java.lang.String str3 = n1Var2.f157809e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getRootPath(...)");
                    k0Var.d("temp", str3);
                    java.lang.String str4 = n1Var2.f157809e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getRootPath(...)");
                    k0Var.d("saved_temp", str4);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
                    long b18 = !k0Var.b(appId2, "saved_temp") ? Long.MIN_VALUE : iVar.b(appId2, "saved_temp");
                    if (n3Var2 != null) {
                        java.lang.String str5 = n1Var2.f157809e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getRootPath(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var2);
                        n3Var2.j(str5, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.m3((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n1) u1Var2), b18);
                    }
                    k0Var.c(appId2, "saved_temp");
                    n1Var2.f157812h = n3Var2;
                }
            } else if (u1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3) u1Var2;
                java.lang.String str6 = j3Var3.f157758d;
                if (str6 == null || str6.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "fs root path is null, skip");
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j3Var3.f157759e, "wxfile://usr")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157778a;
                    java.lang.String str7 = j3Var3.f157758d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "getRootPath(...)");
                    k0Var2.d("normal_none_flatten", str7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
                    long b19 = !k0Var2.b(appId2, "normal_none_flatten") ? Long.MIN_VALUE : iVar.b(appId2, "normal_none_flatten");
                    if (n3Var2 != null) {
                        java.lang.String str8 = j3Var3.f157758d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "getRootPath(...)");
                        n3Var2.j(str8, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l3(), b19);
                    }
                    k0Var2.c(appId2, "normal_none_flatten");
                    j3Var3.f157761g = n3Var2;
                }
            }
        }
        java.lang.String appId3 = this.f162590g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId3, "appId");
        this.f162594n = iVar.b(appId3, "temp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeFileSystemRegistry", this.f162590g + " currentTempSize " + this.f162594n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h hVar = this.f162589f;
        long j17 = (long) 1048576;
        this.f162591h = hVar.f162599f * j17;
        this.f162592i = hVar.f162600g * j17;
        this.f162593m = hVar.f162598e * j17;
        if (rt6.q2()) {
            com.p314xaae8f345.mm.p874xaefb6cc9.y.f150693h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.e(new java.lang.ref.WeakReference(this), rt6.f156336n);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5(java.lang.String str) {
        if (m(0L)) {
            return null;
        }
        return super.mo49614x6665a5c5(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: createTempFileFrom */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17;
        if (m(r6Var != null ? r6Var.C() : 0L)) {
            if (b0Var != null) {
                b0Var.f373357a = null;
            }
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        this.f162594n += r6Var != null ? r6Var.C() : 0L;
        long c17 = r6Var != null ? a06.d.c(r6Var.C() / 1024.0d) : -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = super.mo49619x6aa75256(r6Var, str, z17, b0Var);
        if (mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f162590g, true)) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7072x6cf4c688 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.g.a(b17);
            a17.f143806h = c17;
            a17.k();
        }
        return mo49619x6aa75256;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getStorageSpaceStatistics */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 mo49623xfc54b5c4() {
        return this.f162595o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getTempDirectory */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543(ik1.b0 b0Var) {
        if (m(0L)) {
            if (b0Var != null) {
                b0Var.f373357a = null;
            }
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543 = super.mo49624x5d68c543(b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49624x5d68c543, "getTempDirectory(...)");
        return mo49624x5d68c543;
    }

    public final boolean m(long j17) {
        long j18 = this.f162594n + j17;
        long j19 = this.f162591h;
        boolean z17 = j18 > j19;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.j.f34556x366c91de, 225);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeFileSystemRegistry", "temp file size exceed limit! %d limit:%d", java.lang.Long.valueOf(this.f162594n + j17), java.lang.Long.valueOf(j19));
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: release */
    public void mo49309x41012807() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k0.f157778a;
        java.lang.String appId = this.f162590g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        k0Var.a(appId, this.f162592i, this.f162591h, this.f162593m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3 n3Var = this.f162595o;
        if (n3Var != null) {
            synchronized (n3Var.f162642e) {
                ((java.util.LinkedHashMap) n3Var.f162641d).clear();
                ((java.util.LinkedHashMap) n3Var.f162640c).clear();
            }
        }
        super.mo49309x41012807();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: saveFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, ik1.b0 b0Var) {
        this.f162594n -= r6Var != null ? r6Var.C() : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49631x84702499 = super.mo49631x84702499(r6Var, str, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49631x84702499, "saveFile(...)");
        return mo49631x84702499;
    }
}
