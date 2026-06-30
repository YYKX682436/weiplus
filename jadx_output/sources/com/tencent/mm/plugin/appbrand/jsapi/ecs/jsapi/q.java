package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes9.dex */
public final class q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r f80806d;

    public q(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r rVar) {
        this.f80806d = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:18:0x0016, B:14:0x0023), top: B:17:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            bw5.j8 r7 = (bw5.j8) r7
            bw5.i8 r8 = (bw5.i8) r8
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r7 = "info"
            kotlin.jvm.internal.o.g(r8, r7)
            java.lang.String r7 = r8.b()
            r8 = 0
            if (r7 == 0) goto L1f
            int r0 = r7.length()     // Catch: java.lang.Exception -> L29
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L23
            goto L29
        L23:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L29
            r0.<init>(r7)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r0 = r8
        L2a:
            r1 = -1
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r r2 = r6.f80806d
            java.lang.String r3 = "MicroMsg.OpenEcsGiftReceivePage"
            if (r0 == 0) goto L5b
            java.lang.String r4 = "errCode"
            int r1 = r0.optInt(r4, r1)
            java.lang.String r4 = "errMsg"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.optString(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "OpenEcsGiftReceivePageTask, endWithValue: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            int r4 = rl.b.f397143a
            com.tencent.mars.xlog.Log.i(r3, r7, r8)
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult r7 = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult
            r7.<init>(r1, r0)
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r.a(r2, r7)
            goto L6c
        L5b:
            int r7 = rl.b.f397143a
            java.lang.String r7 = "handleEcsMpActivityPageExitAction, json decode error"
            com.tencent.mars.xlog.Log.i(r3, r7, r8)
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult r7 = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageResult
            java.lang.String r8 = "json decode error"
            r7.<init>(r1, r8)
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.r.a(r2, r7)
        L6c:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
