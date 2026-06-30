package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class s extends android.widget.TextView implements gb1.j, if1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f92102d;

    /* renamed from: e, reason: collision with root package name */
    public yl1.a f92103e;

    public s(android.content.Context context) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
        setIncludeFontPadding(false);
        setLineSpacing(0.0f, 1.0f);
        setSpannableFactory(new com.tencent.mm.plugin.appbrand.widget.r(this));
    }

    @Override // gb1.j
    public boolean a() {
        return this.f92102d;
    }

    @Override // if1.h
    public void setFakeBoldText(boolean z17) {
        getPaint().setFakeBoldText(z17);
    }

    @Override // if1.h
    public void setFontFamily(android.graphics.Typeface typeface) {
        setTypeface(typeface, 0);
    }

    @Override // if1.h
    public void setFontWeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false), 0);
        } else {
            com.tencent.mars.xlog.Log.e("luggage.AppBrandTextView", "not support setFontWeight");
        }
    }

    public void setInterceptEvent(boolean z17) {
        this.f92102d = z17;
    }

    @Override // android.widget.TextView, if1.h
    public void setLineHeight(int i17) {
        if (this.f92103e == null) {
            this.f92103e = new yl1.a(i17, 17);
        }
        if (this.f92103e.f462958d != java.lang.Math.round((float) i17)) {
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (bufferType == android.widget.TextView.BufferType.NORMAL) {
            bufferType = android.widget.TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }
}
