package jm3;

/* loaded from: classes3.dex */
public final class b0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381830d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a) {
        this.f381830d = activityC16653xffd2636a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        android.view.View X6 = this.f381830d.X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2$onEditItem$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2$onEditItem$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
