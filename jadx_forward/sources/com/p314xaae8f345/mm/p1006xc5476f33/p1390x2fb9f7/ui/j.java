package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f181371d;

    public j(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f181371d = exptDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI = this.f181371d;
        com.tencent.mm.plugin.expt.ui.ExptDebugUI.U6(exptDebugUI, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(exptDebugUI.d.getText().toString().trim(), 0));
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
