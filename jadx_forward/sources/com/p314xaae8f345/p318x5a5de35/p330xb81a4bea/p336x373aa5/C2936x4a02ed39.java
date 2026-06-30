package com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5;

/* renamed from: com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView */
/* loaded from: classes10.dex */
public class C2936x4a02ed39 extends android.view.View {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f127444v = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f127445d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f127446e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f127447f;

    /* renamed from: g, reason: collision with root package name */
    public int f127448g;

    /* renamed from: h, reason: collision with root package name */
    public int f127449h;

    /* renamed from: i, reason: collision with root package name */
    public int f127450i;

    /* renamed from: m, reason: collision with root package name */
    public int f127451m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f127452n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.RectF f127453o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Paint f127454p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Path f127455q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f127456r;

    /* renamed from: s, reason: collision with root package name */
    public volatile float f127457s;

    /* renamed from: t, reason: collision with root package name */
    public volatile float f127458t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f127459u;

    public C2936x4a02ed39(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f127445d = 0.0f;
        this.f127456r = false;
        this.f127457s = -1.0f;
        this.f127458t = -1.0f;
        this.f127459u = true;
        this.f127447f = new android.graphics.Point();
        this.f127448g = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.an7);
        this.f127450i = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.an6);
        this.f127449h = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561075an5);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f127452n = paint;
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f127452n.setColor(this.f127450i);
        this.f127452n.setStyle(android.graphics.Paint.Style.STROKE);
        this.f127452n.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 3.5f));
        this.f127455q = new android.graphics.Path();
        this.f127454p = new android.graphics.Paint(1);
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.anc);
        this.f127451m = color;
        this.f127454p.setColor(color);
        this.f127454p.setStyle(android.graphics.Paint.Style.STROKE);
        this.f127454p.setStrokeWidth(java.lang.Math.round(getResources().getDisplayMetrics().density * 3.5f));
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
        android.graphics.Point point = this.f127447f;
        int i17 = point.x;
        int i18 = point.y;
        if (i17 > i18) {
            i17 = i18;
        }
        float round = i17 - java.lang.Math.round(getResources().getDisplayMetrics().density * 1.9f);
        int i19 = (int) (f17 * round);
        int i27 = (int) (round * f18);
        android.graphics.RectF rectF = this.f127453o;
        if (rectF == null) {
            android.graphics.Point point2 = this.f127447f;
            int i28 = point2.x;
            int i29 = point2.y;
            this.f127453o = new android.graphics.RectF(i28 - i19, i29 - i27, i28 + i19, i29 + i27);
        } else {
            android.graphics.Point point3 = this.f127447f;
            int i37 = point3.x;
            rectF.left = i37 - i19;
            int i38 = point3.y;
            rectF.top = i38 - i27;
            rectF.right = i37 + i19;
            rectF.bottom = i38 + i27;
        }
        this.f127455q.reset();
        this.f127455q.addOval(this.f127453o, android.graphics.Path.Direction.CCW);
    }

    public final void c(boolean z17) {
        this.f127456r = false;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "a", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(this, "com/tencent/cloud/huiyan/view/LoadingFrontAnimatorView", "a", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.animation.ValueAnimator valueAnimator = this.f127446e;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning() || this.f127446e.isStarted()) {
            this.f127446e.cancel();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f127459u) {
            if (!this.f127456r) {
                canvas.drawPath(this.f127455q, this.f127454p);
                return;
            }
            if (java.lang.Math.abs(this.f127453o.width() - this.f127453o.height()) > 1.0E-6f) {
                return;
            }
            canvas.save();
            float f17 = this.f127445d * 360.0f;
            android.graphics.Point point = this.f127447f;
            canvas.rotate(f17, point.x, point.y);
            int i17 = 0;
            while (i17 <= 360) {
                this.f127452n.setColor(i17 < 270 ? a(i17 / 270.0f, this.f127448g, this.f127450i) : a((i17 - 270) / 90.0f, this.f127450i, this.f127449h));
                canvas.drawArc(this.f127453o, i17, 1.0f, false, this.f127452n);
                i17++;
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f127457s < 0.0f || this.f127458t < 0.0f) {
            b(1.0f, 1.0f);
        } else {
            b(this.f127457s, this.f127458t);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.graphics.Point point = this.f127447f;
        point.x = size >> 1;
        point.y = size2 >> 1;
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setShowOutCircle */
    public void m21968x5e3699ff(boolean z17) {
        this.f127459u = z17;
    }
}
