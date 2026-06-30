package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRadiusLayout */
/* loaded from: classes4.dex */
public class C12802xb2ff72a7 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f173434d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f173435e;

    public C12802xb2ff72a7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173434d = 0.0f;
        this.f173435e = new android.graphics.Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f173434d <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.Path path = this.f173435e;
        path.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f17 = this.f173434d;
        path.addRoundRect(rectF, new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, android.graphics.Path.Direction.CCW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    /* renamed from: setRadius */
    public void m53634x205ac394(java.lang.Float f17) {
        this.f173434d = f17.floatValue();
        requestLayout();
    }

    public C12802xb2ff72a7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173434d = 0.0f;
        this.f173435e = new android.graphics.Path();
    }
}
