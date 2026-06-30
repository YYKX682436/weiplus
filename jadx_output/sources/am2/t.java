package am2;

/* loaded from: classes3.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.v f8749d;

    public t(am2.v vVar) {
        this.f8749d = vVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.oi1 oi1Var = new r45.oi1();
        oi1Var.set(0, "主播的礼物墙已点亮，去围观");
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(oi1Var.toByteArray());
        am2.v vVar = this.f8749d;
        r45.ch1 a17 = am2.v.a(vVar, gVar, 20092);
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) vVar.f8759b.a(mm2.c1.class)).f328806g).b(new ug2.c(a17));
        return true;
    }
}
