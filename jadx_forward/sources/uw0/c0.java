package uw0;

/* loaded from: classes5.dex */
public final class c0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f513071e;

    public c0(uw0.x xVar, uw0.t0 t0Var) {
        this.f513070d = xVar;
        this.f513071e = t0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513070d.m157183x7391889(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f513071e.U7(eVar);
        }
    }
}
