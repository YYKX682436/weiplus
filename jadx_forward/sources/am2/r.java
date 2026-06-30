package am2;

/* loaded from: classes3.dex */
public final class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f90268d;

    public r(am2.v vVar) {
        this.f90268d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.pi1 pi1Var = new r45.pi1();
        pi1Var.set(1, "test 成为点亮 爱心 的最大助力");
        am2.v vVar = this.f90268d;
        pi1Var.set(0, am2.v.b(vVar));
        r45.ch1 a17 = am2.v.a(vVar, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(pi1Var.mo14344x5f01b1f6()), 20090);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) vVar.f90292b.a(mm2.c1.class)).f410339g).b(new ug2.c(a17));
        mm2.x4 x4Var = (mm2.x4) vVar.f90292b.a(mm2.x4.class);
        x4Var.f411061f.add(new dk2.v7(a17));
        return true;
    }
}
