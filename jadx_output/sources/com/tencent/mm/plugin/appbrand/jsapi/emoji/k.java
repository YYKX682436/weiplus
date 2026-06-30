package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class k implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f80846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.m f80848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext f80849d;

    public k(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.emoji.m mVar, com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext jsApiOpenDesignerProfile$EmotionDesignerContext) {
        this.f80846a = e9Var;
        this.f80847b = i17;
        this.f80848c = mVar;
        this.f80849d = jsApiOpenDesignerProfile$EmotionDesignerContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult r8 = (com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult) r8
            r0 = 0
            if (r8 == 0) goto L10
            boolean r1 = r8.f80813d
            if (r1 == 0) goto La
            goto Lb
        La:
            r8 = r0
        Lb:
            if (r8 == 0) goto L10
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult r8 = r8.f80814e
            goto L11
        L10:
            r8 = r0
        L11:
            int r1 = r7.f80847b
            com.tencent.mm.plugin.appbrand.e9 r2 = r7.f80846a
            com.tencent.mm.plugin.appbrand.jsapi.emoji.m r3 = r7.f80848c
            java.lang.String r4 = "MicroMsg.JsApiOpenDesignerProfile"
            if (r8 != 0) goto L51
            java.lang.String r8 = "openDesignerProfile failed, designerResult is null"
            com.tencent.mars.xlog.Log.e(r4, r8)
            r3.getClass()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L2b
            java.lang.String r0 = "fail:internal error"
        L2b:
            if (r0 != 0) goto L2f
            java.lang.String r0 = ""
        L2f:
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.z.f193105a
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r4 = "errno"
            r5 = 4
            r8.put(r4, r5)     // Catch: java.lang.Exception -> L3d
            goto L49
        L3d:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "MicroMsg.AppBrandJsApi"
            java.lang.String r6 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.mars.xlog.Log.e(r5, r6, r4)
        L49:
            java.lang.String r8 = r3.u(r0, r8)
            r2.a(r1, r8)
            goto L7c
        L51:
            java.lang.String r0 = "openDesignerProfile getDesignerInfo success"
            com.tencent.mars.xlog.Log.i(r4, r0)
            r45.v75 r0 = new r45.v75
            r0.<init>()
            int r4 = r8.f80815d
            r0.f387964d = r4
            java.lang.String r4 = r8.f80816e
            r0.f387965e = r4
            java.lang.String r4 = r8.f80817f
            r0.f387966f = r4
            java.lang.String r4 = r8.f80818g
            r0.f387967g = r4
            java.lang.String r4 = r8.f80819h
            r0.f387970m = r4
            java.lang.String r4 = r8.f80820i
            r0.f387969i = r4
            java.lang.String r8 = r8.f80821m
            r0.f387968h = r8
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext r8 = r7.f80849d
            com.tencent.mm.plugin.appbrand.jsapi.emoji.m.C(r3, r2, r1, r8, r0)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.emoji.k.onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult):void");
    }
}
