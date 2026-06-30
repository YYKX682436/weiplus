package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptAppDebugUI f99832d;

    public e(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
        this.f99832d = exptAppDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h62.d.vj().getClass();
        java.util.List a17 = j62.b.f().a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a17;
        if (arrayList3.size() > 0) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(((j62.a) it.next()).f297879d));
            }
        }
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                strArr[i17] = arrayList2.get(i17) + "";
            }
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.f99832d.getContext(), strArr);
            c0Var.i(0);
            c0Var.f212259t = new com.tencent.mm.plugin.expt.ui.d(this, c0Var, strArr);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
