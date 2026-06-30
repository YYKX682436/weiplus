package l44;

/* loaded from: classes4.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f397915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f397916f;

    public u4(java.lang.String str, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        this.f397914d = str;
        this.f397915e = j17;
        this.f397916f = c19792x256d2725;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f397915e;
        java.lang.String str = this.f397914d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("ad_finder_feeds_preload_id_app_related", 0).edit().putLong(str, j17).commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAdPreloadHelper", "reqFinderFeedsObjectIds received, encryptedObjectId is " + str + ", objectId is " + j17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f397916f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            zy2.u9 u9Var = l44.a5.f397565c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b2) u9Var).a(42, arrayList, 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAdPreloadHelper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
    }
}
