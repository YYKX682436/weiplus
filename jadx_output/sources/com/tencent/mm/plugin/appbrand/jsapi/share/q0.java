package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class q0 implements com.tencent.mm.plugin.appbrand.utils.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelscan.ScanCodeInfo f83207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelmulti.WxaInfo f83209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83212h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.r0 f83213i;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.share.r0 r0Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo, int i18, com.tencent.mm.modelmulti.WxaInfo wxaInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f83213i = r0Var;
        this.f83205a = yVar;
        this.f83206b = i17;
        this.f83207c = scanCodeInfo;
        this.f83208d = i18;
        this.f83209e = wxaInfo;
        this.f83210f = str;
        this.f83211g = str2;
        this.f83212h = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @Override // com.tencent.mm.plugin.appbrand.utils.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "invoke, localPath: "
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiShareImageMessage"
            com.tencent.mars.xlog.Log.i(r0, r14)
            boolean r14 = com.tencent.mm.sdk.platformtools.t8.K0(r13)
            java.lang.String r1 = "fail:imagePath is illegal"
            com.tencent.mm.plugin.appbrand.jsapi.share.r0 r2 = r12.f83213i
            int r3 = r12.f83206b
            com.tencent.mm.plugin.appbrand.y r4 = r12.f83205a
            if (r14 == 0) goto L29
            java.lang.String r13 = r2.o(r1)
            r4.a(r3, r13)
            return
        L29:
            boolean r14 = com.tencent.mm.sdk.platformtools.y1.f(r13)
            if (r14 != 0) goto L43
            java.lang.String r14 = "invoke, %s is not image"
            java.lang.Object[] r5 = new java.lang.Object[]{r13}
            com.tencent.mars.xlog.Log.w(r0, r14, r5)
            com.tencent.mm.vfs.w6.h(r13)
            java.lang.String r13 = r2.o(r1)
            r4.a(r3, r13)
            return
        L43:
            r14 = 1
            r1 = 0
            com.tencent.mm.modelscan.ScanCodeInfo r5 = r12.f83207c
            if (r5 == 0) goto L8b
            java.lang.String r6 = r5.f71273d
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r7 == 0) goto L52
            goto L8b
        L52:
            java.lang.Class<kd0.v2> r7 = kd0.v2.class
            i95.m r7 = i95.n0.c(r7)
            kd0.v2 r7 = (kd0.v2) r7
            int[] r8 = new int[]{r1}
            jd0.j2 r7 = (jd0.j2) r7
            java.util.List r7 = r7.wi(r13, r8)
            if (r7 == 0) goto L90
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L90
            java.lang.Object r8 = r7.next()
            zs5.c0 r8 = (zs5.c0) r8
            java.lang.String r9 = r8.f475332f
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "checkScanCodeInfo scanCode result %s"
            com.tencent.mars.xlog.Log.i(r0, r10, r9)
            java.lang.String r8 = r8.f475332f
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L6a
            r6 = r14
            goto L91
        L8b:
            java.lang.String r6 = "checkScanCodeInfo codeInfo is null"
            com.tencent.mars.xlog.Log.e(r0, r6)
        L90:
            r6 = r1
        L91:
            if (r6 == 0) goto L9a
            java.lang.String r1 = "invoke, checkScanCodeInfo ok"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r11 = r14
            goto La4
        L9a:
            java.lang.String r14 = "invoke, checkScanCodeInfo failed, codeInfo: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.w(r0, r14, r5)
            r11 = r1
        La4:
            android.content.Context r14 = r4.getContext()
            boolean r1 = r14 instanceof android.app.Activity
            if (r1 == 0) goto Lde
            r8 = r14
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r14 = com.tencent.mm.sdk.platformtools.y1.c(r13)
            if (r14 == 0) goto Lcd
            java.lang.String r14 = "invoke, gif"
            com.tencent.mars.xlog.Log.i(r0, r14)
            com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest r14 = new com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest
            r14.<init>(r13)
            com.tencent.mm.plugin.appbrand.jsapi.share.m0 r13 = new com.tencent.mm.plugin.appbrand.jsapi.share.m0
            r13.<init>(r12, r8)
            java.util.Map r0 = com.tencent.mm.plugin.appbrand.ipc.d.f78400a
            java.lang.Class<com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI> r0 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class
            r1 = 0
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(r8, r0, r14, r13, r1)
            return
        Lcd:
            com.tencent.mm.plugin.appbrand.jsapi.share.n0 r9 = new com.tencent.mm.plugin.appbrand.jsapi.share.n0
            r9.<init>(r12, r8)
            com.tencent.mm.plugin.appbrand.jsapi.share.p0 r14 = new com.tencent.mm.plugin.appbrand.jsapi.share.p0
            r6 = r14
            r7 = r12
            r10 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r4.m(r14)
            return
        Lde:
            java.lang.String r13 = "invoke, activity is null"
            com.tencent.mars.xlog.Log.w(r0, r13)
            java.lang.String r13 = "fail:activity is null"
            java.lang.String r13 = r2.o(r13)
            r4.a(r3, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.share.q0.a(java.lang.String, boolean):void");
    }
}
