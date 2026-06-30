package uw0;

/* loaded from: classes5.dex */
public final class w0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f513153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f513154e;

    public w0(uw0.u0 u0Var, uw0.e1 e1Var) {
        this.f513153d = u0Var;
        this.f513154e = e1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.b bVar;
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        this.f513153d.m157184xc27babb(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) {
            uw0.e1 e1Var = this.f513154e;
            e1Var.getClass();
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
            sw0.b bVar2 = null;
            if (zu0.i.f557209f == (dVar != null ? dVar.f494956b : null)) {
                java.lang.String str = dVar.f494955a.f129757b;
                sw0.b bVar3 = e1Var.f430651q;
                if (bVar3 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    bVar = sw0.b.a(bVar3, null, null, str, null, null, 27, null);
                } else {
                    bVar = null;
                }
                e1Var.f430651q = bVar;
                sw0.b bVar4 = e1Var.f513081t;
                if (bVar4 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    bVar2 = sw0.b.a(bVar4, null, null, str, null, null, 27, null);
                }
                e1Var.f513081t = bVar2;
                uw0.u0 u0Var = (uw0.u0) e1Var.f150773i;
                if (u0Var != null && u0Var.isShown()) {
                    e1Var.J7();
                } else {
                    e1Var.f513087z = true;
                }
            }
        }
    }
}
