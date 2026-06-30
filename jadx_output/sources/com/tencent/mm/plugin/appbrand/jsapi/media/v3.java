package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f82100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f82101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.y3 f82102g;

    public v3(com.tencent.mm.plugin.appbrand.jsapi.media.y3 y3Var, java.lang.String str, boolean z17, boolean z18) {
        this.f82102g = y3Var;
        this.f82099d = str;
        this.f82100e = z17;
        this.f82101f = z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r3 == false) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            boolean r0 = r9.f82100e
            r1 = 1
            java.lang.String r2 = r9.f82099d
            if (r0 == 0) goto L2a
            java.lang.String r0 = com.tencent.mm.plugin.appbrand.jsapi.media.p7.c(r2)
            if (r0 == 0) goto L39
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L39
            j62.e r3 = j62.e.g()
            com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo r4 = new com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo
            r4.<init>()
            int r3 = r3.c(r4)
            if (r3 != r1) goto L3a
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.x.Y(r2)
            com.tencent.mm.sdk.platformtools.x.L0(r3, r0)
            goto L3a
        L2a:
            boolean r0 = r9.f82101f
            if (r0 == 0) goto L39
            java.lang.String r0 = com.tencent.mm.plugin.appbrand.jsapi.media.p7.e(r2, r1)
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L39
            goto L3a
        L39:
            r0 = r2
        L3a:
            boolean r3 = r2.equals(r0)
            if (r3 == 0) goto L47
            java.lang.String r0 = com.tencent.mm.plugin.appbrand.jsapi.media.p7.b(r0)
            r2.equals(r0)
        L47:
            com.tencent.mm.plugin.appbrand.jsapi.media.p7.a(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r5 = ".jpg"
            boolean r5 = r0.endsWith(r5)
            if (r5 != 0) goto L61
            java.lang.String r5 = "jpg"
            goto L62
        L61:
            r5 = 0
        L62:
            java.lang.String r6 = "originalPath:%s, path:%s"
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r0}
            java.lang.String r8 = "MicroMsg.JsApiChooseMedia"
            com.tencent.mars.xlog.Log.i(r8, r6, r7)
            com.tencent.mm.plugin.appbrand.jsapi.media.y3 r6 = r9.f82102g
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r7 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.j(r6)
            java.lang.String r7 = r7.f81634d
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r0 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(r7, r0, r5, r1)
            if (r0 == 0) goto L92
            long r1 = r0.f76107i
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            java.lang.String r0 = r0.f76102d
            r4.add(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.u3 r0 = new com.tencent.mm.plugin.appbrand.jsapi.media.u3
            r0.<init>(r9, r4, r3)
            com.tencent.mm.sdk.platformtools.u3.h(r0)
            return
        L92:
            java.lang.String r0 = "handle image from mm-sight camera, get null obj from path: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.e(r8, r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.I(r6)
            r1 = -2
            r0.f81647d = r1
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = com.tencent.mm.plugin.appbrand.jsapi.media.y3.I(r6)
            com.tencent.mm.plugin.appbrand.jsapi.media.y3.C(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.v3.run():void");
    }
}
