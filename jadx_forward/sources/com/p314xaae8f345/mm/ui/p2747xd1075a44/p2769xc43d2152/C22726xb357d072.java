package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2769xc43d2152;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'B!\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b&\u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006*"}, d2 = {"Lcom/tencent/mm/ui/widget/textview/MMShadowTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getShadowTextView", "()Landroid/widget/TextView;", "setShadowTextView", "(Landroid/widget/TextView;)V", "shadowTextView", "", "h", "I", "getShadowMaskColor", "()I", "setShadowMaskColor", "(I)V", "shadowMaskColor", "", "i", "F", "getShadowMaskRadius", "()F", "setShadowMaskRadius", "(F)V", "shadowMaskRadius", "m", "getShadowMaskPadding", "setShadowMaskPadding", "shadowMaskPadding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.textview.MMShadowTextView */
/* loaded from: classes4.dex */
public class C22726xb357d072 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView shadowTextView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int shadowMaskColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float shadowMaskRadius;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float shadowMaskPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22726xb357d072(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.shadowMaskRadius = 16.0f;
        this.shadowMaskPadding = 16.0f;
        this.shadowTextView = new android.widget.TextView(context, attrs);
        b(attrs, 0);
    }

    public void b(android.util.AttributeSet attrs, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, yl5.a.f544639m, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.shadowMaskRadius = obtainStyledAttributes.getFloat(1, 16.0f);
        this.shadowMaskPadding = obtainStyledAttributes.getFloat(1, 16.0f);
        this.shadowMaskColor = obtainStyledAttributes.getColor(0, 637534208);
    }

    public final int getShadowMaskColor() {
        return this.shadowMaskColor;
    }

    public final float getShadowMaskPadding() {
        return this.shadowMaskPadding;
    }

    public final float getShadowMaskRadius() {
        return this.shadowMaskRadius;
    }

    public final android.widget.TextView getShadowTextView() {
        return this.shadowTextView;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.shadowMaskColor);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setMaskFilter(new android.graphics.BlurMaskFilter(this.shadowMaskRadius, android.graphics.BlurMaskFilter.Blur.NORMAL));
        float f17 = this.shadowMaskPadding;
        float f18 = 2;
        android.graphics.RectF rectF = new android.graphics.RectF(f17 / f18, f17, getMeasuredWidth() - (this.shadowMaskPadding / f18), getMeasuredHeight() - this.shadowMaskPadding);
        float f19 = this.shadowMaskRadius;
        canvas.drawRoundRect(rectF, f19, f19, paint);
        android.widget.TextView textView = this.shadowTextView;
        if (textView != null) {
            textView.setGravity(getGravity());
            textView.getPaint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
            textView.setTextSize(0, getTextSize());
            textView.draw(canvas);
            textView.getPaint().setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
        super.onDraw(canvas);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.shadowTextView;
        if (textView != null) {
            textView.layout(i17, i18, i19, i27);
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        android.widget.TextView textView = this.shadowTextView;
        if (textView != null) {
            textView.measure(i17, i18);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.TextView textView = this.shadowTextView;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    /* renamed from: setShadowMaskColor */
    public final void m82204x2c0901d5(int i17) {
        this.shadowMaskColor = i17;
    }

    /* renamed from: setShadowMaskPadding */
    public final void m82205xe5273a03(float f17) {
        this.shadowMaskPadding = f17;
    }

    /* renamed from: setShadowMaskRadius */
    public final void m82206x6de6e860(float f17) {
        this.shadowMaskRadius = f17;
    }

    /* renamed from: setShadowTextView */
    public final void m82207xc5c087b4(android.widget.TextView textView) {
        this.shadowTextView = textView;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        android.widget.TextView textView = this.shadowTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22726xb357d072(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.shadowMaskRadius = 16.0f;
        this.shadowMaskPadding = 16.0f;
        this.shadowTextView = new android.widget.TextView(context, attrs, i17);
        b(attrs, i17);
    }
}
