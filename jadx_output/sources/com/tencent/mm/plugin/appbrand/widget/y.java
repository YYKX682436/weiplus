package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes13.dex */
public class y extends android.graphics.drawable.Drawable {

    /* renamed from: n, reason: collision with root package name */
    public static final android.graphics.RectF f92117n = new android.graphics.RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.RectF f92118o = new android.graphics.RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f92119d;

    /* renamed from: f, reason: collision with root package name */
    public final int f92121f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92122g = 4;

    /* renamed from: h, reason: collision with root package name */
    public int f92123h = -16777216;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingPathTransform f92124i = new com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingPathTransform(null);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingRotation f92125m = new com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingRotation(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f92120e = new java.util.ArrayList();

    public y(android.content.Context context) {
        this.f92121f = java.lang.Math.round(context.getResources().getDisplayMetrics().density * 48.0f);
    }

    public final boolean a() {
        java.util.Iterator it = this.f92120e.iterator();
        while (it.hasNext()) {
            if (((android.animation.Animator) it.next()).isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        stop();
        java.util.ArrayList arrayList = this.f92120e;
        arrayList.clear();
        com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingPathTransform circleProgressDrawable$RingPathTransform = this.f92124i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(circleProgressDrawable$RingPathTransform, "trimPathStart", 0.0f, 0.75f);
        ofFloat.setDuration(1333L);
        ofFloat.setInterpolator(com.tencent.mm.plugin.appbrand.widget.x.f92116a);
        ofFloat.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(circleProgressDrawable$RingPathTransform, "trimPathEnd", 0.0f, 0.75f);
        ofFloat2.setDuration(1333L);
        ofFloat2.setInterpolator(com.tencent.mm.plugin.appbrand.widget.w.f92115a);
        ofFloat2.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(circleProgressDrawable$RingPathTransform, "trimPathOffset", 0.0f, 0.25f);
        ofFloat3.setDuration(1333L);
        android.view.animation.Interpolator interpolator = com.tencent.mm.plugin.appbrand.widget.v.f92114a;
        ofFloat3.setInterpolator(interpolator);
        ofFloat3.setRepeatCount(-1);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        arrayList.add(animatorSet);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f92125m, "rotation", 0.0f, 720.0f);
        ofFloat4.setDuration(6665L);
        ofFloat4.setInterpolator(interpolator);
        ofFloat4.setRepeatCount(-1);
        arrayList.add(ofFloat4);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        if (this.f92119d == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f92119d = paint;
            paint.setAntiAlias(true);
            this.f92119d.setStyle(android.graphics.Paint.Style.STROKE);
            this.f92119d.setStrokeWidth(this.f92122g);
            this.f92119d.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            this.f92119d.setStrokeJoin(android.graphics.Paint.Join.MITER);
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int width = bounds.width();
        int height = bounds.height();
        android.graphics.Paint paint2 = this.f92119d;
        android.graphics.RectF rectF = f92117n;
        canvas.scale(width / rectF.width(), height / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        int save2 = canvas.save();
        paint2.setColor(this.f92123h);
        canvas.rotate(this.f92125m.f91011a);
        com.tencent.mm.plugin.appbrand.widget.CircleProgressDrawable$RingPathTransform circleProgressDrawable$RingPathTransform = this.f92124i;
        float f17 = circleProgressDrawable$RingPathTransform.f91010c;
        float f18 = circleProgressDrawable$RingPathTransform.f91008a;
        canvas.drawArc(f92118o, (-90.0f) + ((f17 + f18) * 360.0f), (circleProgressDrawable$RingPathTransform.f91009b - f18) * 360.0f, false, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f92121f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f92121f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public void start() {
        if (a()) {
            return;
        }
        java.util.Iterator it = this.f92120e.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).start();
        }
        invalidateSelf();
    }

    public void stop() {
        java.util.Iterator it = this.f92120e.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).end();
        }
    }
}
