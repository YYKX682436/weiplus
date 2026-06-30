package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p4 implements com.tencent.mm.plugin.appbrand.page.u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86988a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f86989b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86990c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f86993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86995h;

    public p4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, long j17, org.json.JSONObject jSONObject) {
        this.f86995h = i3Var;
        this.f86991d = str;
        this.f86992e = wdVar;
        this.f86993f = j17;
        this.f86994g = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void a() {
        int size;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        int i17;
        boolean z17;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var;
        li1.a aVar;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var2;
        int i18;
        org.json.JSONObject jSONObject;
        boolean z18;
        com.tencent.mm.plugin.appbrand.page.wd wdVar;
        long j17;
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var3;
        boolean z19;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var4;
        final java.lang.String str2;
        u65.a aVar2;
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        if (this.f86989b) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = this.f86995h;
        if (i3Var2.f86702e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", this.f86991d, this.f86992e);
            return;
        }
        if (this.f86988a) {
            return;
        }
        long j18 = this.f86993f;
        java.lang.String str3 = this.f86991d;
        com.tencent.mm.plugin.appbrand.page.wd wdVar2 = this.f86992e;
        boolean z27 = this.f86990c;
        org.json.JSONObject jSONObject2 = this.f86994g;
        synchronized (i3Var2.f86709o) {
            size = i3Var2.f86711q.size();
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Long.valueOf(j18);
        objArr[1] = str3;
        objArr[2] = wdVar2;
        objArr[3] = java.lang.Integer.valueOf(size);
        objArr[4] = java.lang.Boolean.valueOf(z27);
        int i19 = -1;
        objArr[5] = java.lang.Integer.valueOf(jSONObject2 == null ? -1 : jSONObject2.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext: routeId:%d, url:%s, type:%s), Staging Count: %d, disableAnimation %b, customArgs.size:%d", objArr);
        com.tencent.mm.plugin.appbrand.page.w2 w2Var5 = (com.tencent.mm.plugin.appbrand.page.w2) cf.i.a("AppBrandPageContainerProfile| createPage", new com.tencent.mm.plugin.appbrand.page.p3(i3Var2, str3, wdVar2));
        java.util.Objects.requireNonNull(w2Var5);
        synchronized (i3Var2.f86709o) {
            w2Var = (com.tencent.mm.plugin.appbrand.page.w2) i3Var2.f86710p.peekFirst();
        }
        if (w2Var5.getContentView() == null) {
            w2Var5.setInitialUrl(str3);
            w2Var5.A();
        }
        if (w2Var != null) {
            int currentWindowId = w2Var.getCurrentWindowId();
            i17 = w2Var.getCurrentComponentId();
            z17 = w2Var.B();
            i19 = currentWindowId;
        } else {
            i17 = -1;
            z17 = false;
        }
        int currentWindowId2 = w2Var5.getCurrentWindowId();
        int currentComponentId = w2Var5.getCurrentComponentId();
        boolean B = w2Var5.B();
        com.tencent.mm.plugin.appbrand.page.w2 w2Var6 = null;
        final li1.a aVar3 = (z17 && B && i19 == currentWindowId2) != false ? new li1.a() : null;
        com.tencent.mm.plugin.appbrand.page.jb jbVar = i3Var2.f86716v;
        if (jbVar != null) {
            aVar = aVar3;
            w2Var2 = w2Var5;
            boolean z28 = z17;
            i3Var = i3Var2;
            i18 = 1;
            int i27 = i17;
            jSONObject = jSONObject2;
            z18 = z27;
            wdVar = wdVar2;
            j17 = j18;
            ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) jbVar).f(j18, str3, z28, i19, i27, B, currentWindowId2, currentComponentId, wdVar2, jSONObject, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$e
                @Override // java.lang.Runnable
                public final void run() {
                    li1.a aVar4 = li1.a.this;
                    if (aVar4 != null) {
                        aVar4.a();
                    }
                }
            });
        } else {
            i3Var = i3Var2;
            aVar = aVar3;
            w2Var2 = w2Var5;
            i18 = 1;
            jSONObject = jSONObject2;
            z18 = z27;
            wdVar = wdVar2;
            j17 = j18;
        }
        boolean[] zArr = new boolean[i18];
        zArr[0] = false;
        com.tencent.mm.plugin.appbrand.page.wd wdVar3 = com.tencent.mm.plugin.appbrand.page.wd.APP_LAUNCH;
        final com.tencent.mm.plugin.appbrand.page.wd wdVar4 = wdVar;
        if (wdVar3 == wdVar4) {
            w2Var2.getCurrentPageView().s2();
        }
        boolean z29 = z18 | ((com.tencent.mm.plugin.appbrand.page.xd.a(wdVar4) ? 1 : 0) ^ i18);
        com.tencent.mm.plugin.appbrand.page.wd wdVar5 = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO;
        boolean z37 = (wdVar4 == wdVar5 && w2Var == null) ? i18 : z29 ? 1 : 0;
        final com.tencent.mm.plugin.appbrand.page.i3 i3Var3 = i3Var;
        com.tencent.mm.plugin.appbrand.page.a5 G = i3Var3.G(w2Var, w2Var2, wdVar4, str3, !z37);
        if (i3Var3.e0(wdVar4)) {
            str = str3;
            w2Var2.t(j17, "onAppRoute", wdVar4, G, jSONObject, null);
            zArr[0] = i18;
        } else {
            str = str3;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) w2Var2.getParent();
        if (viewGroup != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageContainer", new java.lang.Throwable(), "page already has a parent", new java.lang.Object[0]);
            w2Var3 = w2Var2;
            viewGroup.removeView(w2Var3);
        } else {
            w2Var3 = w2Var2;
        }
        i3Var3.addView(w2Var3, 0);
        final com.tencent.mm.plugin.appbrand.page.q3 q3Var = new com.tencent.mm.plugin.appbrand.page.q3(i3Var3, wdVar4, w2Var, w2Var3, aVar, j17);
        q3Var.f87023e = z37;
        synchronized (i3Var3.f86709o) {
            try {
                i3Var3.f86711q.push(w2Var3);
                i3Var3.f86712r.push(q3Var);
                if (i3Var3.f86710p.size() == 0) {
                    i3Var3.postDelayed(q3Var, 5000L);
                } else if (wdVar4 == com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH) {
                    i3Var3.postOnAnimation(q3Var);
                } else {
                    i3Var3.postDelayed(q3Var, i3Var3.f86720z);
                }
                if (i3Var3.getRuntime().f74797f.size() >= 2 && i3Var3.f86710p.isEmpty() && wdVar4 == wdVar5) {
                    i3Var3.postOnAnimation(q3Var);
                }
                if (wdVar4 != com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO && wdVar4 != com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE && wdVar4 != com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB && wdVar4 != com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH && wdVar4 != com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH) {
                    z19 = false;
                    if ((!z19 || yo.a.b(new com.tencent.mm.plugin.appbrand.page.wd[]{com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB, com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH, com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH}, wdVar4)) && (w2Var4 = (com.tencent.mm.plugin.appbrand.page.w2) i3Var3.f86710p.peekFirst()) != null && w2Var4 != w2Var3) {
                        w2Var6 = w2Var4;
                    }
                    str2 = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", i3Var3.getAppId(), str2, wdVar4);
                }
                z19 = true;
                if (!z19) {
                }
                w2Var6 = w2Var4;
                str2 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", i3Var3.getAppId(), str2, wdVar4);
            } catch (java.lang.Throwable th6) {
                th = th6;
                while (true) {
                    try {
                        break;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                throw th;
            }
        }
        if (w2Var6 != null && (currentPageView = w2Var6.getCurrentPageView()) != null) {
            currentPageView.z();
        }
        boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView2 = w2Var3.getCurrentPageView();
        final u65.a aVar4 = new u65.a(currentPageView2.p2() ? 2 : 1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$f
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.page.i3 i3Var4 = com.tencent.mm.plugin.appbrand.page.i3.this;
                com.tencent.mm.plugin.appbrand.page.t4 t4Var = q3Var;
                i3Var4.removeCallbacks(t4Var);
                i3Var4.post(t4Var);
            }
        });
        if (currentPageView2.p2()) {
            aVar2 = aVar4;
            currentPageView2.X0(io.flutter.embedding.android.RenderMode.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.i3 i3Var4 = com.tencent.mm.plugin.appbrand.page.i3.this;
                    i3Var4.getClass();
                    boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandPageContainer", "navigateToNext, switchToImage cost[%dms], appId[%s] type[%s], url[%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), i3Var4.getAppId(), wdVar4, str2);
                    aVar4.b();
                }
            }, 500L);
            currentPageView2.o3();
        } else {
            aVar2 = aVar4;
        }
        currentPageView2.P(new com.tencent.mm.plugin.appbrand.page.r3(i3Var3, elapsedRealtime, wdVar4, str2, currentPageView2, aVar2));
        long j19 = j17;
        w2Var3.C(j19, str2, wdVar4);
        i3Var3.H(w2Var3, wdVar4);
        if (!zArr[0]) {
            w2Var3.t(j19, "onAppRoute", wdVar4, G, jSONObject, null);
        }
        this.f86988a = true;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var4 = this.f86995h;
        com.tencent.mm.plugin.appbrand.page.y4 y4Var = i3Var4.A;
        if (y4Var != null) {
            java.util.Objects.requireNonNull(i3Var4.getCurrentPage());
            com.tencent.mm.plugin.appbrand.page.wd wdVar6 = this.f86992e;
            com.tencent.mm.plugin.appbrand.d2 d2Var = ((com.tencent.mm.plugin.appbrand.d2$$b) y4Var).f77560a;
            if (wdVar3 == wdVar6) {
                d2Var.f77558d.R1.b();
            } else {
                d2Var.getClass();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f86995h.f86719y.b(this.f86993f, str, obj, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void cancel() {
        this.f86989b = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.u4
    public void setAnimationEnabled(boolean z17) {
        this.f86990c = !z17;
    }
}
