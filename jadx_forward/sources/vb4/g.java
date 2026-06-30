package vb4;

/* loaded from: classes4.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.i f516348e;

    public g(vb4.i iVar, boolean z17) {
        this.f516348e = iVar;
        this.f516347d = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        vb4.i iVar = this.f516348e;
        boolean z17 = this.f516347d;
        if (z17) {
            android.view.View view = iVar.f516327a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f - (0.2f * floatValue)));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = iVar.f516327a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f - floatValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeExitAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (floatValue != 0.0f) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) iVar.f516327a.getLayoutParams();
            layoutParams.leftMargin = (int) (iVar.f516330d * floatValue);
            layoutParams.topMargin = (int) (iVar.f516331e * floatValue);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) iVar.f516327a.getParent();
            if (z17) {
                layoutParams.rightMargin = (int) ((viewGroup.getWidth() - (iVar.f516337k - (iVar.f516335i * floatValue))) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) ((viewGroup.getHeight() - (iVar.f516336j - (iVar.f516334h * floatValue))) - layoutParams.topMargin);
            } else {
                layoutParams.rightMargin = (int) (((viewGroup.getWidth() * floatValue) - (iVar.f516332f * floatValue)) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) (((viewGroup.getHeight() * floatValue) - (iVar.f516333g * floatValue)) - layoutParams.topMargin);
            }
            iVar.f516327a.setLayoutParams(layoutParams);
        }
        vb4.c cVar = iVar.f516329c;
        if (cVar != null) {
            cVar.b(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeExitAnimation$1");
    }
}
