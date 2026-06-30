package wb4;

/* loaded from: classes4.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.n f525947d;

    public k(wb4.n nVar) {
        this.f525947d = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue != 0.0f) {
            wb4.n nVar = this.f525947d;
            wb4.n.b(nVar).B.setScaleX(floatValue);
            wb4.n.b(nVar).B.setScaleY(floatValue);
            android.view.View view = wb4.n.b(nVar).B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/detail/CardAdDetailBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.detail.CardAdDetailBackAnimation$1");
    }
}
