package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes13.dex */
public class y extends android.graphics.drawable.Drawable {

    /* renamed from: n, reason: collision with root package name */
    public static final android.graphics.RectF f173650n = new android.graphics.RectF(-21.0f, -21.0f, 21.0f, 21.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.RectF f173651o = new android.graphics.RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f173652d;

    /* renamed from: f, reason: collision with root package name */
    public final int f173654f;

    /* renamed from: g, reason: collision with root package name */
    public final int f173655g = 4;

    /* renamed from: h, reason: collision with root package name */
    public int f173656h = -16777216;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12755x46316eee f173657i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12755x46316eee(null);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12756x1f124f7 f173658m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12756x1f124f7(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f173653e = new java.util.ArrayList();

    public y(android.content.Context context) {
        this.f173654f = java.lang.Math.round(context.getResources().getDisplayMetrics().density * 48.0f);
    }

    public final boolean a() {
        java.util.Iterator it = this.f173653e.iterator();
        while (it.hasNext()) {
            if (((android.animation.Animator) it.next()).isStarted()) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        stop();
        java.util.ArrayList arrayList = this.f173653e;
        arrayList.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12755x46316eee c12755x46316eee = this.f173657i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c12755x46316eee, "trimPathStart", 0.0f, 0.75f);
        ofFloat.setDuration(1333L);
        ofFloat.setInterpolator(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.x.f173649a);
        ofFloat.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c12755x46316eee, "trimPathEnd", 0.0f, 0.75f);
        ofFloat2.setDuration(1333L);
        ofFloat2.setInterpolator(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.w.f173648a);
        ofFloat2.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c12755x46316eee, "trimPathOffset", 0.0f, 0.25f);
        ofFloat3.setDuration(1333L);
        android.view.animation.Interpolator interpolator = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.v.f173647a;
        ofFloat3.setInterpolator(interpolator);
        ofFloat3.setRepeatCount(-1);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        arrayList.add(animatorSet);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f173658m, "rotation", 0.0f, 720.0f);
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
        if (this.f173652d == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f173652d = paint;
            paint.setAntiAlias(true);
            this.f173652d.setStyle(android.graphics.Paint.Style.STROKE);
            this.f173652d.setStrokeWidth(this.f173655g);
            this.f173652d.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            this.f173652d.setStrokeJoin(android.graphics.Paint.Join.MITER);
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int width = bounds.width();
        int height = bounds.height();
        android.graphics.Paint paint2 = this.f173652d;
        android.graphics.RectF rectF = f173650n;
        canvas.scale(width / rectF.width(), height / rectF.height());
        canvas.translate(rectF.width() / 2.0f, rectF.height() / 2.0f);
        int save2 = canvas.save();
        paint2.setColor(this.f173656h);
        canvas.rotate(this.f173658m.f172544a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12755x46316eee c12755x46316eee = this.f173657i;
        float f17 = c12755x46316eee.f172543c;
        float f18 = c12755x46316eee.f172541a;
        canvas.drawArc(f173651o, (-90.0f) + ((f17 + f18) * 360.0f), (c12755x46316eee.f172542b - f18) * 360.0f, false, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f173654f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f173654f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: isRunning */
    public boolean m53702x39e05d35() {
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
        java.util.Iterator it = this.f173653e.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).start();
        }
        invalidateSelf();
    }

    public void stop() {
        java.util.Iterator it = this.f173653e.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).end();
        }
    }
}
