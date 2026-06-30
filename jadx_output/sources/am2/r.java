package am2;

/* loaded from: classes3.dex */
public final class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f8735d;

    public r(am2.v vVar) {
        this.f8735d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.pi1 pi1Var = new r45.pi1();
        pi1Var.set(1, "test 成为点亮 爱心 的最大助力");
        am2.v vVar = this.f8735d;
        pi1Var.set(0, am2.v.b(vVar));
        r45.ch1 a17 = am2.v.a(vVar, new com.tencent.mm.protobuf.g(pi1Var.toByteArray()), 20090);
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) vVar.f8759b.a(mm2.c1.class)).f328806g).b(new ug2.c(a17));
        mm2.x4 x4Var = (mm2.x4) vVar.f8759b.a(mm2.x4.class);
        x4Var.f329528f.add(new dk2.v7(a17));
        return true;
    }
}
