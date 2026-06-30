package s34;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public android.util.SparseArray f484250a;

    public static s34.n a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        try {
            s34.n b17 = b(map, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return b17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDynamicUpdateInfo", "parse the update info failed!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
    }

    public static s34.n b(java.util.Map map, java.lang.String str) {
        s34.m a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        s34.n nVar = null;
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
        android.util.SparseArray sparseArray = null;
        for (int i17 = 0; i17 < 20; i17++) {
            if (i17 == 0) {
                a17 = s34.m.a(map, str + ".action");
                if (a17 != null) {
                    sparseArray = new android.util.SparseArray();
                }
            } else {
                a17 = s34.m.a(map, str + ".action" + i17);
            }
            if (a17 == null || sparseArray == null) {
                break;
            }
            sparseArray.put(a17.f484239a, a17);
        }
        if (sparseArray != null && sparseArray.size() > 0) {
            nVar = new s34.n();
            nVar.f484250a = sparseArray;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        return nVar;
    }
}
