package yw3;

/* loaded from: classes.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI f548447d;

    public w(com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
        this.f548447d = repairerAccessibilityDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI = this.f548447d;
        repairerAccessibilityDemoUI.d++;
        ((android.widget.TextView) repairerAccessibilityDemoUI.findViewById(com.p314xaae8f345.mm.R.id.lxz)).setText(java.lang.String.valueOf(repairerAccessibilityDemoUI.d));
        ((java.util.concurrent.CopyOnWriteArrayList) j45.l.f379247b).add(new yw3.v(((android.widget.EditText) repairerAccessibilityDemoUI.findViewById(com.p314xaae8f345.mm.R.id.lxn)).getText().toString()));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
