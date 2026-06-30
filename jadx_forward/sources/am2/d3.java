package am2;

/* loaded from: classes3.dex */
public final class d3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f90186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f90187e;

    public d3(am2.g3 g3Var, r45.xn1 xn1Var) {
        this.f90186d = g3Var;
        this.f90187e = xn1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        r45.xn1 xn1Var = this.f90187e;
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20125);
        r45.ej1 ej1Var = new r45.ej1();
        ej1Var.set(0, 1);
        ej1Var.set(1, "分享了直播");
        ej1Var.set(2, 1);
        ch1Var.set(4, hc2.b.a(ej1Var));
        linkedList.add(new dk2.a8(ch1Var));
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class)) != null) {
            mgVar.I1(linkedList);
        }
        r45.ch1 ch1Var2 = new r45.ch1();
        ch1Var2.set(13, xn1Var);
        ch1Var2.set(1, 20125);
        r45.ej1 ej1Var2 = new r45.ej1();
        ej1Var2.set(0, 1);
        ej1Var2.set(1, "分享了直播");
        ej1Var2.set(2, 1);
        ch1Var2.set(4, hc2.b.a(ej1Var2));
        ((mm2.x4) this.f90186d.f90208b.a(mm2.x4.class)).f411061f.add(new dk2.a8(ch1Var2));
        return true;
    }
}
