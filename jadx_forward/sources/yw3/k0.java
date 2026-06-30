package yw3;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI f548315d;

    public k0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI repairerDBDemoUI) {
        this.f548315d = repairerDBDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI repairerDBDemoUI = this.f548315d;
        android.content.Intent className = new android.content.Intent().setClassName((android.content.Context) this.f548315d, "com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(className);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerDBDemoUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerDBDemoUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerDBDemoUI, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDBDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
