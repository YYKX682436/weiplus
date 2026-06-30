package iy2;

/* loaded from: classes13.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f377395a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f377396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f377397c;

    /* renamed from: d, reason: collision with root package name */
    public final int f377398d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f377399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f377400f;

    /* renamed from: g, reason: collision with root package name */
    public final int f377401g;

    /* renamed from: h, reason: collision with root package name */
    public final int f377402h;

    /* renamed from: i, reason: collision with root package name */
    public final int f377403i;

    /* renamed from: j, reason: collision with root package name */
    public final int f377404j;

    /* renamed from: k, reason: collision with root package name */
    public final int f377405k;

    /* renamed from: l, reason: collision with root package name */
    public final int f377406l;

    /* renamed from: m, reason: collision with root package name */
    public float f377407m;

    /* renamed from: n, reason: collision with root package name */
    public float f377408n;

    /* renamed from: o, reason: collision with root package name */
    public float f377409o;

    /* renamed from: p, reason: collision with root package name */
    public float f377410p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f377411q;

    /* renamed from: r, reason: collision with root package name */
    public int f377412r;

    /* renamed from: s, reason: collision with root package name */
    public int f377413s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f377414t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f377415u;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f377399e = new android.graphics.Paint(1);
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        this.f377407m = -90.0f;
        this.f377410p = 5.0f;
        this.f377413s = 2;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        this.f377414t = ofFloat;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.addUpdateListener(new iy2.a(this));
        this.f377415u = new android.graphics.RectF();
        this.f377395a = context;
        this.f377397c = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f377398d = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a09);
        this.f377396b = context.getResources().getDrawable(j65.e.b() ? com.p314xaae8f345.mm.R.raw.f81340x3a22d0bf : com.p314xaae8f345.mm.R.raw.f81339xd0bd5dd1);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aos);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aor);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aol);
        this.f377406l = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aoq);
        this.f377401g = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.akg);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aon);
        this.f377404j = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aom);
        this.f377405k = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.akh);
        this.f377412r = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aop);
        this.f377402h = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aop);
        this.f377403i = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aoo);
        this.f377400f = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aot);
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public final void b() {
        this.f377413s = 2;
        this.f377414t.cancel();
        this.f377407m = -90.0f;
        this.f377408n = 0.0f;
        this.f377409o = 0.0f;
        this.f377410p = 5.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.f377413s;
        android.graphics.Paint paint = this.f377399e;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f377401g);
            int i18 = this.f377413s;
            int i19 = this.f377402h;
            if (i18 == 7) {
                if (this.f377411q) {
                    this.f377412r -= 4;
                } else {
                    this.f377412r += 4;
                }
                int min = (int) java.lang.Math.min(java.lang.Math.max(i19, this.f377412r), this.f377403i);
                this.f377412r = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i27 = this.f377406l;
        int i28 = this.f377397c;
        android.graphics.drawable.Drawable drawable = this.f377396b;
        if (drawable != null && !a(canvas)) {
            if (this.f377413s == 5) {
                drawable.setColorFilter(this.f377398d, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(i28, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            int width2 = canvas.getWidth() / 2;
            int height2 = canvas.getHeight() / 2;
            drawable.setBounds(width2 - i27, height2 - i27, width2 + i27, height2 + i27);
            drawable.draw(canvas);
        }
        if (this.f377413s == 4) {
            paint.setColor(i28);
            paint.setStrokeWidth(this.f377400f);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.clearShadowLayer();
            paint.setShader(null);
            android.graphics.RectF rectF = this.f377415u;
            int width3 = canvas.getWidth() / 2;
            int i29 = this.f377404j;
            rectF.left = width3 - i29;
            rectF.top = (canvas.getHeight() / 2) - i29;
            rectF.right = (canvas.getWidth() / 2) + i29;
            rectF.bottom = (canvas.getHeight() / 2) + i29;
            canvas.drawArc(rectF, this.f377407m, this.f377409o, false, paint);
            this.f377407m += this.f377408n;
            float f17 = this.f377409o;
            float f18 = this.f377410p;
            float f19 = f17 + f18;
            this.f377409o = f19;
            if (f19 >= 360.0f) {
                this.f377410p = -f18;
                this.f377408n = 5.0f;
            } else if (f19 <= 0.0f) {
                this.f377410p = -f18;
                this.f377408n = 0.0f;
                this.f377407m = -90.0f;
                this.f377409o = 0.0f;
            }
        }
        int i37 = this.f377413s;
        if ((i37 == 6 || i37 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f377405k);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, i27, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f377406l * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f377395a;
        if (context == null) {
            return 0;
        }
        return i65.a.B(context);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
