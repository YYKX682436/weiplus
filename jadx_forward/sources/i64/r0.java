package i64;

/* loaded from: classes4.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370834e;

    public r0(i64.b1 b1Var, long j17, boolean z17) {
        this.f370834e = b1Var;
        this.f370833d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$1");
        i64.b1 b1Var = this.f370834e;
        long j17 = this.f370833d;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addVideoCountImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashMap hashMap = (java.util.HashMap) b1Var.f370625g;
            i64.c1 c1Var = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (i64.c1) hashMap.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
            c1Var.f370647b = 1;
            c1Var.f370654i.f379443b++;
            hashMap.put(java.lang.Long.valueOf(j17), c1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addVideoCountImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$1");
    }
}
