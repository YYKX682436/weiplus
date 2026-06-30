package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class c5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f289142g;

    public c5(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var, yf5.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f289139d = l4Var;
        this.f289140e = o5Var;
        this.f289141f = nVar;
        this.f289142g = layoutParams;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        yf5.m c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = this.f289139d;
        if (l4Var != null) {
            l4Var.f276618g2 = 2;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289140e;
        int i17 = o5Var.f289474x;
        if (i17 > 0) {
            o5Var.f289474x = i17 - 1;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            viewOnTouchListenerC22366xcd5c2226.h(false);
        }
        if (o5Var.K.getAndSet(false)) {
            yf5.j0 j0Var = o5Var.f289457d;
            if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                c17.b();
            }
            o5Var.f289472v = false;
            o5Var.B = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        yf5.m c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = this.f289139d;
        if (l4Var != null) {
            l4Var.f276618g2 = 2;
        }
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289140e;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 k17 = o5Var.k(h17);
        if (k17 != null) {
            k17.f276618g2 = 2;
        }
        yf5.n nVar = this.f289141f;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f543463q.setLayoutParams(this.f289142g);
        nVar.f543462p = o5Var.f289464n;
        nVar.f543463q.requestLayout();
        int i17 = o5Var.f289474x;
        if (i17 > 0) {
            o5Var.f289474x = i17 - 1;
        }
        if (o5Var.K.getAndSet(false)) {
            yf5.j0 j0Var = o5Var.f289457d;
            if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                c17.b();
            }
            o5Var.f289472v = false;
            o5Var.B = false;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            viewOnTouchListenerC22366xcd5c2226.h(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = this.f289139d;
        if (l4Var != null) {
            l4Var.f276618g2 = 66;
        }
        yf5.n nVar = this.f289141f;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = nVar.f543463q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
