package ze5;

/* loaded from: classes9.dex */
public class t6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6, qd5.c {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553739s;

    /* renamed from: t, reason: collision with root package name */
    public ze5.u6 f553740t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.e1z);
        ze5.w6 w6Var = new ze5.w6();
        w6Var.a(xgVar, false);
        xgVar.setTag(w6Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (100 == menuItem.getItemId()) {
            ze5.o6.c(f9Var, this, dVar);
            return false;
        }
        if (131 == menuItem.getItemId()) {
            ze5.o6.d(dVar, menuItem, f9Var);
            return false;
        }
        if (123 == menuItem.getItemId()) {
            nc5.a.f417721a.b(f9Var, 1);
            return false;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) dVar.f542241c.a(sb5.w1.class))).m0(menuItem, f9Var);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(db5.g4 r18, android.view.View r19, rd5.d r20) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.t6.Q(db5.g4, android.view.View, rd5.d):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // qd5.c
    public qd5.a a(rd5.d dVar) {
        return ze5.o6.e(dVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean a0() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        f9Var.m78015x9dfe85a();
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) dVar.f542241c.a(sb5.w1.class));
        lkVar.getClass();
        if (f9Var.J2()) {
            if (!c01.d9.b().E()) {
                db5.t7.k(lkVar.f280113d.g(), lkVar.f280113d.f542250l.m78646xc2a54588());
                return;
            }
            if (!lkVar.f280113d.x().equals("medianote")) {
                ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ic.e(f9Var);
            lkVar.f280113d.L(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.v6(f9Var, qVar, aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f553739s = dVar;
        ze5.w6 w6Var = (ze5.w6) g0Var;
        z01.q qVar = new z01.q();
        af5.y0.b(qVar, f9Var);
        if (this.f553740t == null) {
            this.f553740t = new ze5.u6(this.f553739s, this, false);
        }
        qVar.f550674f = this.f553740t;
        qVar.f550675g = u(dVar);
        qVar.f550676h = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1;
        w6Var.f553817c.m48330xfcfee142(qVar);
        w6Var.f553817c.m80098x2f6118c5(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), w6Var, f9Var.Q0()));
        W(w6Var, dVar2, dVar.t(), false, dVar.D(), dVar, this);
        w6Var.f553816b.m48330xfcfee142(ze5.o6.a(f9Var, this, dVar, w6Var));
        ym5.a1.h(g0Var.f39494xbf64baf8, new ze5.s6(this, f9Var));
        ze5.v6 v6Var = (ze5.v6) f9Var.f275460g2;
        lf5.f.f400067a.a(dVar, f9Var, w6Var, this, v6Var.f553788f, v6Var.f553790h);
        ze5.o6.b(w6Var.f553818d, dVar2, dVar, w6Var);
    }
}
