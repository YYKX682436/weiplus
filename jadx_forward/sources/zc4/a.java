package zc4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f552964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f552965e;

    public a(long j17, long j18) {
        this.f552964d = j17;
        this.f552965e = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.repository.ADImproveDBRepositoryKt$reportAdQueryCost$1");
        long j17 = this.f552964d;
        long j18 = this.f552965e;
        try {
            boolean d17 = l44.h.f397689a.d();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCleanStorageManager", "reportAdQueryCost, expireChkCost=" + j17 + ", queryCost=" + j18 + ", isCleanEnable=" + d17);
            ca4.e0.a("ad_pull_session", "adQueryCost", (int) j17, d17 ? 1 : 0, java.lang.String.valueOf(j18));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_reportAdQueryCost", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.repository.ADImproveDBRepositoryKt$reportAdQueryCost$1");
    }
}
