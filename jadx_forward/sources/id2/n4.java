package id2;

/* loaded from: classes8.dex */
public final class n4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f372228a;

    public n4(id2.s4 s4Var) {
        this.f372228a = s4Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        cl0.g gVar = new cl0.g();
        gVar.h("switch_status", java.lang.String.valueOf(z17 ? 1 : 0));
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        id2.s4 s4Var = this.f372228a;
        java.lang.String str = s4Var.f372330e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_more_recent_switch", gVar2);
        if (z17) {
            id2.s4.O6(s4Var, 1, new id2.m4(s4Var));
            return;
        }
        android.app.Activity m80379x76847179 = s4Var.m80379x76847179();
        id2.l4 l4Var = new id2.l4(s4Var);
        s4Var.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m80379x76847179, 1, true);
        k0Var.q(m80379x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mah), 17);
        k0Var.f293405n = new id2.o4(m80379x76847179);
        k0Var.f293414s = new id2.q4(s4Var, m80379x76847179, l4Var);
        k0Var.f293387d = new id2.r4(s4Var, l4Var);
        k0Var.v();
        java.lang.String str2 = s4Var.f372330e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(str2, "", b52.b.b(), "person_page_more_recent_switch_pop", "");
    }
}
