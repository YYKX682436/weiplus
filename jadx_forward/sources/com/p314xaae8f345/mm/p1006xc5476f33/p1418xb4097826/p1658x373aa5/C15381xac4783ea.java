package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.B!\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b-\u00100J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/StrokeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Landroid/graphics/Typeface;", "tf", "setTypeface", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getStrokeTextView", "()Landroid/widget/TextView;", "setStrokeTextView", "(Landroid/widget/TextView;)V", "strokeTextView", "", "h", "I", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeColor", "", "i", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeWidth", "", "m", "Z", "getEnsureStrokeTextMeasureBeforeDraw", "()Z", "setEnsureStrokeTextMeasureBeforeDraw", "(Z)V", "ensureStrokeTextMeasureBeforeDraw", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.StrokeTextView */
/* loaded from: classes5.dex */
public class C15381xac4783ea extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView strokeTextView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int strokeColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float strokeWidth;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean ensureStrokeTextMeasureBeforeDraw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15381xac4783ea(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.strokeTextView = new android.widget.TextView(context, attrs);
        e(attrs, 0);
    }

    public void b(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.widget.TextView textView = this.strokeTextView;
        if (textView != null) {
            if (this.ensureStrokeTextMeasureBeforeDraw && (textView.getWidth() == 0 || textView.getHeight() == 0)) {
                textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            }
            textView.getPaint().setStrokeWidth(this.strokeWidth);
            textView.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
            textView.setTextColor(this.strokeColor);
            textView.setGravity(getGravity());
            textView.setTextSize(0, getTextSize());
            textView.draw(canvas);
        }
    }

    public void e(android.util.AttributeSet attrs, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, li0.a.f400286g, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.strokeWidth = obtainStyledAttributes.getFloat(1, 4.0f);
        this.strokeColor = obtainStyledAttributes.getColor(0, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
    }

    public final boolean getEnsureStrokeTextMeasureBeforeDraw() {
        return this.ensureStrokeTextMeasureBeforeDraw;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final android.widget.TextView getStrokeTextView() {
        return this.strokeTextView;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        b(canvas);
        super.onDraw(canvas);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.strokeTextView;
        if (textView != null) {
            textView.layout(i17, i18, i19, i27);
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        android.widget.TextView textView;
        if (this.ensureStrokeTextMeasureBeforeDraw && (textView = this.strokeTextView) != null) {
            textView.measure(i17, i18);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setEnsureStrokeTextMeasureBeforeDraw */
    public final void m62512x337da0fc(boolean z17) {
        this.ensureStrokeTextMeasureBeforeDraw = z17;
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.TextView textView = this.strokeTextView;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    /* renamed from: setStrokeColor */
    public final void m62513xe1d3a649(int i17) {
        this.strokeColor = i17;
    }

    /* renamed from: setStrokeTextView */
    public final void m62514x9e8eeccc(android.widget.TextView textView) {
        this.strokeTextView = textView;
    }

    /* renamed from: setStrokeWidth */
    public final void m62515xe2eaa4ac(float f17) {
        this.strokeWidth = f17;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        android.widget.TextView textView = this.strokeTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface) {
        android.widget.TextView textView = this.strokeTextView;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        super.setTypeface(typeface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15381xac4783ea(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.strokeTextView = new android.widget.TextView(context, attrs, i17);
        e(attrs, i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15381xac4783ea(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.strokeTextView = new android.widget.TextView(context);
    }
}
