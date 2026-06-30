package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f181376d;

    public m(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f181376d = exptDebugUI;
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
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(this.f181376d.mo55332x76847179(), strArr);
            c0Var.i(0);
            c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.l(this, c0Var, strArr);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
