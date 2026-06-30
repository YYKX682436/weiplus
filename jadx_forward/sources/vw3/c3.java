package vw3;

/* loaded from: classes.dex */
public final class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f522441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f522442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522443f;

    public c3(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f522441d = repairerMsgDebugUI;
        this.f522442e = j17;
        this.f522443f = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f522441d;
        android.content.Intent intent = new android.content.Intent(repairerMsgDebugUI.mo55332x76847179(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI.class);
        pf5.j0.a(intent, ix3.s3.class);
        intent.putExtra("Chat_Msg_Id", this.f522442e);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522443f;
        intent.putExtra("Chat_User", f9Var != null ? f9Var.Q0() : null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = repairerMsgDebugUI.mo55332x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$15", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$15", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
