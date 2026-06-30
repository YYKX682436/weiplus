package com.p314xaae8f345.mm.ui.p2647x2e3067;

/* renamed from: com.tencent.mm.ui.blur.BlurView */
/* loaded from: classes5.dex */
public class C21592xe744b7cc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ib5.f f279538d;

    /* renamed from: e, reason: collision with root package name */
    public int f279539e;

    /* renamed from: f, reason: collision with root package name */
    public float f279540f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Path f279541g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.RectF f279542h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f279543i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f279544m;

    public C21592xe744b7cc(android.content.Context context) {
        super(context);
        this.f279538d = new ib5.h(this);
        this.f279540f = 0.0f;
        this.f279541g = new android.graphics.Path();
        this.f279542h = new android.graphics.RectF();
        this.f279544m = false;
        a(null, 0);
    }

    /* renamed from: setBlurController */
    private void m79367x3b949065(ib5.f fVar) {
        this.f279538d.mo135040x5cd39ffa();
        this.f279538d = fVar;
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.f528717b, i17, 0);
        this.f279539e = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public com.p314xaae8f345.mm.ui.p2647x2e3067.C21592xe744b7cc b(int i17) {
        this.f279538d.f(i17);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2647x2e3067.C21592xe744b7cc c(android.view.ViewGroup viewGroup) {
        ib5.d dVar = new ib5.d(this, viewGroup);
        m79367x3b949065(dVar);
        if (!isHardwareAccelerated()) {
            dVar.i(false);
        }
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f279538d.b(canvas);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        if (this.f279540f != 0.0f) {
            android.graphics.Path path = this.f279541g;
            path.reset();
            if (this.f279544m) {
                float f17 = this.f279540f;
                this.f279543i = new float[]{f17, f17, f17, f17, f17, f17, f17, f17};
            } else {
                float f18 = this.f279540f;
                this.f279543i = new float[]{f18, f18, f18, f18, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            android.graphics.RectF rectF = this.f279542h;
            rectF.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            path.addRoundRect(rectF, this.f279543i, android.graphics.Path.Direction.CCW);
            canvas.clipPath(path);
        }
        if (!canvas.isHardwareAccelerated()) {
            if (isHardwareAccelerated()) {
                return;
            }
            super.draw(canvas);
        } else {
            this.f279538d.a(canvas);
            int i17 = this.f279539e;
            if (i17 != 0) {
                canvas.drawColor(i17);
            }
            super.draw(canvas);
        }
    }

    /* renamed from: getBlurController */
    public ib5.f m79368x739e2859() {
        return this.f279538d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.f279538d.i(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f279538d.i(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f279538d.g();
    }

    public C21592xe744b7cc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279538d = new ib5.h(this);
        this.f279540f = 0.0f;
        this.f279541g = new android.graphics.Path();
        this.f279542h = new android.graphics.RectF();
        this.f279544m = false;
        a(attributeSet, 0);
    }

    public C21592xe744b7cc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279538d = new ib5.h(this);
        this.f279540f = 0.0f;
        this.f279541g = new android.graphics.Path();
        this.f279542h = new android.graphics.RectF();
        this.f279544m = false;
        a(attributeSet, i17);
    }
}
