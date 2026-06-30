package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptDebugUI f99844d;

    public n(com.tencent.mm.plugin.expt.ui.ExptDebugUI exptDebugUI) {
        this.f99844d = exptDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h62.d.vj().Gj(1);
        dp.a.makeText(this.f99844d.getContext(), "start req expt", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
