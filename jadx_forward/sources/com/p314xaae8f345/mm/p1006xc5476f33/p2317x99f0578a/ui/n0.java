package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256980d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256980d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256980d;
        v0Var.f257013g = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar = v0Var.f257011J;
        if (eVar != null) {
            eVar.f256955i = v0Var.f257028x;
        }
        if (eVar != null) {
            eVar.D();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar2 = v0Var.f257011J;
        if (eVar2 != null) {
            eVar2.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
