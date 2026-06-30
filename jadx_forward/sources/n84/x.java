package n84;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n84.x f417233a;

    public static n84.x a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (f417233a == null) {
            synchronized (n84.x.class) {
                try {
                    if (f417233a == null) {
                        f417233a = new n84.x();
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
                    throw th6;
                }
            }
        }
        n84.x xVar = f417233a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        return xVar;
    }

    public void b(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
        if (runnable != null) {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runOnUiThread", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtThreadUtil");
    }
}
