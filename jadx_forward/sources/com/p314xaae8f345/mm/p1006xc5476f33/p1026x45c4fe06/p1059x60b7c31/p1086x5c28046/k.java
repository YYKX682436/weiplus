package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* loaded from: classes13.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m f162381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12088xa3d6f36a f162382d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12088xa3d6f36a c12088xa3d6f36a) {
        this.f162379a = e9Var;
        this.f162380b = i17;
        this.f162381c = mVar;
        this.f162382d = c12088xa3d6f36a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 r8) {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46) r8
            r0 = 0
            if (r8 == 0) goto L10
            boolean r1 = r8.f162346d
            if (r1 == 0) goto La
            goto Lb
        La:
            r8 = r0
        Lb:
            if (r8 == 0) goto L10
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult r8 = r8.f162347e
            goto L11
        L10:
            r8 = r0
        L11:
            int r1 = r7.f162380b
            com.tencent.mm.plugin.appbrand.e9 r2 = r7.f162379a
            com.tencent.mm.plugin.appbrand.jsapi.emoji.m r3 = r7.f162381c
            java.lang.String r4 = "MicroMsg.JsApiOpenDesignerProfile"
            if (r8 != 0) goto L51
            java.lang.String r8 = "openDesignerProfile failed, designerResult is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8)
            r3.getClass()
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L2b
            java.lang.String r0 = "fail:internal error"
        L2b:
            if (r0 != 0) goto L2f
            java.lang.String r0 = ""
        L2f:
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r6, r4)
        L49:
            java.lang.String r8 = r3.u(r0, r8)
            r2.a(r1, r8)
            goto L7c
        L51:
            java.lang.String r0 = "openDesignerProfile getDesignerInfo success"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            r45.v75 r0 = new r45.v75
            r0.<init>()
            int r4 = r8.f162348d
            r0.f469497d = r4
            java.lang.String r4 = r8.f162349e
            r0.f469498e = r4
            java.lang.String r4 = r8.f162350f
            r0.f469499f = r4
            java.lang.String r4 = r8.f162351g
            r0.f469500g = r4
            java.lang.String r4 = r8.f162352h
            r0.f469503m = r4
            java.lang.String r4 = r8.f162353i
            r0.f469502i = r4
            java.lang.String r8 = r8.f162354m
            r0.f469501h = r8
            com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$EmotionDesignerContext r8 = r7.f162382d
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.C(r3, r2, r1, r8, r0)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.k.mo50331x8a4d1541(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult):void");
    }
}
