package za4;

/* loaded from: classes4.dex */
public class n {
    public java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var, java.lang.Class cls) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
        if (a2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return null;
        }
        if (cls.isInstance(a2Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
            return a2Var;
        }
        try {
            if (a2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a) {
                java.util.Iterator it = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a) a2Var).O().iterator();
                while (it.hasNext()) {
                    java.lang.Object a17 = a((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) it.next(), cls);
                    if (a17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
                        return a17;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageCompFinder", "findCardComp, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findCardComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageCompFinder");
        return null;
    }
}
