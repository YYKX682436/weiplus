package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class a extends com.tencent.luggage.sdk.jsapi.component.service.m1 {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.j f88618h;

    public a(com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsruntime.j0 j0Var) {
        super(c0Var, j0Var);
        this.f88618h = (com.tencent.mm.plugin.appbrand.service.j) c0Var.A1();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void A(java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(370L, 39L, 1L, false);
        com.tencent.mm.plugin.appbrand.report.v0.i(((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).getAppId(), ((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).t3().E0().f305852r.pkgVersion, ((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).t3().E0().f305852r.f75399d, 370, 39, 1);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public com.tencent.mm.plugin.appbrand.jsruntime.r b(java.lang.String str, int i17) {
        if (this.f88618h.M == null) {
            return null;
        }
        return super.b(str, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r27, boolean r28, com.tencent.luggage.sdk.jsapi.component.n[] r29, boolean[] r30, java.lang.Object[] r31, long r32, long r34) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            boolean r2 = android.text.TextUtils.isEmpty(r27)
            if (r2 == 0) goto Lc
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.z.f193105a
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
            com.tencent.luggage.sdk.jsapi.component.service.y r2 = r0.f47406d
            com.tencent.mm.plugin.appbrand.service.c0 r2 = (com.tencent.mm.plugin.appbrand.service.c0) r2
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
            int r1 = r4.sourceLength
            long r5 = (long) r1
            goto L8f
        L3a:
            r1 = r1[r6]
            if (r1 == 0) goto L41
            long r5 = r1.f47354k
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
            int r4 = r15.sourceLength
            long r9 = (long) r4
            long r5 = r5 + r9
            long r9 = r15.flatJSCompileCost
            long r13 = r13 + r9
            long r9 = r15.flatJSRunCost
            long r11 = r11 + r9
            int r4 = r15.codeCacheStatus
            int r9 = r15.f42677c
            r10 = r9
            r9 = r4
            goto L6e
        L67:
            r4 = r1[r3]
            if (r4 == 0) goto L6e
            long r7 = r4.f47354k
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
            r4.f42675a = r7
            r7 = r34
            r4.f42676b = r7
            r4.codeCacheStatus = r9
            r4.f42677c = r10
            r4.flatJSCompileCost = r13
            r4.flatJSRunCost = r11
            int r1 = (int) r5
            r4.sourceLength = r1
        L8f:
            r24 = r4
            r17 = r5
            goto L98
        L94:
            r17 = r5
            r24 = 0
        L98:
            com.tencent.luggage.sdk.jsapi.component.service.y r15 = r0.f47406d
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
            com.tencent.mm.plugin.appbrand.report.quality.e.e(r15, r16, r17, r19, r20, r21, r23, r24, r25)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.a.c(java.lang.String, boolean, com.tencent.luggage.sdk.jsapi.component.n[], boolean[], java.lang.Object[], long, long):void");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void d(com.tencent.luggage.sdk.jsapi.component.service.y yVar, com.tencent.mm.plugin.appbrand.jsruntime.r context) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) yVar;
        kotlin.jvm.internal.o.g(c0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        if (t37.e3()) {
            com.tencent.stubs.logger.Log.i("MicroMsg.AppBrand.WXNativeInjector", "evaluate wxNative.js start. appId:" + c0Var.getAppId() + ", contextId:" + context.o());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.net.URL url = new java.net.URL(c0Var.X0() + "wxNative.js");
            java.lang.String e17 = ik1.f.e("wxNative.js");
            kotlin.jvm.internal.o.f(e17, "getAssetAsString(...)");
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) context).R(url, e17, new com.tencent.mm.plugin.appbrand.service.a7(c0Var, context, elapsedRealtime));
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public int e() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_common_lib_code_cache_type, 0);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public java.lang.String f(com.tencent.luggage.sdk.jsapi.component.service.y yVar, java.lang.String str) {
        try {
            return super.f((com.tencent.mm.plugin.appbrand.service.c0) yVar, str);
        } catch (com.tencent.mm.plugin.appbrand.appcache.t6 e17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(370L, 48L, 1L, false);
            com.tencent.mm.plugin.appbrand.report.v0.i(((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).getAppId(), ((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).t3().E0().f305852r.pkgVersion, ((com.tencent.mm.plugin.appbrand.service.c0) this.f47406d).t3().E0().f305852r.f75399d, 370, 48, 1);
            throw e17;
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public java.lang.Object m(int i17) {
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88618h;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = jVar.M;
        if (wxaPkgV8SnapshotInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJSContextInterfaceWC", "onAllocContextFromSnapshotStart, commLibSnapshotInfo is null");
            return null;
        }
        jVar.P0(new com.tencent.mm.plugin.appbrand.service.j$$d(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
        return wxaPkgV8SnapshotInfo;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void n(int i17, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88618h;
        jVar.getClass();
        jVar.P0(new com.tencent.mm.plugin.appbrand.service.j$$c(com.tencent.mm.plugin.appbrand.v8_snapshot.t1.f90823d));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void o(boolean z17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.e(z17, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void p() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextStart");
        }
        j3Var.d(com.tencent.mm.plugin.appbrand.v8_snapshot.g3.f90714f);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void q(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.f(this.f88618h.L, str, z17, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void r(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.g(this.f88618h.L, str);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void s(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.k(this.f88618h.L, str, this.f47406d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void t(java.lang.String str, int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.l(this.f88618h.L, str);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.r(this.f88618h.L, str, str2, str3);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void w(int i17, java.util.ArrayList arrayList, long j17, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        long j18;
        int i18;
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.m(this.f88618h.L, arrayList.size() == 1 ? (java.lang.String) arrayList.get(0) : java.util.Arrays.toString(arrayList.toArray(new java.lang.String[0])), arrayList2, arrayList3, this.f47406d);
        if (arrayList2 == null || arrayList3 == null) {
            return;
        }
        long j19 = j17;
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            java.lang.String str = (java.lang.String) arrayList.get(i19);
            if (!android.text.TextUtils.isEmpty(str)) {
                cl.k1 k1Var = (cl.k1) arrayList3.get(i19);
                if (i19 == arrayList.size() - 1) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    j18 = java.lang.System.currentTimeMillis();
                } else {
                    j18 = k1Var != null ? k1Var.flatJSCompileCost + j19 + k1Var.flatJSRunCost : j19;
                }
                com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct g17 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.g(this.f47406d);
                g17.p(str);
                g17.f62568p = k1Var != null ? k1Var.sourceLength : 0L;
                g17.f62570r = (k1Var == null || (i18 = k1Var.codeCacheStatus) < 0 || i18 >= 7) ? 4L : com.tencent.mm.plugin.appbrand.jsruntime.l0.f84003t0[i18];
                g17.f62571s = 1L;
                g17.f62572t = k1Var != null ? k1Var.flatJSCompileCost : 0L;
                g17.f62574v = k1Var != null ? k1Var.f42677c : 0L;
                g17.f62563k = j19;
                g17.f62564l = j18;
                g17.f62561i = j18 - j19;
                g17.k();
                j19 = j18;
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public void x(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.n(this.f88618h.L, str);
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) this.f47406d;
        if ((c0Var instanceof com.tencent.mm.plugin.appbrand.service.u6) && u46.l.a(str, "WASubContext.js")) {
            java.lang.String wxAutoTestJs = ((com.tencent.mm.plugin.appbrand.service.u6) c0Var).getWxAutoTestJs();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (wxAutoTestJs == null) {
                wxAutoTestJs = "";
            }
            ((com.tencent.mm.plugin.appbrand.jsruntime.n) ((com.tencent.mm.plugin.appbrand.jsruntime.b) this.f47407e).x0(i17)).evaluateJavascript(wxAutoTestJs, null);
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    public boolean y() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_read_comm_lib_by_fd, 1) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0268  */
    @Override // com.tencent.luggage.sdk.jsapi.component.service.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(com.tencent.luggage.sdk.jsapi.component.n r25, boolean r26, long r27, long r29, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.service.a.z(com.tencent.luggage.sdk.jsapi.component.n, boolean, long, long, java.lang.Object):void");
    }
}
