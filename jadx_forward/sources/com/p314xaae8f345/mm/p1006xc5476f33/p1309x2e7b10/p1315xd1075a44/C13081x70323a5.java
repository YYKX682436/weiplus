package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44;

/* renamed from: com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView */
/* loaded from: classes4.dex */
public class C13081x70323a5 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public int f177006d;

    /* renamed from: e, reason: collision with root package name */
    public int f177007e;

    /* renamed from: f, reason: collision with root package name */
    public float f177008f;

    /* renamed from: g, reason: collision with root package name */
    public float f177009g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f177010h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f177011i;

    public C13081x70323a5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177006d = -1;
        this.f177007e = -1;
        a();
    }

    public void a() {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f177006d = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561711qk);
        this.f177007e = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 2;
    }

    /* renamed from: getShowScale */
    public float m54469x8d4a0597() {
        return this.f177008f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f177011i;
        if (rectF != null && this.f177010h != null) {
            rectF.right = getWidth();
            this.f177011i.bottom = getHeight();
            android.graphics.Path path = this.f177010h;
            android.graphics.RectF rectF2 = this.f177011i;
            float f17 = this.f177009g;
            path.addRoundRect(rectF2, f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.f177010h);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i17, int i18, int i19, int i27) {
        if (getDrawable() == null) {
            return super.setFrame(i17, i18, i19, i27);
        }
        android.graphics.Matrix imageMatrix = getImageMatrix();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        int i28 = getContext().getResources().getDisplayMetrics().widthPixels - this.f177007e;
        int i29 = this.f177006d;
        if (intrinsicWidth * i29 > intrinsicHeight * i28) {
            this.f177008f = i29 / intrinsicHeight;
        } else {
            this.f177008f = i28 / intrinsicWidth;
        }
        float f17 = this.f177008f;
        imageMatrix.setScale(f17, f17);
        setImageMatrix(imageMatrix);
        return super.setFrame(i17, i18, i19, i27);
    }

    /* renamed from: setRadius */
    public void m54470x205ac394(float f17) {
        this.f177009g = f17;
        if (f17 > 0.0f) {
            this.f177010h = new android.graphics.Path();
            this.f177011i = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public C13081x70323a5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f177006d = -1;
        this.f177007e = -1;
        a();
    }
}
