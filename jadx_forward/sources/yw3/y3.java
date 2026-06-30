package yw3;

/* loaded from: classes4.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f548468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(0);
        this.f548468d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("dbdemo"), "demo.db");
        jm0.i iVar = jm0.k.f381802h;
        yw3.d dVar = (yw3.d) iVar.a(yw3.d.class);
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        dVar.O6(o17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerMvvmDBDemoUI", "create db done");
        yw3.k kVar = (yw3.k) ((yw3.d) iVar.a(yw3.d.class)).P6(yw3.k.class);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f548468d;
        kVar.Q6(repairerMvvmDBDemoUI, new yw3.w3(repairerMvvmDBDemoUI));
        pm0.v.X(new yw3.x3(repairerMvvmDBDemoUI));
        return jz5.f0.f384359a;
    }
}
