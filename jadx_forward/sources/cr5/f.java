package cr5;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f303559a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f303560b;

    /* renamed from: c, reason: collision with root package name */
    public final er5.g f303561c;

    /* renamed from: d, reason: collision with root package name */
    public final br5.e f303562d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f303563e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f303564f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f303565g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f303566h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f303567i;

    public f(zq5.k logger, android.view.View view, er5.g zoomableEngine, br5.e subsamplingEngine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logger, "logger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zoomableEngine, "zoomableEngine");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subsamplingEngine, "subsamplingEngine");
        this.f303559a = logger;
        this.f303560b = view;
        this.f303561c = zoomableEngine;
        this.f303562d = subsamplingEngine;
        this.f303563e = new android.graphics.Rect();
        this.f303564f = new android.graphics.Rect();
        this.f303565g = new android.graphics.Matrix();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
        this.f303566h = new android.graphics.Paint();
        this.f303567i = jz5.h.b(new cr5.c(this));
        p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new cr5.b(this, null), 3, null);
    }

    public static final boolean a(cr5.f fVar, android.graphics.Canvas canvas, yq5.r rVar, boolean z17) {
        fVar.getClass();
        yq5.p pVar = rVar.f546154d;
        if (pVar == null) {
            return false;
        }
        if (!(!((yq5.a) pVar).f546121a.isRecycled())) {
            pVar = null;
        }
        if (pVar == null) {
            return false;
        }
        android.graphics.Bitmap bitmap = ((yq5.a) pVar).f546121a;
        android.graphics.Bitmap bitmap2 = bitmap.isRecycled() ^ true ? bitmap : null;
        if (bitmap2 == null) {
            return false;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        android.graphics.Rect rect = fVar.f303563e;
        rect.set(0, 0, width, height);
        zq5.e eVar = rVar.f546152b;
        int i17 = eVar.f556594a;
        int i18 = eVar.f556596c;
        int i19 = eVar.f556597d;
        android.graphics.Rect rect2 = fVar.f303564f;
        rect2.set(i17, eVar.f556595b, i18, i19);
        android.graphics.Paint paint = fVar.f303566h;
        paint.setAlpha(rVar.f546157g);
        canvas.drawBitmap(bitmap2, rect, rect2, paint);
        if (z17) {
            int i27 = rVar.f546155e;
            int i28 = i27 == 2 ? rVar.f546156f == 1 ? -16711936 : -16724737 : i27 == 1 ? -256 : -65536;
            jz5.g gVar = fVar.f303567i;
            ((android.graphics.Paint) ((jz5.n) gVar).mo141623x754a37bb()).setColor(i28);
            canvas.drawRect(rect2, (android.graphics.Paint) ((jz5.n) gVar).mo141623x754a37bb());
        }
        return true;
    }
}
