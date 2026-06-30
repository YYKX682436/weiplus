package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class f1 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if ((r0 != null && r0.f89422z) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.tencent.mm.plugin.appbrand.hc r6, com.tencent.mm.plugin.appbrand.AppBrandRuntime r7) {
        /*
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "rt"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r7 instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            boolean r0 = r6 instanceof com.tencent.mm.plugin.appbrand.d9
            r2 = 1
            java.lang.String r3 = "MicroMsg.AppBrandPersistentRuntimeConfig"
            if (r0 == 0) goto L18
            goto L5c
        L18:
            boolean r0 = r6 instanceof com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC
            if (r0 == 0) goto L5e
            r0 = r6
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) r0
            android.app.Activity r0 = r0.w()
            if (r0 != 0) goto L2b
            java.lang.String r6 = "canKeepPersistent, container.activity == NULL"
            com.tencent.mars.xlog.Log.e(r3, r6)
            return r1
        L2b:
            boolean r4 = r0 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI
            if (r4 != 0) goto L5c
            java.util.concurrent.ConcurrentHashMap r4 = com.tencent.mm.plugin.appbrand.v1.f90640a
            boolean r4 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.e(r7)
            if (r4 != 0) goto L46
            boolean r4 = r7.Q0()
            if (r4 != 0) goto L46
            boolean r4 = r7.N0()
            if (r4 == 0) goto L44
            goto L46
        L44:
            r4 = r1
            goto L47
        L46:
            r4 = r2
        L47:
            if (r4 != 0) goto L5c
            boolean r4 = r0 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI
            if (r4 == 0) goto L50
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r0 = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) r0
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L59
            boolean r0 = r0.f89422z
            if (r0 != r2) goto L59
            r0 = r2
            goto L5a
        L59:
            r0 = r1
        L5a:
            if (r0 == 0) goto L5e
        L5c:
            r0 = r2
            goto L5f
        L5e:
            r0 = r1
        L5f:
            java.lang.String r4 = "canKeepPersistent, containerUI["
            if (r0 == 0) goto L7e
            boolean r5 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(r7)
            if (r5 == 0) goto L7e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            r7.append(r6)
            java.lang.String r6 = "], isGame:true"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.i(r3, r6)
            return r2
        L7e:
            com.tencent.mm.plugin.appbrand.e1 r5 = new com.tencent.mm.plugin.appbrand.e1
            r5.<init>(r7)
            if (r0 == 0) goto Lad
            boolean r0 = com.tencent.xweb.WebView.y0()
            if (r0 == 0) goto L95
            r0 = 2003(0x7d3, float:2.807E-42)
            boolean r0 = com.tencent.xweb.a3.k(r0)
            if (r0 == 0) goto L95
            r0 = r2
            goto L96
        L95:
            r0 = r1
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lac
            java.lang.Object r0 = r5.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lad
        Lac:
            r1 = r2
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r6 = "], return "
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = " for appId:"
            r0.append(r6)
            java.lang.String r6 = r7.f74803n
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.f1.a(com.tencent.mm.plugin.appbrand.hc, com.tencent.mm.plugin.appbrand.AppBrandRuntime):boolean");
    }
}
