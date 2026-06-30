package tf5;

/* loaded from: classes11.dex */
public final class b0 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500490d;

    public b0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500490d = c22342xca74f598;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        tf5.g item = (tf5.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500490d;
        c22342xca74f598.D = rawX;
        c22342xca74f598.E = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        tf5.g data = (tf5.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = data.f500511d;
        sb6.append(z3Var.d1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmAddressUIFragment", sb6.toString());
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        if (c01.e2.M(d17)) {
            intent.putExtra("Is_group_card", true);
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent, d17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        j45.l.j(this.f500490d.mo7438x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(d17, 10L);
    }

    @Override // in5.u
    public boolean v(android.view.View view, in5.c cVar, int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598;
        rl5.r rVar;
        tf5.g data = (tf5.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = data.f500511d;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.b4(z3Var.d1()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(z3Var.d1()) || (rVar = (c22342xca74f598 = this.f500490d).C) == null) {
            return true;
        }
        rVar.g(view, i17, 0L, new tf5.o(c22342xca74f598, data, i17), new tf5.p(c22342xca74f598, data, i17), c22342xca74f598.D, c22342xca74f598.E);
        return true;
    }
}
