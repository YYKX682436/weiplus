package vo1;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f520073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f520074e;

    public o(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f520073d = arrayList;
        this.f520074e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f520073d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f520074e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f520085n.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            vo1.c cVar = (vo1.c) next;
            qVar.getClass();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = cVar.f520031a;
            android.view.View view = k3Var != null ? k3Var.f3639x46306858 : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = cVar.f520032b;
            android.view.View view2 = k3Var2 != null ? k3Var2.f3639x46306858 : null;
            java.util.ArrayList arrayList2 = qVar.f520089r;
            jz5.l lVar = cVar.f520037g;
            if (view != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                long j17 = 2;
                ofFloat.setDuration(qVar.f93704f / j17);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).after(qVar.f93704f / j17);
                if (lVar != null) {
                    java.lang.Number number = (java.lang.Number) lVar.f384366d;
                    int intValue = number.intValue();
                    java.lang.Number number2 = (java.lang.Number) lVar.f384367e;
                    if (intValue > number2.intValue()) {
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(number.intValue(), number2.intValue());
                        ofInt.addUpdateListener(new vo1.f(view));
                        ofInt.addListener(new vo1.g(view));
                        ofInt.setDuration(qVar.f93704f);
                        animatorSet.play(ofInt);
                    }
                }
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(qVar.f93704f);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
                arrayList2.add(cVar.f520031a);
                duration.translationX(cVar.f520035e - cVar.f520033c);
                duration.translationY(cVar.f520036f - cVar.f520034d);
                duration.setListener(new vo1.h(qVar, cVar, duration, animatorSet, view)).start();
                animatorSet.start();
            }
            if (view2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                if (lVar != null) {
                    java.lang.Number number3 = (java.lang.Number) lVar.f384366d;
                    int intValue2 = number3.intValue();
                    java.lang.Number number4 = (java.lang.Number) lVar.f384367e;
                    if (intValue2 < number4.intValue()) {
                        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(number3.intValue(), number4.intValue());
                        h0Var.f391656d = ofInt2;
                        ofInt2.addUpdateListener(new vo1.i(view2));
                        ((android.animation.ValueAnimator) h0Var.f391656d).addListener(new vo1.j(view2));
                        ((android.animation.ValueAnimator) h0Var.f391656d).setDuration(qVar.f93704f);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = view2;
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChangeImpl", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChangeImpl", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.ViewPropertyAnimator animate = view3.animate();
                arrayList2.add(cVar.f520032b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(qVar.f93704f).alpha(1.0f).setListener(new vo1.k(qVar, cVar, animate, h0Var, view3)).start();
                android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) h0Var.f391656d;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        }
    }
}
