package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class md implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f167278d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f167279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f167280f;

    /* renamed from: g, reason: collision with root package name */
    public final l81.v0 f167281g;

    public md(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11540x7c757cfc data, l81.v0 v0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config = data.f156401d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 stat = data.f156402e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stat, "stat");
        this.f167278d = config;
        this.f167279e = stat;
        this.f167280f = data.f156403f;
        this.f167281g = v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0.f156376v == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.md r5) {
        /*
            com.tencent.mm.plugin.appbrand.hc r0 = r4.f156329e
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb
            r2 = 0
            if (r1 == 0) goto La
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L13
            boolean r0 = r0.f156376v
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "run() callbackOnPreRenderComplete id:"
            r0.<init>(r3)
            int r3 = r5.f167280f
            r0.append(r3)
            java.lang.String r3 = ", appId:"
            r0.append(r3)
            java.lang.String r3 = r4.f156336n
            r0.append(r3)
            java.lang.String r3 = ", instanceId:"
            r0.append(r3)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r4.u0()
            java.lang.String r3 = r3.f128810w
            r0.append(r3)
            java.lang.String r3 = ", hasResumedContainer:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            if (r1 == 0) goto L55
            l81.v0 r4 = r5.f167281g
            if (r4 == 0) goto L62
            r5 = -2
            r0 = 2
            l81.v0.b(r4, r5, r2, r0, r2)
            goto L62
        L55:
            r4.f0()
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.c(r4)
            l81.v0 r4 = r5.f167281g
            if (r4 == 0) goto L62
            r4.mo50385xe05b4124()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.md.a(com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.md):void");
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.md mdVar) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService.RemoteLoader", "run() waitForRuntimeInitReady id:" + mdVar.f167280f + ", appId:" + o6Var.f156336n + ", instanceId:" + mdVar.f167278d.f128810w);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.jd jdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.jd(o6Var, mdVar);
        if (o6Var.T) {
            jdVar.a();
        } else {
            o6Var.G.add(jdVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kd kdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kd(mdVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ge geVar = o6Var.H;
        if (!geVar.f159786b.get()) {
            geVar.f159785a.add(kdVar);
        }
        synchronized (o6Var) {
            z17 = o6Var.U;
        }
        if (!z17) {
            o6Var.X0();
        }
        xi1.g mo48803xee5260a9 = o6Var.mo48803xee5260a9();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48803xee5260a9, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.platform.window.fake.PreRenderCustomWindowAndroid");
        android.util.DisplayMetrics mo48807xad90d981 = ((yi1.a) mo48803xee5260a9).mo48807xad90d981();
        o6Var.f156343s.measure(android.view.View.MeasureSpec.makeMeasureSpec(mo48807xad90d981.widthPixels, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(mo48807xad90d981.heightPixels, Integer.MIN_VALUE));
        o6Var.I1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ld(o6Var));
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandPreRenderColdStartService.RemoteLoader-" + this.f167280f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r6.mo48806x666b03f3() > 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if ((r6 != null && r6.f156376v) != false) goto L53;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.md.run():void");
    }
}
