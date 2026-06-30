package uw0;

/* loaded from: classes5.dex */
public final class b0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f513066e;

    public b0(uw0.x xVar, uw0.t0 t0Var) {
        this.f513065d = xVar;
        this.f513066e = t0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513065d.m157184xc27babb(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f513066e.V7(eVar);
        }
    }
}
