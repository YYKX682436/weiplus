package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class pm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn {

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f286812x;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570064w5);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rm rmVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rm();
        rmVar.a(xgVar, true);
        xgVar.setTag(rmVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (!f9Var.u2()) {
            return true;
        }
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
        }
        if (this.f286812x.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f286812x = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rm rmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rm) g0Var;
        x01.a a17 = x01.a.a(f9Var.j());
        if (a17 == null) {
            return;
        }
        java.lang.String str2 = a17.f532505a;
        n(rmVar, dVar, f9Var, str2);
        m(rmVar, dVar, str2, f9Var);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(rmVar.f286999b.getContext(), x01.b.a(a17), (int) rmVar.f286999b.getTextSize(), 1, null, "");
        rmVar.f286999b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), rmVar, null));
        rmVar.f286999b.setOnLongClickListener(u(dVar));
    }
}
