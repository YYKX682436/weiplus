package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptHitDebugUI f181383d;

    public t(com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI) {
        this.f181383d = exptHitDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j62.c oj6 = h62.d.vj().oj(this.f181383d.p);
        if (oj6 != null) {
            java.util.HashMap E = oj6.E();
            if (!E.isEmpty()) {
                java.util.Iterator it = E.keySet().iterator();
                if (it.hasNext()) {
                    h62.d.vj().bj((java.lang.String) it.next(), "", true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
