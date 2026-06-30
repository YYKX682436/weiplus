package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232661d;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        this.f232661d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCancel, firstRenderTime:");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f232661d;
        sb6.append(z5Var.f233118x);
        sb6.append(", firstRenderFrame:");
        sb6.append(z5Var.f233119y);
        sb6.append(", backFirstRenderTime:");
        sb6.append(z5Var.f233120z);
        sb6.append(", backFirstFrame:");
        sb6.append(z5Var.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", sb6.toString());
        z5Var.f233119y = z5Var.A;
        z5Var.f233118x = z5Var.f233120z;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w4 w4Var = z5Var.H;
        if (w4Var != null) {
            ((jm3.j0) w4Var).a(z5Var.B);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
