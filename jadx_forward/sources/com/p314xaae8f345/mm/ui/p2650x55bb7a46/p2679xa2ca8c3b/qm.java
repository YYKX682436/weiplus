package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn {

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f286918x;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nn, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (!f9Var.u2()) {
            return true;
        }
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
        }
        if (this.f286918x.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286918x = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) g0Var;
        x01.a a17 = x01.a.a(f9Var.j());
        Z(aoVar, f9Var.P0() < 2, true);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(aoVar.f284912b.getContext(), x01.b.a(a17), (int) aoVar.f284912b.m84164x40077844(), 1, null, "");
        aoVar.f284912b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), aoVar, null));
        aoVar.f284912b.setOnLongClickListener(u(dVar));
        V(aoVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
