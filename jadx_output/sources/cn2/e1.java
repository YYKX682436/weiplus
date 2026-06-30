package cn2;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f43498a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f43499b;

    /* renamed from: c, reason: collision with root package name */
    public final float f43500c;

    /* renamed from: d, reason: collision with root package name */
    public final double f43501d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43502e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f43503f;

    /* renamed from: g, reason: collision with root package name */
    public float f43504g;

    /* renamed from: h, reason: collision with root package name */
    public float f43505h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f43506i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f43507j;

    /* renamed from: k, reason: collision with root package name */
    public float f43508k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f43509l;

    public e1(android.view.View container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f43498a = container;
        this.f43499b = "FlashLightProxy";
        this.f43500c = 1.0f;
        this.f43501d = 1.0f * 0.95d;
        this.f43506i = jz5.h.b(cn2.d1.f43495d);
        this.f43507j = jz5.h.b(cn2.c1.f43488d);
        gm2.c1 c1Var = gm2.c1.f273320a;
        this.f43508k = ((java.lang.Number) ((jz5.n) gm2.c1.f273339t).getValue()).intValue();
        this.f43509l = jz5.h.b(new cn2.b1(this));
    }

    public final android.animation.ValueAnimator a() {
        java.lang.Object value = ((jz5.n) this.f43509l).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.animation.ValueAnimator) value;
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i(this.f43499b, "stop source:" + i17 + '!');
        this.f43502e = false;
        if (a().isRunning()) {
            a().cancel();
        }
    }
}
