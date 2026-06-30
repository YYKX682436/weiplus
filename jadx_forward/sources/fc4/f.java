package fc4;

/* loaded from: classes3.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f342658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc4.g f342659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f342661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f342662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f342663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f342664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f342665n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f342666o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f342667p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f342668q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f342669r;

    public f(float f17, fc4.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15, int i17, int i18, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38) {
        this.f342658d = f17;
        this.f342659e = gVar;
        this.f342660f = viewOnLongClickListenerC18284x499dee15;
        this.f342661g = i17;
        this.f342662h = i18;
        this.f342663i = i19;
        this.f342664m = i27;
        this.f342665n = z17;
        this.f342666o = i28;
        this.f342667p = i29;
        this.f342668q = i37;
        this.f342669r = i38;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runExitAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPreScale$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        fc4.g gVar = this.f342659e;
        float f17 = gVar.f342682i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPreScale$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        float f18 = this.f342658d;
        float f19 = ((f17 - f18) * (1.0f - floatValue)) + f18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342660f;
        viewOnLongClickListenerC18284x499dee15.setScaleX(f19);
        viewOnLongClickListenerC18284x499dee15.setScaleY(f19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPreDeltaX$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        int i17 = gVar.f342686p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPreDeltaX$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        float f27 = i17;
        float f28 = 1;
        float f29 = f28 - floatValue;
        viewOnLongClickListenerC18284x499dee15.setTranslationX(((this.f342661g - this.f342662h) * floatValue) + (f27 * f29));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPreDeltaY$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        int i18 = gVar.f342687q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPreDeltaY$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        viewOnLongClickListenerC18284x499dee15.setTranslationY(((this.f342663i - this.f342664m) * floatValue) + (i18 * f29));
        if (this.f342665n) {
            int i19 = (int) (((((this.f342666o * f18) - this.f342667p) * floatValue) * (f28 / f19)) / 2);
            viewOnLongClickListenerC18284x499dee15.setClipBounds(new android.graphics.Rect(i19, 0, viewOnLongClickListenerC18284x499dee15.getWidth() - i19, viewOnLongClickListenerC18284x499dee15.getHeight()));
        } else {
            int i27 = (int) (((((this.f342668q * f18) - this.f342669r) * floatValue) * (f28 / f19)) / 2);
            viewOnLongClickListenerC18284x499dee15.setClipBounds(new android.graphics.Rect(0, i27, viewOnLongClickListenerC18284x499dee15.getWidth(), viewOnLongClickListenerC18284x499dee15.getHeight() - i27));
        }
        if (floatValue >= 0.95d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15.r(this.f342660f, false, false, false, 6, null);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = gVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((fc4.h) pf5.z.f435481a.a(activity).a(fc4.h.class)).O6(f29);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runExitAnimation$2");
    }
}
