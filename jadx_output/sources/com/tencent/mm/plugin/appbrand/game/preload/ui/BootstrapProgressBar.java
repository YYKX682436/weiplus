package com.tencent.mm.plugin.appbrand.game.preload.ui;

/* loaded from: classes4.dex */
public class BootstrapProgressBar extends android.view.View implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f78233d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f78234e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f78235f;

    /* renamed from: g, reason: collision with root package name */
    public float f78236g;

    /* renamed from: h, reason: collision with root package name */
    public float f78237h;

    /* renamed from: i, reason: collision with root package name */
    public float f78238i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78239m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78240n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f78241o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f78242p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f78243q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f78244r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f78245s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Canvas f78246t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f78247u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f78248v;

    /* renamed from: w, reason: collision with root package name */
    public int f78249w;

    public BootstrapProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78236g = 0.0f;
        this.f78237h = 0.0f;
        this.f78238i = 100.0f;
        this.f78239m = false;
        this.f78240n = false;
        this.f78241o = true;
        this.f78242p = true;
        this.f78243q = true;
        a();
    }

    public final void a() {
        android.animation.ValueAnimator.setFrameDelay(15L);
        this.f78245s = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f78233d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f78233d.setAntiAlias(true);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f78234e = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f78234e.setAntiAlias(true);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f78235f = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        this.f78235f.setARGB(38, 0, 0, 0);
        setProgress(this.f78236g);
        setMaxProgress(this.f78238i);
    }

    public final void b() {
        if (this.f78239m && this.f78240n) {
            clearAnimation();
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
            this.f78244r = ofFloat;
            ofFloat.setDuration(300L);
            this.f78244r.setRepeatCount(-1);
            this.f78244r.setRepeatMode(1);
            this.f78244r.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f78244r.addUpdateListener(new ra1.a(this));
            this.f78244r.start();
        }
    }

    public float getMaxProgress() {
        return this.f78238i;
    }

    public float getProgress() {
        return this.f78236g;
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
        this.f78237h = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        if (this.f78247u == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf((int) height));
            arrayList.add(java.lang.Integer.valueOf((int) width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/game/preload/ui/BootstrapProgressBar", "onDraw", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            this.f78247u = createBitmap;
        }
        if (this.f78246t == null) {
            this.f78246t = new android.graphics.Canvas(this.f78247u);
        }
        this.f78246t.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        float f17 = this.f78236g / this.f78238i;
        int i17 = (int) (width * f17);
        float currentTimeMillis = (this.f78239m && this.f78240n) ? height * 2.0f * (1.0f - (((float) (java.lang.System.currentTimeMillis() % 370)) / 370.0f)) : 0.0f;
        if (f17 < 1.0f) {
            this.f78246t.save();
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, 0.0f);
            float f18 = i17;
            path.lineTo(f18, 0.0f);
            path.lineTo(f18 - height, height);
            path.lineTo(0.0f, height);
            this.f78246t.clipPath(path);
        }
        if (this.f78239m) {
            if (this.f78248v == null) {
                android.graphics.Paint paint = this.f78234e;
                android.graphics.Paint paint2 = this.f78233d;
                int i18 = (int) height;
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                this.f78248v = createBitmap2;
            }
            float f28 = 0.0f - currentTimeMillis;
            while (f28 < i17) {
                this.f78246t.drawBitmap(this.f78248v, f28, 0.0f, this.f78245s);
                f28 += this.f78248v.getWidth();
            }
        } else {
            this.f78246t.drawRect(0.0f, 0.0f, i17, height, this.f78233d);
        }
        if (f17 < 1.0f) {
            this.f78246t.restore();
        }
        android.graphics.Path path3 = new android.graphics.Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(width, 0.0f);
        path3.lineTo(width, height);
        path3.lineTo(0.0f, height);
        this.f78246t.drawPath(path3, this.f78235f);
        float f29 = this.f78241o ? height / 2.0f : 0.0f;
        android.graphics.Bitmap bitmap = this.f78247u;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(config3);
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
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
        if (!this.f78242p) {
            canvas3.drawRect(rect2, paint3);
        }
        if (!this.f78243q) {
            canvas3.drawRect(rect3, paint3);
        }
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas3.drawBitmap(bitmap, rect, rect, paint3);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, this.f78245s);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), android.view.View.MeasureSpec.getSize(i18));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        if (i18 != i27) {
            this.f78248v = null;
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setAnimated(boolean z17) {
        this.f78240n = z17;
        invalidate();
        b();
    }

    public void setMaxProgress(float f17) {
        if (getProgress() > f17) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("MaxProgress cant be smaller than the current progress %d<%d", java.lang.Float.valueOf(getProgress()), java.lang.Float.valueOf(f17)));
        }
        this.f78238i = f17;
        invalidate();
    }

    public void setProgress(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > this.f78238i) {
            f17 = 100.0f;
        }
        this.f78236g = f17;
        if (!this.f78240n) {
            this.f78237h = f17;
            invalidate();
            return;
        }
        clearAnimation();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f78237h, this.f78236g);
        this.f78244r = ofFloat;
        ofFloat.setDuration(300L);
        this.f78244r.setRepeatCount(0);
        this.f78244r.setRepeatMode(1);
        this.f78244r.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f78244r.addUpdateListener(this);
        this.f78244r.addListener(this);
        this.f78244r.start();
    }

    public void setProgressColor(int i17) {
        this.f78249w = i17;
        this.f78233d.setColor(i17);
        android.graphics.Paint paint = this.f78234e;
        int i18 = this.f78249w;
        paint.setColor(android.graphics.Color.rgb(((int) ((android.graphics.Color.red(i18) * 0.7f) + (android.graphics.Color.red(-16777216) * 0.3f))) / 1, ((int) ((android.graphics.Color.green(i18) * 0.7f) + (android.graphics.Color.green(-16777216) * 0.3f))) / 1, ((int) ((android.graphics.Color.blue(i18) * 0.7f) + (android.graphics.Color.blue(-16777216) * 0.3f))) / 1));
        this.f78248v = null;
        this.f78247u = null;
        this.f78246t = null;
        invalidate();
    }

    public void setStriped(boolean z17) {
        this.f78239m = z17;
        invalidate();
        b();
    }

    public BootstrapProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f78236g = 0.0f;
        this.f78237h = 0.0f;
        this.f78238i = 100.0f;
        this.f78239m = false;
        this.f78240n = false;
        this.f78241o = true;
        this.f78242p = true;
        this.f78243q = true;
        a();
    }
}
