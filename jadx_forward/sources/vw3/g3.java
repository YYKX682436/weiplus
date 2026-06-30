package vw3;

/* loaded from: classes.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI f522494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f522495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522496f;

    public g3(com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI, long j17, java.lang.String str) {
        this.f522494d = repairerMsgDebugUI;
        this.f522495e = j17;
        this.f522496f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent(this.f522494d.mo55332x76847179(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI.class);
        intent.putExtra("Chat_Msg_Id", this.f522495e);
        intent.putExtra("Chat_User", this.f522496f);
        com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI repairerMsgDebugUI = this.f522494d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerMsgDebugUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerMsgDebugUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerMsgDebugUI, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMsgDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
