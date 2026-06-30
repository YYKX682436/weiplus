package vb4;

/* loaded from: classes4.dex */
public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb4.f f516341e;

    public d(vb4.f fVar, boolean z17) {
        this.f516341e = fVar;
        this.f516340d = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        vb4.f fVar = this.f516341e;
        fVar.f516344n++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$008", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = fVar.f516327a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f - floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/animation/SnsAdNativeEnterAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (floatValue != 1.0f) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f516327a.getLayoutParams();
            layoutParams.leftMargin = (int) (fVar.f516330d * floatValue);
            layoutParams.topMargin = (int) (fVar.f516331e * floatValue);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) fVar.f516327a.getParent();
            if (this.f516340d) {
                layoutParams.rightMargin = (int) ((viewGroup.getWidth() - (fVar.f516337k - (fVar.f516335i * floatValue))) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) ((viewGroup.getHeight() - (fVar.f516336j - (fVar.f516334h * floatValue))) - layoutParams.topMargin);
            } else {
                layoutParams.rightMargin = (int) (((viewGroup.getWidth() * floatValue) - (fVar.f516332f * floatValue)) - layoutParams.leftMargin);
                layoutParams.bottomMargin = (int) (((viewGroup.getHeight() * floatValue) - (fVar.f516333g * floatValue)) - layoutParams.topMargin);
            }
            fVar.f516327a.setLayoutParams(layoutParams);
        }
        vb4.c cVar = fVar.f516329c;
        if (cVar != null) {
            cVar.b(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation$1");
    }
}
