package fa1;

/* loaded from: classes7.dex */
public class x extends ae.v {

    /* renamed from: i, reason: collision with root package name */
    public final fa1.a f342233i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseIntArray f342234m;

    public x(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        super(yVar, j0Var);
        this.f342234m = new android.util.SparseIntArray();
        this.f342233i = (fa1.a) yVar.A1();
    }

    public final void B(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(370L, 40L, 1L, false);
        if (z17) {
            g0Var.mo68477x336bdfd8(370L, 49L, 1L, false);
        } else {
            g0Var.mo68477x336bdfd8(370L, 50L, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r b(java.lang.String str, int i17) {
        if (this.f342233i.P == null) {
            return null;
        }
        return super.b(str, i17);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public java.lang.String f(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, java.lang.String str) {
        java.lang.String f17 = super.f(yVar, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "beforeInjectUserScript(%s)", str);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2 = this.f128939d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.i.e(yVar2);
        e17.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals("game.js")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(2000, (int) (java.lang.System.currentTimeMillis() - e17.f159744a.u0().I));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(3001, e17.f159753j.intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(3003, e17.f159752i.intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().b(4001, e17.f159754k.intValue());
        }
        if (yVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals("game.js")) {
            fe.g a17 = fe.g.a(yVar2.mo48798x74292566());
            a17.getClass();
            a17.f342887b = android.os.SystemClock.elapsedRealtime();
        }
        return f17;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public int k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "hy: injectWxaScript from js context interface: %s %d", str, java.lang.Integer.valueOf(rVar.o()));
        android.util.SparseIntArray sparseIntArray = this.f342234m;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> list = null;
        if (sparseIntArray.get(rVar.o(), 0) <= 0) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f128939d;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, ";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);", yVar.U0().toString());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) rVar).mo14660x738236e6(format, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "ensureFullWxConfigInjected inject wxConfig, appId:%s, cost:%sms", yVar.mo48798x74292566(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            sparseIntArray.put(rVar.o(), 1);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(this.f128939d.x().qe("injectGameContextPlugin")));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgABTest", "openMultiSplitPluginCode exp false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "injectGameContextPlugin :%b, abtest:%b", valueOf, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgABTest", "openMultiSplitPluginCode exp false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "injectPluginCodeNewLogic");
        if (str.equals("game.js")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = this.f128939d.t3().E0().f387385r.f156937i;
            if (c11670x2ef26cc7 != null) {
                list = c11670x2ef26cc7.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsContextInterfaceWC", "pluginCodeList wxaRuntimeModulePluginListMap null");
            }
            if (list != null && list.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "client inject pluginCode size:%s", java.lang.Integer.valueOf(list.size()));
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : list) {
                    java.util.List<java.lang.Integer> list2 = c11669x3195c847.f33470xde2f80a4;
                    if (list2 != null) {
                        list2.size();
                        java.util.Arrays.toString(list2.toArray());
                    }
                    if (list2 != null && list2.contains(0)) {
                        super.k(rVar, c11669x3195c847.f33472xb01af1d7 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33445x4ed35ca);
                    }
                }
            }
        }
        super.k(rVar, str);
        return 1;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public java.lang.Object m(int i17) {
        fa1.a aVar = this.f342233i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = aVar.P;
        if (c12745x1ee4df80 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameJsContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        aVar.P0(new fa1.C28319x2ca3e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        return c12745x1ee4df80;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void n(int i17, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        fa1.a aVar = this.f342233i;
        aVar.getClass();
        aVar.P0(new fa1.C28320x2ca3e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void o(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.e(z17, this.f128939d);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextStart");
        }
        j3Var.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172247f);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void q(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.f(this.f342233i.N, str, z17, this.f128939d);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void r(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.g(this.f342233i.N, str);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void s(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.k(this.f342233i.N, str, this.f128939d);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void t(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.l(this.f342233i.N, str);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.r(this.f342233i.N, str, str2, str3);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.m(this.f342233i.N, arrayList.size() == 1 ? (java.lang.String) arrayList.get(0) : java.util.Arrays.toString(arrayList.toArray(new java.lang.String[0])), arrayList2, arrayList3, this.f128939d);
    }

    @Override // ae.v, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void x(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.n(this.f342233i.N, str);
        super.x(i17, str);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public boolean y() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void z(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
        java.lang.String str;
        int i17;
        int i18;
        java.lang.String str2 = nVar.f128885i;
        if (!str2.endsWith("plugin.js")) {
            str = str2;
            if ("WAGameSubContext.js".equals(str)) {
                if (z17 && (this.f128939d.H0() || this.f128939d.mo50262x39e05d35())) {
                    cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7097x4a56851f g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.g(this.f128939d);
                    g17.p(str);
                    g17.f144101p = nVar.f128887k;
                    g17.f144103r = (k1Var == null || (i18 = k1Var.f4717x67f135e7) < 0 || i18 >= 7) ? 4L : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.f165536t0[i18];
                    g17.f144104s = 1L;
                    g17.f144105t = k1Var != null ? k1Var.f4718xa1600be : 0L;
                    g17.f144107v = k1Var != null ? k1Var.f124210c : 0L;
                    g17.f144096k = j17;
                    g17.f144097l = j18;
                    g17.f144094i = j18 - j17;
                    g17.k();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(778L, 17L, 1L, false);
                if (z17) {
                    g0Var.mo68477x336bdfd8(778L, 19L, 1L, false);
                } else {
                    g0Var.mo68477x336bdfd8(778L, 18L, 1L, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(this.f128939d.mo48798x74292566(), 24, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(this.f128939d.mo48798x74292566(), this.f128939d.t3().E0().f387385r.f33456x1c82a56c, this.f128939d.t3().E0().f387385r.f156932d, 778, 18, 1);
                }
                if (this.f128939d.t3() != null) {
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35227xdad5cfc8, "WAGameSubContext.js", j17, j18);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35224x60b9523f, "", "WAGameSubContext.js", j17, j18);
                    }
                }
            } else if (str.endsWith("game.js")) {
                if (this.f128939d.H0() || this.f128939d.mo50262x39e05d35()) {
                    cl.k1 k1Var2 = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    ze.n t37 = this.f128939d.t3();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(t37 != null ? t37.hashCode() : -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "[QualitySystem] app-service.js runtime.hashCode = [%d]", objArr);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.d(this.f128939d, nVar.f128885i, nVar.f128887k, "", 0, j17, t37 != null ? t37.hashCode() : -1, k1Var2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(778L, 21L, 1L, false);
                if (z17) {
                    g0Var2.mo68477x336bdfd8(778L, 23L, 1L, false);
                    i17 = 0;
                } else {
                    g0Var2.mo68477x336bdfd8(778L, 22L, 1L, false);
                    i17 = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(this.f128939d.mo48798x74292566(), 24, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(this.f128939d.mo48798x74292566(), this.f128939d.t3().E0().f387385r.f33456x1c82a56c, this.f128939d.t3().E0().f387385r.f156932d, 778, 22, 1);
                }
                this.f128939d.mo48798x74292566();
                java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f436464a.f436465a).get(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35205x24728b);
                if (list != null && list.size() > 0) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(list.get(i17));
                    throw null;
                }
                if (this.f128939d.t3() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.d(this.f128939d.t3(), 204, j18 - j17);
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35221xfa7cfe98, str, j17, j18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35251xb7150598);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35221xfa7cfe98, "", str, j17, j18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.b(this.f128939d.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35251xb7150598);
                    }
                }
            }
        } else if (!z17) {
            str = str2;
            yd.q qVar = yd.q.ERROR;
            java.lang.String str3 = "plugin " + nVar.f157573a + " inject fail!";
            ae.q qVar2 = (ae.q) this.f128939d.z1(ae.q.class);
            if (qVar2 != null) {
                ((ae.a) qVar2).F0().a(qVar, str3);
            }
            B(false);
        } else if (this.f128939d.H0() || this.f128939d.mo50262x39e05d35()) {
            cl.k1 k1Var3 = obj instanceof cl.k1 ? (cl.k1) obj : null;
            ze.n t38 = this.f128939d.t3();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = nVar.f128885i;
            objArr2[1] = java.lang.Integer.valueOf(t38 != null ? t38.hashCode() : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsContextInterfaceWC", "[QualitySystem] %s runtime.hashCode = [%d]", objArr2);
            str = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.d(this.f128939d, nVar.f128885i, nVar.f128887k, nVar.f157573a, nVar.f157574b, j17, t38 != null ? t38.hashCode() : -1, k1Var3);
            yd.q qVar3 = yd.q.INFO;
            java.lang.String str4 = "plugin " + nVar.f157573a + " inject success!";
            ae.q qVar4 = (ae.q) this.f128939d.z1(ae.q.class);
            if (qVar4 != null) {
                ((ae.a) qVar4).F0().a(qVar3, str4);
            }
            B(true);
        } else {
            str = str2;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f(this.f128939d.mo48798x74292566(), "JsInject", j17, j18, java.lang.String.format("{ \"fileName\": \"%s\", \"fileSize\": %d }", str, java.lang.Long.valueOf(nVar.f128887k)));
        }
    }
}
