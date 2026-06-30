package com.p314xaae8f345.mm.ui.p2642x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/ui/base/EllipsizedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxPixels", "Ljz5/f0;", "setMaxWidth", "setExtraEllipsizeWidth", "getExtraEllipsizeWidth", "", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.base.EllipsizedTextView */
/* loaded from: classes2.dex */
public final class C21474x2dffe629 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f278782g;

    /* renamed from: h, reason: collision with root package name */
    public int f278783h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f278784i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView.BufferType f278785m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f278786n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21474x2dffe629(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f278782g = "…";
    }

    public final void b(int i17, int i18, boolean z17) {
        java.lang.CharSequence subSequence;
        java.lang.CharSequence charSequence = this.f278784i;
        boolean z18 = charSequence instanceof android.text.SpannableString;
        java.lang.String str = this.f278782g;
        if (!z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.CharSequence charSequence2 = this.f278784i;
            sb6.append((java.lang.Object) (charSequence2 != null ? charSequence2.subSequence(i17, i18) : null));
            sb6.append(str);
            super.setText(sb6.toString(), this.f278785m);
            return;
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : null;
        if (spannableString == null || (subSequence = spannableString.subSequence(i17, i18)) == null) {
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subSequence);
        if (z17) {
            spannableStringBuilder.append((java.lang.CharSequence) str);
        }
        super.setText(spannableStringBuilder, this.f278785m);
    }

    /* renamed from: getExtraEllipsizeWidth, reason: from getter */
    public final int getF278783h() {
        return this.f278783h;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView
    public java.lang.CharSequence getText() {
        return this.f278784i;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        float measureText = getPaint().measureText(this.f278782g) * 1.2f;
        if (getEllipsize() != android.text.TextUtils.TruncateAt.END || (i19 = this.f278783h) <= 0 || i19 > getMeasuredWidth() || (getLayout().getEllipsisCount(getLayout().getLineCount() - 1) <= 0 && !this.f278786n)) {
            super.setText(this.f278784i, this.f278785m);
            super.onMeasure(i17, i18);
            return;
        }
        this.f278786n = false;
        int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineCount() - 1, (getMeasuredWidth() - measureText) - this.f278783h);
        java.lang.CharSequence charSequence = this.f278784i;
        int length = charSequence != null ? charSequence.length() : 0;
        if (offsetForHorizontal >= length || super.getText().length() != length) {
            if (offsetForHorizontal < length || super.getText().length() == length) {
                return;
            }
            super.setText(this.f278784i, this.f278785m);
            super.onMeasure(i17, i18);
            return;
        }
        if (this.f278785m == android.widget.TextView.BufferType.NORMAL) {
            b(0, offsetForHorizontal, true);
            this.f278786n = true;
        } else {
            b(0, offsetForHorizontal, false);
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: setExtraEllipsizeWidth */
    public final void m78883xc934b3a7(int i17) {
        this.f278783h = i17;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i17) {
        super.setMaxWidth(i17);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f278784i = charSequence;
        this.f278785m = bufferType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21474x2dffe629(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f278782g = "…";
    }
}
