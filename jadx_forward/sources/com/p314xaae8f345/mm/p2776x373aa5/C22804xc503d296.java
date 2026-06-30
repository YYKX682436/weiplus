package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.RoundedCornerHardTouchableLayout */
/* loaded from: classes13.dex */
public class C22804xc503d296 extends com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 {

    /* renamed from: s, reason: collision with root package name */
    public ym5.c5 f294993s;

    public C22804xc503d296(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet, 0);
    }

    public final void d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528715J, i17, 0);
        this.f294993s = new ym5.c5(this, obtainStyledAttributes.getDimension(2, 0.0f), obtainStyledAttributes.getDimension(3, 0.0f), obtainStyledAttributes.getDimension(0, 0.0f), obtainStyledAttributes.getDimension(1, 0.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        ym5.c5 c5Var = this.f294993s;
        float f17 = c5Var.f544768a;
        float f18 = c5Var.f544769b;
        float f19 = c5Var.f544771d;
        float f27 = c5Var.f544770c;
        path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setRadius */
    public void m82735x205ac394(float f17) {
        ym5.c5 c5Var = this.f294993s;
        c5Var.f544768a = f17;
        c5Var.f544769b = f17;
        c5Var.f544770c = f17;
        c5Var.f544771d = f17;
        postInvalidate();
    }

    public C22804xc503d296(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        d(context, attributeSet, i17);
    }
}
