package ze5;

/* loaded from: classes9.dex */
public final class l2 extends ze5.h2 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553594s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = ui6.g();
        if (g17 == null) {
            return true;
        }
        ze5.n2.a(ze5.o2.f553657a, g17, f9Var);
        return true;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        java.lang.Integer valueOf = erVar != null ? java.lang.Integer.valueOf(erVar.d()) : null;
        if (valueOf != null) {
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, this.f553594s) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f553594s;
                boolean z17 = false;
                if (dVar != null && !dVar.A()) {
                    z17 = true;
                }
                if (z17) {
                    menu.c(valueOf.intValue(), 123, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(valueOf.intValue(), 111, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.app.Activity g17;
        if (dVar == null || f9Var == null || (g17 = dVar.g()) == null) {
            return;
        }
        db5.e1.A(g17, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5h), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572076y2), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ze5.j2(f9Var, dVar), ze5.k2.f553576d);
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).f(context);
        f17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
        f17.setForeground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
        f17.setPadding(0, 0, i65.a.b(context, 5), 0);
        return f17;
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f553594s = ui6;
    }
}
