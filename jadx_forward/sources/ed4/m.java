package ed4;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa f332847d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa c18286x16099eaa) {
        this.f332847d = c18286x16099eaa;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
        android.app.Activity activity = this.f332847d.f250782f;
        if (activity == null || activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "onCompletion, postDelayed-run activity isFinished");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa c18286x16099eaa = this.f332847d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            c18286x16099eaa.f250846t = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            if (this.f332847d.f250845s) {
                this.f332847d.f250844r.D0.f506688p.c(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa c18286x16099eaa2 = this.f332847d;
                c18286x16099eaa2.f250849w.j(c18286x16099eaa2.f250844r.D0.T.f506666c);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
    }
}
