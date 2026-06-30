package vw3;

/* loaded from: classes.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f522511e;

    public h3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI) {
        this.f522510d = f9Var;
        this.f522511e = repairerMsgDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522510d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(f9Var != null ? f9Var.U1() : null);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this.f522511e);
        e4Var.f293309c = "复制成功";
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
