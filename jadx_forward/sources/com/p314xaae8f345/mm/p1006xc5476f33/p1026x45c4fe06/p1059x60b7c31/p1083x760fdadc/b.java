package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes7.dex */
public class b implements if1.h {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.ThreadLocal f162205i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f162206d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.res.Resources f162207e;

    /* renamed from: f, reason: collision with root package name */
    public final mm0.e f162208f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f162209g;

    /* renamed from: h, reason: collision with root package name */
    public yl1.a f162210h;

    public b(android.content.res.Resources resources, int i17) {
        this.f162209g = "";
        this.f162207e = resources;
        android.text.TextPaint textPaint = (android.text.TextPaint) f162205i.get();
        java.util.Objects.requireNonNull(textPaint);
        this.f162206d = textPaint;
        this.f162209g = "";
        mm0.e c17 = mm0.e.c();
        c17.f410114b = "";
        c17.f410115c = 0;
        c17.f410116d = "".length();
        c17.f410117e = textPaint;
        c17.f410118f = i17;
        this.f162208f = c17;
    }

    public final void a() {
        yl1.a aVar = this.f162210h;
        mm0.e eVar = this.f162208f;
        if (aVar != null) {
            android.text.SpannableString spannableString = new android.text.SpannableString(this.f162209g);
            spannableString.setSpan(this.f162210h, 0, spannableString.length(), 18);
            eVar.f410114b = spannableString;
            eVar.f410115c = 0;
            eVar.f410116d = spannableString.length();
            return;
        }
        java.lang.CharSequence charSequence = this.f162209g;
        if (charSequence == null) {
            eVar.getClass();
            return;
        }
        eVar.f410114b = charSequence;
        eVar.f410115c = 0;
        eVar.f410116d = charSequence.length();
    }

    @Override // if1.h
    /* renamed from: getTextSize */
    public float mo50874x40077844() {
        return this.f162206d.getTextSize();
    }

    @Override // if1.h
    /* renamed from: setEllipsize */
    public void mo50875xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        mm0.e eVar = this.f162208f;
        if (truncateAt != null) {
            eVar.f410121i = truncateAt;
        } else {
            eVar.getClass();
        }
    }

    @Override // if1.h
    /* renamed from: setFakeBoldText */
    public void mo50876x2232cd49(boolean z17) {
        this.f162206d.setFakeBoldText(z17);
    }

    @Override // if1.h
    /* renamed from: setFontFamily */
    public void mo50877xd365a295(android.graphics.Typeface typeface) {
        this.f162206d.setTypeface(typeface);
    }

    @Override // if1.h
    /* renamed from: setFontWeight */
    public void mo50878xf09e89a9(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("luggage.JsApiMeasureTextString", "not support setFontWeight");
        } else {
            this.f162206d.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false));
        }
    }

    @Override // if1.h
    /* renamed from: setGravity */
    public void mo50879xc1f6fb8c(int i17) {
        this.f162208f.f410120h = i17;
    }

    @Override // if1.h
    /* renamed from: setLineHeight */
    public void mo50880xfda66c3d(int i17) {
        yl1.a aVar = this.f162210h;
        if (aVar != null) {
            if (!(aVar.f544491d != java.lang.Math.round((float) i17))) {
                return;
            }
        }
        this.f162210h = new yl1.a(i17, 16);
        a();
    }

    @Override // if1.h
    /* renamed from: setSingleLine */
    public void mo50881x52d64a5e(boolean z17) {
        mm0.e eVar = this.f162208f;
        if (z17) {
            eVar.f410123k = 1;
        } else {
            eVar.f410123k = Integer.MAX_VALUE;
        }
    }

    @Override // if1.h
    /* renamed from: setText */
    public void mo50882x765074af(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence.equals(this.f162209g)) {
            return;
        }
        this.f162209g = charSequence;
        a();
    }

    @Override // if1.h
    /* renamed from: setTextColor */
    public void mo50883x1c5c5ff4(int i17) {
        this.f162206d.setColor(i17);
    }

    @Override // if1.h
    /* renamed from: setTextSize */
    public void mo50884x3abfd950(int i17, float f17) {
        this.f162206d.setTextSize(android.util.TypedValue.applyDimension(i17, f17, this.f162207e.getDisplayMetrics()));
    }
}
