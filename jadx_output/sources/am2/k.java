package am2;

/* loaded from: classes3.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.p f8705d;

    public k(am2.p pVar) {
        this.f8705d = pVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        r45.d42 d42Var = new r45.d42();
        d42Var.set(0, "https://dldir1.qq.com/weixin/checkresupdate/gift-goal-haptics-test-ani_56bc938338e44c248498b7f5c53bed20.pag");
        d42Var.set(4, "https://dldir1.qq.com/weixin/checkresupdate/gift-goal-haptics-test-ani_56bc938338e44c248498b7f5c53bed20.pag");
        d42Var.set(2, 1);
        d42Var.set(3, null);
        r45.a8 a8Var = new r45.a8();
        r45.q53 q53Var = new r45.q53();
        q53Var.set(0, "https://dldir1.qq.com/weixin/checkresupdate/gift-goal-haptics-test-sfx_978864974a644da596826d2abfa1f6a8.mp3");
        a8Var.set(0, q53Var);
        java.util.LinkedList list = a8Var.getList(1);
        r45.zy6 zy6Var = new r45.zy6();
        zy6Var.set(0, 0L);
        zy6Var.set(1, 500L);
        list.add(zy6Var);
        java.util.LinkedList list2 = a8Var.getList(1);
        r45.zy6 zy6Var2 = new r45.zy6();
        zy6Var2.set(0, 1000L);
        zy6Var2.set(1, 500L);
        list2.add(zy6Var2);
        java.util.LinkedList list3 = a8Var.getList(1);
        r45.zy6 zy6Var3 = new r45.zy6();
        zy6Var3.set(0, 2000L);
        zy6Var3.set(1, 500L);
        list3.add(zy6Var3);
        java.util.LinkedList list4 = a8Var.getList(1);
        r45.zy6 zy6Var4 = new r45.zy6();
        zy6Var4.set(0, 3000L);
        zy6Var4.set(1, 500L);
        list4.add(zy6Var4);
        d42Var.set(6, a8Var);
        d42Var.set(7, (r45.a8) d42Var.getCustom(6));
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(d42Var.toByteArray());
        am2.p pVar = this.f8705d;
        r45.ch1 a17 = am2.p.a(pVar, gVar, 20096);
        com.tencent.mm.plugin.finder.live.util.o1 o1Var = ((mm2.c1) pVar.f8727b.a(mm2.c1.class)).f328806g;
        ug2.a aVar = new ug2.a(a17);
        aVar.f427512b = 6000000L;
        ((com.tencent.mm.plugin.finder.live.util.j1) o1Var).b(aVar);
        return true;
    }
}
