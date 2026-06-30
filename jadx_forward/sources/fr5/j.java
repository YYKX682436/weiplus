package fr5;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f347500a;

    /* renamed from: b, reason: collision with root package name */
    public final float f347501b;

    /* renamed from: c, reason: collision with root package name */
    public final float f347502c;

    /* renamed from: d, reason: collision with root package name */
    public final int f347503d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Interpolator f347504e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f347505f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f347506g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f347507h;

    /* renamed from: i, reason: collision with root package name */
    public long f347508i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347509j;

    public j(android.view.View view, float f17, float f18, int i17, android.view.animation.Interpolator interpolator, yz5.l onUpdateValue, yz5.a onEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interpolator, "interpolator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUpdateValue, "onUpdateValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        this.f347500a = view;
        this.f347501b = f17;
        this.f347502c = f18;
        this.f347503d = i17;
        this.f347504e = interpolator;
        this.f347505f = onUpdateValue;
        this.f347506g = onEnd;
        this.f347507h = new fr5.i(this);
    }

    public final void a() {
        if (this.f347509j) {
            this.f347509j = false;
            this.f347500a.removeCallbacks(this.f347507h);
            this.f347506g.mo152xb9724478();
        }
    }
}
