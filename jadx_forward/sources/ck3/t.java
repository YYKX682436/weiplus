package ck3;

/* loaded from: classes8.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f124051a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.Animator f124052b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.Animator f124053c;

    public t(android.view.View view) {
        this.f124051a = view;
    }

    public final android.animation.Animator a(int i17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        float f17 = 1.0f;
        android.view.View view = this.f124051a;
        if (view != null && view.getVisibility() == 0) {
            f17 = view.getAlpha();
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", f17, 0.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(ta5.h.f498412a.a());
        animatorSet.playTogether(ofFloat);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "anim hide beginAlpha: %s, endAlpha: %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(0.0f));
        return animatorSet;
    }

    public final android.animation.Animator b(qn5.a aVar, float f17, float f18) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f124051a, "alpha", f17, f18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(ta5.h.f498412a.a());
        animatorSet.playTogether(ofFloat);
        if (aVar != null) {
            animatorSet.addListener(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "anim show beginAlpha: %s, endAlpha: %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        return animatorSet;
    }

    public final android.animation.Animator c(boolean z17, int i17, boolean z18, qn5.a aVar) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f124051a;
        android.animation.ObjectAnimator ofFloat = z17 ? z18 ? android.animation.ObjectAnimator.ofFloat(view, "translationX", -i17, 0.0f) : android.animation.ObjectAnimator.ofFloat(view, "translationX", i17, 0.0f) : z18 ? android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -i17) : android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, i17);
        ofFloat.setDuration(800L);
        animatorSet.playTogether(ofFloat);
        if (aVar != null) {
            animatorSet.addListener(aVar);
        }
        return animatorSet;
    }

    public final boolean d() {
        android.animation.Animator animator = this.f124053c;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public final boolean e() {
        android.animation.Animator animator = this.f124052b;
        if (animator != null) {
            return animator.isRunning();
        }
        return false;
    }

    public final void f(int i17, boolean z17, boolean z18, qn5.a aVar) {
        android.view.View view = this.f124051a;
        if (view == null) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
            if (aVar != null) {
                aVar.a(null);
            }
            android.animation.Animator animator = this.f124052b;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (z17) {
            ck3.r rVar = new ck3.r(view, aVar);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", 0.0f, -i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(rVar);
            this.f124053c = animatorSet;
        } else if (z18) {
            this.f124053c = a(i17, new ck3.r(view, aVar));
        } else {
            ck3.r rVar2 = new ck3.r(view, aVar);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.addListener(rVar2);
            this.f124053c = animatorSet2;
        }
        android.animation.Animator animator2 = this.f124053c;
        if (animator2 != null) {
            animator2.start();
        }
    }

    public final void g(int i17, boolean z17, qn5.a aVar) {
        android.view.View view = this.f124051a;
        if (view == null) {
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
            return;
        }
        if (e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
            android.animation.Animator animator = this.f124052b;
            if (animator != null) {
                animator.cancel();
            }
        }
        android.animation.Animator c17 = c(false, i17, z17, new ck3.r(view, aVar));
        this.f124053c = c17;
        c17.start();
    }

    public final void h(boolean z17, qn5.a aVar, float f17, float f18) {
        android.animation.Animator animator;
        android.view.View view = this.f124051a;
        if (view == null) {
            return;
        }
        if (e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
            android.animation.Animator animator2 = this.f124053c;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di()) {
            ck3.s sVar = new ck3.s(view, aVar);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
            ofFloat.setDuration(300L);
            animatorSet.playTogether(ofFloat);
            animatorSet.addListener(sVar);
            animator = animatorSet;
        } else if (z17) {
            animator = b(new ck3.s(view, aVar), f17, f18);
        } else {
            ck3.s sVar2 = new ck3.s(view, aVar);
            float c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni().c();
            float f19 = view != null && view.getVisibility() == 8 ? 0.0f : c17;
            if (!(view != null && view.getVisibility() == 8) || c17 <= 0.0f) {
                c17 = 1.0f;
            }
            animator = b(sVar2, f19, c17);
        }
        this.f124052b = animator;
        animator.start();
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowAnimInner", "(ZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowAnimInner", "(ZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(int i17, boolean z17, qn5.a aVar) {
        android.view.View view = this.f124051a;
        if (view == null) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
            android.animation.Animator animator = this.f124053c;
            if (animator != null) {
                animator.cancel();
            }
        }
        android.animation.Animator c17 = c(true, i17, z17, new ck3.s(view, aVar));
        this.f124052b = c17;
        c17.start();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskFBViewAnimationHandler", "playShowTranslateAnimation", "(IZLcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
