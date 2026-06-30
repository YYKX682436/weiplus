package i64;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370853f;

    public t0(i64.b1 b1Var, long j17, long j18) {
        this.f370853f = b1Var;
        this.f370851d = j17;
        this.f370852e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
        long j17 = this.f370851d;
        i64.b1 b1Var = this.f370853f;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashSet hashSet = b1Var.f370624f;
            long j18 = this.f370852e;
            if (hashSet.contains(java.lang.Long.valueOf(j18))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            } else {
                hashSet.add(java.lang.Long.valueOf(j18));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
    }
}
