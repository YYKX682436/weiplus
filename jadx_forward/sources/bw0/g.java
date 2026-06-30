package bw0;

/* loaded from: classes5.dex */
public final class g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.a f106316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.l f106317e;

    public g(bw0.a aVar, bw0.l lVar) {
        this.f106316d = aVar;
        this.f106317e = lVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f106316d.m11430xba281f6f(eVar);
        sw0.m mVar = eVar.f494961c;
        boolean z17 = mVar instanceof sw0.h;
        sw0.b bVar = null;
        bw0.l lVar = this.f106317e;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(lVar.m158345xefc66565(), null, null, new bw0.f(lVar, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            if (lVar.f106328s.isShowing()) {
                lVar.f106328s.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            lVar.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
            if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
                java.lang.String str = dVar.f494955a.f129757b;
                ex0.o oVar = lVar.f106326q;
                if (oVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    oVar.I(str);
                }
                sw0.b bVar2 = lVar.f106325p;
                if (bVar2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    bVar = sw0.b.a(bVar2, null, str, null, null, null, 29, null);
                }
                lVar.f106325p = bVar;
                lVar.p7();
            }
        }
    }
}
