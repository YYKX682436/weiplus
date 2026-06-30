package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/view/RCRelativeLayout;", "Landroid/widget/RelativeLayout;", "", "r", "Ljz5/f0;", "setRadius", "Lym5/l3;", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.RCRelativeLayout */
/* loaded from: classes5.dex */
public final class C22798xaab445a7 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public ym5.l3 f294947d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f294948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22798xaab445a7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f294947d = new ym5.l3(0.0f, 0.0f, 0.0f, 0.0f);
        this.f294948e = new android.graphics.Path();
        if (attributeSet != null) {
            a(attributeSet, 0);
        }
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.B, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (int) obtainStyledAttributes.getDimension(0, i65.a.b(getContext(), 4) * 1.0f);
                ym5.l3 l3Var = this.f294947d;
                l3Var.f544959a = dimension;
                l3Var.f544960b = dimension;
                l3Var.f544961c = dimension;
                l3Var.f544962d = dimension;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RCRelativeLayout", "initAttribute radius:" + this.f294947d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        ym5.l3 l3Var = this.f294947d;
        if (l3Var.f544959a > 0.0f || l3Var.f544960b > 0.0f || l3Var.f544961c > 0.0f || l3Var.f544962d > 0.0f) {
            android.graphics.Path path = this.f294948e;
            path.reset();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            ym5.l3 l3Var2 = this.f294947d;
            float f17 = l3Var2.f544959a;
            float f18 = l3Var2.f544960b;
            float f19 = l3Var2.f544962d;
            float f27 = l3Var2.f544961c;
            path.addRoundRect(rectF, new float[]{f17, f17, f18, f18, f19, f19, f27, f27}, android.graphics.Path.Direction.CCW);
            path.close();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: setRadius */
    public final void m82641x205ac394(ym5.l3 cornerRadius) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cornerRadius, "cornerRadius");
        this.f294947d = cornerRadius;
        requestLayout();
    }

    /* renamed from: setRadius */
    public final void m82640x205ac394(float f17) {
        ym5.l3 l3Var = this.f294947d;
        l3Var.f544959a = f17;
        l3Var.f544960b = f17;
        l3Var.f544961c = f17;
        l3Var.f544962d = f17;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22798xaab445a7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f294947d = new ym5.l3(0.0f, 0.0f, 0.0f, 0.0f);
        this.f294948e = new android.graphics.Path();
        if (attributeSet != null) {
            a(attributeSet, i17);
        }
    }
}
