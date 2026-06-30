package r44;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r44.f f451090d;

    public e(r44.f fVar) {
        this.f451090d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$reportAdCount$1");
        r44.f fVar = this.f451090d;
        try {
            int z07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().z0();
            boolean d17 = l44.h.f397689a.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r44.f.P6(fVar), "reportAdCount, count=" + z07 + ", isCleanEnable=" + d17);
            ca4.e0.a("ad_pull_session", "adCountInDB", z07, d17 ? 1 : 0, "1");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_reportAdCount", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$reportAdCount$1");
    }
}
