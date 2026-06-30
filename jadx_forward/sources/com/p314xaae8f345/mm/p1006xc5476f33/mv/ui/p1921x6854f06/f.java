package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes5.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232476d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232476d = activityC16662x5873ebce;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232476d;
        if (!activityC16662x5873ebce.D && !activityC16662x5873ebce.f232446s) {
            activityC16662x5873ebce.setResult(-1);
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC16662x5873ebce.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559447f2);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.g(activityC16662x5873ebce));
        activityC16662x5873ebce.f232442o.startAnimation(loadAnimation);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
