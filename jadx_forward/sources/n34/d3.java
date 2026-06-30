package n34;

/* loaded from: classes4.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416112e;

    public d3(java.lang.String str, java.lang.String str2) {
        this.f416111d = str;
        this.f416112e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
        wa4.e0 e0Var = null;
        java.lang.String d17 = dw3.h.d(dw3.h.f325744a, null, null, 3, null);
        com.p314xaae8f345.mm.vfs.w6.c(this.f416111d, d17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.util.HashMap hashMap = n34.h3.f416144e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.lang.String str = this.f416112e;
        n34.w3 w3Var = (n34.w3) hashMap.get(str);
        if (w3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            w3Var.f416302c = d17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        }
        wa4.f0 b17 = wa4.b0.f525736a.b(str);
        if (b17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideo", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideo", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            e0Var = b17.f525760c;
        }
        if (e0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            e0Var.f525753a = d17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFinderPostManager", "video path copy finish");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
    }
}
