package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes11.dex */
public class w implements android.view.View.OnClickListener {
    public w(com.tencent.mm.plugin.expt.ui.z zVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptReportBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g("cancel expt debug now!");
        u1Var.a(true);
        u1Var.b(new com.tencent.mm.plugin.expt.ui.v(this));
        u1Var.e(new com.tencent.mm.plugin.expt.ui.u(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
