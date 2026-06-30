package s74;

/* loaded from: classes4.dex */
public final class i4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f485880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f485881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f485882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f485883g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f485884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f485885i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f485886m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f485887n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f485888o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f485889p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f485890q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f485891r;

    public i4(android.view.View view, int i17, int i18, java.util.Map map, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f485880d = view;
        this.f485881e = i17;
        this.f485882f = i18;
        this.f485883g = map;
        this.f485884h = i19;
        this.f485885i = i27;
        this.f485886m = i28;
        this.f485887n = i29;
        this.f485888o = i37;
        this.f485889p = i38;
        this.f485890q = i39;
        this.f485891r = i47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        s74.q4 q4Var = s74.q4.f486046a;
        android.view.View view = this.f485880d;
        if (!q4Var.c(view)) {
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(this.f485881e);
            }
            view.setBackground(new android.graphics.drawable.ColorDrawable(this.f485882f));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Utils", " currentView.getColorEnable  false ~");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
            return;
        }
        boolean z17 = view instanceof android.widget.TextView;
        java.util.Map map = this.f485883g;
        if (z17 && (map.containsKey("color") || map.containsKey("hover-color"))) {
            float f18 = floatValue / 100.0f;
            ((android.widget.TextView) view).setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{e3.b.c(this.f485886m, this.f485887n, f18), e3.b.c(this.f485884h, this.f485885i, f18)}));
        }
        if (map.containsKey("background-color") || map.containsKey("hover-background-color")) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            float f19 = floatValue / 100.0f;
            int c17 = e3.b.c(this.f485888o, this.f485889p, f19);
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(e3.b.c(this.f485890q, this.f485891r, f19));
            android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(c17);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, colorDrawable);
            stateListDrawable.addState(new int[0], colorDrawable2);
            if (view != null) {
                view.setBackground(stateListDrawable);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
    }
}
