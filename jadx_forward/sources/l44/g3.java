package l44;

/* loaded from: classes.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397677d;

    public g3(java.lang.String str) {
        this.f397677d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f397677d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "start send get http req to dest IPv4, url is " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(1612, 40);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            hy4.e e17 = hy4.f.e(str, null, null);
            if (e17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 42);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", "not receive http response, url is " + str);
            } else if (e17.f367630a == 200) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 41);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPassThroughInfoHelper", "get http response success, url is " + str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 42);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", "get http response failed, url is " + str + ", statusCode is " + e17.f367630a);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPassThroughInfoHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
    }
}
