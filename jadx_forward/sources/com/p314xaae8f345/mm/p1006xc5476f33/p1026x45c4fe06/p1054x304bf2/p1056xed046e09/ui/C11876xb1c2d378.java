package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar */
/* loaded from: classes4.dex */
public class C11876xb1c2d378 extends android.view.View implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f159766d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f159767e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f159768f;

    /* renamed from: g, reason: collision with root package name */
    public float f159769g;

    /* renamed from: h, reason: collision with root package name */
    public float f159770h;

    /* renamed from: i, reason: collision with root package name */
    public float f159771i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f159772m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f159773n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f159774o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f159775p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f159776q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f159777r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f159778s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Canvas f159779t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f159780u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f159781v;

    /* renamed from: w, reason: collision with root package name */
    public int f159782w;

    public C11876xb1c2d378(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159769g = 0.0f;
        this.f159770h = 0.0f;
        this.f159771i = 100.0f;
        this.f159772m = false;
        this.f159773n = false;
        this.f159774o = true;
        this.f159775p = true;
        this.f159776q = true;
        a();
    }

    public final void a() {
        android.animation.ValueAnimator.setFrameDelay(15L);
        this.f159778s = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f159766d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f159766d.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f159767e = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f159767e.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f159768f = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.f159768f.setARGB(38, 0, 0, 0);
        m50366x3ae760af(this.f159769g);
        m50365xadb2e1ef(this.f159771i);
    }

    public final void b() {
        if (this.f159772m && this.f159773n) {
            clearAnimation();
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
            this.f159777r = ofFloat;
            ofFloat.setDuration(300L);
            this.f159777r.setRepeatCount(-1);
            this.f159777r.setRepeatMode(1);
            this.f159777r.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f159777r.addUpdateListener(new ra1.a(this));
            this.f159777r.start();
        }
    }

    /* renamed from: getMaxProgress */
    public float m50362x174d6e7b() {
        return this.f159771i;
    }

    /* renamed from: getProgress */
    public float m50363x402effa3() {
        return this.f159769g;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f159770h = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        if (this.f159780u == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf((int) height));
            arrayList.add(java.lang.Integer.valueOf((int) width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f159780u = createBitmap;
        }
        if (this.f159779t == null) {
            this.f159779t = new android.graphics.Canvas(this.f159780u);
        }
        this.f159779t.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        float f17 = this.f159769g / this.f159771i;
        int i17 = (int) (width * f17);
        float currentTimeMillis = (this.f159772m && this.f159773n) ? height * 2.0f * (1.0f - (((float) (java.lang.System.currentTimeMillis() % 370)) / 370.0f)) : 0.0f;
        if (f17 < 1.0f) {
            this.f159779t.save();
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, 0.0f);
            float f18 = i17;
            path.lineTo(f18, 0.0f);
            path.lineTo(f18 - height, height);
            path.lineTo(0.0f, height);
            this.f159779t.clipPath(path);
        }
        if (this.f159772m) {
            if (this.f159781v == null) {
                android.graphics.Paint paint = this.f159767e;
                android.graphics.Paint paint2 = this.f159766d;
                int i18 = (int) height;
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(java.lang.Integer.valueOf(i18 * 2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "createTile", "(FLandroid/graphics/Paint;Landroid/graphics/Paint;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "createTile", "(FLandroid/graphics/Paint;Landroid/graphics/Paint;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
                android.graphics.Path path2 = new android.graphics.Path();
                path2.moveTo(0.0f, 0.0f);
                path2.lineTo(height, 0.0f);
                path2.lineTo(0.0f, height);
                canvas2.drawPath(path2, paint);
                path2.reset();
                float f19 = height + 0.0f;
                path2.moveTo(f19, 0.0f);
                path2.lineTo(0.0f, height);
                path2.lineTo(f19, height);
                float f27 = (height * 2.0f) + 0.0f;
                path2.lineTo(f27, 0.0f);
                canvas2.drawPath(path2, paint2);
                path2.reset();
                path2.moveTo(f27, 0.0f);
                path2.lineTo(f27 - height, height);
                path2.lineTo(f27, height);
                canvas2.drawPath(path2, paint);
                this.f159781v = createBitmap2;
            }
            float f28 = 0.0f - currentTimeMillis;
            while (f28 < i17) {
                this.f159779t.drawBitmap(this.f159781v, f28, 0.0f, this.f159778s);
                f28 += this.f159781v.getWidth();
            }
        } else {
            this.f159779t.drawRect(0.0f, 0.0f, i17, height, this.f159766d);
        }
        if (f17 < 1.0f) {
            this.f159779t.restore();
        }
        android.graphics.Path path3 = new android.graphics.Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(width, 0.0f);
        path3.lineTo(width, height);
        path3.lineTo(0.0f, height);
        this.f159779t.drawPath(path3, this.f159768f);
        float f29 = this.f159774o ? height / 2.0f : 0.0f;
        android.graphics.Bitmap bitmap = this.f159780u;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(config3);
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(height2));
        arrayList3.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "createRoundedBitmap", "(Landroid/graphics/Bitmap;FZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
        yj0.a.e(obj3, createBitmap3, "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "createRoundedBitmap", "(Landroid/graphics/Bitmap;FZZ)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas3 = new android.graphics.Canvas(createBitmap3);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmap.getWidth() / 2, bitmap.getHeight());
        android.graphics.Rect rect3 = new android.graphics.Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth(), bitmap.getHeight());
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        canvas3.drawARGB(0, 0, 0, 0);
        canvas3.drawRoundRect(new android.graphics.RectF(rect), f29, f29, paint3);
        if (!this.f159775p) {
            canvas3.drawRect(rect2, paint3);
        }
        if (!this.f159776q) {
            canvas3.drawRect(rect3, paint3);
        }
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas3.drawBitmap(bitmap, rect, rect, paint3);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, this.f159778s);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), android.view.View.MeasureSpec.getSize(i18));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            this.f159781v = null;
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    /* renamed from: setAnimated */
    public void m50364x472cc825(boolean z17) {
        this.f159773n = z17;
        invalidate();
        b();
    }

    /* renamed from: setMaxProgress */
    public void m50365xadb2e1ef(float f17) {
        if (m50363x402effa3() > f17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("MaxProgress cant be smaller than the current progress %d<%d", java.lang.Float.valueOf(m50363x402effa3()), java.lang.Float.valueOf(f17)));
        }
        this.f159771i = f17;
        invalidate();
    }

    /* renamed from: setProgress */
    public void m50366x3ae760af(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > this.f159771i) {
            f17 = 100.0f;
        }
        this.f159769g = f17;
        if (!this.f159773n) {
            this.f159770h = f17;
            invalidate();
            return;
        }
        clearAnimation();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f159770h, this.f159769g);
        this.f159777r = ofFloat;
        ofFloat.setDuration(300L);
        this.f159777r.setRepeatCount(0);
        this.f159777r.setRepeatMode(1);
        this.f159777r.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f159777r.addUpdateListener(this);
        this.f159777r.addListener(this);
        this.f159777r.start();
    }

    /* renamed from: setProgressColor */
    public void m50367x7d38f3f4(int i17) {
        this.f159782w = i17;
        this.f159766d.setColor(i17);
        android.graphics.Paint paint = this.f159767e;
        int i18 = this.f159782w;
        paint.setColor(android.graphics.Color.rgb(((int) ((android.graphics.Color.red(i18) * 0.7f) + (android.graphics.Color.red(-16777216) * 0.3f))) / 1, ((int) ((android.graphics.Color.green(i18) * 0.7f) + (android.graphics.Color.green(-16777216) * 0.3f))) / 1, ((int) ((android.graphics.Color.blue(i18) * 0.7f) + (android.graphics.Color.blue(-16777216) * 0.3f))) / 1));
        this.f159781v = null;
        this.f159780u = null;
        this.f159779t = null;
        invalidate();
    }

    /* renamed from: setStriped */
    public void m50368x411532f5(boolean z17) {
        this.f159772m = z17;
        invalidate();
        b();
    }

    public C11876xb1c2d378(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159769g = 0.0f;
        this.f159770h = 0.0f;
        this.f159771i = 100.0f;
        this.f159772m = false;
        this.f159773n = false;
        this.f159774o = true;
        this.f159775p = true;
        this.f159776q = true;
        a();
    }
}
