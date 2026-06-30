package i64;

/* loaded from: classes4.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i64.i1 f370708d;

    public g1(i64.i1 i1Var) {
        this.f370708d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        i64.i1 i1Var = this.f370708d;
        long j17 = i1Var.f370729e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        if (currentTimeMillis - j17 >= 60000 || i64.i1.b(i1Var).f454713d.size() > 1000) {
            if (i64.i1.b(i1Var) != null && i64.i1.b(i1Var).f454713d.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                r45.e96 e96Var = i1Var.f370731g;
                if (e96Var.f454713d.size() > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("trigerSave ");
                    java.util.LinkedList linkedList = e96Var.f454713d;
                    sb6.append(linkedList.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLogMgr", sb6.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ij().y0(e96Var);
                    linkedList.clear();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("trigerSaveImp", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
            i1Var.f370729e = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$3");
    }
}
