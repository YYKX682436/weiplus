package com.tencent.cloud.huiyan.view;

/* loaded from: classes10.dex */
public class LoadingFrontAnimatorView extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f45911v = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f45912d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f45913e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f45914f;

    /* renamed from: g, reason: collision with root package name */
    public int f45915g;

    /* renamed from: h, reason: collision with root package name */
    public int f45916h;

    /* renamed from: i, reason: collision with root package name */
    public int f45917i;

    /* renamed from: m, reason: collision with root package name */
    public int f45918m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f45919n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.RectF f45920o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f45921p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Path f45922q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45923r;

    /* renamed from: s, reason: collision with root package name */
    public volatile float f45924s;

    /* renamed from: t, reason: collision with root package name */
    public volatile float f45925t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f45926u;

    public LoadingFrontAnimatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45912d = 0.0f;
        this.f45923r = false;
        this.f45924s = -1.0f;
        this.f45925t = -1.0f;
        this.f45926u = true;
        this.f45914f = new android.graphics.Point();
        this.f45915g = getResources().getColor(com.tencent.mm.R.color.an7);
        this.f45917i = getResources().getColor(com.tencent.mm.R.color.an6);
        this.f45916h = getResources().getColor(com.tencent.mm.R.color.f479542an5);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f45919n = paint;
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f45919n.setColor(this.f45917i);
        this.f45919n.setStyle(android.graphics.Paint.Style.STROKE);
        this.f45919n.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 3.5f));
        this.f45922q = new android.graphics.Path();
        this.f45921p = new android.graphics.Paint(1);
        int color = getResources().getColor(com.tencent.mm.R.color.anc);
        this.f45918m = color;
        this.f45921p.setColor(color);
        this.f45921p.setStyle(android.graphics.Paint.Style.STROKE);
        this.f45921p.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 3.5f));
    }

    public static int a(float f17, int i17, int i18) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int alpha = android.graphics.Color.alpha(i17);
        int red = android.graphics.Color.red(i17);
        int blue = android.graphics.Color.blue(i17);
        int green = android.graphics.Color.green(i17);
        int alpha2 = android.graphics.Color.alpha(i18);
        int red2 = android.graphics.Color.red(i18);
        return android.graphics.Color.argb((int) (((alpha2 - alpha) * f17) + alpha), (int) (((red2 - red) * f17) + red), (int) ((f17 * (android.graphics.Color.green(i18) - green)) + green), (int) (((android.graphics.Color.blue(i18) - blue) * f17) + blue));
    }

    public final void b(float f17, float f18) {
        android.graphics.Point point = this.f45914f;
        int i17 = point.x;
        int i18 = point.y;
        if (i17 > i18) {
            i17 = i18;
        }
        float round = i17 - java.lang.Math.round(getResources().getDisplayMetrics().density * 1.9f);
        int i19 = (int) (f17 * round);
        int i27 = (int) (round * f18);
        android.graphics.RectF rectF = this.f45920o;
        if (rectF == null) {
            android.graphics.Point point2 = this.f45914f;
            int i28 = point2.x;
            int i29 = point2.y;
            this.f45920o = new android.graphics.RectF(i28 - i19, i29 - i27, i28 + i19, i29 + i27);
        } else {
            android.graphics.Point point3 = this.f45914f;
            int i37 = point3.x;
            rectF.left = i37 - i19;
            int i38 = point3.y;
            rectF.top = i38 - i27;
            rectF.right = i37 + i19;
            rectF.bottom = i38 + i27;
        }
        this.f45922q.reset();
        this.f45922q.addOval(this.f45920o, android.graphics.Path.Direction.CCW);
    }

    public final void c(boolean z17) {
        this.f45923r = false;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "a", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(this, "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "a", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.ValueAnimator valueAnimator = this.f45913e;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning() || this.f45913e.isStarted()) {
            this.f45913e.cancel();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45926u) {
            if (!this.f45923r) {
                canvas.drawPath(this.f45922q, this.f45921p);
                return;
            }
            if (java.lang.Math.abs(this.f45920o.width() - this.f45920o.height()) > 1.0E-6f) {
                return;
            }
            canvas.save();
            float f17 = this.f45912d * 360.0f;
            android.graphics.Point point = this.f45914f;
            canvas.rotate(f17, point.x, point.y);
            int i17 = 0;
            while (i17 <= 360) {
                this.f45919n.setColor(i17 < 270 ? a(i17 / 270.0f, this.f45915g, this.f45917i) : a((i17 - 270) / 90.0f, this.f45917i, this.f45916h));
                canvas.drawArc(this.f45920o, i17, 1.0f, false, this.f45919n);
                i17++;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f45924s < 0.0f || this.f45925t < 0.0f) {
            b(1.0f, 1.0f);
        } else {
            b(this.f45924s, this.f45925t);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.graphics.Point point = this.f45914f;
        point.x = size >> 1;
        point.y = size2 >> 1;
        setMeasuredDimension(size, size2);
    }

    public void setShowOutCircle(boolean z17) {
        this.f45926u = z17;
    }
}
