package yw3;

/* loaded from: classes.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI f548216d;

    public a0(com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
        this.f548216d = repairerAccessibilityDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView textView = (android.widget.TextView) this.f548216d.findViewById(com.p314xaae8f345.mm.R.id.f568169ly5);
        textView.setText("I am warning!");
        view.postDelayed(new yw3.z(textView), 3000L);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
