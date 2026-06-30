package tj3;

/* loaded from: classes8.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f501293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f501294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f501295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f501296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f501297h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f501298i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f501299m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f501300n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f501301o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f501302p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f501303q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f501304r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f501305s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f501306t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f501307u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f501308v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f501309w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f501310x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f501311y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f501312z;

    public m(tj3.p pVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47, float f48, float f49, float f57, float f58, float f59, float f66, int i17, int i18, float f67, float f68) {
        this.f501293d = pVar;
        this.f501294e = f17;
        this.f501295f = f18;
        this.f501296g = f19;
        this.f501297h = f27;
        this.f501298i = f28;
        this.f501299m = f29;
        this.f501300n = f37;
        this.f501301o = f38;
        this.f501302p = f39;
        this.f501303q = f47;
        this.f501304r = f48;
        this.f501305s = f49;
        this.f501306t = f57;
        this.f501307u = f58;
        this.f501308v = f59;
        this.f501309w = f66;
        this.f501310x = i17;
        this.f501311y = i18;
        this.f501312z = f67;
        this.A = f68;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        tj3.p pVar = this.f501293d;
        pVar.f501317c.setX((it.getAnimatedFraction() * this.f501294e) + this.f501295f);
        pVar.f501317c.setY((it.getAnimatedFraction() * this.f501296g) + this.f501297h);
        pVar.f501318d.setX((it.getAnimatedFraction() * this.f501298i) + this.f501299m);
        pVar.f501318d.setY((it.getAnimatedFraction() * this.f501300n) + this.f501301o);
        pVar.d().setX((it.getAnimatedFraction() * this.f501302p) + this.f501303q);
        pVar.d().setY((it.getAnimatedFraction() * this.f501304r) + this.f501305s);
        pVar.c().setX((it.getAnimatedFraction() * this.f501306t) + this.f501307u);
        pVar.c().setY((it.getAnimatedFraction() * this.f501308v) + this.f501309w);
        android.view.ViewGroup.LayoutParams layoutParams = pVar.c().getLayoutParams();
        layoutParams.width = (int) ((it.getAnimatedFraction() * this.f501310x) + this.f501311y);
        pVar.c().setLayoutParams(layoutParams);
        android.widget.RelativeLayout c17 = pVar.c();
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f501312z;
        float f18 = this.A;
        c17.setAlpha((animatedFraction * f17) + f18);
        pVar.d().setAlpha((it.getAnimatedFraction() * f17) + f18);
    }
}
