package sc2;

/* loaded from: classes2.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(sc2.h1 h1Var, in5.s0 s0Var) {
        super(0);
        this.f487384d = h1Var;
        this.f487385e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc2.h1 h1Var = this.f487384d;
        android.view.View view = h1Var.X;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{android.graphics.Color.argb(0, 161, 161, 161), android.graphics.Color.argb(255, 161, 161, 161)});
        gradientDrawable.setCornerRadius(this.f487385e.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
        android.view.View view2 = h1Var.X;
        if (view2 != null) {
            view2.setBackground(gradientDrawable);
        }
        android.view.View view3 = h1Var.X;
        android.view.ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = 0;
        }
        android.view.View view4 = h1Var.X;
        if (view4 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15179x385a9ce5 c15179x385a9ce5 = h1Var.U;
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(1, c15179x385a9ce5 != null ? c15179x385a9ce5.getWidth() : 0);
        ofInt.addUpdateListener(new sc2.b1(h1Var));
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new sc2.c1(h1Var));
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofInt, ofFloat);
        animatorSet.addListener(new sc2.d1(h1Var));
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        animatorSet.setStartDelay(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.O5).mo141623x754a37bb()).r()).longValue() * 1000);
        animatorSet.start();
        h1Var.f487466y0 = animatorSet;
        return jz5.f0.f384359a;
    }
}
