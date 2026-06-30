package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f91172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f91173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f91174f;

    public h0(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f91172d = n7Var;
        this.f91173e = o6Var;
        this.f91174f = appBrandInitConfigWC;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r6 = r17
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$4"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r18
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r17
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.page.n7 r0 = r6.f91172d
            java.lang.String r0 = com.tencent.mm.plugin.appbrand.complaint.c.b(r0)
            k91.z5 r1 = new k91.z5
            r1.<init>()
            com.tencent.mm.plugin.appbrand.o6 r2 = r6.f91173e
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r2 = r2.E0()
            com.tencent.mm.plugin.appbrand.o6 r3 = r6.f91173e
            com.tencent.mm.plugin.appbrand.page.n7 r3 = r3.N2()
            kotlin.jvm.internal.o.d(r3)
            com.tencent.mm.plugin.appbrand.o6 r4 = r6.f91173e
            java.lang.String r5 = "$runtime"
            kotlin.jvm.internal.o.f(r4, r5)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r4.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r5.L1
            java.lang.String r7 = "halfScreenConfig"
            kotlin.jvm.internal.o.f(r5, r7)
            boolean r7 = r5.c()
            r8 = 1
            if (r7 == 0) goto L5b
            k91.x2 r7 = k91.x2.f305817e
            k91.x2 r5 = r5.D
            if (r5 != r7) goto L5b
            r5 = r8
            goto L5c
        L5b:
            r5 = 0
        L5c:
            r7 = 0
            if (r5 == 0) goto L71
            com.tencent.mm.plugin.appbrand.hc r5 = r4.f74796e
            if (r5 != 0) goto L64
            goto L71
        L64:
            boolean r9 = r5.n(r4)
            if (r9 == 0) goto L71
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r5.i(r4)
            r7 = r4
            com.tencent.mm.plugin.appbrand.o6 r7 = (com.tencent.mm.plugin.appbrand.o6) r7
        L71:
            java.lang.String r4 = r2.f305842e
            r1.f305863a = r4
            java.lang.String r4 = ""
            if (r7 != 0) goto L7b
            r5 = r4
            goto L7d
        L7b:
            java.lang.String r5 = r7.f74803n
        L7d:
            r1.f305865c = r5
            r5 = 3
            r1.f305872j = r5
            com.tencent.mm.plugin.appbrand.page.fb r5 = r3.a2()
            if (r5 != 0) goto L89
            goto L8d
        L89:
            java.lang.String r4 = r3.X1()
        L8d:
            r1.f305873k = r4
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r3 = r2.f305852r
            int r3 = r3.f75399d
            r1.f305870h = r3
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = r2.f305852r
            int r2 = r2.pkgVersion
            r1.f305869g = r2
            r1.f305875m = r0
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r0 = "key_is_embed_wxa"
            r15.putBoolean(r0, r8)
            com.tencent.mm.plugin.appbrand.page.n7 r0 = r6.f91172d
            android.content.Context r9 = r0.getF147807d()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r6.f91174f
            java.lang.String r10 = r0.f47278x
            r11 = 11
            java.lang.String r12 = ""
            r13 = 1
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams r14 = r1.a()
            com.tencent.mm.plugin.appbrand.page.n7 r0 = r6.f91172d
            android.content.Context r0 = r0.getF147807d()
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r16 = com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.a(r0)
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$4"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.h0.onClick(android.view.View):void");
    }
}
