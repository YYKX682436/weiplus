package oa5;

/* loaded from: classes8.dex */
public class d implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa5.g f425394d;

    public d(oa5.g gVar) {
        this.f425394d = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        oa5.g gVar = this.f425394d;
        android.animation.Animator.AnimatorListener animatorListener = gVar.f425407n;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
        java.util.HashMap hashMap = gVar.f425389b;
        if (hashMap != null) {
            hashMap.remove(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        oa5.g gVar = this.f425394d;
        android.animation.Animator.AnimatorListener animatorListener = gVar.f425407n;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        java.util.HashMap hashMap = gVar.f425389b;
        if (hashMap != null) {
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(animator);
            if (runnable != null) {
                runnable.run();
            }
            gVar.f425389b.remove(animator);
        }
        gVar.f425411r.remove(animator);
        if (gVar.f425411r.isEmpty()) {
            gVar.f425407n = null;
        }
        gVar.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f425394d.f425407n;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        oa5.g gVar = this.f425394d;
        android.animation.Animator.AnimatorListener animatorListener = gVar.f425407n;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
        java.util.HashMap hashMap = gVar.f425388a;
        if (hashMap != null) {
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(animator);
            if (runnable != null) {
                runnable.run();
            }
            gVar.f425388a.remove(animator);
        }
        gVar.getClass();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.View view;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        oa5.g gVar = this.f425394d;
        oa5.a aVar = gVar.f425392e;
        if (aVar != null) {
            aVar.a(animatedFraction);
        }
        oa5.f fVar = (oa5.f) gVar.f425411r.get(valueAnimator);
        if ((fVar.f425398a & 511) != 0 && (view = (android.view.View) gVar.f425400g.get()) != null) {
            view.invalidate();
        }
        java.util.ArrayList arrayList = fVar.f425399b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                oa5.e eVar = (oa5.e) arrayList.get(i17);
                float f17 = eVar.f425396b + (eVar.f425397c * animatedFraction);
                android.view.View view2 = (android.view.View) gVar.f425400g.get();
                if (view2 != null) {
                    int i18 = eVar.f425395a;
                    if (i18 == 1) {
                        view2.setTranslationX(f17);
                    } else if (i18 == 2) {
                        view2.setTranslationY(f17);
                    } else if (i18 == 4) {
                        view2.setScaleX(f17);
                    } else if (i18 == 8) {
                        view2.setScaleY(f17);
                    } else if (i18 == 16) {
                        view2.setRotation(f17);
                    } else if (i18 == 32) {
                        view2.setRotationX(f17);
                    } else if (i18 == 64) {
                        view2.setRotationY(f17);
                    } else if (i18 == 128) {
                        view2.setX(f17);
                    } else if (i18 == 256) {
                        view2.setY(f17);
                    } else if (i18 == 512) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(java.lang.Float.valueOf(f17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/anim/animator/ViewPropertyAnimatorHC", "setValue", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/ui/anim/animator/ViewPropertyAnimatorHC", "setValue", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
        }
        android.view.View view3 = (android.view.View) gVar.f425400g.get();
        if (view3 != null) {
            view3.invalidate();
        }
    }
}
