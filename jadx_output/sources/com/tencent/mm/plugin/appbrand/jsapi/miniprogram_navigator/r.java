package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public final class r extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a {
    private static final int CTRL_INDEX = 351;
    private static final java.lang.String NAME = "navigateToDevMiniProgram";

    static {
        si1.e.a(NAME);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            r1 = r10
            com.tencent.mm.plugin.appbrand.y r1 = (com.tencent.mm.plugin.appbrand.y) r1
            java.lang.String r10 = "appId"
            java.lang.String r2 = r11.optString(r10)
            java.lang.String r10 = "downloadURL"
            java.lang.String r10 = r11.optString(r10)
            java.lang.String r0 = "checkSumMd5"
            java.lang.String r0 = r11.optString(r0)
            java.lang.String r3 = "envVersion"
            java.lang.String r3 = r11.optString(r3)
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r4 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.DEVELOP
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r3 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(r3, r4)
            java.lang.String r5 = "relativeURL"
            java.lang.String r5 = r11.optString(r5)
            java.lang.String r6 = "extoptions"
            java.lang.String r6 = r11.optString(r6)
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r7 == 0) goto L3e
            java.lang.String r10 = "fail:appID is empty"
            java.lang.String r10 = r9.o(r10)
            r1.a(r12, r10)
            goto Lb8
        L3e:
            r7 = 0
            if (r4 != r3) goto L79
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L79
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo r4 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo
            r4.<init>()
            r4.f82181d = r2
            r4.f82182e = r10
            r4.f82183f = r0
            r4.f82184g = r6
            java.lang.String r10 = com.tencent.mm.sdk.platformtools.x2.f193072b     // Catch: java.lang.Exception -> L60
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q> r0 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q.class
            android.os.Parcelable r10 = com.tencent.mm.ipcinvoker.d0.f(r10, r4, r0)     // Catch: java.lang.Exception -> L60
            if (r10 == 0) goto L6c
            r10 = 1
            goto L6d
        L60:
            r10 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[]{r4, r10}
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiNavigateToDevMiniProgram"
            java.lang.String r4 = "invoke IPCFlushDevPkg, parcel:%s, exception:%s"
            com.tencent.mars.xlog.Log.e(r0, r4, r10)
        L6c:
            r10 = r7
        L6d:
            if (r10 != 0) goto L79
            java.lang.String r10 = "fail save packageInfo failed"
            java.lang.String r10 = r9.o(r10)
            r1.a(r12, r10)
            goto Lb8
        L79:
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d r10 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d
            r10.<init>()
            r10.f82204a = r12
            java.lang.String r0 = "scene"
            int r0 = r11.optInt(r0, r7)
            r10.f82205b = r0
            java.lang.String r0 = "sceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f82206c = r0
            java.lang.String r0 = "preScene"
            int r0 = r11.optInt(r0, r7)
            r10.f82207d = r0
            java.lang.String r0 = "preSceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f82208e = r0
            java.lang.String r0 = "noRelaunchIfPathUnchanged"
            boolean r0 = r11.optBoolean(r0, r7)
            r10.f82213j = r0
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0 r0 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0.f82261b
            int r3 = r3.f82194d
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.o r8 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.o
            r8.<init>(r9, r1, r12)
            r7 = 0
            r4 = r5
            r5 = r10
            r6 = r11
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h C() {
        return com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0.f82261b;
    }
}
