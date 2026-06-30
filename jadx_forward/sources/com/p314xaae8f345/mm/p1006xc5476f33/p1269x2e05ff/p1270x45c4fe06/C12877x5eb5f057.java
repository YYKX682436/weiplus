package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/ball/appbrand/FloatBallRadiusLayout;", "Landroid/widget/RelativeLayout;", "", "r", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.appbrand.FloatBallRadiusLayout */
/* loaded from: classes4.dex */
public final class C12877x5eb5f057 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f174508d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f174509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12877x5eb5f057(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f174509e = new android.graphics.Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f174508d <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        android.graphics.Path path = this.f174509e;
        path.reset();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f17 = this.f174508d;
        path.addRoundRect(rectF, new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, android.graphics.Path.Direction.CCW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    /* renamed from: setRadius */
    public final void m54023x205ac394(float f17) {
        this.f174508d = f17;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12877x5eb5f057(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f174509e = new android.graphics.Path();
    }
}
