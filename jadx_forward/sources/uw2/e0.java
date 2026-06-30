package uw2;

/* loaded from: classes2.dex */
public final class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f513192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f513193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f513194f;

    public e0(in5.s0 s0Var, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f513192d = s0Var;
        this.f513193e = list;
        this.f513194f = h0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f513192d.f374658i;
        nv2.h1 h1Var = nv2.n1.f422083g;
        java.util.LinkedList h17 = nv2.n1.f422084h.h(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        java.util.List<android.view.View> list = this.f513193e;
        for (android.view.View view : list) {
            if (view != null) {
                view.setTranslationX(0.0f);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f513194f;
        android.view.View view2 = (android.view.View) h0Var.f391656d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) h0Var.f391656d).setTranslationX(0.0f);
        android.view.View view3 = (android.view.View) h0Var.f391656d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$startAvatarAnimator$10", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.a0(h17, 0);
        uw2.h0 h0Var2 = uw2.h0.f513207a;
        if (c19781xd1c47b87 != null) {
            java.lang.Object obj = list.get(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            android.view.View findViewById = ((android.view.View) obj).findViewById(com.p314xaae8f345.mm.R.id.ge9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            h0Var2.n(c19781xd1c47b87, (android.widget.ImageView) findViewById);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.a0(h17, 1);
        if (c19781xd1c47b872 != null) {
            java.lang.Object obj2 = list.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            android.view.View findViewById2 = ((android.view.View) obj2).findViewById(com.p314xaae8f345.mm.R.id.ge7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            h0Var2.n(c19781xd1c47b872, (android.widget.ImageView) findViewById2);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b873 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.a0(h17, 2);
        if (c19781xd1c47b873 != null) {
            java.lang.Object obj3 = list.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
            android.view.View findViewById3 = ((android.view.View) obj3).findViewById(com.p314xaae8f345.mm.R.id.f566593ge5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            h0Var2.n(c19781xd1c47b873, (android.widget.ImageView) findViewById3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
