package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5;

/* renamed from: com.tencent.mm.plugin.game.commlib.view.FixAspectRatioImageView */
/* loaded from: classes4.dex */
public class C15869xcd5a00e2 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public int f220957f;

    /* renamed from: g, reason: collision with root package name */
    public int f220958g;

    /* renamed from: h, reason: collision with root package name */
    public float f220959h;

    /* renamed from: i, reason: collision with root package name */
    public int f220960i;

    /* renamed from: m, reason: collision with root package name */
    public int f220961m;

    /* renamed from: n, reason: collision with root package name */
    public int f220962n;

    /* renamed from: o, reason: collision with root package name */
    public int f220963o;

    /* renamed from: p, reason: collision with root package name */
    public int f220964p;

    public C15869xcd5a00e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220959h = 0.0f;
        this.f220960i = 0;
        this.f220961m = 0;
        this.f220962n = 0;
        this.f220963o = 0;
        this.f220964p = 0;
        n(context, attributeSet, 0);
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.a.f363108a, i17, 0);
        this.f220959h = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f220960i = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f220961m = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f220962n = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f220963o = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        this.f220964p = dimensionPixelOffset;
        int i18 = this.f220961m;
        if (i18 == 0) {
            i18 = this.f220960i;
        }
        this.f220961m = i18;
        int i19 = this.f220962n;
        if (i19 == 0) {
            i19 = this.f220960i;
        }
        this.f220962n = i19;
        int i27 = this.f220963o;
        if (i27 == 0) {
            i27 = this.f220960i;
        }
        this.f220963o = i27;
        if (dimensionPixelOffset == 0) {
            dimensionPixelOffset = this.f220960i;
        }
        this.f220964p = dimensionPixelOffset;
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int max = java.lang.Math.max(this.f220961m, this.f220963o) + java.lang.Math.max(this.f220962n, this.f220964p);
        int max2 = java.lang.Math.max(this.f220961m, this.f220962n) + java.lang.Math.max(this.f220963o, this.f220964p);
        if (this.f220957f >= max && this.f220958g >= max2) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(this.f220961m, 0.0f);
            path.lineTo(this.f220957f - this.f220962n, 0.0f);
            int i17 = this.f220957f;
            path.quadTo(i17, 0.0f, i17, this.f220962n);
            path.lineTo(this.f220957f, this.f220958g - this.f220964p);
            int i18 = this.f220957f;
            int i19 = this.f220958g;
            path.quadTo(i18, i19, i18 - this.f220964p, i19);
            path.lineTo(this.f220963o, this.f220958g);
            path.quadTo(0.0f, this.f220958g, 0.0f, r1 - this.f220963o);
            path.lineTo(0.0f, this.f220961m);
            path.quadTo(0.0f, 0.0f, this.f220961m, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f220957f = getWidth();
        this.f220958g = getHeight();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f220959h == 0.0f) {
            super.onMeasure(i17, i18);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) (this.f220959h * size), 1073741824));
    }

    public C15869xcd5a00e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220959h = 0.0f;
        this.f220960i = 0;
        this.f220961m = 0;
        this.f220962n = 0;
        this.f220963o = 0;
        this.f220964p = 0;
        n(context, attributeSet, i17);
    }
}
