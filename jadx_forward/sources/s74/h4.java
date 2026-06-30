package s74;

/* loaded from: classes2.dex */
public final class h4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f485864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f485865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f485866f;

    public h4(double d17, double d18, android.view.View view) {
        this.f485864d = d17;
        this.f485865e = d18;
        this.f485866f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processAlphaAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = (float) (((1 - r3) * this.f485864d) + (((f17 != null ? f17.floatValue() : 0.0f) / 100.0f) * this.f485865e));
        if (floatValue >= 1.0f) {
            android.view.View view = this.f485866f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else if (floatValue <= 0.0f) {
            android.view.View view2 = this.f485866f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view3 = this.f485866f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewUtils$processAlphaAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processAlphaAnimation$1");
    }
}
