package uw0;

/* loaded from: classes5.dex */
public final class v0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f513149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f513150e;

    public v0(uw0.u0 u0Var, uw0.e1 e1Var) {
        this.f513149d = u0Var;
        this.f513150e = e1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513149d.m157185xb3befd0b(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f513150e.K7(eVar);
        }
    }
}
