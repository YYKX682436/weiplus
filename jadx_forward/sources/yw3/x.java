package yw3;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI f548456d;

    public x(com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
        this.f548456d = repairerAccessibilityDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI = this.f548456d;
        dp.a.m125854x26a183b((android.content.Context) repairerAccessibilityDemoUI, (java.lang.CharSequence) "repairer_dischild_click_btn click!", 0).show();
        ab0.c0 c0Var = (ab0.c0) i95.n0.c(ab0.c0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = repairerAccessibilityDemoUI.mo55332x76847179();
        ((za0.k) c0Var).getClass();
        w41.u.f524421a.b(mo55332x76847179, "25984993448421345@kefu.openim");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
