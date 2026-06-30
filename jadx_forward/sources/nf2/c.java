package nf2;

/* loaded from: classes10.dex */
public final class c implements nf2.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf2.w f418192a;

    public c(nf2.w wVar) {
        this.f418192a = wVar;
    }

    public void a() {
        nf2.w wVar = this.f418192a;
        nf2.d1 d1Var = wVar.f418341m;
        if (d1Var != null) {
            te2.a9.f499416a.e(d1Var.f418233u ^ true ? 7 : 8, null);
            boolean z17 = d1Var.f418233u;
            java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
            if (z17) {
                if (z17) {
                    nf2.i1 i1Var = d1Var.f418232t;
                    if (!(i1Var != null && i1Var.f418289e)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "expand: starting expand animation");
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = d1Var.f418230r;
                        if (c22789xd23e9a9b != null) {
                            c22789xd23e9a9b.n();
                            c22789xd23e9a9b.setVisibility(8);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "stopCollapsedPagAnim: PAG animation stopped");
                        }
                        android.view.View view = d1Var.f418229q;
                        if (view != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.widget.FrameLayout frameLayout = d1Var.f418219g;
                        if (frameLayout != null) {
                            frameLayout.setAlpha(0.0f);
                            frameLayout.setVisibility(0);
                        }
                        android.view.View view2 = d1Var.f418221i;
                        if (view2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(valueOf);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "expand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view3 = d1Var.f418218f;
                        if (view3 != null) {
                            view3.post(new nf2.k0(d1Var));
                        }
                    }
                }
            } else if (!z17) {
                nf2.i1 i1Var2 = d1Var.f418232t;
                if (!(i1Var2 != null && i1Var2.f418289e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "collapse: starting collapse animation");
                    nf2.i1 i1Var3 = d1Var.f418232t;
                    if (i1Var3 != null) {
                        nf2.i0 i0Var = new nf2.i0(d1Var);
                        if (!i1Var3.f418289e) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LyricsCollapseAnimator", "animateCollapse: starting");
                            jz5.l c17 = i1Var3.c();
                            float floatValue = ((java.lang.Number) c17.f384366d).floatValue();
                            android.view.View view4 = i1Var3.f418285a;
                            view4.setPivotX(floatValue);
                            view4.setPivotY(((java.lang.Number) c17.f384367e).floatValue());
                            jz5.l b17 = i1Var3.b();
                            float floatValue2 = ((java.lang.Number) b17.f384366d).floatValue();
                            android.view.View view5 = i1Var3.f418286b;
                            view5.setPivotX(floatValue2);
                            view5.setPivotY(((java.lang.Number) b17.f384367e).floatValue());
                            android.view.View view6 = i1Var3.f418287c;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "animateCollapse", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "animateCollapse", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View view7 = i1Var3.f418287c;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(valueOf);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "animateCollapse", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view7.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator", "animateCollapse", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            android.view.View view8 = i1Var3.f418287c;
                            view8.setScaleX(0.5f);
                            view8.setScaleY(0.5f);
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view5, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view5, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view5, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
                            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view8, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 0.5f, 1.0f);
                            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(view8, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 0.5f, 1.0f);
                            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(view8, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
                            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
                            animatorSet.setDuration(250L);
                            animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                            animatorSet2.playTogether(ofFloat7, ofFloat8, ofFloat9);
                            animatorSet2.setDuration(125L);
                            animatorSet2.setStartDelay(125L);
                            animatorSet2.setInterpolator(new android.view.animation.DecelerateInterpolator());
                            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                            animatorSet3.playTogether(animatorSet, animatorSet2);
                            animatorSet3.addListener(new nf2.g1(i1Var3, i0Var));
                            animatorSet3.start();
                            i1Var3.f418290f = animatorSet3;
                        }
                    }
                }
            }
            wVar.Z6().E = true ^ z17;
        }
    }
}
