package hy0;

/* loaded from: classes5.dex */
public final class x extends iy0.h {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367531g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367532h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f367533i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f367534j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367535k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f367536l;

    /* renamed from: m, reason: collision with root package name */
    public final android.text.TextPaint f367537m;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f367538n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367531g = jz5.h.b(new hy0.r(this, context));
        this.f367532h = jz5.h.b(new hy0.w(context));
        this.f367533i = jz5.h.b(new hy0.q(context));
        this.f367534j = jz5.h.b(new hy0.t(context));
        this.f367535k = jz5.h.b(new hy0.u(context));
        jz5.g b17 = jz5.h.b(new hy0.p(context));
        jz5.g b18 = jz5.h.b(new hy0.s(context));
        jz5.g b19 = jz5.h.b(new hy0.v(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).intValue());
        this.f367536l = paint;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).intValue());
        float f17 = 12;
        textPaint.setTextSize((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f367537m = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).intValue());
        textPaint2.setTextSize((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17));
        textPaint2.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f367538n = textPaint2;
    }

    public static final float b(hy0.x xVar) {
        return ((java.lang.Number) ((jz5.n) xVar.f367533i).mo141623x754a37bb()).floatValue();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((hy0.o) ((jz5.n) this.f367531g).mo141623x754a37bb()).a(canvas, context);
    }
}
