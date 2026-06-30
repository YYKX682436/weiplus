package za4;

/* loaded from: classes4.dex */
public abstract class d0 {
    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, za4.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
        java.lang.String str4 = str2 + str3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", "cdn file %s is already exists", str4);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.b0(e0Var, str4));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
                return;
            }
            new za4.u(str, str2, str3, i17, new za4.c0(e0Var, str, i17, str4)).execute(new java.lang.Void[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, za4.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.a0(e0Var));
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageDownloadFileHelper", "small file %s is already exists", str2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.v(e0Var, str2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
                return;
            }
            new za4.f0(str, str2, z17, i17, i18, new za4.z(e0Var, str, i17)).execute(new java.lang.Void[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
    }
}
