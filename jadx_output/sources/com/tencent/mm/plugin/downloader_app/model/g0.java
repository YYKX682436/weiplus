package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.h0 f97273d;

    public g0(com.tencent.mm.plugin.downloader_app.model.h0 h0Var) {
        this.f97273d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/model/GameDownloadFloatBallHelper$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.model.h0 h0Var = this.f97273d;
        com.tencent.mm.plugin.downloader_app.model.l0.e0(h0Var.f97276a, false);
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = h0Var.f97276a;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = l0Var.f97300y;
        if (u1Var != null) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
            if (j0Var != null) {
                j0Var.dismiss();
            }
            l0Var.f97300y = null;
            l0Var.A.dead();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/model/GameDownloadFloatBallHelper$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
