package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0 f232638d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0 k0Var) {
        this.f232638d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0 k0Var = this.f232638d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f232766d, "click comment input");
        k0Var.f232774o = true;
        android.view.View view2 = k0Var.f232770h;
        if (view2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8 m8Var = k0Var.f232773n;
            m8Var.a(view2);
            m8Var.b(kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.bpc), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.blj), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gyy), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.j7o), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.os8)}));
        }
        k0Var.Q6().setVisibility(0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16688x2f31b8ec) ((jz5.n) k0Var.f232768f).mo141623x754a37bb()).setVisibility(0);
        k0Var.Q6().setAlpha(0.0f);
        k0Var.Q6().animate().alpha(1.0f).setDuration(200L).start();
        android.view.View view3 = k0Var.f232772m;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view3 != null ? view3.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(k0Var.f232772m);
        }
        ((android.view.ViewGroup) ((jz5.n) k0Var.f232769g).mo141623x754a37bb()).addView(k0Var.f232772m);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
