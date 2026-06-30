package uw0;

/* loaded from: classes5.dex */
public final class y0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f513160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.u0 f513161e;

    public y0(uw0.e1 e1Var, uw0.u0 u0Var) {
        this.f513160d = e1Var;
        this.f513161e = u0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        sw0.e eVar = (sw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        uw0.e1 e1Var = this.f513160d;
        if (e1Var.A) {
            java.util.List<sw0.d> list = eVar.f494959a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (sw0.d dVar : list) {
                arrayList.add(sw0.d.a(dVar, null, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f494955a.f129762g.get("support_multi_subtitles"), "1") ? dVar.f494956b : zu0.i.f557211h, false, null, 13, null));
            }
            eVar = sw0.e.b(eVar, arrayList, null, null, 6, null);
        }
        this.f513161e.m157187xd75f96ed(eVar);
        sw0.m mVar = eVar.f494961c;
        if (mVar instanceof sw0.h) {
            p3325xe03a0797.p3326xc267989b.l.d(e1Var.m158345xefc66565(), null, null, new uw0.x0(e1Var, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = e1Var.B;
            if (u3Var.isShowing()) {
                u3Var.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            e1Var.H7(eVar);
        }
    }
}
