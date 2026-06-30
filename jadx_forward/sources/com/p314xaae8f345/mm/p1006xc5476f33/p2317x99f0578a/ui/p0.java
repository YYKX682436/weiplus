package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256990d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256990d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256990d;
        if (v0Var.f257032z) {
            v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257034e;
            v0Var.M(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, true);
            android.widget.ImageView imageView = v0Var.f257022r;
            if (imageView != null) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
            }
        } else {
            v0Var.B = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.w.f257035f;
            v0Var.M(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, false);
            android.widget.ImageView imageView2 = v0Var.f257022r;
            if (imageView2 != null) {
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
