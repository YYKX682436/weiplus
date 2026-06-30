package at2;

/* loaded from: classes3.dex */
public final class i extends com.tencent.mm.plugin.finder.live.plugin.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13683p;

    /* renamed from: q, reason: collision with root package name */
    public xs2.p f13684q;

    /* renamed from: r, reason: collision with root package name */
    public xs2.c1 f13685r;

    /* renamed from: s, reason: collision with root package name */
    public xs2.o f13686s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f13687t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13683p = "ReplayBulletLazyPlugin";
        this.f13687t = jz5.h.b(new at2.e(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        xs2.p pVar = this.f13684q;
        if (pVar != null) {
            pVar.onDetach();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void g1(android.content.res.Configuration configuration) {
        xs2.o oVar = this.f13686s;
        if (oVar != null) {
            ((xs2.e) oVar).k(x0());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        ys2.h hVar = (ys2.h) U0(ys2.h.class);
        boolean z17 = false;
        if (hVar != null && hVar.f465165s) {
            z17 = true;
        }
        return !z17;
    }
}
