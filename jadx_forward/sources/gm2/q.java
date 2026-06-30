package gm2;

/* loaded from: classes3.dex */
public class q extends gm2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.p f354993e = new gm2.p(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f354994f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    /* renamed from: d, reason: collision with root package name */
    public gm2.o f354995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f354995d = new gm2.o(0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, false, null, 0, 0, 0, false, false, 524287, null);
    }

    @Override // gm2.y1
    public int a() {
        return this.f354995d.f354988t;
    }

    public void b(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float measureText = paint.measureText(this.f354995d.f354978j.toString());
        gm2.o oVar = this.f354995d;
        float f18 = oVar.f354969a + f17;
        float f19 = oVar.f354971c + f18 + oVar.f354983o + oVar.f354973e + measureText + oVar.f354972d;
        int i27 = i19 - i17;
        int i28 = oVar.f354976h;
        float f27 = i17 + (i27 > i28 ? (i27 - i28) / 2 : 0);
        float f28 = i28 + f27;
        int i29 = oVar.f354974f;
        if (i29 != 0 || oVar.f354975g == 0) {
            paint.setColor(i29);
            android.graphics.RectF rectF = new android.graphics.RectF(f18, f27, f19, f28);
            int i37 = this.f354995d.f354977i;
            canvas.drawRoundRect(rectF, i37, i37, paint);
            return;
        }
        try {
            android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(this.f354995d.f354975g, null);
            drawable.setBounds(new android.graphics.Rect((int) f18, (int) f27, (int) f19, (int) f28));
            drawable.draw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveLevelImageSpan", th6, "invalid bgDrawableId:" + this.f354995d.f354975g, new java.lang.Object[0]);
        }
    }

    public void c(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
    }

    public final void d(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        jz5.f0 f0Var;
        gm2.o oVar = this.f354995d;
        android.graphics.drawable.Drawable drawable = oVar.f354982n;
        if (drawable != null) {
            if (oVar.f354987s) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f354995d.f354985q, android.graphics.PorterDuff.Mode.SRC_ATOP));
            } else {
                drawable.clearColorFilter();
            }
            float f18 = f17 + r6.f354969a + r6.f354971c;
            int i27 = i19 - i17;
            int i28 = this.f354995d.f354984p;
            int i29 = (i27 - i28) / 2;
            drawable.setBounds(new android.graphics.Rect((int) f18, i29, (int) (r6.f354983o + f18), i28 + i29));
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            drawable.draw(canvas);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLevelImageSpan", "drawLeftIcon bitmap is empty!");
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            android.graphics.Typeface typeface = paint.getTypeface();
            paint.setTextSize(this.f354995d.f354980l);
            if (this.f354995d.f354986r) {
                b(canvas, f17, i19, i27, i28, paint);
            }
            d(canvas, f17, i19, i27, i28, paint);
            e(canvas, f17, i19, i27, i28, paint);
            c(canvas, f17, i19, i27, i28, paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
            paint.setTypeface(typeface);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f539688b, "liveInvalidBadgeTag", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, "FinderLiveLevelImageSpan.draw");
        }
    }

    public final void e(android.graphics.Canvas canvas, float f17, int i17, int i18, int i19, android.graphics.Paint paint) {
        if (this.f354995d.f354978j.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLevelImageSpan", "drawRightText text is empty!");
            return;
        }
        com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f354995d.f354979k);
        canvas.drawText(this.f354995d.f354978j.toString(), f17 + r5.f354969a + r5.f354971c + r5.f354983o + r5.f354973e, (java.lang.Math.abs(paint.ascent() + paint.descent()) / 2) + ((i19 - i17) / 2), paint);
        com.p314xaae8f345.mm.ui.bk.t0(paint);
    }
}
