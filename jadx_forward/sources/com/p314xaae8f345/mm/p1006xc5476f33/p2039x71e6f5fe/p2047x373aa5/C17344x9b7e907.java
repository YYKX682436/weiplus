package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/scanner/view/RoundedCornerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scan-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.view.RoundedCornerView */
/* loaded from: classes4.dex */
public final class C17344x9b7e907 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f241413d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f241414e;

    /* renamed from: f, reason: collision with root package name */
    public final float f241415f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f241416g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f241417h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f241418i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f241419m;

    /* renamed from: n, reason: collision with root package name */
    public final float f241420n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17344x9b7e907(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f241413d = paint;
        this.f241414e = new android.graphics.Path();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, qy3.a.f449316a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f241415f = obtainStyledAttributes.getDimension(1, 0.0f);
        this.f241416g = obtainStyledAttributes.getBoolean(4, false);
        this.f241417h = obtainStyledAttributes.getBoolean(5, false);
        this.f241418i = obtainStyledAttributes.getBoolean(2, false);
        this.f241419m = obtainStyledAttributes.getBoolean(3, false);
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f241420n = dimension;
        obtainStyledAttributes.recycle();
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(dimension);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Path path = this.f241414e;
        path.reset();
        boolean z17 = this.f241416g;
        float f17 = this.f241415f;
        float f18 = this.f241420n;
        if (z17) {
            path.moveTo(f18 / 2.0f, getHeight() / 2.0f);
            path.lineTo(f18 / 2.0f, f17);
            float f19 = 2;
            path.arcTo(f18 / 2.0f, f18 / 2.0f, f17 * f19, f17 * f19, -180.0f, 90.0f, false);
            path.lineTo(getWidth() / 2.0f, f18 / 2.0f);
        }
        if (this.f241417h) {
            path.moveTo(getWidth() / 2.0f, f18 / 2.0f);
            path.lineTo(getWidth() - f17, f18 / 2.0f);
            float f27 = 2;
            path.arcTo(getWidth() - (f17 * f27), f18 / 2.0f, getWidth() - (f18 / 2.0f), f17 * f27, -90.0f, 90.0f, false);
            path.lineTo(getWidth() - (f18 / 2.0f), getHeight() / 2.0f);
        }
        if (this.f241419m) {
            path.moveTo(getWidth() - (f18 / 2.0f), getHeight() / 2.0f);
            path.lineTo(getWidth() - (f18 / 2.0f), getHeight() - f17);
            float f28 = 2;
            path.arcTo(getWidth() - (f17 * f28), getHeight() - (f28 * f17), getWidth() - (f18 / 2.0f), getHeight() - (f18 / 2.0f), 0.0f, 90.0f, false);
            path.lineTo(getWidth() / 2.0f, getHeight() - (f18 / 2.0f));
        }
        if (this.f241418i) {
            path.moveTo(getWidth() / 2.0f, getHeight() - (f18 / 2.0f));
            path.lineTo(f17, getHeight() - (f18 / 2.0f));
            float f29 = 2;
            path.arcTo(f18 / 2.0f, getHeight() - (f17 * f29), f17 * f29, getHeight() - (f18 / 2.0f), 90.0f, 90.0f, false);
            path.lineTo(f18 / 2.0f, getHeight() / 2.0f);
        }
        canvas.drawPath(path, this.f241413d);
    }
}
