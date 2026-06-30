package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.t f83855f;

    public s(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.webrtc.t tVar) {
        this.f83853d = lVar;
        this.f83854e = i17;
        this.f83855f = tVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        int i17 = ((com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadStatus) obj).f83794d;
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.t tVar = this.f83855f;
        int i18 = this.f83854e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f83853d;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isDownload", java.lang.Boolean.TRUE);
            hashMap.put("errCode", 1008);
            tVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap));
            return;
        }
        if (i17 == 1) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("isDownload", java.lang.Boolean.FALSE);
            hashMap2.put("errCode", 1009);
            tVar.getClass();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap2.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap2));
            return;
        }
        if (i17 == 2) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("isDownload", java.lang.Boolean.FALSE);
            hashMap3.put("errCode", 1010);
            tVar.getClass();
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap3));
            return;
        }
        if (i17 == 3) {
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("isDownload", java.lang.Boolean.FALSE);
            hashMap4.put("errCode", 1011);
            tVar.getClass();
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap4.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap4));
            return;
        }
        if (i17 == 4) {
            java.util.HashMap hashMap5 = new java.util.HashMap();
            hashMap5.put("isDownload", java.lang.Boolean.FALSE);
            hashMap5.put("errCode", 1012);
            tVar.getClass();
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap5.put("errno", 0);
            lVar.a(i18, tVar.t("ok", hashMap5));
            return;
        }
        if (i17 != 5) {
            return;
        }
        java.util.HashMap hashMap6 = new java.util.HashMap();
        hashMap6.put("isDownload", java.lang.Boolean.FALSE);
        hashMap6.put("errCode", 1013);
        tVar.getClass();
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap6.put("errno", 0);
        lVar.a(i18, tVar.t("ok", hashMap6));
    }
}
