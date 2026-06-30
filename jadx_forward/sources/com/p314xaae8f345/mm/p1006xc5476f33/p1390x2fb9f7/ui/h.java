package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptAppDebugUI f181369d;

    public h(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
        this.f181369d = exptAppDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI = this.f181369d;
        arrayList2.add(java.lang.Integer.valueOf(exptAppDebugUI.o));
        h62.d.vj().Jj(0, arrayList2, null);
        h62.d.vj().Cj(false);
        exptAppDebugUI.V6();
        exptAppDebugUI.i.setText(" del :" + exptAppDebugUI.o + " true");
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
