package at2;

/* loaded from: classes3.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f95216p;

    /* renamed from: q, reason: collision with root package name */
    public xs2.p f95217q;

    /* renamed from: r, reason: collision with root package name */
    public xs2.c1 f95218r;

    /* renamed from: s, reason: collision with root package name */
    public xs2.o f95219s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f95220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f95216p = "ReplayBulletLazyPlugin";
        this.f95220t = jz5.h.b(new at2.e(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        xs2.p pVar = this.f95217q;
        if (pVar != null) {
            pVar.mo58804x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void g1(android.content.res.Configuration configuration) {
        xs2.o oVar = this.f95219s;
        if (oVar != null) {
            ((xs2.e) oVar).k(x0());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        ys2.h hVar = (ys2.h) U0(ys2.h.class);
        boolean z17 = false;
        if (hVar != null && hVar.f546698s) {
            z17 = true;
        }
        return !z17;
    }
}
