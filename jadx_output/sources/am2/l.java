package am2;

/* loaded from: classes3.dex */
public final class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.p f8709d;

    public l(am2.p pVar) {
        this.f8709d = pVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.di1 di1Var = new r45.di1();
        di1Var.set(0, "MMFinderLiveGift100001");
        di1Var.set(1, "测试文本(开始)");
        di1Var.set(2, 1);
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(di1Var.toByteArray());
        am2.p pVar = this.f8709d;
        r45.ch1 a17 = am2.p.a(pVar, gVar, 20098);
        mm2.x4 x4Var = (mm2.x4) pVar.f8727b.a(mm2.x4.class);
        x4Var.f329528f.add(new fk2.j3(a17));
        return true;
    }
}
