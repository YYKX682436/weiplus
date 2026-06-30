package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.MMTruncTextView */
/* loaded from: classes4.dex */
public class C22508xc962957e extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f291616d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f291617e;

    public C22508xc962957e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291616d = false;
        this.f291617e = false;
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f291616d) {
            java.lang.CharSequence text = getText();
            if (text instanceof android.text.Spanned) {
                this.f291617e = true;
                setText(android.text.TextUtils.ellipsize(text, getPaint(), (getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft(), android.text.TextUtils.TruncateAt.END));
                this.f291617e = false;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        this.f291616d = !this.f291617e;
    }

    public C22508xc962957e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291616d = false;
        this.f291617e = false;
    }
}
