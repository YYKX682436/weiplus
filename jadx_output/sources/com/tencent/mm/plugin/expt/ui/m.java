package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f99843d;

    public m(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f99843d = exptDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList Bi = h62.d.vj().Bi();
        if (Bi != null && Bi.size() > 0) {
            int size = Bi.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                strArr[i17] = Bi.get(i17) + "";
            }
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.f99843d.getContext(), strArr);
            c0Var.i(0);
            c0Var.f212259t = new com.tencent.mm.plugin.expt.ui.l(this, c0Var, strArr);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
