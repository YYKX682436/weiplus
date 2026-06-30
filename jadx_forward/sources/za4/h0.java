package za4;

/* loaded from: classes4.dex */
public class h0 {
    public java.lang.Object a(ab4.d0 d0Var, java.lang.Class cls) {
        java.util.List a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
        if (d0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return null;
        }
        if (cls.isInstance(d0Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
            return d0Var;
        }
        try {
            if (za4.z0.s(d0Var.f84360q) && (a17 = d0Var.a()) != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    java.lang.Object a18 = a((ab4.d0) it.next(), cls);
                    if (a18 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
                        return a18;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageInfoFinder", "findCardInfo, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageInfoFinder");
        return null;
    }
}
