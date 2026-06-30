package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.p0 f69132a = new com.tencent.mm.minigame.p0();

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.tencent.luggage.sdk.jsapi.component.service.y r5, java.util.Map r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof com.tencent.mm.minigame.l0
            if (r5 == 0) goto L13
            r5 = r7
            com.tencent.mm.minigame.l0 r5 = (com.tencent.mm.minigame.l0) r5
            int r0 = r5.f69104h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f69104h = r0
            goto L18
        L13:
            com.tencent.mm.minigame.l0 r5 = new com.tencent.mm.minigame.l0
            r5.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r5.f69102f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f69104h
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r6 = r5.f69101e
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r5 = r5.f69100d
            com.tencent.mm.minigame.p0 r5 = (com.tencent.mm.minigame.p0) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L68
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            java.io.File r7 = new java.io.File
            java.lang.String r1 = "/sdcard/Android/data/com.tencent.mm/cache/framework-debug.zip"
            r7.<init>(r1)
            boolean r7 = r7.exists()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "filterFrameworkPkgPath: IS_DEBUG=false, exist="
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "WVA.JsApiOperateWVA"
            com.tencent.mars.xlog.Log.i(r1, r7)
            com.tencent.mm.minigame.r0 r7 = com.tencent.mm.minigame.u0.f69147e
            r5.f69100d = r4
            r5.f69101e = r6
            r5.f69104h = r2
            java.lang.Object r7 = r7.b(r5)
            if (r7 != r0) goto L67
            return r0
        L67:
            r5 = r4
        L68:
            java.lang.String r7 = (java.lang.String) r7
            com.tencent.mm.minigame.k0 r0 = com.tencent.mm.minigame.k0.f69088f
            java.lang.String r1 = "AHP: 正在使用 UDR framework"
            r5.b(r1, r0)
            java.lang.String r5 = "pkgPath"
            r6.put(r5, r7)
            com.tencent.mm.minigame.r0 r5 = com.tencent.mm.minigame.u0.f69147e
            java.lang.String r7 = "PLUGIN_MANAGER_MD5"
            java.lang.String r7 = r5.a(r7)
            java.lang.String r0 = "pluginManagerMd5"
            r6.put(r0, r7)
            java.lang.String r7 = "PLUGIN_LOADER_MD5"
            java.lang.String r5 = r5.a(r7)
            java.lang.String r7 = "pluginLoaderMd5"
            r6.put(r7, r5)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.p0.a(com.tencent.luggage.sdk.jsapi.component.service.y, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.lang.String message, com.tencent.mm.minigame.k0 showToast) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(showToast, "showToast");
        com.tencent.mars.xlog.Log.i("WVA.JsApiOperateWVA", message);
        if (showToast.f69090d) {
            ym5.a1.f(new com.tencent.mm.minigame.n0(message));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.mm.plugin.appbrand.service.c0 r9, java.lang.String r10, java.util.Map r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.p0.c(com.tencent.mm.plugin.appbrand.service.c0, java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
