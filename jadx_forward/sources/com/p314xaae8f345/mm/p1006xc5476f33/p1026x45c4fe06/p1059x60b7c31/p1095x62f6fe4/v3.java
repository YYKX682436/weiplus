package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f163633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f163634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 f163635g;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var, java.lang.String str, boolean z17, boolean z18) {
        this.f163635g = y3Var;
        this.f163632d = str;
        this.f163633e = z17;
        this.f163634f = z18;
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
            boolean r0 = r9.f163633e
            r1 = 1
            java.lang.String r2 = r9.f163632d
            if (r0 == 0) goto L2a
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.c(r2)
            if (r0 == 0) goto L39
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L39
            j62.e r3 = j62.e.g()
            com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo r4 = new com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo
            r4.<init>()
            int r3 = r3.c(r4)
            if (r3 != r1) goto L3a
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(r2)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(r3, r0)
            goto L3a
        L2a:
            boolean r0 = r9.f163634f
            if (r0 == 0) goto L39
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.e(r2, r1)
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L39
            goto L3a
        L39:
            r0 = r2
        L3a:
            boolean r3 = r2.equals(r0)
            if (r3 == 0) goto L47
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.b(r0)
            r2.equals(r0)
        L47:
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.a(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r6, r7)
            com.tencent.mm.plugin.appbrand.jsapi.media.y3 r6 = r9.f163635g
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.j(r6)
            java.lang.String r7 = r7.f163167d
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(r7, r0, r5, r1)
            if (r0 == 0) goto L92
            long r1 = r0.f157640i
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            java.lang.String r0 = r0.f157635d
            r4.add(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.u3 r0 = new com.tencent.mm.plugin.appbrand.jsapi.media.u3
            r0.<init>(r9, r4, r3)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r0)
            return
        L92:
            java.lang.String r0 = "handle image from mm-sight camera, get null obj from path: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.I(r6)
            r1 = -2
            r0.f163180d = r1
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.I(r6)
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.C(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v3.run():void");
    }
}
