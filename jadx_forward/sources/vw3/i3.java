package vw3;

/* loaded from: classes.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f522520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522521e;

    public i3(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f522520d = repairerMsgDebugUI;
        this.f522521e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.f522520d, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522521e;
        intent.putExtra("xmlContent", f9Var != null ? f9Var.U1() : null);
        intent.putExtra("msgId", f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        intent.putExtra("fromUsername", f9Var != null ? f9Var.Q0() : null);
        intent.putExtra("toUsername", f9Var != null ? f9Var.Q0() : null);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f522520d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerMsgDebugUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerMsgDebugUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerMsgDebugUI, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
