package hy0;

/* loaded from: classes5.dex */
public final class p2 implements iy0.c {
    public final jz5.g A;
    public final android.graphics.Paint B;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f367456a;

    /* renamed from: b, reason: collision with root package name */
    public float f367457b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f367458c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f367459d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f367460e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f367461f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.RectF f367462g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367463h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f367464i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f367465j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367466k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f367467l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f367468m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f367469n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f367470o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f367471p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f367472q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f367473r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f367474s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367475t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Path f367476u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f367477v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f367478w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Paint f367479x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f367480y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Paint f367481z;

    public p2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367456a = new android.graphics.RectF();
        this.f367458c = new android.graphics.RectF();
        this.f367459d = new android.graphics.RectF();
        this.f367460e = new android.graphics.RectF();
        this.f367461f = new android.graphics.RectF();
        this.f367462g = new android.graphics.RectF();
        this.f367463h = jz5.h.b(new hy0.g2(context));
        this.f367464i = jz5.h.b(new hy0.a2(context));
        this.f367465j = jz5.h.b(new hy0.v1(context));
        this.f367466k = jz5.h.b(new hy0.w1(context));
        this.f367467l = jz5.h.b(new hy0.x1(context));
        this.f367468m = jz5.h.b(new hy0.y1(context));
        this.f367469n = jz5.h.b(new hy0.z1(context));
        this.f367470o = jz5.h.b(new hy0.o2(context));
        this.f367471p = jz5.h.b(new hy0.n2(context));
        this.f367472q = jz5.h.b(new hy0.m2(context));
        this.f367473r = jz5.h.b(new hy0.e2(context));
        jz5.g b17 = jz5.h.b(new hy0.c2(context));
        this.f367474s = jz5.h.b(new hy0.b2(context));
        this.f367475t = jz5.h.b(new hy0.d2(context));
        this.f367476u = new android.graphics.Path();
        this.f367477v = jz5.h.b(new hy0.l2(context));
        jz5.g b18 = jz5.h.b(new hy0.k2(context));
        this.f367478w = jz5.h.b(new hy0.j2(context));
        jz5.g b19 = jz5.h.b(new hy0.h2(context));
        jz5.g b27 = jz5.h.b(new hy0.i2(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).intValue());
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f367479x = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(((java.lang.Number) ((jz5.n) b27).mo141623x754a37bb()).intValue());
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).floatValue());
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367480y = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint3.setStrokeWidth(e());
        this.f367481z = paint3;
        this.A = jz5.h.b(new hy0.f2(this));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).intValue());
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        this.B = paint4;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ex0.a0 a0Var = context.f367579b;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f338630g.f338710e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((ex0.r) obj).f338701b;
            ex0.r n17 = a0Var.n();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f78, n17 != null ? n17.f338701b : null)) {
                break;
            }
        }
        ex0.c cVar = obj instanceof ex0.c ? (ex0.c) obj : null;
        if (cVar != null) {
            ug.m mVar = ug.m.Transition;
            ug.m mVar2 = cVar.f338702c;
            if (mVar2 == mVar) {
                return;
            }
            bx0.h hVar = context.f367580c;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = cVar.f338701b;
            android.graphics.Rect c17 = bx0.h.c(hVar, c3971x241f782, false, 2, null);
            java.util.Objects.toString(c17);
            android.graphics.RectF rectF = this.f367456a;
            rectF.set(c17);
            if (c(rectF, context.f367581d)) {
                if (!a0Var.E(c3971x241f782)) {
                    rectF.right -= this.f367457b / 2;
                }
                if (!a0Var.D(c3971x241f782)) {
                    rectF.left += this.f367457b / 2;
                }
                ax0.e r17 = a0Var.r();
                ax0.e eVar = ax0.e.f96508d;
                android.graphics.Paint paint = this.f367481z;
                if (r17 == eVar) {
                    canvas.drawRoundRect(rectF, d(), d(), paint);
                    return;
                }
                if (kz5.z.G(new ax0.e[]{ax0.e.f96509e, ax0.e.f96511g, ax0.e.f96510f}, a0Var.r())) {
                    android.graphics.RectF rectF2 = this.f367458c;
                    float f17 = rectF.left;
                    jz5.g gVar = this.f367477v;
                    float f18 = 2;
                    rectF2.set(f17 - ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), rectF.top - (e() / f18), rectF.left, rectF.bottom + (e() / f18));
                    android.graphics.RectF rectF3 = this.f367459d;
                    rectF3.set(rectF.right, rectF.top - (e() / f18), rectF.right + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), rectF.bottom + (e() / f18));
                    float f19 = rectF.left;
                    float f27 = rectF.top;
                    canvas.drawLine(f19, f27, rectF.right, f27, paint);
                    float f28 = rectF.left;
                    float f29 = rectF.bottom;
                    canvas.drawLine(f28, f29, rectF.right, f29, paint);
                    android.graphics.Path path = this.f367476u;
                    path.reset();
                    path.moveTo(rectF2.left + d(), rectF2.top);
                    path.lineTo(rectF2.right, rectF2.top);
                    path.lineTo(rectF2.right, rectF2.bottom);
                    path.lineTo(rectF2.left + d(), rectF2.bottom);
                    float f37 = rectF2.left;
                    float f38 = rectF2.bottom;
                    path.quadTo(f37, f38, f37, f38 - d());
                    path.lineTo(rectF2.left, rectF2.top + d());
                    float f39 = rectF2.left;
                    path.quadTo(f39, rectF2.top, d() + f39, rectF2.top);
                    path.close();
                    android.graphics.Paint paint2 = this.f367479x;
                    canvas.drawPath(path, paint2);
                    float centerX = rectF2.centerX();
                    float centerY = rectF2.centerY();
                    float f47 = centerY - (f() / f18);
                    float f48 = centerY + (f() / f18);
                    android.graphics.Paint paint3 = this.f367480y;
                    canvas.drawLine(centerX, f47, centerX, f48, paint3);
                    path.reset();
                    path.moveTo(rectF3.left, rectF3.top);
                    path.lineTo(rectF3.left, rectF3.bottom);
                    path.lineTo(rectF3.right - d(), rectF3.bottom);
                    float f49 = rectF3.right;
                    float f57 = rectF3.bottom;
                    path.quadTo(f49, f57, f49, f57 - d());
                    path.lineTo(rectF3.right, rectF3.top + d());
                    float f58 = rectF3.right;
                    path.quadTo(f58, rectF3.top, f58 - d(), rectF3.top);
                    path.lineTo(rectF3.left, rectF3.top);
                    path.close();
                    canvas.drawPath(path, paint2);
                    float centerX2 = rectF3.centerX();
                    float centerY2 = rectF3.centerY();
                    canvas.drawLine(centerX2, centerY2 - (f() / f18), centerX2, centerY2 + (f() / f18), paint3);
                    java.lang.String format = java.lang.String.format("%.1fS", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(cVar.j().m33988x124aa384())}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    android.graphics.Rect rect = new android.graphics.Rect();
                    jz5.g gVar2 = this.A;
                    ((android.text.TextPaint) ((jz5.n) gVar2).mo141623x754a37bb()).getTextBounds(format, 0, format.length(), rect);
                    float f59 = rectF.left;
                    jz5.g gVar3 = this.f367471p;
                    float floatValue = f59 + ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).floatValue();
                    float floatValue2 = rectF.top + ((java.lang.Number) ((jz5.n) this.f367470o).mo141623x754a37bb()).floatValue();
                    android.graphics.RectF rectF4 = this.f367460e;
                    jz5.g gVar4 = this.f367473r;
                    rectF4.set(floatValue, floatValue2, rect.width() + floatValue + (((java.lang.Number) ((jz5.n) gVar4).mo141623x754a37bb()).floatValue() * f18), ((java.lang.Number) ((jz5.n) this.f367474s).mo141623x754a37bb()).floatValue() + floatValue2);
                    float d17 = d();
                    float d18 = d();
                    android.graphics.Paint paint4 = this.B;
                    canvas.drawRoundRect(rectF4, d17, d18, paint4);
                    canvas.drawText(format, rectF4.left + ((java.lang.Number) ((jz5.n) gVar4).mo141623x754a37bb()).floatValue(), rectF4.top + rect.height() + ((rectF4.height() - rect.height()) / f18), (android.text.TextPaint) ((jz5.n) gVar2).mo141623x754a37bb());
                    if (mVar2 != ug.m.ImageClip) {
                        android.graphics.RectF rectF5 = this.f367461f;
                        float floatValue3 = rectF.left + ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).floatValue();
                        float f66 = rectF4.bottom;
                        jz5.g gVar5 = this.f367472q;
                        rectF5.set(floatValue3, f66 + ((java.lang.Number) ((jz5.n) gVar5).mo141623x754a37bb()).floatValue(), rectF.left + ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).floatValue() + ((java.lang.Number) ((jz5.n) this.f367467l).mo141623x754a37bb()).floatValue(), rectF4.bottom + ((java.lang.Number) ((jz5.n) gVar5).mo141623x754a37bb()).floatValue() + ((java.lang.Number) ((jz5.n) this.f367466k).mo141623x754a37bb()).floatValue());
                        android.graphics.RectF rectF6 = this.f367462g;
                        rectF6.set(rectF5.left + ((rectF5.width() - b()) / f18), rectF5.top + ((rectF5.height() - b()) / f18), rectF5.right - ((rectF5.width() - b()) / f18), rectF5.bottom - ((rectF5.height() - b()) / f18));
                        canvas.drawRoundRect(rectF5, d(), d(), paint4);
                        if (cVar.D()) {
                            canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f367464i).mo141623x754a37bb(), (android.graphics.Rect) null, rectF6, (android.graphics.Paint) null);
                        } else {
                            canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) this.f367463h).mo141623x754a37bb(), (android.graphics.Rect) null, rectF6, (android.graphics.Paint) null);
                        }
                    }
                }
            }
        }
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f367465j).mo141623x754a37bb()).floatValue();
    }

    public final float d() {
        return ((java.lang.Number) ((jz5.n) this.f367468m).mo141623x754a37bb()).floatValue();
    }

    public final float e() {
        return ((java.lang.Number) this.f367469n.mo141623x754a37bb()).floatValue();
    }

    public final float f() {
        return ((java.lang.Number) ((jz5.n) this.f367478w).mo141623x754a37bb()).floatValue();
    }
}
