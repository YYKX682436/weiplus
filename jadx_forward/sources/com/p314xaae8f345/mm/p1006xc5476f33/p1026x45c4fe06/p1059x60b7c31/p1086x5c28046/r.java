package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* loaded from: classes7.dex */
class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    private r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult r3 = new com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult
            r3.<init>()
            boolean r1 = r10 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12089x154a1741
            java.lang.String r2 = "MicroMsg.JsApiOpenSingleStickerView"
            r4 = 0
            if (r1 != 0) goto L19
            java.lang.String r10 = "handleRequest, request not instance of OpenEmojiSinglePageRequest, finishProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r10)
            r3.f162370d = r4
            r9.m50420x7b736e5c(r3)
            return
        L19:
            gm0.m r1 = gm0.j1.b()
            boolean r1 = r1.n()
            if (r1 != 0) goto L2e
            java.lang.String r10 = "handleRequest, MMKernel.account().hasLogin() is false, finishProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r10)
            r3.f162370d = r4
            r9.m50420x7b736e5c(r3)
            return
        L2e:
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageRequest r10 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12089x154a1741) r10
            java.lang.String r10 = r10.f162369d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L50
            r1.<init>(r10)     // Catch: org.json.JSONException -> L50
            java.lang.String r10 = "md5"
            java.lang.String r10 = r1.optString(r10)     // Catch: org.json.JSONException -> L50
            java.lang.String r5 = "emojiInfoBuf"
            java.lang.String r5 = r1.optString(r5)     // Catch: org.json.JSONException -> L4d
            java.lang.String r6 = "showEntry"
            boolean r0 = r1.optBoolean(r6)     // Catch: org.json.JSONException -> L4b
            r8 = r0
            goto L59
        L4b:
            r1 = move-exception
            goto L53
        L4d:
            r1 = move-exception
            r5 = r0
            goto L53
        L50:
            r1 = move-exception
            r10 = r0
            r5 = r10
        L53:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r0, r6)
            r8 = r4
        L59:
            r6 = r5
            r5 = r10
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            if (r10 == 0) goto L72
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r10 == 0) goto L72
            java.lang.String r10 = "md5 or emojiInfoBuf is empty, finishProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r10)
            r3.f162370d = r4
            r9.m50420x7b736e5c(r3)
            return
        L72:
            java.lang.Class<com.tencent.mm.feature.emoji.api.o6> r10 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class
            i95.m r10 = i95.n0.c(r10)
            com.tencent.mm.feature.emoji.api.o6 r10 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) r10
            if (r10 != 0) goto L87
            java.lang.String r10 = "service is empty, finishProcess"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r10)
            r3.f162370d = r4
            r9.m50420x7b736e5c(r3)
            return
        L87:
            r7 = 1000042(0xf426a, float:1.401357E-39)
            com.tencent.mm.plugin.appbrand.jsapi.emoji.q r0 = new com.tencent.mm.plugin.appbrand.jsapi.emoji.q
            r1 = r0
            r2 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.r.mo50332x63bc5f47(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest):void");
    }
}
