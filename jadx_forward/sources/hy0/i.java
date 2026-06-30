package hy0;

/* loaded from: classes5.dex */
public final class i extends hy0.n {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f367374d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f367375e;

    /* renamed from: f, reason: collision with root package name */
    public final int f367376f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367377g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f367378h;

    /* renamed from: i, reason: collision with root package name */
    public final int f367379i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f367380j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367381k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f367382l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f367383m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f367384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.g b17 = jz5.h.b(new hy0.f(context));
        jz5.g b18 = jz5.h.b(new hy0.g(context));
        jz5.g b19 = jz5.h.b(new hy0.h(context));
        jz5.g b27 = jz5.h.b(new hy0.e(context));
        this.f367374d = new android.graphics.RectF();
        this.f367375e = new android.graphics.Path();
        this.f367376f = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8);
        this.f367377g = jz5.h.b(new hy0.a(context));
        int i17 = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 20);
        this.f367378h = new android.graphics.RectF(bx0.b.b(0, 0, i17, i17));
        this.f367379i = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 4);
        this.f367380j = jz5.h.b(new hy0.c(context));
        this.f367381k = jz5.h.b(new hy0.d(this));
        android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).floatValue(), ((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).floatValue()}, 0.0f);
        android.graphics.CornerPathEffect cornerPathEffect = new android.graphics.CornerPathEffect(b());
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b27).mo141623x754a37bb()).intValue());
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).floatValue());
        paint.setPathEffect(new android.graphics.ComposePathEffect(dashPathEffect, cornerPathEffect));
        this.f367382l = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setAlpha(7);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f367383m = paint2;
        this.f367384n = jz5.h.b(hy0.b.f367324d);
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Rect rect = context.f367582e;
        float f17 = rect.bottom + this.f367422b;
        android.graphics.RectF rectF = this.f367374d;
        rectF.set(rect.left, f17, rect.right + 9999, this.f367421a + f17);
        hy0.y2 y2Var = hy0.y2.f367573d;
        bx0.h hVar = context.f367580c;
        hVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f117811e;
        android.graphics.RectF rectF2 = (android.graphics.RectF) concurrentHashMap.get(y2Var);
        if (rectF2 != null) {
            rectF2.set(rectF);
        } else {
            concurrentHashMap.put(y2Var, rectF);
        }
        android.graphics.Path path = this.f367375e;
        path.reset();
        path.addRect(rectF, android.graphics.Path.Direction.CW);
        canvas.drawRect(rectF, this.f367383m);
        canvas.drawPath(path, this.f367382l);
        android.graphics.RectF rectF3 = this.f367378h;
        int centerX = context.f367581d.centerX();
        int i17 = rect.left;
        if (centerX < i17) {
            centerX = i17;
        }
        rectF3.offsetTo(centerX + this.f367376f, rectF.centerY() - (rectF3.height() / 2));
        canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f367377g).mo141623x754a37bb(), (android.graphics.Rect) null, rectF3, (android.graphics.Paint) null);
        canvas.drawText((java.lang.String) ((jz5.n) this.f367380j).mo141623x754a37bb(), rectF3.right + this.f367379i, rectF3.centerY() - ((android.graphics.Rect) ((jz5.n) this.f367381k).mo141623x754a37bb()).exactCenterY(), (android.text.TextPaint) ((jz5.n) this.f367384n).mo141623x754a37bb());
    }
}
