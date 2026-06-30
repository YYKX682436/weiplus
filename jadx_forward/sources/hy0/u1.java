package hy0;

/* loaded from: classes5.dex */
public final class u1 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f367511a;

    /* renamed from: b, reason: collision with root package name */
    public final float f367512b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f367513c;

    /* renamed from: d, reason: collision with root package name */
    public final float f367514d;

    /* renamed from: e, reason: collision with root package name */
    public final float f367515e;

    /* renamed from: f, reason: collision with root package name */
    public final float f367516f;

    /* renamed from: g, reason: collision with root package name */
    public final int f367517g;

    /* renamed from: h, reason: collision with root package name */
    public final int f367518h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f367519i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f367520j;

    public u1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367512b = 0.1f;
        this.f367513c = new java.util.LinkedHashSet();
        float dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.al7);
        this.f367514d = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.alg) / 2;
        float dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.al8);
        this.f367515e = dimensionPixelSize2;
        this.f367516f = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562097al3);
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.afp, null);
        this.f367517g = color;
        this.f367518h = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.afo, null);
        int color2 = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.afq, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f367519i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(color2);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(dimensionPixelSize2);
        paint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        this.f367520j = paint2;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = this.f367511a;
        if (c3971x241f78 == null) {
            return;
        }
        ex0.r K = context.f367579b.K(c3971x241f78);
        ex0.f fVar = K instanceof ex0.f ? (ex0.f) K : null;
        if (fVar == null) {
            return;
        }
        bx0.h hVar = context.f367580c;
        boolean z17 = false;
        android.graphics.Rect b17 = hVar.b(c3971x241f78, false);
        java.util.Set set = this.f367513c;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            float m34345x1629663d = (float) hVar.f117810d.f117800s.m34345x1629663d((com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) it.next());
            android.graphics.Paint paint = this.f367519i;
            paint.setColor(this.f367517g);
            float f17 = hVar.f117810d.f117799r.f328578b;
            float f18 = this.f367516f;
            canvas.drawPoint(m34345x1629663d, f17 - f18, paint);
            paint.setColor(this.f367518h);
            ax0.a aVar = fVar.f338667j;
            ax0.a aVar2 = ax0.a.f96494e;
            float f19 = this.f367512b;
            if (aVar == aVar2 && java.lang.Math.abs(b17.left - m34345x1629663d) < f19) {
                canvas.drawPoint(m34345x1629663d, hVar.f117810d.f117799r.f328578b - f18, paint);
            } else if (fVar.f338667j == ax0.a.f96495f && java.lang.Math.abs(b17.right - m34345x1629663d) < f19) {
                canvas.drawPoint(m34345x1629663d, hVar.f117810d.f117799r.f328578b - f18, paint);
            }
        }
        if (fVar.f338666i && fVar.f338668k == ax0.d.f96506f) {
            int ordinal = fVar.f338667j.ordinal();
            android.graphics.Paint paint2 = this.f367520j;
            float f27 = this.f367515e;
            if (ordinal == 1) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = fVar.k();
                if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                    java.util.Iterator it6 = set.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        } else if (((com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) it6.next()).m33975x22a7969a(k17)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    return;
                }
                int ordinal2 = fVar.f338670m.ordinal();
                float f28 = this.f367514d;
                if (ordinal2 == 1) {
                    float f29 = (b17.left - f28) - (f27 / 2);
                    canvas.drawLine(f29, b17.top, f29, b17.bottom, paint2);
                    return;
                } else {
                    if (ordinal2 != 2) {
                        return;
                    }
                    float f37 = b17.left + f28 + (f27 / 2);
                    canvas.drawLine(f37, b17.top, f37, b17.bottom, paint2);
                    return;
                }
            }
            if (ordinal != 2) {
                return;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = fVar.l().m34007xde00a612();
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator it7 = set.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    } else if (((com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) it7.next()).m33975x22a7969a(m34007xde00a612)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                return;
            }
            int ordinal3 = fVar.f338670m.ordinal();
            if (ordinal3 == 1) {
                float f38 = (f27 / 2) + b17.right;
                canvas.drawLine(f38, b17.top, f38, b17.bottom, paint2);
            } else {
                if (ordinal3 != 2) {
                    return;
                }
                float f39 = b17.right - (f27 / 2);
                canvas.drawLine(f39, b17.top, f39, b17.bottom, paint2);
            }
        }
    }
}
