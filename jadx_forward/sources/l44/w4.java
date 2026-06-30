package l44;

/* loaded from: classes4.dex */
public class w4 implements yz5.p {
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, encryptedObjectId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        } else if (c19792x256d2725 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            l44.a5.f397563a.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, finderObject is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        } else {
            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
            l44.a5.f397564b.put(str, java.lang.Long.valueOf(m76784x5db1b11));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds received, encryptedObjectId is " + str + ", objectId is " + m76784x5db1b11);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$4");
        return f0Var;
    }
}
