package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class q0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 f164740c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e f164742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0 f164746i;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8, int i18, com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f164746i = r0Var;
        this.f164738a = yVar;
        this.f164739b = i17;
        this.f164740c = c11131x285e79f8;
        this.f164741d = i18;
        this.f164742e = c11127xcc7d6e4e;
        this.f164743f = str;
        this.f164744g = str2;
        this.f164745h = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r13)
            java.lang.String r1 = "fail:imagePath is illegal"
            com.tencent.mm.plugin.appbrand.jsapi.share.r0 r2 = r12.f164746i
            int r3 = r12.f164739b
            com.tencent.mm.plugin.appbrand.y r4 = r12.f164738a
            if (r14 == 0) goto L29
            java.lang.String r13 = r2.o(r1)
            r4.a(r3, r13)
            return
        L29:
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(r13)
            if (r14 != 0) goto L43
            java.lang.String r14 = "invoke, %s is not image"
            java.lang.Object[] r5 = new java.lang.Object[]{r13}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r14, r5)
            com.p314xaae8f345.mm.vfs.w6.h(r13)
            java.lang.String r13 = r2.o(r1)
            r4.a(r3, r13)
            return
        L43:
            r14 = 1
            r1 = 0
            com.tencent.mm.modelscan.ScanCodeInfo r5 = r12.f164740c
            if (r5 == 0) goto L8b
            java.lang.String r6 = r5.f152806d
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
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
            java.lang.String r9 = r8.f556865f
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "checkScanCodeInfo scanCode result %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10, r9)
            java.lang.String r8 = r8.f556865f
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L6a
            r6 = r14
            goto L91
        L8b:
            java.lang.String r6 = "checkScanCodeInfo codeInfo is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)
        L90:
            r6 = r1
        L91:
            if (r6 == 0) goto L9a
            java.lang.String r1 = "invoke, checkScanCodeInfo ok"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r11 = r14
            goto La4
        L9a:
            java.lang.String r14 = "invoke, checkScanCodeInfo failed, codeInfo: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r14, r5)
            r11 = r1
        La4:
            android.content.Context r14 = r4.mo50352x76847179()
            boolean r1 = r14 instanceof android.app.Activity
            if (r1 == 0) goto Lde
            r8 = r14
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(r13)
            if (r14 == 0) goto Lcd
            java.lang.String r14 = "invoke, gif"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest r14 = new com.tencent.mm.plugin.appbrand.jsapi.share.ShareGifToConversationRequest
            r14.<init>(r13)
            com.tencent.mm.plugin.appbrand.jsapi.share.m0 r13 = new com.tencent.mm.plugin.appbrand.jsapi.share.m0
            r13.<init>(r12, r8)
            java.util.Map r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a
            java.lang.Class<com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class
            r1 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(r8, r0, r14, r13, r1)
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r13)
            java.lang.String r13 = "fail:activity is null"
            java.lang.String r13 = r2.o(r13)
            r4.a(r3, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0.a(java.lang.String, boolean):void");
    }
}
