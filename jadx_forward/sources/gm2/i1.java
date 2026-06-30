package gm2;

/* loaded from: classes3.dex */
public final class i1 extends gm2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f354944f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f354945d;

    /* renamed from: e, reason: collision with root package name */
    public gm2.h1 f354946e;

    static {
        new gm2.f1(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f354945d = jz5.h.b(gm2.g1.f354901d);
        this.f354946e = new gm2.h1(null, null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, null, null, 0, 262143, null);
    }

    @Override // gm2.y1
    public int a() {
        return this.f354946e.f354922t;
    }

    public final void b(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        int i27;
        paint.setColor(this.f354946e.f354915m);
        paint.setTextSize(this.f354946e.f354906d);
        if (this.f354946e.f354921s <= 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) this.f354946e.f354903a);
            sb6.append((java.lang.Object) this.f354946e.f354904b);
            java.lang.String sb7 = sb6.toString();
            gm2.h1 h1Var = this.f354946e;
            float measureText = h1Var.f354912j + paint.measureText(sb7, 0, sb7.length());
            gm2.h1 h1Var2 = this.f354946e;
            h1Var.f354921s = (int) (measureText + h1Var2.f354914l + h1Var2.f354913k);
        }
        gm2.h1 h1Var3 = this.f354946e;
        float f18 = 2;
        float f19 = h1Var3.f354916n / f18;
        float f27 = (i19 - i17) / f18;
        float f28 = h1Var3.f354908f + f17;
        float f29 = f27 - f19;
        float f37 = f28 + h1Var3.f354921s;
        float f38 = f27 + f19;
        float f39 = h1Var3.f354917o;
        if (f39 > 0.0f) {
            f19 = f39;
        }
        android.graphics.Bitmap bitmap = h1Var3.f354918p;
        if (bitmap != null) {
            if (bitmap != null) {
                canvas.drawBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, false, 200.0f, false, null), (android.graphics.Rect) null, new android.graphics.RectF(f28, f29, f37, f38), (android.graphics.Paint) null);
                return;
            }
            return;
        }
        if (h1Var3.f354919q == null) {
            canvas.drawRoundRect(new android.graphics.RectF(f28, f29, f37, f38), f19, f19, paint);
            return;
        }
        int alpha = paint.getAlpha();
        int[] iArr = this.f354946e.f354919q;
        java.lang.Integer S = iArr != null ? kz5.z.S(iArr, 0) : null;
        int[] iArr2 = this.f354946e.f354919q;
        java.lang.Integer S2 = iArr2 != null ? kz5.z.S(iArr2, 1) : null;
        paint.setAlpha(255);
        if (S == null || S2 == null) {
            i27 = alpha;
        } else {
            paint.setShader(new android.graphics.LinearGradient(f28, f27, f37, f27, S.intValue(), S2.intValue(), android.graphics.Shader.TileMode.CLAMP));
            canvas.drawRoundRect(new android.graphics.RectF(f28, f29, f37, f38), f19, f19, paint);
            paint.setShader(null);
            i27 = alpha;
        }
        paint.setAlpha(i27);
    }

    public final void c(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        gm2.h1 h1Var = this.f354946e;
        if (h1Var.f354910h) {
            float measureText = paint.measureText(h1Var.f354903a.toString());
            jz5.g gVar = this.f354945d;
            float intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
            float intValue2 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
            float f18 = r2.f354908f + f17 + intValue;
            float f19 = r2.f354912j + f18 + measureText + r2.f354913k + intValue;
            int i27 = (i19 - i17) - ((int) (2 * intValue2));
            int i28 = this.f354946e.f354916n;
            float f27 = i17 + (i27 > i28 ? (i27 - i28) / 2 : 0) + intValue2;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
            paint2.setStrokeWidth(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawRoundRect(new android.graphics.RectF(f18, f27, f19, i28 + f27), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561178bk), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561178bk), paint2);
        }
    }

    public final void d(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f354946e.f354905c);
        paint.setAlpha(this.f354946e.f354909g);
        paint.setTextSize(this.f354946e.f354906d);
        int i27 = this.f354946e.f354920r;
        int i28 = i27 > 0 ? i19 - (i27 / 2) : (i19 - i17) / 2;
        float f18 = 2;
        float f19 = i28;
        float abs = (java.lang.Math.abs(paint.ascent() + paint.descent()) / f18) + f19;
        gm2.h1 h1Var = this.f354946e;
        float f27 = f17 + h1Var.f354908f + h1Var.f354912j;
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fontMetrics, "getFontMetrics(...)");
        float f28 = fontMetrics.bottom;
        float f29 = (f19 + ((f28 - fontMetrics.top) / f18)) - f28;
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ae2.in.N6.r()).booleanValue()) {
            canvas.drawText(this.f354946e.f354903a.toString(), f27, f29, paint);
        } else {
            canvas.drawText(this.f354946e.f354903a.toString(), f27, abs, paint);
        }
        if (this.f354946e.f354904b.length() > 0) {
            java.lang.CharSequence charSequence = this.f354946e.f354903a;
            float measureText = f27 + paint.measureText(charSequence, 0, charSequence.length());
            canvas.drawText(this.f354946e.f354904b.toString(), measureText + r6.f354914l, abs, paint);
        }
        com.p314xaae8f345.mm.ui.bk.t0(paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            android.graphics.Typeface typeface = paint.getTypeface();
            b(canvas, f17, i19, i27, i28, paint);
            d(canvas, f17, i19, i27, i28, paint);
            c(canvas, f17, i19, i27, i28, paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
            paint.setTypeface(typeface);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f539688b, "liveInvalidBadgeTag", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveTagImageSpan.draw");
        }
    }
}
