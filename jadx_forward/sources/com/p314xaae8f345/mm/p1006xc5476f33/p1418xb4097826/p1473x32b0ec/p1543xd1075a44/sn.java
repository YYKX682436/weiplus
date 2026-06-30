package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sn extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn f201352d;

    public sn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn znVar) {
        this.f201352d = znVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn znVar = this.f201352d;
        android.view.View view = znVar.f202118e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        znVar.f202120g.setAlpha(1.0f);
        znVar.f202117d.setElevation(znVar.f202114a.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3y));
        android.view.View view2 = znVar.f202118e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f202119f.setVisibility(8);
        znVar.f202120g.setVisibility(8);
        znVar.f202122i.setVisibility(8);
        znVar.f202123j.setVisibility(8);
        android.widget.TextView textView = znVar.f202124k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f202125l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f202126m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f202127n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f202129p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn.d(znVar, false, 1, null);
        znVar.f202133t.setVisibility(8);
        znVar.f202133t.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        znVar.f202133t.setClickable(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn znVar = this.f201352d;
        android.view.View view = znVar.f202118e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        znVar.f202120g.setAlpha(1.0f);
        znVar.f202117d.setElevation(znVar.f202114a.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3y));
        android.view.View view2 = znVar.f202118e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$hideLoadingLayer$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f202119f.setVisibility(8);
        znVar.f202120g.setVisibility(8);
        znVar.f202122i.setVisibility(8);
        znVar.f202123j.setVisibility(8);
        android.widget.TextView textView = znVar.f202124k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f202125l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f202126m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f202127n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f202129p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zn.d(znVar, false, 1, null);
        znVar.f202133t.setVisibility(8);
        znVar.f202133t.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        znVar.f202133t.setClickable(false);
    }
}
