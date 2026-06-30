package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class f1 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if ((r0 != null && r0.f170955z) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc r6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r7) {
        /*
            java.lang.String r0 = "container"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "rt"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            boolean r0 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9
            r2 = 1
            java.lang.String r3 = "MicroMsg.AppBrandPersistentRuntimeConfig"
            if (r0 == 0) goto L18
            goto L5c
        L18:
            boolean r0 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb
            if (r0 == 0) goto L5e
            r0 = r6
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb) r0
            android.app.Activity r0 = r0.w()
            if (r0 != 0) goto L2b
            java.lang.String r6 = "canKeepPersistent, container.activity == NULL"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r6)
            return r1
        L2b:
            boolean r4 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d
            if (r4 != 0) goto L5c
            java.util.concurrent.ConcurrentHashMap r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.f172173a
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.e(r7)
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
            boolean r4 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a
            if (r4 == 0) goto L50
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) r0
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L59
            boolean r0 = r0.f170955z
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
            boolean r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(r7)
            if (r5 == 0) goto L7e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            r7.append(r6)
            java.lang.String r6 = "], isGame:true"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            return r2
        L7e:
            com.tencent.mm.plugin.appbrand.e1 r5 = new com.tencent.mm.plugin.appbrand.e1
            r5.<init>(r7)
            if (r0 == 0) goto Lad
            boolean r0 = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()
            if (r0 == 0) goto L95
            r0 = 2003(0x7d3, float:2.807E-42)
            boolean r0 = com.p314xaae8f345.p3210x3857dc.a3.k(r0)
            if (r0 == 0) goto L95
            r0 = r2
            goto L96
        L95:
            r0 = r1
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lac
            java.lang.Object r0 = r5.mo152xb9724478()
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
            java.lang.String r6 = r7.f156336n
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f1.a(com.tencent.mm.plugin.appbrand.hc, com.tencent.mm.plugin.appbrand.AppBrandRuntime):boolean");
    }
}
