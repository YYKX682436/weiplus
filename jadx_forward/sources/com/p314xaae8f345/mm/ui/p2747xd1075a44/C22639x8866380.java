package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/widget/RCLinearLayout;", "Landroid/widget/LinearLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.RCLinearLayout */
/* loaded from: classes3.dex */
public class C22639x8866380 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f292932d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f292933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22639x8866380(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float b17 = i65.a.b(getContext(), 4) * 1.0f;
        this.f292932d = b17;
        this.f292933e = new float[]{b17, b17, b17, b17, b17, b17, b17, b17};
        if (attributeSet != null) {
            a(attributeSet, 0);
        }
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.C, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (int) obtainStyledAttributes.getDimension(0, i65.a.b(getContext(), 4) * 1.0f);
                this.f292932d = dimension;
                this.f292933e = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RCLinearLayout", "initAttribute cornerDp:" + this.f292932d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f292933e, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    /* renamed from: setRadius */
    public final void m81430x205ac394(float f17) {
        this.f292932d = f17;
        this.f292933e = new float[]{f17, f17, f17, f17, f17, f17, f17, f17};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22639x8866380(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float b17 = i65.a.b(getContext(), 4) * 1.0f;
        this.f292932d = b17;
        this.f292933e = new float[]{b17, b17, b17, b17, b17, b17, b17, b17};
        if (attributeSet != null) {
            a(attributeSet, i17);
        }
    }
}
