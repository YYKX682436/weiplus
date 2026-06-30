package i64;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f370884e;

    public w0(i64.b1 b1Var, long j17) {
        this.f370884e = b1Var;
        this.f370883d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
        i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f370884e.f370625g).get(java.lang.Long.valueOf(this.f370883d));
        if (c1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            c1Var.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
    }
}
