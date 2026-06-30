package com.tencent.mm.plugin.card.widget;

/* loaded from: classes4.dex */
public class MemberCardTopCropImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public int f95473d;

    /* renamed from: e, reason: collision with root package name */
    public int f95474e;

    /* renamed from: f, reason: collision with root package name */
    public float f95475f;

    /* renamed from: g, reason: collision with root package name */
    public float f95476g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Path f95477h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f95478i;

    public MemberCardTopCropImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95473d = -1;
        this.f95474e = -1;
        a();
    }

    public void a() {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f95473d = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480178qk);
        this.f95474e = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479884hx) * 2;
    }

    public float getShowScale() {
        return this.f95475f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f95478i;
        if (rectF != null && this.f95477h != null) {
            rectF.right = getWidth();
            this.f95478i.bottom = getHeight();
            android.graphics.Path path = this.f95477h;
            android.graphics.RectF rectF2 = this.f95478i;
            float f17 = this.f95476g;
            path.addRoundRect(rectF2, f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.f95477h);
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
        int i28 = getContext().getResources().getDisplayMetrics().widthPixels - this.f95474e;
        int i29 = this.f95473d;
        if (intrinsicWidth * i29 > intrinsicHeight * i28) {
            this.f95475f = i29 / intrinsicHeight;
        } else {
            this.f95475f = i28 / intrinsicWidth;
        }
        float f17 = this.f95475f;
        imageMatrix.setScale(f17, f17);
        setImageMatrix(imageMatrix);
        return super.setFrame(i17, i18, i19, i27);
    }

    public void setRadius(float f17) {
        this.f95476g = f17;
        if (f17 > 0.0f) {
            this.f95477h = new android.graphics.Path();
            this.f95478i = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public MemberCardTopCropImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f95473d = -1;
        this.f95474e = -1;
        a();
    }
}
