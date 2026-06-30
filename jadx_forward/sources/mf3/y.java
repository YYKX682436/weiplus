package mf3;

/* loaded from: classes3.dex */
public final class y implements mg3.e, mf3.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f407666d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.n f407667e;

    /* renamed from: f, reason: collision with root package name */
    public final lf3.j f407668f;

    /* renamed from: g, reason: collision with root package name */
    public float f407669g;

    /* renamed from: h, reason: collision with root package name */
    public int f407670h;

    /* renamed from: i, reason: collision with root package name */
    public int f407671i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f407672m;

    public y(android.view.View content, mf3.n layer, lf3.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layer, "layer");
        this.f407666d = content;
        this.f407667e = layer;
        this.f407668f = jVar;
        this.f407669g = 1.0f;
    }

    @Override // mg3.e
    public void a(float f17, float f18) {
        int i17;
        int i18 = this.f407671i;
        android.view.View view = this.f407666d;
        if (i18 == 0 || this.f407670h == 0) {
            this.f407671i = view.getHeight();
            this.f407670h = view.getWidth();
        }
        if (this.f407670h == 0 || (i17 = this.f407671i) == 0) {
            return;
        }
        float f19 = 1;
        float f27 = f19 - (f18 / i17);
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        view.setPivotX(r0 / 2);
        view.setPivotY(this.f407671i / 2);
        view.setScaleX(f27);
        view.setScaleY(f27);
        view.setTranslationX(f17);
        view.setTranslationY(f18);
        lf3.j jVar = this.f407668f;
        if (jVar != null) {
            jVar.d3(f27);
        }
        this.f407669g = f27;
        this.f407667e.d(f19 - f27);
        if (this.f407672m) {
            if (f17 == 0.0f) {
                if (f18 == 0.0f) {
                    this.f407672m = false;
                }
            }
        }
        if (this.f407672m) {
            return;
        }
        if (java.lang.Math.abs(f17) > 10.0d || java.lang.Math.abs(f18) > 10.0d) {
            this.f407672m = true;
        }
    }

    @Override // mg3.e
    public void d() {
        float f17 = this.f407669g;
        android.view.View view = this.f407666d;
        if (f17 < 1.0f) {
            lf3.j jVar = this.f407668f;
            if (jVar != null) {
                jVar.E2(view);
                return;
            }
            return;
        }
        view.setPivotX(this.f407670h / 2);
        view.setPivotY(this.f407671i / 2);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // mg3.e
    public boolean f(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return this.f407667e.n(event);
    }

    @Override // mg3.e
    public boolean g(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // mf3.o
    public void j() {
        lf3.j jVar = this.f407668f;
        if (jVar != null) {
            jVar.E2(this.f407666d);
        }
    }
}
