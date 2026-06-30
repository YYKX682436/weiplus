package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public final class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.a {

    /* renamed from: CTRL_INDEX */
    private static final int f34525x366c91de = 351;

    /* renamed from: NAME */
    private static final java.lang.String f34526x24728b = "navigateToDevMiniProgram";

    static {
        si1.e.a(f34526x24728b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            r1 = r10
            com.tencent.mm.plugin.appbrand.y r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) r1
            java.lang.String r10 = "appId"
            java.lang.String r2 = r11.optString(r10)
            java.lang.String r10 = "downloadURL"
            java.lang.String r10 = r11.optString(r10)
            java.lang.String r0 = "checkSumMd5"
            java.lang.String r0 = r11.optString(r0)
            java.lang.String r3 = "envVersion"
            java.lang.String r3 = r11.optString(r3)
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.DEVELOP
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(r3, r4)
            java.lang.String r5 = "relativeURL"
            java.lang.String r5 = r11.optString(r5)
            java.lang.String r6 = "extoptions"
            java.lang.String r6 = r11.optString(r6)
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
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
            r4.f163714d = r2
            r4.f163715e = r10
            r4.f163716f = r0
            r4.f163717g = r6
            java.lang.String r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b     // Catch: java.lang.Exception -> L60
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q.class
            android.os.Parcelable r10 = com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(r10, r4, r0)     // Catch: java.lang.Exception -> L60
            if (r10 == 0) goto L6c
            r10 = 1
            goto L6d
        L60:
            r10 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[]{r4, r10}
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiNavigateToDevMiniProgram"
            java.lang.String r4 = "invoke IPCFlushDevPkg, parcel:%s, exception:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r10)
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
            r10.f163737a = r12
            java.lang.String r0 = "scene"
            int r0 = r11.optInt(r0, r7)
            r10.f163738b = r0
            java.lang.String r0 = "sceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f163739c = r0
            java.lang.String r0 = "preScene"
            int r0 = r11.optInt(r0, r7)
            r10.f163740d = r0
            java.lang.String r0 = "preSceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f163741e = r0
            java.lang.String r0 = "noRelaunchIfPathUnchanged"
            boolean r0 = r11.optBoolean(r0, r7)
            r10.f163746j = r0
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q0.f163794b
            int r3 = r3.f163727d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.r.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.a
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.h C() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q0.f163794b;
    }
}
