package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class md implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f85745d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f85746e;

    /* renamed from: f, reason: collision with root package name */
    public final int f85747f;

    /* renamed from: g, reason: collision with root package name */
    public final l81.v0 f85748g;

    public md(com.tencent.mm.plugin.appbrand.BindRemoteServiceData data, l81.v0 v0Var) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = data.f74868d;
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = data.f74869e;
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f85745d = config;
        this.f85746e = stat;
        this.f85747f = data.f74870f;
        this.f85748g = v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0.f74843v == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.appbrand.o6 r4, com.tencent.mm.plugin.appbrand.md r5) {
        /*
            com.tencent.mm.plugin.appbrand.hc r0 = r4.f74796e
            boolean r1 = r0 instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC
            r2 = 0
            if (r1 == 0) goto La
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L13
            boolean r0 = r0.f74843v
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "run() callbackOnPreRenderComplete id:"
            r0.<init>(r3)
            int r3 = r5.f85747f
            r0.append(r3)
            java.lang.String r3 = ", appId:"
            r0.append(r3)
            java.lang.String r3 = r4.f74803n
            r0.append(r3)
            java.lang.String r3 = ", instanceId:"
            r0.append(r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r4.u0()
            java.lang.String r3 = r3.f47277w
            r0.append(r3)
            java.lang.String r3 = ", hasResumedContainer:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader"
            com.tencent.mars.xlog.Log.i(r3, r0)
            if (r1 == 0) goto L55
            l81.v0 r4 = r5.f85748g
            if (r4 == 0) goto L62
            r5 = -2
            r0 = 2
            l81.v0.b(r4, r5, r2, r0, r2)
            goto L62
        L55:
            r4.f0()
            com.tencent.mm.plugin.appbrand.v1.c(r4)
            l81.v0 r4 = r5.f85748g
            if (r4 == 0) goto L62
            r4.onSuccess()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.md.a(com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.md):void");
    }

    public static final void b(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.md mdVar) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader", "run() waitForRuntimeInitReady id:" + mdVar.f85747f + ", appId:" + o6Var.f74803n + ", instanceId:" + mdVar.f85745d.f47277w);
        com.tencent.mm.plugin.appbrand.jd jdVar = new com.tencent.mm.plugin.appbrand.jd(o6Var, mdVar);
        if (o6Var.T) {
            jdVar.a();
        } else {
            o6Var.G.add(jdVar);
        }
        com.tencent.mm.plugin.appbrand.kd kdVar = new com.tencent.mm.plugin.appbrand.kd(mdVar);
        com.tencent.mm.plugin.appbrand.ge geVar = o6Var.H;
        if (!geVar.f78253b.get()) {
            geVar.f78252a.add(kdVar);
        }
        synchronized (o6Var) {
            z17 = o6Var.U;
        }
        if (!z17) {
            o6Var.X0();
        }
        xi1.g windowAndroid = o6Var.getWindowAndroid();
        kotlin.jvm.internal.o.e(windowAndroid, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.fake.PreRenderCustomWindowAndroid");
        android.util.DisplayMetrics vDisplayMetrics = ((yi1.a) windowAndroid).getVDisplayMetrics();
        o6Var.f74810s.measure(android.view.View.MeasureSpec.makeMeasureSpec(vDisplayMetrics.widthPixels, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(vDisplayMetrics.heightPixels, Integer.MIN_VALUE));
        o6Var.I1(new com.tencent.mm.plugin.appbrand.ld(o6Var));
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandPreRenderColdStartService.RemoteLoader-" + this.f85747f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r6.getStackSize() > 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if ((r6 != null && r6.f74843v) != false) goto L53;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.md.run():void");
    }
}
