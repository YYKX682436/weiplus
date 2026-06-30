package am2;

/* loaded from: classes3.dex */
public final class c3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f8646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f8647e;

    public c3(am2.g3 g3Var, r45.xn1 xn1Var) {
        this.f8646d = g3Var;
        this.f8647e = xn1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        r45.xn1 xn1Var = this.f8647e;
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20078);
        r45.bj1 bj1Var = new r45.bj1();
        bj1Var.set(1, "关注了主播");
        bj1Var.set(2, 0);
        ch1Var.set(4, hc2.b.a(bj1Var));
        linkedList.add(new dk2.a8(ch1Var));
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class)) != null) {
            mgVar.I1(linkedList);
        }
        r45.ch1 ch1Var2 = new r45.ch1();
        ch1Var2.set(13, xn1Var);
        ch1Var2.set(1, 20078);
        r45.bj1 bj1Var2 = new r45.bj1();
        bj1Var2.set(1, "关注了主播");
        bj1Var2.set(2, 1);
        ch1Var2.set(4, hc2.b.a(bj1Var2));
        ((mm2.x4) this.f8646d.f8675b.a(mm2.x4.class)).f329528f.add(new dk2.a8(ch1Var2));
        return true;
    }
}
