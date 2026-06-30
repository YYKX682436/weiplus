package lc4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc4.d0 f399485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ua6 f399487f;

    public c0(lc4.d0 d0Var, int i17, r45.ua6 ua6Var) {
        this.f399485d = d0Var;
        this.f399486e = i17;
        this.f399487f = ua6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader$onSceneEnd$1");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        lc4.d0 d0Var = this.f399485d;
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        java.util.List c76 = gVar.c7(new ym3.c(d0Var.f399488d.f233606w.get(), 0, this.f399486e, new lc4.b0(ca4.z0.s0(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) this.f399487f.f468703f.getFirst()).Id), ca4.z0.s0(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) this.f399487f.f468703f.getLast()).Id), 0, 0, 12, null)));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c76, 10));
        java.util.Iterator it = c76.iterator();
        while (it.hasNext()) {
            arrayList.add(new zc4.b((xc4.p) it.next(), false, 2, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.UnreadLoader", "preload form db size:" + arrayList.size());
        this.f399485d.b().clear();
        this.f399485d.b().addAll(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader$onSceneEnd$1");
    }
}
