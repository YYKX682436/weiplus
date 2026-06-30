package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class s extends android.widget.TextView implements gb1.j, if1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f173635d;

    /* renamed from: e, reason: collision with root package name */
    public yl1.a f173636e;

    public s(android.content.Context context) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context));
        setIncludeFontPadding(false);
        setLineSpacing(0.0f, 1.0f);
        setSpannableFactory(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.r(this));
    }

    @Override // gb1.j
    public boolean a() {
        return this.f173635d;
    }

    @Override // if1.h
    /* renamed from: setFakeBoldText */
    public void mo50876x2232cd49(boolean z17) {
        getPaint().setFakeBoldText(z17);
    }

    @Override // if1.h
    /* renamed from: setFontFamily */
    public void mo50877xd365a295(android.graphics.Typeface typeface) {
        setTypeface(typeface, 0);
    }

    @Override // if1.h
    /* renamed from: setFontWeight */
    public void mo50878xf09e89a9(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false), 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("luggage.AppBrandTextView", "not support setFontWeight");
        }
    }

    /* renamed from: setInterceptEvent */
    public void m53689x1b3dbffa(boolean z17) {
        this.f173635d = z17;
    }

    @Override // android.widget.TextView, if1.h
    /* renamed from: setLineHeight */
    public void mo50880xfda66c3d(int i17) {
        if (this.f173636e == null) {
            this.f173636e = new yl1.a(i17, 17);
        }
        if (this.f173636e.f544491d != java.lang.Math.round((float) i17)) {
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
