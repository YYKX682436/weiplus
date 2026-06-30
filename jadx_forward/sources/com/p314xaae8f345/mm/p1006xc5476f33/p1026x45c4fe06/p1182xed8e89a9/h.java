package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35150x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f35151x24728b = "takeScreenshotForProfile";

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.f f169215g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.f(null);

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(10:5|(5:25|26|(1:28)(1:37)|29|(2:31|(1:35)))|11|(1:13)|(1:15)|16|17|18|19|20))|40|(1:7)|25|26|(0)(0)|29|(0)|11|(0)|(0)|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiTakeScreenshotForProfile", r6.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045 A[Catch: Exception -> 0x0088, TryCatch #1 {Exception -> 0x0088, blocks: (B:26:0x0032, B:28:0x0045, B:29:0x0056, B:31:0x005a, B:33:0x0076, B:35:0x0080, B:37:0x004a), top: B:25:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[Catch: Exception -> 0x0088, TryCatch #1 {Exception -> 0x0088, blocks: (B:26:0x0032, B:28:0x0045, B:29:0x0056, B:31:0x005a, B:33:0x0076, B:35:0x0080, B:37:0x004a), top: B:25:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a A[Catch: Exception -> 0x0088, TryCatch #1 {Exception -> 0x0088, blocks: (B:26:0x0032, B:28:0x0045, B:29:0x0056, B:31:0x005a, B:33:0x0076, B:35:0x0080, B:37:0x004a), top: B:25:0x0032 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r5, org.json.JSONObject r6, int r7) {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.y r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) r5
            java.lang.String r0 = "env"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.mo32091x9a3f0ba2()
            boolean r6 = r6 instanceof ze.n
            r0 = 0
            if (r6 == 0) goto L28
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r6 = r5.mo32091x9a3f0ba2()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r6, r1)
            ze.n r6 = (ze.n) r6
            boolean r6 = r6.s2()
            if (r6 == 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = r0
        L29:
            if (r6 != 0) goto L32
            int r1 = sj1.l.f489904a
            if (r1 == 0) goto L32
            r2 = 3
            if (r1 != r2) goto L92
        L32:
            com.tencent.mm.plugin.appbrand.profile.g r1 = new com.tencent.mm.plugin.appbrand.profile.g     // Catch: java.lang.Exception -> L88
            r1.<init>(r5)     // Catch: java.lang.Exception -> L88
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L88
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L88
            java.lang.Thread r3 = r3.getThread()     // Catch: java.lang.Exception -> L88
            if (r2 != r3) goto L4a
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> L88
            goto L56
        L4a:
            ku5.u0 r2 = ku5.t0.f394148d     // Catch: java.lang.Exception -> L88
            ku5.t0 r2 = (ku5.t0) r2     // Catch: java.lang.Exception -> L88
            wu5.c r1 = r2.C(r1)     // Catch: java.lang.Exception -> L88
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L88
        L56:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto L92
            int r2 = sj1.l.f489904a     // Catch: java.lang.Exception -> L88
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r5.mo32091x9a3f0ba2()     // Catch: java.lang.Exception -> L88
            com.tencent.mm.plugin.appbrand.e9 r2 = r2.C0()     // Catch: java.lang.Exception -> L88
            int r2 = r2.mo50260x9f1221c2()     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L88
            com.tencent.mm.plugin.appbrand.profile.f r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.h.f169215g     // Catch: java.lang.Exception -> L88
            java.lang.String r6 = r3.a(r1, r6)     // Catch: java.lang.Exception -> L88
            boolean r1 = sj1.l.f489905b     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto L92
            java.util.HashMap r1 = sj1.l.f489906c     // Catch: java.lang.Exception -> L88
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L88
            sj1.b r1 = (sj1.b) r1     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto L92
            double r2 = sj1.l.a()     // Catch: java.lang.Exception -> L88
            r1.b(r6, r2)     // Catch: java.lang.Exception -> L88
            goto L92
        L88:
            r6 = move-exception
            java.lang.String r1 = "MicroMsg.JsApiTakeScreenshotForProfile"
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6)
        L92:
            r6 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L9b
            java.lang.String r6 = "ok"
        L9b:
            if (r6 != 0) goto L9f
            java.lang.String r6 = ""
        L9f:
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "errno"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> Lac
            goto Lb8
        Lac:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.AppBrandJsApi"
            java.lang.String r3 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r0)
        Lb8:
            java.lang.String r6 = r4.u(r6, r1)
            r5.a(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.h.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
