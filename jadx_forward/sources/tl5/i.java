package tl5;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    public static final android.view.animation.Interpolator f501883l = new android.view.animation.LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f501884a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f501885b;

    /* renamed from: c, reason: collision with root package name */
    public final int f501886c;

    /* renamed from: d, reason: collision with root package name */
    public final int f501887d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Interpolator f501888e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f501889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f501890g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f501891h;

    /* renamed from: i, reason: collision with root package name */
    public int f501892i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f501893j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Paint f501894k;

    public i(android.graphics.RectF fromFrame, android.graphics.RectF toFrame, int i17, int i18, android.view.animation.Interpolator alphaInterpolator, android.graphics.drawable.Drawable drawable, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 4) != 0 ? 255 : i17;
        i18 = (i27 & 8) != 0 ? 255 : i18;
        alphaInterpolator = (i27 & 16) != 0 ? f501883l : alphaInterpolator;
        drawable = (i27 & 32) != 0 ? null : drawable;
        i19 = (i27 & 64) != 0 ? 0 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromFrame, "fromFrame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toFrame, "toFrame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alphaInterpolator, "alphaInterpolator");
        this.f501884a = fromFrame;
        this.f501885b = toFrame;
        this.f501886c = i17;
        this.f501887d = i18;
        this.f501888e = alphaInterpolator;
        this.f501889f = drawable;
        this.f501890g = i19;
        this.f501891h = new android.graphics.RectF();
        this.f501892i = 255;
        this.f501893j = new android.graphics.Matrix();
    }

    public final void a(android.graphics.Canvas canvas, float f17, float f18) {
        float f19;
        float f27;
        float f28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        boolean z17 = java.lang.Math.abs(f17 - 0.0f) < 1.0E-4f;
        android.graphics.RectF rectF = this.f501891h;
        android.graphics.RectF rectF2 = this.f501884a;
        if (z17) {
            rectF.set(rectF2);
        } else {
            boolean z18 = java.lang.Math.abs(f17 - 1.0f) < 1.0E-4f;
            android.graphics.RectF rectF3 = this.f501885b;
            if (z18) {
                rectF.set(rectF3);
            } else {
                float f29 = rectF2.left;
                float f37 = f29 + ((rectF3.left - f29) * f17);
                float f38 = rectF2.top;
                float f39 = f38 + ((rectF3.top - f38) * f17);
                float f47 = rectF2.right;
                float f48 = f47 + ((rectF3.right - f47) * f17);
                float f49 = rectF2.bottom;
                rectF.set(f37, f39, f48, f49 + ((rectF3.bottom - f49) * f17));
            }
        }
        int i17 = this.f501886c;
        if (i17 == this.f501887d) {
            this.f501892i = i17;
        } else {
            if (f18 == -1.0f) {
                f18 = this.f501888e.getInterpolation(f17);
            }
            this.f501892i = h3.a.b(i17 + ((int) ((r2 - i17) * f18)), 0, 255);
        }
        int i18 = this.f501892i;
        if (i18 <= 0) {
            return;
        }
        android.graphics.drawable.Drawable drawable = this.f501889f;
        if (drawable == null) {
            int i19 = this.f501890g;
            if (i19 != 0) {
                android.graphics.Paint paint = this.f501894k;
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    this.f501894k = paint;
                }
                paint.setColor(i19);
                paint.setAlpha(i18);
                canvas.drawRect(rectF, paint);
                return;
            }
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float width = rectF.width();
        float height = rectF.height();
        android.graphics.Matrix matrix = this.f501893j;
        matrix.reset();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(0, 0, (int) width, (int) height);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f57 = intrinsicWidth;
            float f58 = intrinsicHeight;
            if (f57 * height > width * f58) {
                f19 = (1.0f + height) / f58;
                f28 = (width - (f57 * f19)) * 0.5f;
                f27 = 0.0f;
            } else {
                f19 = (1.0f + width) / f57;
                f27 = (height - (f58 * f19)) * 0.5f;
                f28 = 0.0f;
            }
            matrix.setScale(f19, f19);
            matrix.postTranslate(f28, f27);
        }
        drawable.setAlpha(i18);
        int save = canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.clipRect(0.0f, 0.0f, width, height);
        canvas.concat(matrix);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
