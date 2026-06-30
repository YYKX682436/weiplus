package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes9.dex */
public class f implements android.view.View.OnClickListener {
    public f(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        d42.a.a().getClass();
        gm0.j1.d().g(new d42.d());
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
