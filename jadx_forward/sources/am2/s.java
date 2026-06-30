package am2;

/* loaded from: classes3.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f90272d;

    public s(am2.v vVar) {
        this.f90272d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.wi1 wi1Var = new r45.wi1();
        wi1Var.set(1, "test点亮了");
        am2.v vVar = this.f90272d;
        wi1Var.set(0, am2.v.b(vVar));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wi1Var.mo14344x5f01b1f6());
        r45.ch1 a17 = am2.v.a(vVar, gVar, 20091);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1) ((mm2.c1) vVar.f90292b.a(mm2.c1.class)).f410339g).b(new ug2.c(a17));
        mm2.x4 x4Var = (mm2.x4) vVar.f90292b.a(mm2.x4.class);
        x4Var.f411061f.add(new dk2.v7(a17));
        r45.ch1 a18 = am2.v.a(vVar, gVar, 20020);
        r45.xn1 xn1Var = (r45.xn1) a18.m75936x14adae67(13);
        if (xn1Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76227x7ac946f0("***");
            xn1Var.set(0, c19782x23db1cfa);
        }
        mm2.x4 x4Var2 = (mm2.x4) vVar.f90292b.a(mm2.x4.class);
        x4Var2.f411061f.add(new dk2.ka(a18));
        return true;
    }
}
