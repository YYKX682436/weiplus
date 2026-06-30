package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256987d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256987d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256987d;
        int ordinal = v0Var.B.ordinal();
        if (ordinal == 0) {
            v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257033d;
            v0Var.K(6);
        } else if (ordinal == 1) {
            v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257033d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = v0Var.f257024t;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
            if (c22621x7603e017 != null) {
                c22621x7603e017.setCursorVisible(false);
            }
            v0Var.J(false);
        } else if (ordinal == 2) {
            v0Var.M(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
