package s74;

/* loaded from: classes2.dex */
public final class n4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f485975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f485976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f485977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f485978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f485979h;

    public n4(android.view.View view, double d17, double d18, double d19, double d27) {
        this.f485975d = view;
        this.f485976e = d17;
        this.f485977f = d18;
        this.f485978g = d19;
        this.f485979h = d27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processScaleAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = (f17 != null ? f17.floatValue() : 0.0f) / 100.0f;
        double d17 = 1 - floatValue;
        double d18 = floatValue;
        float f18 = (float) ((this.f485976e * d17) + (this.f485977f * d18));
        android.view.View view = this.f485975d;
        view.setScaleX(f18);
        view.setScaleY((float) ((d17 * this.f485978g) + (d18 * this.f485979h)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processScaleAnimation$1");
    }
}
