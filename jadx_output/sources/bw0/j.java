package bw0;

/* loaded from: classes5.dex */
public final class j implements vw0.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.l f24788d;

    public j(bw0.l lVar) {
        this.f24788d = lVar;
    }

    @Override // vw0.d0
    public void K3(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f24788d.l7().v(data);
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f24788d.l7().u(data);
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // vw0.d0
    public void l5() {
        bw0.l lVar = this.f24788d;
        kotlinx.coroutines.l.d(lVar.getMainScope(), null, null, new bw0.i(lVar, null), 3, null);
    }

    @Override // vw0.d0
    public void p0() {
    }

    @Override // vw0.d0
    public void s(sw0.d data) {
        kotlin.jvm.internal.o.g(data, "data");
        bw0.l lVar = this.f24788d;
        xw0.r l76 = lVar.l7();
        sw0.b bVar = lVar.f24792p;
        l76.w(data, bVar != null ? bVar.f413416c : null);
    }

    @Override // vw0.d0
    public void w1() {
        bw0.l lVar = this.f24788d;
        sw0.e eVar = (sw0.e) lVar.l7().f457650n.getValue();
        if (eVar == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        if (dVar == null) {
            return;
        }
        xw0.r l76 = lVar.l7();
        sw0.b bVar = lVar.f24792p;
        l76.l(dVar, bVar != null ? bVar.f413416c : null, true);
    }
}
