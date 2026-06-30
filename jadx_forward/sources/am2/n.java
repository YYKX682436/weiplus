package am2;

/* loaded from: classes3.dex */
public final class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.p f90250d;

    public n(am2.p pVar) {
        this.f90250d = pVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.di1 di1Var = new r45.di1();
        di1Var.set(0, "MMFinderLiveGift100001");
        di1Var.set(1, "测试文本（已送满）");
        di1Var.set(2, 2);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(di1Var.mo14344x5f01b1f6());
        am2.p pVar = this.f90250d;
        r45.ch1 a17 = am2.p.a(pVar, gVar, 20098);
        mm2.x4 x4Var = (mm2.x4) pVar.f90260b.a(mm2.x4.class);
        x4Var.f411061f.add(new fk2.j3(a17));
        return true;
    }
}
