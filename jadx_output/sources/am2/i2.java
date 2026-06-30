package am2;

/* loaded from: classes3.dex */
public final class i2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.i2 f8696d = new am2.i2();

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 1000068);
        r45.vw1 vw1Var = new r45.vw1();
        vw1Var.set(1, "你以「斗气大陆八星斗帝...」的身份进入直播间");
        vw1Var.set(0, 5);
        ch1Var.set(4, new com.tencent.mm.protobuf.g(vw1Var.toByteArray()));
        linkedList.add(new dk2.sc(ch1Var));
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class)) != null) {
            mgVar.I1(linkedList);
        }
        return true;
    }
}
