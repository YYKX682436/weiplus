package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class f1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.g1 f161493c;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.g1 g1Var) {
        this.f161491a = lVar;
        this.f161492b = i17;
        this.f161493c = g1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|4|(4:5|6|7|(8:9|(1:11)|(1:13)(1:23)|14|15|16|17|18)(8:24|(1:26)|(1:28)(1:37)|29|30|31|32|33))|38|39|40|41|42|43|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r15);
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse r15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12034xcbb61794) r15
            java.lang.String r0 = "MicroMsg.JsApiOpenBizPublishImageForAppBrand"
            java.lang.String r1 = "MicroMsg.AppBrandJsApi"
            java.lang.String r2 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r3 = "errno"
            java.lang.String r4 = "fail:internal error"
            com.tencent.mm.plugin.appbrand.jsapi.biz.g1 r5 = r14.f161493c
            int r6 = r14.f161492b
            com.tencent.mm.plugin.appbrand.jsapi.l r7 = r14.f161491a
            java.lang.String r8 = "fail:internal error "
            java.lang.String r9 = "success: "
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1f
            java.lang.String r11 = r15.f161480f     // Catch: java.lang.Exception -> L1f
            r10.<init>(r11)     // Catch: java.lang.Exception -> L1f
            goto L24
        L1f:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
        L24:
            r11 = 4
            r12 = 0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La9
            r13.<init>(r9)     // Catch: java.lang.Exception -> La9
            boolean r9 = r15.f161478d     // Catch: java.lang.Exception -> La9
            r13.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = ", errMsg: "
            r13.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = r15.f161479e     // Catch: java.lang.Exception -> La9
            r13.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = ", extraData: "
            r13.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = r15.f161480f     // Catch: java.lang.Exception -> La9
            r13.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r9 = r13.toString()     // Catch: java.lang.Exception -> La9
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r9)     // Catch: java.lang.Exception -> La9
            boolean r9 = r15.f161478d     // Catch: java.lang.Exception -> La9
            java.lang.String r13 = ""
            if (r9 == 0) goto L77
            r5.getClass()     // Catch: java.lang.Exception -> La9
            r15 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Exception -> La9
            if (r8 == 0) goto L5d
            java.lang.String r15 = "ok"
        L5d:
            if (r15 != 0) goto L60
            goto L61
        L60:
            r13 = r15
        L61:
            java.lang.String r15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a     // Catch: java.lang.Exception -> La9
            r10.put(r3, r12)     // Catch: java.lang.Exception -> L67
            goto L6f
        L67:
            r15 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch: java.lang.Exception -> La9
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r15)     // Catch: java.lang.Exception -> La9
        L6f:
            java.lang.String r15 = r5.u(r13, r10)     // Catch: java.lang.Exception -> La9
            r7.a(r6, r15)     // Catch: java.lang.Exception -> La9
            goto Lcc
        L77:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La9
            r9.<init>(r8)     // Catch: java.lang.Exception -> La9
            java.lang.String r15 = r15.f161479e     // Catch: java.lang.Exception -> La9
            r9.append(r15)     // Catch: java.lang.Exception -> La9
            java.lang.String r15 = r9.toString()     // Catch: java.lang.Exception -> La9
            r5.getClass()     // Catch: java.lang.Exception -> La9
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Exception -> La9
            if (r8 == 0) goto L8f
            r15 = r4
        L8f:
            if (r15 != 0) goto L92
            goto L93
        L92:
            r13 = r15
        L93:
            java.lang.String r15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a     // Catch: java.lang.Exception -> La9
            r10.put(r3, r11)     // Catch: java.lang.Exception -> L99
            goto La1
        L99:
            r15 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch: java.lang.Exception -> La9
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r15)     // Catch: java.lang.Exception -> La9
        La1:
            java.lang.String r15 = r5.u(r13, r10)     // Catch: java.lang.Exception -> La9
            r7.a(r6, r15)     // Catch: java.lang.Exception -> La9
            goto Lcc
        La9:
            r15 = move-exception
            java.lang.String r8 = "invoke error"
            java.lang.Object[] r9 = new java.lang.Object[r12]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r15, r8, r9)
            r5.getClass()
            android.text.TextUtils.isEmpty(r4)
            java.lang.String r15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            r10.put(r3, r11)     // Catch: java.lang.Exception -> Lbd
            goto Lc5
        Lbd:
            r15 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r15)
        Lc5:
            java.lang.String r15 = r5.u(r4, r10)
            r7.a(r6, r15)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.f1.mo50331x8a4d1541(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult):void");
    }
}
