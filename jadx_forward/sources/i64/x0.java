package i64;

/* loaded from: classes4.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370889e;

    public x0(i64.b1 b1Var, long j17) {
        this.f370889e = b1Var;
        this.f370888d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
        i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f370889e.f370625g).get(java.lang.Long.valueOf(this.f370888d));
        if (c1Var != null) {
            i64.b1 b1Var = this.f370889e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            b1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            android.app.Activity activity = b1Var.f370632n;
            boolean z17 = activity != null && activity.isFinishing();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "isFinishing:" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            if (!z17) {
                synchronized (c1Var) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                    if (c1Var.f370654i.f379448g > 0 && c1Var.f370657l == 0) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        c1Var.f370657l = android.os.SystemClock.elapsedRealtime();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.f370646a, "onPausePlay, pauseBeginTime=" + c1Var.f370657l);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
    }
}
