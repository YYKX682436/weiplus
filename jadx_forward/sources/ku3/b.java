package ku3;

/* loaded from: classes10.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.s f393701d;

    public b(ku3.s sVar) {
        this.f393701d = sVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.s sVar = this.f393701d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) sVar.f393921h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        sVar.n((android.widget.TextView) mo141623x754a37bb);
        ku3.s.a(sVar, sVar.c());
        android.view.View d17 = sVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$hideUnFoldIndicatorWithAni$1", "onAnimationEnd", "(Landroid/animation/Animator;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$hideUnFoldIndicatorWithAni$1", "onAnimationEnd", "(Landroid/animation/Animator;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
