package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f181378d;

    public o(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f181378d = exptDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI = this.f181378d;
        arrayList2.add(java.lang.Integer.valueOf(exptDebugUI.p));
        h62.d.vj().Ij(0, arrayList2, null, null);
        exptDebugUI.i.setText(" del :" + exptDebugUI.p);
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
