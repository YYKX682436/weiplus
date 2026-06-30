package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes13.dex */
public class g3 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f272371a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f272372b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272373c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272374d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f272375e = new android.graphics.Paint(1);

    /* renamed from: f, reason: collision with root package name */
    public final int f272376f;

    /* renamed from: g, reason: collision with root package name */
    public final int f272377g;

    /* renamed from: h, reason: collision with root package name */
    public final int f272378h;

    /* renamed from: i, reason: collision with root package name */
    public final int f272379i;

    /* renamed from: j, reason: collision with root package name */
    public final int f272380j;

    /* renamed from: k, reason: collision with root package name */
    public final int f272381k;

    /* renamed from: l, reason: collision with root package name */
    public final int f272382l;

    /* renamed from: m, reason: collision with root package name */
    public float f272383m;

    /* renamed from: n, reason: collision with root package name */
    public float f272384n;

    /* renamed from: o, reason: collision with root package name */
    public float f272385o;

    /* renamed from: p, reason: collision with root package name */
    public float f272386p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272387q;

    /* renamed from: r, reason: collision with root package name */
    public int f272388r;

    /* renamed from: s, reason: collision with root package name */
    public int f272389s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f272390t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f272391u;

    public g3(android.content.Context context) {
        this.f272372b = null;
        this.f272373c = 0;
        this.f272374d = 0;
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        new android.view.animation.AccelerateDecelerateInterpolator();
        new java.util.Random(java.lang.System.currentTimeMillis());
        this.f272382l = 0;
        this.f272383m = -90.0f;
        this.f272384n = 0.0f;
        this.f272385o = 0.0f;
        this.f272386p = 5.0f;
        this.f272387q = false;
        this.f272389s = 2;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        this.f272390t = ofFloat;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.f3(this));
        this.f272391u = new android.graphics.RectF();
        this.f272371a = context;
        this.f272373c = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        this.f272374d = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a09);
        this.f272372b = context.getResources().getDrawable(j65.e.b() ? com.p314xaae8f345.mm.R.raw.f81340x3a22d0bf : com.p314xaae8f345.mm.R.raw.f81339xd0bd5dd1);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adv);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adu);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ado);
        this.f272382l = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adt);
        this.f272377g = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a__);
        i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adq);
        this.f272380j = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adp);
        this.f272381k = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a_a);
        this.f272388r = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ads);
        this.f272378h = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ads);
        this.f272379i = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adr);
        this.f272376f = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.adw);
    }

    public final boolean a(android.graphics.Canvas canvas) {
        return canvas == null || canvas.getWidth() == 0 || canvas.getHeight() == 0;
    }

    public void b() {
        this.f272389s = 2;
        this.f272390t.cancel();
        this.f272383m = -90.0f;
        this.f272384n = 0.0f;
        this.f272385o = 0.0f;
        this.f272386p = 5.0f;
        invalidateSelf();
    }

    public void c() {
        this.f272389s = 4;
        android.animation.ValueAnimator valueAnimator = this.f272390t;
        valueAnimator.cancel();
        valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int i17 = this.f272389s;
        android.graphics.Paint paint = this.f272375e;
        if ((i17 == 6 || i17 == 7) && !a(canvas)) {
            int width = canvas.getWidth() >> 1;
            int height = canvas.getHeight() >> 1;
            paint.setShader(null);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f272377g);
            int i18 = this.f272389s;
            int i19 = this.f272378h;
            if (i18 == 7) {
                if (this.f272387q) {
                    this.f272388r -= 4;
                } else {
                    this.f272388r += 4;
                }
                int min = java.lang.Math.min(java.lang.Math.max(i19, this.f272388r), this.f272379i);
                this.f272388r = min;
                canvas.drawCircle(width, height, min, paint);
            } else {
                canvas.drawCircle(width, height, i19, paint);
            }
        }
        int i27 = this.f272382l;
        int i28 = this.f272373c;
        android.graphics.drawable.Drawable drawable = this.f272372b;
        if (drawable != null && !a(canvas)) {
            if (this.f272389s == 5) {
                drawable.setColorFilter(this.f272374d, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else {
                drawable.setColorFilter(i28, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            int width2 = canvas.getWidth() / 2;
            int height2 = canvas.getHeight() / 2;
            drawable.setBounds(width2 - i27, height2 - i27, width2 + i27, height2 + i27);
            drawable.draw(canvas);
        }
        if (this.f272389s == 4 && canvas != null) {
            paint.setColor(i28);
            paint.setStrokeWidth(this.f272376f);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.clearShadowLayer();
            paint.setShader(null);
            android.graphics.RectF rectF = this.f272391u;
            int width3 = canvas.getWidth() / 2;
            int i29 = this.f272380j;
            rectF.left = width3 - i29;
            rectF.top = (canvas.getHeight() / 2) - i29;
            rectF.right = (canvas.getWidth() / 2) + i29;
            rectF.bottom = (canvas.getHeight() / 2) + i29;
            canvas.drawArc(rectF, this.f272383m, this.f272385o, false, paint);
            this.f272383m += this.f272384n;
            float f17 = this.f272385o;
            float f18 = this.f272386p;
            float f19 = f17 + f18;
            this.f272385o = f19;
            if (f19 >= 360.0f) {
                this.f272386p = -f18;
                this.f272384n = 5.0f;
            } else if (f19 <= 0.0f) {
                this.f272386p = -f18;
                this.f272384n = 0.0f;
                this.f272383m = -90.0f;
                this.f272385o = 0.0f;
            }
        }
        int i37 = this.f272389s;
        if ((i37 == 6 || i37 == 7) && !a(canvas)) {
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f272381k);
            canvas.drawCircle(canvas.getWidth() >> 1, canvas.getHeight() >> 1, i27, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f272382l * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.content.Context context = this.f272371a;
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
