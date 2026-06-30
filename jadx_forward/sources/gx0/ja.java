package gx0;

/* loaded from: classes5.dex */
public final class ja implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358114d;

    public ja(gx0.ac acVar) {
        this.f358114d = acVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        cx0.f fVar = (cx0.f) obj;
        gx0.ac acVar = this.f358114d;
        ex0.a0 e86 = acVar.e8();
        if (e86 == null || fVar == null || acVar.A7().getWidth() <= 0) {
            return;
        }
        if (fVar.f306051a == cx0.a.f306026d) {
            gx0.sc z76 = acVar.z7();
            ug.m mVar = ug.m.Narration;
            z76.getClass();
            pv0.g gVar = (pv0.g) z76.f440097r.get(mVar);
            if (gVar != null) {
                ((vu0.s) ((jz5.n) gVar.f440056d).mo141623x754a37bb()).a();
            }
        }
        ex0.q qVar = (ex0.q) kz5.n0.Z(e86.f338630g.f338712g);
        acVar.f304183v = qVar != null ? qVar.C() : 1.0f;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        acVar.s7(new gx0.wb(acVar, h0Var, c0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieNarrationPanelUIC", "refreshTimbre: nextRoleID = " + ((java.lang.String) h0Var.f391656d) + ", hasDifferentRoleID = " + c0Var.f391645d);
        if (c0Var.f391645d || (obj2 = h0Var.f391656d) == null) {
            com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = dw0.c.f325617f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4104x6d422cb2, "<set-?>");
            acVar.f304180s = c4104x6d422cb2;
        } else {
            dw0.c l76 = acVar.z7().l7((java.lang.String) obj2);
            com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb22 = l76 != null ? l76.f325619a : null;
            if (c4104x6d422cb22 != null) {
                acVar.f304180s = c4104x6d422cb22;
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(acVar.m158345xefc66565(), null, null, new gx0.tb(acVar, fVar, e86, null), 3, null);
    }
}
