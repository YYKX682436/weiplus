package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes4.dex */
public class AppBrandTaskRadiusLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f91901d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f91902e;

    public AppBrandTaskRadiusLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91901d = 0.0f;
        this.f91902e = new android.graphics.Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        if (this.f91901d <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.Path path = this.f91902e;
        path.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f17 = this.f91901d;
        path.addRoundRect(rectF, new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, android.graphics.Path.Direction.CCW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public void setRadius(java.lang.Float f17) {
        this.f91901d = f17.floatValue();
        requestLayout();
    }

    public AppBrandTaskRadiusLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91901d = 0.0f;
        this.f91902e = new android.graphics.Path();
    }
}
