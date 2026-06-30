package h44;

/* loaded from: classes4.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final h44.b a(h94.a aVar, r45.x30 x30Var) {
        java.lang.String str;
        java.lang.String string;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, foldAdInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        if (x30Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, clickActionInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        if (x30Var.f471261d != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, click_action_type is not download, type=" + x30Var.f471261d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        java.lang.String str2 = x30Var.f471269o;
        java.lang.String str3 = x30Var.f471268n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, appId or packageName is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        r45.rf0 rf0Var = x30Var.f471280z;
        if (rf0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, pb download_info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return null;
        }
        java.lang.String str4 = rf0Var.f466320d;
        java.lang.String str5 = rf0Var.f466321e;
        k44.g gVar = new k44.g(str4, str5, rf0Var.f466322f, rf0Var.f466323g, rf0Var.f466324h, rf0Var.f466325i, rf0Var.f466326m, rf0Var.f466327n, rf0Var.f466328o, rf0Var.f466329p, rf0Var.f466330q, rf0Var.f466331r);
        r45.qf0 qf0Var = x30Var.f471270p;
        if (qf0Var == null || (str = qf0Var.f465458d) == null) {
            str = str5;
        }
        if (qf0Var == null || (string = qf0Var.f465460f) == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            string = context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j68) : null;
        }
        k44.f fVar = new k44.f(str, string);
        java.lang.String str6 = rf0Var.f466320d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
        fVar.f385606c = str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.DownloadHalfScreenInfo");
        h44.b bVar = new h44.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360445a = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360446b = str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPackageName", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360447c = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWxAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360448d = bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUseGameDownloadWidget", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360449e = gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360450f = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String c17 = aVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360454j = c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String e17 = aVar.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUxInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360453i = e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUxInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String a17 = aVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360455k = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String d17 = aVar.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTraceId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360456l = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTraceId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String L = ca4.m0.L(aVar.e());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360457m = L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        bVar.f360458n = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdExtInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        if (a44.k.f82818g.b(bVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
            return bVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadParams", "parseFromFoldAd, checkJumpDownloadHalfScreenParamsValid failed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromFoldAd", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams$Companion");
        return null;
    }
}
