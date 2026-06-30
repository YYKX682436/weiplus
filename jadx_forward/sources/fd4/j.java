package fd4;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f342847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd4.k f342848e;

    public j(fd4.k kVar, boolean z17) {
        this.f342848e = kVar;
        this.f342847d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
        fd4.k kVar = this.f342848e;
        if (fd4.k.s(kVar) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
            return;
        }
        if (!this.f342847d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8.b(1, 2, kVar.f342825i);
        }
        fd4.k.s(kVar).setVisibility(8);
        fd4.k.s(kVar).setBackgroundColor(0);
        fd4.k.s(kVar).a();
        fd4.k.s(kVar).m71273x672610fc(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
    }
}
