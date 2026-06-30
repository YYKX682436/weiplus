package i64;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f370692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f370693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.i1 f370694f;

    public d1(i64.i1 i1Var, int i17, java.lang.Object[] objArr) {
        this.f370694f = i1Var;
        this.f370692d = i17;
        this.f370693e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
        r45.e44 e44Var = new r45.e44();
        int i17 = this.f370692d;
        e44Var.f454540d = i17;
        e44Var.f454542f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e44Var.f454543g = 1;
        i64.i1 i1Var = this.f370694f;
        java.lang.String c17 = i1Var.c(this.f370693e);
        e44Var.f454541e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(c17.getBytes());
        i64.i1.b(i1Var).f454713d.add(e44Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLogMgr", "snsadlog " + i17 + " " + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        long j17 = i1Var.f370729e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (j17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            i1Var.f370729e = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$1");
    }
}
