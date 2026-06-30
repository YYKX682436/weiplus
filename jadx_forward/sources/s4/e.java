package s4;

/* loaded from: classes15.dex */
public class e extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {

    /* renamed from: m, reason: collision with root package name */
    public static final android.view.animation.Interpolator f484405m = new android.view.animation.LinearInterpolator();

    /* renamed from: n, reason: collision with root package name */
    public static final android.view.animation.Interpolator f484406n = new y3.b();

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f484407o = {-16777216};

    /* renamed from: d, reason: collision with root package name */
    public final s4.d f484408d;

    /* renamed from: e, reason: collision with root package name */
    public float f484409e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.Resources f484410f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f484411g;

    /* renamed from: h, reason: collision with root package name */
    public float f484412h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f484413i;

    public e(android.content.Context context) {
        context.getClass();
        this.f484410f = context.getResources();
        s4.d dVar = new s4.d();
        this.f484408d = dVar;
        dVar.f484392i = f484407o;
        dVar.a(0);
        dVar.f484391h = 2.5f;
        dVar.f484385b.setStrokeWidth(2.5f);
        invalidateSelf();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new s4.b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f484405m);
        ofFloat.addListener(new s4.c(this, dVar));
        this.f484411g = ofFloat;
    }

    public void a(float f17, s4.d dVar, boolean z17) {
        float interpolation;
        float f18;
        if (this.f484413i) {
            d(f17, dVar);
            float floor = (float) (java.lang.Math.floor(dVar.f484396m / 0.8f) + 1.0d);
            float f19 = dVar.f484394k;
            float f27 = dVar.f484395l;
            dVar.f484388e = f19 + (((f27 - 0.01f) - f19) * f17);
            dVar.f484389f = f27;
            float f28 = dVar.f484396m;
            dVar.f484390g = f28 + ((floor - f28) * f17);
            return;
        }
        if (f17 != 1.0f || z17) {
            float f29 = dVar.f484396m;
            android.view.animation.Interpolator interpolator = f484406n;
            if (f17 < 0.5f) {
                interpolation = dVar.f484394k;
                f18 = (((y3.d) interpolator).getInterpolation(f17 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f37 = dVar.f484394k + 0.79f;
                interpolation = f37 - (((1.0f - ((y3.d) interpolator).getInterpolation((f17 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f18 = f37;
            }
            float f38 = f29 + (0.20999998f * f17);
            float f39 = (f17 + this.f484412h) * 216.0f;
            dVar.f484388e = interpolation;
            dVar.f484389f = f18;
            dVar.f484390g = f38;
            this.f484409e = f39;
        }
    }

    public final void b(float f17, float f18, float f19, float f27) {
        float f28 = this.f484410f.getDisplayMetrics().density;
        float f29 = f18 * f28;
        s4.d dVar = this.f484408d;
        dVar.f484391h = f29;
        dVar.f484385b.setStrokeWidth(f29);
        dVar.f484400q = f17 * f28;
        dVar.a(0);
        dVar.f484401r = (int) (f19 * f28);
        dVar.f484402s = (int) (f27 * f28);
    }

    public void c(int i17) {
        if (i17 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void d(float f17, s4.d dVar) {
        if (f17 <= 0.75f) {
            dVar.f484404u = dVar.f484392i[dVar.f484393j];
            return;
        }
        float f18 = (f17 - 0.75f) / 0.25f;
        int[] iArr = dVar.f484392i;
        int i17 = dVar.f484393j;
        int i18 = iArr[i17];
        int i19 = iArr[(i17 + 1) % iArr.length];
        dVar.f484404u = ((((i18 >> 24) & 255) + ((int) ((((i19 >> 24) & 255) - r1) * f18))) << 24) | ((((i18 >> 16) & 255) + ((int) ((((i19 >> 16) & 255) - r3) * f18))) << 16) | ((((i18 >> 8) & 255) + ((int) ((((i19 >> 8) & 255) - r4) * f18))) << 8) | ((i18 & 255) + ((int) (f18 * ((i19 & 255) - r2))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f484409e, bounds.exactCenterX(), bounds.exactCenterY());
        s4.d dVar = this.f484408d;
        android.graphics.RectF rectF = dVar.f484384a;
        float f17 = dVar.f484400q;
        float f18 = (dVar.f484391h / 2.0f) + f17;
        if (f17 <= 0.0f) {
            f18 = (java.lang.Math.min(bounds.width(), bounds.height()) / 2.0f) - java.lang.Math.max((dVar.f484401r * dVar.f484399p) / 2.0f, dVar.f484391h / 2.0f);
        }
        rectF.set(bounds.centerX() - f18, bounds.centerY() - f18, bounds.centerX() + f18, bounds.centerY() + f18);
        float f19 = dVar.f484388e;
        float f27 = dVar.f484390g;
        float f28 = (f19 + f27) * 360.0f;
        float f29 = ((dVar.f484389f + f27) * 360.0f) - f28;
        android.graphics.Paint paint = dVar.f484385b;
        paint.setColor(dVar.f484404u);
        paint.setAlpha(dVar.f484403t);
        float f37 = dVar.f484391h / 2.0f;
        rectF.inset(f37, f37);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f484387d);
        float f38 = -f37;
        rectF.inset(f38, f38);
        canvas.drawArc(rectF, f28, f29, false, paint);
        if (dVar.f484397n) {
            android.graphics.Path path = dVar.f484398o;
            if (path == null) {
                android.graphics.Path path2 = new android.graphics.Path();
                dVar.f484398o = path2;
                path2.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f39 = (dVar.f484401r * dVar.f484399p) / 2.0f;
            dVar.f484398o.moveTo(0.0f, 0.0f);
            dVar.f484398o.lineTo(dVar.f484401r * dVar.f484399p, 0.0f);
            android.graphics.Path path3 = dVar.f484398o;
            float f47 = dVar.f484401r;
            float f48 = dVar.f484399p;
            path3.lineTo((f47 * f48) / 2.0f, dVar.f484402s * f48);
            dVar.f484398o.offset((min + rectF.centerX()) - f39, rectF.centerY() + (dVar.f484391h / 2.0f));
            dVar.f484398o.close();
            android.graphics.Paint paint2 = dVar.f484386c;
            paint2.setColor(dVar.f484404u);
            paint2.setAlpha(dVar.f484403t);
            canvas.save();
            canvas.rotate(f28 + f29, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f484398o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f484408d.f484403t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f484411g.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f484408d.f484403t = i17;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f484408d.f484385b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f484411g.cancel();
        s4.d dVar = this.f484408d;
        float f17 = dVar.f484388e;
        dVar.f484394k = f17;
        float f18 = dVar.f484389f;
        dVar.f484395l = f18;
        dVar.f484396m = dVar.f484390g;
        if (f18 != f17) {
            this.f484413i = true;
            this.f484411g.setDuration(666L);
            this.f484411g.start();
            return;
        }
        dVar.a(0);
        dVar.f484394k = 0.0f;
        dVar.f484395l = 0.0f;
        dVar.f484396m = 0.0f;
        dVar.f484388e = 0.0f;
        dVar.f484389f = 0.0f;
        dVar.f484390g = 0.0f;
        this.f484411g.setDuration(1332L);
        this.f484411g.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f484411g.cancel();
        this.f484409e = 0.0f;
        s4.d dVar = this.f484408d;
        if (dVar.f484397n) {
            dVar.f484397n = false;
        }
        dVar.a(0);
        dVar.f484394k = 0.0f;
        dVar.f484395l = 0.0f;
        dVar.f484396m = 0.0f;
        dVar.f484388e = 0.0f;
        dVar.f484389f = 0.0f;
        dVar.f484390g = 0.0f;
        invalidateSelf();
    }
}
