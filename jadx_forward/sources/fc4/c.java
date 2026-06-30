package fc4;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f342631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f342633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f342634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f342635h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f342636i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f342637m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f342638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f342639o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f342640p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f342641q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ fc4.g f342642r;

    public c(float f17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15, int i17, int i18, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38, fc4.g gVar) {
        this.f342631d = f17;
        this.f342632e = viewOnLongClickListenerC18284x499dee15;
        this.f342633f = i17;
        this.f342634g = i18;
        this.f342635h = i19;
        this.f342636i = i27;
        this.f342637m = z17;
        this.f342638n = i28;
        this.f342639o = i29;
        this.f342640p = i37;
        this.f342641q = i38;
        this.f342642r = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = 1;
        float f18 = this.f342631d;
        float f19 = 1.0f - floatValue;
        float f27 = f17 - ((f17 - f18) * f19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = this.f342632e;
        viewOnLongClickListenerC18284x499dee15.setScaleX(f27);
        viewOnLongClickListenerC18284x499dee15.setScaleY(f27);
        float f28 = f17 - floatValue;
        viewOnLongClickListenerC18284x499dee15.setTranslationX((this.f342633f - this.f342634g) * f28);
        viewOnLongClickListenerC18284x499dee15.setTranslationY((this.f342635h - this.f342636i) * f28);
        if (this.f342637m) {
            int i17 = (int) (((((this.f342638n * f18) - this.f342639o) * f19) * (f17 / f27)) / 2);
            viewOnLongClickListenerC18284x499dee15.setClipBounds(new android.graphics.Rect(i17, 0, viewOnLongClickListenerC18284x499dee15.getWidth() - i17, viewOnLongClickListenerC18284x499dee15.getHeight()));
        } else {
            int i18 = (int) (((((this.f342640p * f18) - this.f342641q) * f19) * (f17 / f27)) / 2);
            viewOnLongClickListenerC18284x499dee15.setClipBounds(new android.graphics.Rect(0, i18, viewOnLongClickListenerC18284x499dee15.getWidth(), viewOnLongClickListenerC18284x499dee15.getHeight() - i18));
        }
        viewOnLongClickListenerC18284x499dee15.setVisibility(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f342642r.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((fc4.h) pf5.z.f435481a.a(activity).a(fc4.h.class)).O6(floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC$runEnterAnimation$1$onPreDraw$2");
    }
}
