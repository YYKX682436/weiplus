package i64;

/* loaded from: classes4.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370860f;

    public u0(i64.b1 b1Var, long j17, long j18, boolean z17) {
        this.f370860f = b1Var;
        this.f370858d = j17;
        this.f370859e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$4");
        i64.b1 b1Var = this.f370860f;
        long j17 = this.f370858d;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePlayStartTimeImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashMap hashMap = (java.util.HashMap) b1Var.f370625g;
            i64.c1 c1Var = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (i64.c1) hashMap.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
            j64.b bVar = c1Var.f370654i;
            if (bVar.f379448g == 0) {
                bVar.f379448g = this.f370859e;
            }
            hashMap.put(java.lang.Long.valueOf(j17), c1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePlayStartTimeImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$4");
    }
}
