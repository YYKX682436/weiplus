package l44;

/* loaded from: classes4.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f397949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f397950e;

    public x3(java.util.ArrayList arrayList, boolean z17) {
        this.f397949d = arrayList;
        this.f397950e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$3");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        java.util.ArrayList arrayList = this.f397949d;
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            java.util.Iterator it = arrayList.iterator();
            boolean z17 = false;
            boolean z18 = false;
            while (it.hasNext()) {
                l44.y3 y3Var = (l44.y3) it.next();
                if (!android.text.TextUtils.isEmpty(y3Var.f397958a)) {
                    if (y3Var.f397960c == 2) {
                        z17 = true;
                    } else {
                        z18 = true;
                    }
                }
            }
            boolean z19 = this.f397950e;
            if (z17 || z18) {
                l44.z3.g(arrayList, z19, z17, z18);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "doPreloadWeAppEnvForNativeLandingPage, preloadWeAppPkg=" + z19 + ", no weAppUserName");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppPreloader", "---checkPreloadWeAppEnvForNativeLandingPage, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$3");
    }
}
