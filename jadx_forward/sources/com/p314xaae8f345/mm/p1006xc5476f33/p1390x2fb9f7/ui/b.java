package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptAppDebugUI f181356d;

    public b(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
        this.f181356d = exptAppDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI = this.f181356d;
        j62.a b17 = j62.b.f().b(exptAppDebugUI.n.getText().toString().trim());
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI.U6(exptAppDebugUI, b17 == null ? 0 : b17.f379412d);
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
