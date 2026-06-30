package cn2;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f125031a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f125032b;

    /* renamed from: c, reason: collision with root package name */
    public final float f125033c;

    /* renamed from: d, reason: collision with root package name */
    public final double f125034d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125035e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f125036f;

    /* renamed from: g, reason: collision with root package name */
    public float f125037g;

    /* renamed from: h, reason: collision with root package name */
    public float f125038h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f125039i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f125040j;

    /* renamed from: k, reason: collision with root package name */
    public float f125041k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f125042l;

    public e1(android.view.View container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f125031a = container;
        this.f125032b = "FlashLightProxy";
        this.f125033c = 1.0f;
        this.f125034d = 1.0f * 0.95d;
        this.f125039i = jz5.h.b(cn2.d1.f125028d);
        this.f125040j = jz5.h.b(cn2.c1.f125021d);
        gm2.c1 c1Var = gm2.c1.f354853a;
        this.f125041k = ((java.lang.Number) ((jz5.n) gm2.c1.f354872t).mo141623x754a37bb()).intValue();
        this.f125042l = jz5.h.b(new cn2.b1(this));
    }

    public final android.animation.ValueAnimator a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f125042l).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.animation.ValueAnimator) mo141623x754a37bb;
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f125032b, "stop source:" + i17 + '!');
        this.f125035e = false;
        if (a().isRunning()) {
            a().cancel();
        }
    }
}
