package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class ed extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "setReportGameExtraInfo";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:30:0x0019, B:12:0x0025), top: B:29:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r6, org.json.JSONObject r7, int r8) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.e9 r6 = (com.tencent.mm.plugin.appbrand.e9) r6
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 != 0) goto L67
            if (r7 != 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L13
            goto L67
        L13:
            java.lang.String r2 = ""
            java.lang.String r3 = "platformInfo"
            if (r7 == 0) goto L22
            boolean r4 = r7.has(r3)     // Catch: java.lang.Exception -> L20
            if (r4 != r0) goto L22
            goto L23
        L20:
            r7 = move-exception
            goto L2a
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L33
            java.lang.String r7 = r7.getString(r3)     // Catch: java.lang.Exception -> L20
            goto L34
        L2a:
            java.lang.String r0 = "safeGetString"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.tencent.mm.sdk.platformtools.Log.a(r0, r2, r7)
        L33:
            r7 = 0
        L34:
            if (r7 != 0) goto L37
            goto L38
        L37:
            r2 = r7
        L38:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r6.getRuntime()
            if (r7 == 0) goto L5d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r6.getRuntime()
            boolean r7 = r7 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r7 == 0) goto L5d
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r6.getRuntime()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC"
            kotlin.jvm.internal.o.e(r7, r0)
            com.tencent.mm.plugin.appbrand.o6 r7 = (com.tencent.mm.plugin.appbrand.o6) r7
            r7.f86174j2 = r2
            java.lang.String r7 = "ok"
            java.lang.String r7 = r5.o(r7)
            r6.a(r8, r7)
            goto L6e
        L5d:
            java.lang.String r7 = "fail: no right service"
            java.lang.String r7 = r5.o(r7)
            r6.a(r8, r7)
            goto L6e
        L67:
            java.lang.String r6 = "MicroMsg.AppBrand.JsApiSetReportGameExtraInfo"
            java.lang.String r7 = "service or data null"
            com.tencent.mars.xlog.Log.e(r6, r7)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.ed.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
