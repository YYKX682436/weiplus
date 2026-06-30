package fd4;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f342843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.l0 f342844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u74.d f342845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fd4.k f342846g;

    public i(fd4.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s34.l0 l0Var, u74.d dVar) {
        this.f342846g = kVar;
        this.f342843d = c17933xe8d1b226;
        this.f342844e = l0Var;
        this.f342845f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
        fd4.k kVar = this.f342846g;
        if (fd4.k.s(kVar) == null || (c17933xe8d1b226 = this.f342843d) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17800x9656c5e8.b(1, 1, c17933xe8d1b226);
        fd4.k.s(kVar).setVisibility(0);
        fd4.k.s(kVar).a();
        fd4.k.s(kVar).m71274x4a93d7a7(this.f342844e.f484234c);
        fd4.k.s(kVar).m71273x672610fc(new fd4.h(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
    }
}
