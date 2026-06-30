package com.tencent.mm.feature.chatbot.brand.ui.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/view/FirstLinePrefixedTextView;", "Landroid/widget/FrameLayout;", "", "gapDp", "Ljz5/f0;", "setGapDp", "restSp", "setRestLineIndentSp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FirstLinePrefixedTextView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f65319d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f65320e;

    /* renamed from: f, reason: collision with root package name */
    public int f65321f;

    /* renamed from: g, reason: collision with root package name */
    public int f65322g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f65323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstLinePrefixedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488243e04, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f65319d = inflate;
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488244e05, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) inflate2;
        this.f65320e = textView;
        this.f65321f = (int) android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.f65322g = (int) android.util.TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics());
        this.f65323h = "";
        inflate.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        addView(textView);
        addView(inflate);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        android.widget.TextView textView = this.f65320e;
        textView.layout(paddingLeft, paddingTop, textView.getMeasuredWidth() + paddingLeft, textView.getMeasuredHeight() + paddingTop);
        android.view.View view = this.f65319d;
        view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        measureChildWithMargins(this.f65319d, i17, 0, i18, 0);
        android.view.View view = this.f65319d;
        int measuredWidth = view.getMeasuredWidth() + this.f65321f;
        android.text.SpannableString spannableString = new android.text.SpannableString(this.f65323h);
        spannableString.setSpan(new android.text.style.LeadingMarginSpan.Standard(measuredWidth, this.f65322g), 0, spannableString.length(), 33);
        android.widget.TextView textView = this.f65320e;
        textView.setText(spannableString);
        measureChildWithMargins(this.f65320e, i17, 0, i18, 0);
        setMeasuredDimension(android.view.View.resolveSize(getPaddingLeft() + getPaddingRight() + java.lang.Math.max(textView.getMeasuredWidth(), view.getMeasuredWidth()), i17), android.view.View.resolveSize(getPaddingTop() + getPaddingBottom() + java.lang.Math.max(textView.getMeasuredHeight(), view.getMeasuredHeight()), i18));
    }

    public final void setGapDp(float f17) {
        this.f65321f = (int) android.util.TypedValue.applyDimension(1, f17, getResources().getDisplayMetrics());
        requestLayout();
    }

    public final void setRestLineIndentSp(float f17) {
        this.f65322g = (int) android.util.TypedValue.applyDimension(2, f17, getResources().getDisplayMetrics());
        requestLayout();
    }
}
