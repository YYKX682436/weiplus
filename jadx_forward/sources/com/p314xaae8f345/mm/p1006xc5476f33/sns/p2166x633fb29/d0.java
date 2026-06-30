package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f245666f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var, java.lang.String str, java.lang.String str2) {
        this.f245666f = m0Var;
        this.f245664d = str;
        this.f245665e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var = this.f245666f;
        java.util.Set set = m0Var.f245981k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (set != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            java.util.Set set2 = m0Var.f245981k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            java.util.Iterator it = ((java.util.HashSet) set2).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g0) it.next();
                if (g0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933) g0Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUI", "isPlaying " + activityC18151xfc5a9933.f249190e.mo69311xc00617a4());
                    if (activityC18151xfc5a9933.f249190e.mo69311xc00617a4()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    } else {
                        activityC18151xfc5a9933.f249190e.mo69317x764cf626(false);
                        java.lang.String f256131m = activityC18151xfc5a9933.f249190e.getF256131m();
                        java.lang.String str = this.f245665e;
                        boolean equals = str.equals(f256131m);
                        java.lang.String str2 = this.f245664d;
                        if (equals) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = activityC18151xfc5a9933.f249190e;
                            c17691x8fb37d74.b(c17691x8fb37d74.mo69308x9c2553a6());
                            activityC18151xfc5a9933.f249190e.h(true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + str2 + " path: " + str);
                        } else {
                            activityC18151xfc5a9933.f249190e.mo69327xab3268fe(str);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d742 = activityC18151xfc5a9933.f249190e;
                            c17691x8fb37d742.b(c17691x8fb37d742.mo69308x9c2553a6());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + str2 + " path: " + str);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightProgress", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
    }
}
