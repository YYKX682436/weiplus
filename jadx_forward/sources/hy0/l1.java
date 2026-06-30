package hy0;

/* loaded from: classes5.dex */
public final class l1 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f367399a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f367400b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f367401c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f367402d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f367403e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f367404f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367405g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f367406h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f367407i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f367408j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367409k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f367410l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f367411m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f367412n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f367413o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f367414p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f367415q;

    public l1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367400b = new android.graphics.RectF();
        this.f367401c = new android.graphics.RectF();
        this.f367402d = new android.graphics.RectF();
        this.f367403e = new android.graphics.RectF();
        this.f367404f = jz5.h.b(new hy0.z0(context));
        this.f367405g = jz5.h.b(new hy0.a1(context));
        this.f367406h = new android.graphics.Path();
        this.f367407i = jz5.h.b(new hy0.h1(context));
        jz5.g b17 = jz5.h.b(new hy0.g1(context));
        jz5.g b18 = jz5.h.b(new hy0.e1(context));
        this.f367408j = jz5.h.b(new hy0.d1(context));
        this.f367409k = jz5.h.b(new hy0.j1(context));
        jz5.g b19 = jz5.h.b(new hy0.b1(context));
        jz5.g b27 = jz5.h.b(new hy0.f1(context));
        jz5.g b28 = jz5.h.b(new hy0.c1(context));
        jz5.g b29 = jz5.h.b(new hy0.i1(context));
        jz5.g b37 = jz5.h.b(new hy0.k1(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).intValue());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f367410l = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b27).mo141623x754a37bb()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).floatValue());
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        this.f367411m = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(((java.lang.Number) ((jz5.n) b28).mo141623x754a37bb()).intValue());
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeWidth(((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).floatValue());
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367412n = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(((java.lang.Number) ((jz5.n) b37).mo141623x754a37bb()).intValue());
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.f367413o = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(((java.lang.Number) ((jz5.n) b29).mo141623x754a37bb()).intValue());
        paint5.setStyle(android.graphics.Paint.Style.STROKE);
        paint5.setStrokeWidth(f());
        this.f367414p = paint5;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        jv0.h state;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367399a;
        if (c3971x241f78 == null) {
            return;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = context.f367578a;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 c10939x5805e934 = abstractC11003x25486817 instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p891x89444d94.C10939x5805e934) abstractC11003x25486817 : null;
        if (c10939x5805e934 == null || (state = c10939x5805e934.getState()) == null) {
            return;
        }
        boolean z17 = this.f367415q;
        android.graphics.RectF rectF = this.f367401c;
        android.graphics.RectF rectF2 = this.f367400b;
        if (!z17) {
            bx0.h hVar = context.f367580c;
            rectF2.set(hVar.b(c3971x241f78, true));
            rectF.set(hVar.d(c3971x241f78, true));
        }
        canvas.drawRect(rectF2, this.f367413o);
        int ordinal = state.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            float f17 = 2;
            canvas.drawRect((f() / f17) + rectF2.left, (f() / f17) + rectF2.top, rectF2.right - (f() / f17), rectF2.bottom - (f() / f17), this.f367414p);
            return;
        }
        float f18 = rectF2.left;
        float f19 = rectF2.top;
        float f27 = rectF.bottom;
        android.graphics.Paint paint = this.f367411m;
        canvas.drawLine(f18, f19, f18, f27, paint);
        float f28 = rectF2.right;
        canvas.drawLine(f28, rectF2.top, f28, rectF.bottom, paint);
        android.graphics.RectF rectF3 = this.f367402d;
        float f29 = rectF.left;
        jz5.g gVar = this.f367407i;
        float f37 = 2;
        rectF3.set(f29 - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), rectF.top - (d() / f37), rectF.left, rectF.bottom + (d() / f37));
        android.graphics.Path path = this.f367406h;
        path.reset();
        path.moveTo(rectF3.left + b(), rectF3.top);
        path.lineTo(rectF3.right, rectF3.top);
        path.lineTo(rectF3.right, rectF3.bottom);
        path.lineTo(rectF3.left + b(), rectF3.bottom);
        float f38 = rectF3.left;
        float f39 = rectF3.bottom;
        path.quadTo(f38, f39, f38, f39 - b());
        path.lineTo(rectF3.left, rectF3.top + b());
        float f47 = rectF3.left;
        path.quadTo(f47, rectF3.top, b() + f47, rectF3.top);
        path.close();
        android.graphics.Paint paint2 = this.f367410l;
        canvas.drawPath(path, paint2);
        float centerX = rectF3.centerX();
        float centerY = rectF3.centerY();
        float e17 = centerY - (e() / f37);
        float e18 = centerY + (e() / f37);
        android.graphics.Paint paint3 = this.f367412n;
        canvas.drawLine(centerX, e17, centerX, e18, paint3);
        android.graphics.RectF rectF4 = this.f367403e;
        rectF4.set(rectF.right, rectF.top - (d() / f37), rectF.right + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), rectF.bottom + (d() / f37));
        path.reset();
        path.moveTo(rectF4.left, rectF4.top);
        path.lineTo(rectF4.left, rectF4.bottom);
        path.lineTo(rectF4.right - b(), rectF4.bottom);
        float f48 = rectF4.right;
        float f49 = rectF4.bottom;
        path.quadTo(f48, f49, f48, f49 - b());
        path.lineTo(rectF4.right, rectF4.top + b());
        float f57 = rectF4.right;
        path.quadTo(f57, rectF4.top, f57 - b(), rectF4.top);
        path.lineTo(rectF4.left, rectF4.top);
        path.close();
        canvas.drawPath(path, paint2);
        float centerX2 = rectF4.centerX();
        float centerY2 = rectF4.centerY();
        canvas.drawLine(centerX2, centerY2 - (e() / f37), centerX2, centerY2 + (e() / f37), paint3);
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f367404f).mo141623x754a37bb()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) ((jz5.n) this.f367405g).mo141623x754a37bb()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) ((jz5.n) this.f367408j).mo141623x754a37bb()).floatValue();
    }

    public final float f() {
        return ((java.lang.Number) this.f367409k.mo141623x754a37bb()).floatValue();
    }
}
