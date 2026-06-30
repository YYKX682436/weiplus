package uw0;

/* loaded from: classes5.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.a f513078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.o f513079e;

    public e(uw0.a aVar, uw0.o oVar) {
        this.f513078d = aVar;
        this.f513079e = oVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513078d.m157184xc27babb(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            this.f513079e.S7(eVar);
        }
    }
}
