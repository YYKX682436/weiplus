package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.m1 {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j f170151h;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.j0 j0Var) {
        super(c0Var, j0Var);
        this.f170151h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j) c0Var.A1();
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void A(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(370L, 39L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).mo48798x74292566(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).t3().E0().f387385r.f33456x1c82a56c, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).t3().E0().f387385r.f156932d, 370, 39, 1);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r b(java.lang.String str, int i17) {
        if (this.f170151h.M == null) {
            return null;
        }
        return super.b(str, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r27, boolean r28, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] r29, boolean[] r30, java.lang.Object[] r31, long r32, long r34) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            boolean r2 = android.text.TextUtils.isEmpty(r27)
            if (r2 == 0) goto Lc
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
        Lc:
            boolean r2 = android.text.TextUtils.isEmpty(r27)
            if (r2 != 0) goto Lb4
            int r2 = r1.length
            if (r2 == 0) goto Lb4
            r2 = r30
            int r2 = r2.length
            if (r2 != 0) goto L1c
            goto Lb4
        L1c:
            com.tencent.luggage.sdk.jsapi.component.service.y r2 = r0.f128939d
            com.tencent.mm.plugin.appbrand.service.c0 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) r2
            com.tencent.mm.plugin.appbrand.o6 r2 = r2.t3()
            int r3 = r1.length
            r5 = 1
            r6 = 0
            if (r3 != r5) goto L42
            r3 = r31[r6]
            boolean r5 = r3 instanceof cl.k1
            if (r5 == 0) goto L33
            r4 = r3
            cl.k1 r4 = (cl.k1) r4
            goto L34
        L33:
            r4 = 0
        L34:
            if (r4 == 0) goto L3a
            int r1 = r4.f4720x425dcee1
            long r5 = (long) r1
            goto L8f
        L3a:
            r1 = r1[r6]
            if (r1 == 0) goto L41
            long r5 = r1.f128887k
            goto L8f
        L41:
            return
        L42:
            r3 = r6
            r9 = r3
            r10 = r9
            r5 = 0
            r11 = 0
            r13 = 0
        L4b:
            int r15 = r1.length
            if (r3 >= r15) goto L71
            r15 = r31[r3]
            boolean r4 = r15 instanceof cl.k1
            if (r4 == 0) goto L67
            cl.k1 r15 = (cl.k1) r15
            int r4 = r15.f4720x425dcee1
            long r9 = (long) r4
            long r5 = r5 + r9
            long r9 = r15.f4718xa1600be
            long r13 = r13 + r9
            long r9 = r15.f4719xac733416
            long r11 = r11 + r9
            int r4 = r15.f4717x67f135e7
            int r9 = r15.f124210c
            r10 = r9
            r9 = r4
            goto L6e
        L67:
            r4 = r1[r3]
            if (r4 == 0) goto L6e
            long r7 = r4.f128887k
            long r5 = r5 + r7
        L6e:
            int r3 = r3 + 1
            goto L4b
        L71:
            r3 = 0
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 <= 0) goto L94
            cl.k1 r4 = new cl.k1
            r4.<init>()
            r7 = r32
            r4.f124208a = r7
            r7 = r34
            r4.f124209b = r7
            r4.f4717x67f135e7 = r9
            r4.f124210c = r10
            r4.f4718xa1600be = r13
            r4.f4719xac733416 = r11
            int r1 = (int) r5
            r4.f4720x425dcee1 = r1
        L8f:
            r24 = r4
            r17 = r5
            goto L98
        L94:
            r17 = r5
            r24 = 0
        L98:
            com.tencent.luggage.sdk.jsapi.component.service.y r15 = r0.f128939d
            java.util.Objects.requireNonNull(r27)
            java.lang.String r19 = ""
            r20 = 0
            if (r2 == 0) goto La8
            int r1 = r2.hashCode()
            goto La9
        La8:
            r1 = -1
        La9:
            r23 = r1
            r16 = r27
            r21 = r32
            r25 = r28
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.e(r15, r16, r17, r19, r20, r21, r23, r24, r25)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a.c(java.lang.String, boolean, com.tencent.luggage.sdk.jsapi.component.n[], boolean[], java.lang.Object[], long, long):void");
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void d(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
        if (t37.e3()) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.AppBrand.WXNativeInjector", "evaluate wxNative.js start. appId:" + c0Var.mo48798x74292566() + ", contextId:" + context.o());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.net.URL url = new java.net.URL(c0Var.X0() + "wxNative.js");
            java.lang.String e17 = ik1.f.e("wxNative.js");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getAssetAsString(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) context).R(url, e17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a7(c0Var, context, elapsedRealtime));
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public java.lang.String f(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, java.lang.String str) {
        try {
            return super.f((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar, str);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t6 e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(370L, 48L, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).mo48798x74292566(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).t3().E0().f387385r.f33456x1c82a56c, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d).t3().E0().f387385r.f156932d, 370, 48, 1);
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public java.lang.Object m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = this.f170151h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = jVar.M;
        if (c12745x1ee4df80 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        jVar.P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12587x30bb3a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
        return c12745x1ee4df80;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void n(int i17, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = this.f170151h;
        jVar.getClass();
        jVar.P0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12586x30bb39(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t1.f172356d));
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.f(this.f170151h.L, str, z17, this.f128939d);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void r(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.g(this.f170151h.L, str);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void s(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.k(this.f170151h.L, str, this.f128939d);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void t(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.l(this.f170151h.L, str);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.r(this.f170151h.L, str, str2, str3);
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        long j18;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.m(this.f170151h.L, arrayList.size() == 1 ? (java.lang.String) arrayList.get(0) : java.util.Arrays.toString(arrayList.toArray(new java.lang.String[0])), arrayList2, arrayList3, this.f128939d);
        if (arrayList2 == null || arrayList3 == null) {
            return;
        }
        long j19 = j17;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            java.lang.String str = (java.lang.String) arrayList.get(i19);
            if (!android.text.TextUtils.isEmpty(str)) {
                cl.k1 k1Var = (cl.k1) arrayList3.get(i19);
                if (i19 == arrayList.size() - 1) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    j18 = java.lang.System.currentTimeMillis();
                } else {
                    j18 = k1Var != null ? k1Var.f4718xa1600be + j19 + k1Var.f4719xac733416 : j19;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7097x4a56851f g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.g(this.f128939d);
                g17.p(str);
                g17.f144101p = k1Var != null ? k1Var.f4720x425dcee1 : 0L;
                g17.f144103r = (k1Var == null || (i18 = k1Var.f4717x67f135e7) < 0 || i18 >= 7) ? 4L : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.f165536t0[i18];
                g17.f144104s = 1L;
                g17.f144105t = k1Var != null ? k1Var.f4718xa1600be : 0L;
                g17.f144107v = k1Var != null ? k1Var.f124210c : 0L;
                g17.f144096k = j19;
                g17.f144097l = j18;
                g17.f144094i = j18 - j19;
                g17.k();
                j19 = j18;
            }
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public void x(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a.n(this.f170151h.L, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f128939d;
        if ((c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u6) && u46.l.a(str, "WASubContext.js")) {
            java.lang.String wxAutoTestJs = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u6) c0Var).getWxAutoTestJs();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (wxAutoTestJs == null) {
                wxAutoTestJs = "";
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b) this.f128940e).x0(i17)).mo14660x738236e6(wxAutoTestJs, null);
        }
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    public boolean y() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0268  */
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n r25, boolean r26, long r27, long r29, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a.z(com.tencent.luggage.sdk.jsapi.component.n, boolean, long, long, java.lang.Object):void");
    }
}
