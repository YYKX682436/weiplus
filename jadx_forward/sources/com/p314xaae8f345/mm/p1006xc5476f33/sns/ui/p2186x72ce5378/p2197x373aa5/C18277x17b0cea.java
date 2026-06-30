package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTextView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTouchableTextView;", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "Ljz5/f0;", "setCustomText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView */
/* loaded from: classes4.dex */
public final class C18277x17b0cea extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18278x8895fd33 {

    /* renamed from: h, reason: collision with root package name */
    public int f250708h;

    /* renamed from: i, reason: collision with root package name */
    public int f250709i;

    /* renamed from: m, reason: collision with root package name */
    public int f250710m;

    /* renamed from: n, reason: collision with root package name */
    public int f250711n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f250712o;

    public C18277x17b0cea(android.content.Context context) {
        super(context, null, 0, 6, null);
        this.f250712o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(getContext()));
    }

    public final void b(java.lang.CharSequence charSequence, yz5.l lVar) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        if (charSequence == null || charSequence.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int textSize = (int) getTextSize();
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            spannableStringBuilder.setSpan(new cd4.a(textSize), 0, spannableStringBuilder.length(), 33);
        } else {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(charSequence);
            spannableStringBuilder2.setSpan(new cd4.a(textSize), 0, charSequence.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        if (lVar != null) {
            lVar.mo146xb9724478(spannableStringBuilder);
        }
        setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.onMeasure(i17, i18);
        if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int maxLines = getMaxLines();
        if (maxLines <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        android.text.Layout layout = getLayout();
        if (layout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        if (layout.getLineCount() <= maxLines) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        int i19 = maxLines - 1;
        android.text.TextPaint paint = getPaint();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f250712o;
        paint.getFontMetricsInt(fontMetricsInt);
        int compoundPaddingTop = getCompoundPaddingTop() + java.lang.Math.min(layout.getLineBottom(i19), layout.getLineBaseline(i19) + fontMetricsInt.bottom) + getCompoundPaddingBottom();
        if (compoundPaddingTop < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), compoundPaddingTop);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    /* renamed from: setCustomText */
    public final void m71028xbe1e2a40(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        b(charSequence, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        this.f250710m = i18;
        this.f250711n = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setPadding(i17, this.f250710m - this.f250708h, i19, this.f250711n - this.f250709i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView
    public void setTextSize(int i17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setTextSize(i17, f17);
        if (yb4.a.f542230a.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int abs = java.lang.Math.abs(fontMetricsInt.top);
        int abs2 = java.lang.Math.abs(fontMetricsInt.ascent);
        int abs3 = java.lang.Math.abs(fontMetricsInt.bottom);
        int abs4 = java.lang.Math.abs(fontMetricsInt.descent);
        if (abs > abs2) {
            this.f250708h = abs - abs2;
        }
        if (abs3 > abs4) {
            this.f250709i = abs3 - abs4;
        }
        fontMetricsInt.toString();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        super.setPadding(paddingLeft, this.f250710m - this.f250708h, paddingRight, this.f250711n - this.f250709i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFixPadding", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextSize", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView");
    }

    public C18277x17b0cea(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.f250712o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(getContext()));
    }

    public C18277x17b0cea(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f250712o = new android.graphics.Paint.FontMetricsInt();
        setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(getContext()));
    }
}
