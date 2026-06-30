package hy0;

/* loaded from: classes5.dex */
public final class y0 extends iy0.h {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367553g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367554h;

    /* renamed from: i, reason: collision with root package name */
    public final hy0.t1 f367555i;

    /* renamed from: j, reason: collision with root package name */
    public final hy0.b3 f367556j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f367557k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f367558l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f367559m;

    /* renamed from: n, reason: collision with root package name */
    public final android.text.TextPaint f367560n;

    /* renamed from: o, reason: collision with root package name */
    public final android.text.TextPaint f367561o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f367562p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f367563q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f367564r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f367565s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367566t;

    /* renamed from: u, reason: collision with root package name */
    public long f367567u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f367568v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF f367569w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.RectF f367570x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f367571y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367553g = jz5.h.b(new hy0.o0(this));
        this.f367554h = jz5.h.b(new hy0.v0(this, context));
        this.f367555i = new hy0.t1(context);
        this.f367556j = new hy0.b3(context);
        this.f367557k = jz5.h.b(new hy0.q0(context));
        jz5.g b17 = jz5.h.b(new hy0.u0(context));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).intValue());
        this.f367558l = paint;
        jz5.g b18 = jz5.h.b(new hy0.w0(context));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(((java.lang.Number) ((jz5.n) b18).mo141623x754a37bb()).intValue());
        this.f367559m = paint2;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 11));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f367560n = textPaint;
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(-1);
        textPaint2.setTextSize((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8));
        textPaint2.setTextAlign(android.graphics.Paint.Align.LEFT);
        this.f367561o = textPaint2;
        jz5.g b19 = jz5.h.b(new hy0.r0(context));
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(((java.lang.Number) ((jz5.n) b19).mo141623x754a37bb()).intValue());
        this.f367562p = paint3;
        this.f367563q = jz5.h.b(new hy0.s0(context));
        this.f367564r = jz5.h.b(new hy0.x0(context));
        this.f367565s = jz5.h.b(new hy0.p0(context));
        this.f367566t = jz5.h.b(new hy0.t0(context));
        this.f367567u = java.lang.System.currentTimeMillis();
        this.f367568v = new android.graphics.RectF();
        this.f367569w = new android.graphics.RectF();
        this.f367570x = new android.graphics.RectF();
        this.f367571y = new android.graphics.Rect();
    }

    public static final float b(hy0.y0 y0Var) {
        return ((java.lang.Number) ((jz5.n) y0Var.f367557k).mo141623x754a37bb()).floatValue();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a narrationLaneYOffsetRange;
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int ordinal = this.f377250c.ordinal();
        bx0.h hVar = context.f367580c;
        if (ordinal == 11) {
            narrationLaneYOffsetRange = hVar.f117810d.f117790i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(narrationLaneYOffsetRange, "narrationLaneYOffsetRange");
        } else if (ordinal != 12) {
            narrationLaneYOffsetRange = com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a.c();
        } else {
            narrationLaneYOffsetRange = hVar.f117810d.f117791j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(narrationLaneYOffsetRange, "captionLaneYOffsetRange");
        }
        this.f377248a = narrationLaneYOffsetRange;
        if (!narrationLaneYOffsetRange.a()) {
            android.graphics.RectF rectF = this.f377249b;
            float f17 = hVar.f117810d.f117799r.f328577a;
            float f18 = (float) this.f377248a.f130042a;
            float e17 = hVar.e() - hVar.f117810d.f117799r.f328579c;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a = this.f377248a;
            rectF.set(f17, f18, e17, (float) (c4176xaeba704a.f130042a + c4176xaeba704a.f130043b));
            if (!rectF.isEmpty()) {
                jz5.g gVar = this.f377251d;
                canvas.drawRoundRect(rectF, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).floatValue(), (android.graphics.Paint) ((jz5.n) this.f377253f).mo141623x754a37bb());
            }
        }
        ex0.a0 a0Var = context.f367579b;
        a0Var.getClass();
        if (uu0.c.e().f512740b && a0Var.I.f338659d) {
            ((hy0.i0) ((jz5.n) this.f367553g).mo141623x754a37bb()).a(canvas, context);
        }
        ((hy0.n0) ((jz5.n) this.f367554h).mo141623x754a37bb()).a(canvas, context);
        ex0.v vVar = a0Var.f338630g;
        java.util.List list = vVar.f338712g;
        if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                vu0.u uVar = ((ex0.q) it.next()).f338698t;
                if (uVar == vu0.u.f521694f || uVar == vu0.u.f521695g) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            java.util.List list2 = vVar.f338712g;
            if (!(list2 instanceof java.util.Collection) || !((java.util.ArrayList) list2).isEmpty()) {
                java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                while (it6.hasNext()) {
                    if (((ex0.q) it6.next()).f338699u == vu0.w.f521700e) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (!z18) {
                this.f367567u = java.lang.System.currentTimeMillis();
                return;
            }
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(context.f367578a, false, 1, null);
    }
}
