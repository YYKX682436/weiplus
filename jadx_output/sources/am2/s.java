package am2;

/* loaded from: classes3.dex */
public final class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f8739d;

    public s(am2.v vVar) {
        this.f8739d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.wi1 wi1Var = new r45.wi1();
        wi1Var.set(1, "test点亮了");
        am2.v vVar = this.f8739d;
        wi1Var.set(0, am2.v.b(vVar));
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(wi1Var.toByteArray());
        r45.ch1 a17 = am2.v.a(vVar, gVar, 20091);
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) vVar.f8759b.a(mm2.c1.class)).f328806g).b(new ug2.c(a17));
        mm2.x4 x4Var = (mm2.x4) vVar.f8759b.a(mm2.x4.class);
        x4Var.f329528f.add(new dk2.v7(a17));
        r45.ch1 a18 = am2.v.a(vVar, gVar, 20020);
        r45.xn1 xn1Var = (r45.xn1) a18.getCustom(13);
        if (xn1Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setNickname("***");
            xn1Var.set(0, finderContact);
        }
        mm2.x4 x4Var2 = (mm2.x4) vVar.f8759b.a(mm2.x4.class);
        x4Var2.f329528f.add(new dk2.ka(a18));
        return true;
    }
}
