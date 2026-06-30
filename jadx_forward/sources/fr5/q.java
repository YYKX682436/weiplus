package fr5;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f347543a;

    /* renamed from: b, reason: collision with root package name */
    public final er5.c f347544b;

    /* renamed from: c, reason: collision with root package name */
    public final er5.g f347545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f347546d;

    /* renamed from: e, reason: collision with root package name */
    public final int f347547e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f347548f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f347549g;

    /* renamed from: h, reason: collision with root package name */
    public final fr5.j f347550h;

    public q(android.view.View view, er5.c scrollBarSpec, er5.g zoomableEngine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollBarSpec, "scrollBarSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zoomableEngine, "zoomableEngine");
        this.f347543a = view;
        this.f347544b = scrollBarSpec;
        this.f347545c = zoomableEngine;
        this.f347546d = 255;
        this.f347547e = a06.d.b(scrollBarSpec.f337764b / 2);
        this.f347549g = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(scrollBarSpec.f337763a);
        paint.setAlpha(255);
        this.f347548f = paint;
        this.f347550h = new fr5.j(view, 255, 0.0f, 300, new android.view.animation.DecelerateInterpolator(), new fr5.n(this), fr5.o.f347537d);
        view.addOnAttachStateChangeListener(new fr5.p(this));
    }
}
