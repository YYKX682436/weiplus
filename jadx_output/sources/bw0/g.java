package bw0;

/* loaded from: classes5.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.a f24783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.l f24784e;

    public g(bw0.a aVar, bw0.l lVar) {
        this.f24783d = aVar;
        this.f24784e = lVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f24783d.setTextStyleState(eVar);
        sw0.m mVar = eVar.f413428c;
        boolean z17 = mVar instanceof sw0.h;
        sw0.b bVar = null;
        bw0.l lVar = this.f24784e;
        if (z17) {
            kotlinx.coroutines.l.d(lVar.getMainScope(), null, null, new bw0.f(lVar, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            if (lVar.f24795s.isShowing()) {
                lVar.f24795s.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            lVar.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
            if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
                java.lang.String str = dVar.f413422a.f48224b;
                ex0.o oVar = lVar.f24793q;
                if (oVar != null) {
                    kotlin.jvm.internal.o.d(str);
                    oVar.I(str);
                }
                sw0.b bVar2 = lVar.f24792p;
                if (bVar2 != null) {
                    kotlin.jvm.internal.o.d(str);
                    bVar = sw0.b.a(bVar2, null, str, null, null, null, 29, null);
                }
                lVar.f24792p = bVar;
                lVar.p7();
            }
        }
    }
}
