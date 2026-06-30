package za4;

/* loaded from: classes4.dex */
public class u extends za4.o {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f552729f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f552730g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f552731h;

    /* renamed from: i, reason: collision with root package name */
    public final int f552732i;

    /* renamed from: j, reason: collision with root package name */
    public final za4.t f552733j;

    public u(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, za4.t tVar) {
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        this.f552691a = str;
        this.f552729f = str2;
        this.f552730g = str3;
        this.f552731h = str2 + str3;
        this.f552732i = i17;
        this.f552733j = tVar;
    }

    public static /* synthetic */ za4.t a(za4.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        za4.t tVar = uVar.f552733j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return tVar;
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        try {
            java.lang.String str2 = "0";
            int i17 = 0;
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                str2 = "1";
                if (com.p314xaae8f345.mm.vfs.w6.h(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, succ");
                    i17 = 1;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, failed");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, file not exists");
            }
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            ca4.e0.a("sight_del_err_file", str2, this.f552732i, i17, "cdn|" + m40061x1de3608b);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "delErrFile, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delErrFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69832x928730f4(this.f552729f, this.f552730g, this.f552691a, this.f552732i, new za4.r(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageDownloadCDNFileTask", "doInBackground exp, netType=" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + ", exp=" + e17.toString() + ", url=" + this.f552691a);
            b(this.f552731h);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new za4.s(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadCDNFileTask");
        return null;
    }
}
