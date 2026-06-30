package bb2;

/* loaded from: classes5.dex */
public final class x0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f100600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.q0 f100601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.z0 f100602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bb2.r0 f100603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f100604h;

    public x0(bb2.q0 q0Var, bb2.z0 z0Var, bb2.r0 r0Var, java.lang.Runnable runnable) {
        this.f100601e = q0Var;
        this.f100602f = z0Var;
        this.f100603g = r0Var;
        this.f100604h = runnable;
        if (!android.animation.Animator.AnimatorListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.animation.Animator.AnimatorListener.class.getClassLoader(), new java.lang.Class[]{android.animation.Animator.AnimatorListener.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.animation.Animator.AnimatorListener");
        }
        this.f100600d = (android.animation.Animator.AnimatorListener) newProxyInstance;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        bb2.q0 q0Var = this.f100601e;
        android.view.View view = q0Var.f100484d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = q0Var.f100484d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100602f.s(q0Var, this.f100603g);
        java.lang.Runnable runnable = this.f100604h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        bb2.q0 q0Var = this.f100601e;
        android.view.View view = q0Var.f100484d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = q0Var.f100484d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/bullet/FixedCenterDanmakuRender$recycleDanmaku$1$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100602f.s(q0Var, this.f100603g);
        java.lang.Runnable runnable = this.f100604h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f100600d.onAnimationRepeat(p07);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f100600d.onAnimationStart(p07);
    }
}
