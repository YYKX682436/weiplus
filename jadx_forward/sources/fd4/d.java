package fd4;

/* loaded from: classes4.dex */
public class d implements s84.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.f f342830a;

    public d(fd4.f fVar) {
        this.f342830a = fVar;
    }

    @Override // s84.j
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onDragHit");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f342830a;
        fd4.f.s(fVar).f486423b++;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fVar.D = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onDragStart, dragCount=" + fd4.f.s(fVar).f486423b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        boolean z17 = fVar.f342841z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            fVar.f342841z = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            long j17 = fVar.B;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            if (j17 > 0) {
                s84.a s17 = fd4.f.s(fVar);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                long j18 = fVar.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                s17.f486425d = ((int) (currentTimeMillis2 - j18)) + 500;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DragAdBusiness", "mVideoStartPlayTime==0");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f342830a;
        fVar.r(null);
        ca4.z0.I0(new long[]{20, 100});
        fVar.l();
        fVar.k(42);
        fd4.f.s(fVar).f486424c++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onDragSucc=" + fd4.f.s(fVar).f486424c + ", duration=" + fd4.f.t(fVar) + ", totalDuration=" + fd4.f.s(fVar).f486422a + ", firstJumplayTime=" + fd4.f.s(fVar).f486425d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f342830a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragAdBusiness", "onDragCancel, duration=" + fd4.f.t(fVar) + ", totalDuration=" + fd4.f.s(fVar).f486422a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }
}
