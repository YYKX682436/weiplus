package vw3;

/* loaded from: classes.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI f522544d;

    public k2(com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI) {
        this.f522544d = repairerLoginAndRegUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI.g;
        com.tencent.mm.plugin.repairer.ui.RepairerLoginAndRegUI repairerLoginAndRegUI = this.f522544d;
        repairerLoginAndRegUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(repairerLoginAndRegUI.mo55332x76847179(), "com.tencent.mm.plugin.account.ui.MobileVerifyUI");
        intent.putExtra("bindmcontact_mobile", repairerLoginAndRegUI.U6().f522663a + ' ' + repairerLoginAndRegUI.U6().f522664b);
        intent.putExtra("bindmcontact_shortmobile", repairerLoginAndRegUI.U6().f522664b);
        intent.putExtra("country_name", "中国");
        intent.putExtra("couttry_code", repairerLoginAndRegUI.U6().f522663a);
        intent.putExtra("mobile_verify_purpose", 3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerLoginAndRegUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToVerifySmsForgetPWD", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerLoginAndRegUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerLoginAndRegUI, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI", "goToVerifySmsForgetPWD", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerLoginAndRegUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
