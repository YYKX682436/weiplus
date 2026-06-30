package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/widget/textview/FadeEdgeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "gradientScope", "Ljz5/f0;", "setGradientScope", "color", "setTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.textview.FadeEdgeTextView */
/* loaded from: classes4.dex */
public final class C22724xdb26ef0b extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public int f294055g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Shader f294056h;

    /* renamed from: i, reason: collision with root package name */
    public int f294057i;

    /* renamed from: m, reason: collision with root package name */
    public int f294058m;

    /* renamed from: n, reason: collision with root package name */
    public int f294059n;

    /* renamed from: o, reason: collision with root package name */
    public int f294060o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22724xdb26ef0b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void b() {
        int currentTextColor = getCurrentTextColor();
        if (getPaint().measureText(getText().toString()) > getMeasuredWidth()) {
            currentTextColor = 0;
        }
        int i17 = currentTextColor;
        if (getMeasuredWidth() > this.f294055g) {
            this.f294056h = new android.graphics.LinearGradient(getMeasuredWidth() - this.f294055g, 0.0f, getMeasuredWidth(), 0.0f, getCurrentTextColor(), i17, android.graphics.Shader.TileMode.CLAMP);
        } else {
            this.f294056h = new android.graphics.LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, getCurrentTextColor(), i17, android.graphics.Shader.TileMode.CLAMP);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.onDraw(canvas);
            return;
        }
        getPaint().setShader(this.f294056h);
        getPaint().setAlpha(255);
        android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        canvas.drawText(getText().toString(), 0.0f, (getMeasuredHeight() / 2) + ((-(fontMetrics.descent + fontMetrics.ascent)) / 2), getPaint());
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    /* renamed from: setGradientScope */
    public final void m82199xdce977c2(int i17) {
        this.f294055g = i17;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        this.f294059n = i18;
        this.f294060o = i27;
        super.setPadding(i17, i18 - this.f294057i, i19, i27 - this.f294058m);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        super.setTextColor(i17);
        b();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int abs = java.lang.Math.abs(fontMetricsInt.top);
        int abs2 = java.lang.Math.abs(fontMetricsInt.ascent);
        int abs3 = java.lang.Math.abs(fontMetricsInt.bottom);
        int abs4 = java.lang.Math.abs(fontMetricsInt.descent);
        if (abs > abs2) {
            this.f294057i = (abs - abs2) / 2;
        }
        if (abs3 > abs4) {
            this.f294058m = abs3 - abs4;
        }
        com.p314xaae8f345.mm.ui.yk.a("FadeEdgeTextView", "fixTopPadding:" + this.f294057i + " fixBottomPadding:" + this.f294058m + " font:" + fontMetricsInt, new java.lang.Object[0]);
        super.setPadding(getPaddingLeft(), this.f294059n - this.f294057i, getPaddingRight(), this.f294060o - this.f294058m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22724xdb26ef0b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544634h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f294055g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        setSingleLine();
    }
}
