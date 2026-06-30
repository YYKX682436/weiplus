package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f99839d;

    public k(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f99839d = exptDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI = this.f99839d;
        h62.d.vj().yj(exptDebugUI.o.getText().toString().trim());
        exptDebugUI.o.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
