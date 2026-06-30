package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class wc extends com.tencent.mm.plugin.appbrand.page.a implements ni1.i {
    public static final java.lang.String[] G = {"custom_event_GenerateFuncReady", "custom_event_tapAnyWhere", "custom_event_vdSync", "onAppRoute", "onAppRouteDone"};
    public ni1.f A;
    public java.lang.String B;
    public boolean C;
    public com.tencent.mm.plugin.appbrand.page.vc D;
    public final com.tencent.mm.plugin.appbrand.page.cd E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public boolean f87219x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f87220y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f87221z;

    public wc(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        super(bVar);
        this.f87219x = false;
        this.f87220y = false;
        this.f87221z = false;
        this.A = null;
        this.E = new com.tencent.mm.plugin.appbrand.page.uc(this);
        this.F = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public com.tencent.mm.plugin.appbrand.page.hb R() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.appbrand.page.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.wc.W():void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    public void X(com.tencent.luggage.sdk.jsapi.component.n nVar, boolean z17, long j17, long j18, java.lang.Object obj) {
        if ("WAPageFrame.html".equals(nVar.f47352i) && !android.text.TextUtils.isEmpty(H())) {
            com.tencent.mm.plugin.appbrand.keylogger.w.f(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAWebview, "", j17, j18);
        }
        if (this.f87221z || F() == null || ((com.tencent.luggage.sdk.jsapi.component.b) F()).t3() == null || !N("checkIsAppSharedPageFrameExecutionFinished").c(nVar.f47352i)) {
            return;
        }
        this.f87221z = true;
    }

    public boolean a0() {
        return f0() != null && f0().Y();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.dd S(android.content.Context context) {
        com.tencent.mm.plugin.appbrand.page.ed edVar = new com.tencent.mm.plugin.appbrand.page.ed(c0(context));
        com.tencent.mm.plugin.appbrand.page.cd cdVar = this.E;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) ((com.tencent.mm.plugin.appbrand.page.uc) cdVar).f87150d.F();
        edVar.f86579e = v5Var;
        edVar.f86580f = cdVar;
        edVar.f86581g.f87253a = v5Var;
        edVar.f86584m.clear();
        G(se.a.class, edVar);
        return edVar;
    }

    public com.tencent.mm.plugin.appbrand.page.fb c0(android.content.Context context) {
        return new com.tencent.mm.plugin.appbrand.page.wa(context, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.tencent.luggage.sdk.jsapi.component.b bVar;
        if (u46.a.b(G, str)) {
            com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "publish critical appId[%s] url[%s] event[%s]", H(), this.f86375m, str);
            if (F() != null && ((com.tencent.luggage.sdk.jsapi.component.b) F()).j2() && "custom_event_GenerateFuncReady".equals(str)) {
                this.f87220y = true;
                com.tencent.mm.plugin.appbrand.keylogger.w.g(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                if (this.f87219x) {
                    com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                    this.f87220y = false;
                }
            }
        }
        if (com.tencent.mm.plugin.appbrand.page.vd.f87185a.contains(str) && (bVar = (com.tencent.luggage.sdk.jsapi.component.b) F()) != null) {
            bVar.e(str, str2, bVar.getComponentId());
        }
        return false;
    }

    public void d0(java.lang.String str, long j17, long j18) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (!this.C && str.startsWith("custom_event_")) {
            if (str.startsWith("custom_event_vdSync") || str.startsWith("custom_event_vdSyncBatch")) {
                if (((com.tencent.luggage.sdk.jsapi.component.b) F()).j2()) {
                    if (!this.f87219x) {
                        com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepVdSync);
                        this.f87219x = true;
                    }
                    if (this.f87220y) {
                        com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepGenerateFuncReadyRespond);
                        this.f87220y = false;
                    }
                }
                com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "dispatch critical vdSync appId[%s] url[%s] event[%s] content[%s] src[%d]", H(), this.f86375m, str, u46.l.t(str2, 0, 20), java.lang.Integer.valueOf(i17));
            } else {
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = H();
                objArr[1] = this.f86375m;
                objArr[2] = str;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                objArr[3] = java.lang.Integer.valueOf(str2.length());
                objArr[4] = java.lang.Integer.valueOf(i17);
                com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "dispatch critical appId[%s] url[%s] event[%s] size[%d] src[%d]", objArr);
            }
        }
        return false;
    }

    public final void e0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String k17 = u46.l.k(new java.lang.String[]{str, str2, str3}, ":");
        if (android.text.TextUtils.isEmpty(k17)) {
            return;
        }
        this.B = k17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appId", str);
        hashMap.put("appUrl", str2);
        hashMap.put("appStatus", str3);
        f0().setAppBrandInfo(hashMap);
        if (f0().b0()) {
            f0().evaluateJavascript("document.title=\"" + com.tencent.mm.plugin.appbrand.utils.w2.a(k17) + "\"", null);
        }
    }

    public com.tencent.mm.plugin.appbrand.page.dd f0() {
        return (com.tencent.mm.plugin.appbrand.page.dd) this.f86372g;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        this.C = false;
        this.f87219x = false;
        this.f87220y = false;
        f0().J(new com.tencent.mm.plugin.appbrand.page.pc(this));
        boolean j17 = super.j(str, wdVar);
        e0(H(), this.f86375m, "INITIAL");
        return j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void k() {
        super.k();
        e0(H(), this.f86375m, "INVISIBLE");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void n() {
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "dispatchForeground appId[%s] url[%s]", H(), this.f86375m);
        super.n();
        e0(H(), this.f86375m, "VISIBLE");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.luggage.sdk.jsapi.component.a
    public java.lang.Object r(java.lang.Class cls) {
        ni1.f fVar;
        if (ni1.f.class != cls) {
            return super.r(cls);
        }
        if (this.A != null || (fVar = (ni1.f) this.f86372g.h0(ni1.f.class)) == null) {
            return cls.cast(this.A);
        }
        com.tencent.mm.plugin.appbrand.page.nc ncVar = new com.tencent.mm.plugin.appbrand.page.nc(this, fVar);
        this.A = ncVar;
        return cls.cast(ncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // re.a, com.tencent.mm.plugin.appbrand.page.d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.util.Map r5, com.tencent.mm.plugin.appbrand.page.wd r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.jsapi.l r0 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r0 = (com.tencent.luggage.sdk.jsapi.component.b) r0
            java.util.Objects.requireNonNull(r0)
            com.tencent.mm.plugin.appbrand.page.wd r0 = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK
            if (r0 == r6) goto L5a
            com.tencent.mm.plugin.appbrand.jsapi.l r6 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r6 = (com.tencent.luggage.sdk.jsapi.component.b) r6
            java.lang.Class<ri1.a> r0 = ri1.a.class
            nd.b r6 = r6.q(r0)
            ri1.a r6 = (ri1.a) r6
            if (r6 == 0) goto L5a
            java.lang.String r0 = r4.f86375m
            ri1.p r6 = (ri1.p) r6
            boolean r1 = r6.f396036e
            r2 = 0
            if (r1 == 0) goto L3e
            if (r0 == 0) goto L31
            int r1 = r0.length()
            if (r1 != 0) goto L2f
            goto L31
        L2f:
            r1 = r2
            goto L32
        L31:
            r1 = 1
        L32:
            if (r1 == 0) goto L35
            goto L3e
        L35:
            r45.o8 r6 = r6.a(r0)
            if (r6 == 0) goto L3e
            java.lang.String r6 = r6.f382017f
            goto L3f
        L3e:
            r6 = 0
        L3f:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "initialRenderingCacheData"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L50
            r1.<init>(r6)     // Catch: java.lang.Exception -> L50
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L50
            goto L5a
        L50:
            r6 = move-exception
            java.lang.String r0 = "onFillRouteInEventData when parsing initialRenderingCacheData"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Luggage.MPPageViewRenderer"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r6, r0, r1)
        L5a:
            java.lang.String r6 = "qualityData"
            java.lang.Object r0 = r5.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L6c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.put(r6, r0)
        L6c:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            com.tencent.mm.plugin.appbrand.jsapi.l r1 = r4.F()
            com.tencent.luggage.sdk.jsapi.component.b r1 = (com.tencent.luggage.sdk.jsapi.component.b) r1
            int r1 = r1.getComponentId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "%d_%d"
            java.lang.String r6 = java.lang.String.format(r6, r2, r1)
            java.lang.String r1 = "navId"
            r0.put(r1, r6)
            com.tencent.mm.plugin.appbrand.page.dd r6 = r4.f0()
            boolean r6 = r6.q()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "isWebviewPreload"
            r0.put(r1, r6)
            boolean r6 = r4.f87221z
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "isPreloadPageFrame"
            r0.put(r1, r6)
            ze.n r6 = r4.J()
            boolean r6 = r6.a2()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "prerender"
            r5.put(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.wc.u(java.util.Map, com.tencent.mm.plugin.appbrand.page.wd):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void v() {
        super.v();
        f0().D();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.a, com.tencent.mm.plugin.appbrand.page.d7
    public void x() {
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewRenderer", "dispatchPageReady url[%s]", this.f86375m);
        this.C = true;
        super.x();
        this.f86371f.invalidate();
        if (((com.tencent.luggage.sdk.jsapi.component.b) F()).j2()) {
            com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageReady);
            com.tencent.mm.plugin.appbrand.keylogger.w.e(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPageInit);
        }
    }
}
