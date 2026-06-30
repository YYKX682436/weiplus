package i64;

/* loaded from: classes4.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370895f;

    public y0(i64.b1 b1Var, long j17, long j18) {
        this.f370895f = b1Var;
        this.f370893d = j17;
        this.f370894e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
        i64.c1 c1Var = (i64.c1) this.f370895f.f370625g.get(java.lang.Long.valueOf(this.f370893d));
        if (c1Var != null) {
            c1Var.f370658m = this.f370894e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
    }
}
