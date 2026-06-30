package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class b implements if1.h {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.ThreadLocal f80672i = new com.tencent.mm.plugin.appbrand.jsapi.coverview.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f80673d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.res.Resources f80674e;

    /* renamed from: f, reason: collision with root package name */
    public final mm0.e f80675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f80676g;

    /* renamed from: h, reason: collision with root package name */
    public yl1.a f80677h;

    public b(android.content.res.Resources resources, int i17) {
        this.f80676g = "";
        this.f80674e = resources;
        android.text.TextPaint textPaint = (android.text.TextPaint) f80672i.get();
        java.util.Objects.requireNonNull(textPaint);
        this.f80673d = textPaint;
        this.f80676g = "";
        mm0.e c17 = mm0.e.c();
        c17.f328581b = "";
        c17.f328582c = 0;
        c17.f328583d = "".length();
        c17.f328584e = textPaint;
        c17.f328585f = i17;
        this.f80675f = c17;
    }

    public final void a() {
        yl1.a aVar = this.f80677h;
        mm0.e eVar = this.f80675f;
        if (aVar != null) {
            android.text.SpannableString spannableString = new android.text.SpannableString(this.f80676g);
            spannableString.setSpan(this.f80677h, 0, spannableString.length(), 18);
            eVar.f328581b = spannableString;
            eVar.f328582c = 0;
            eVar.f328583d = spannableString.length();
            return;
        }
        java.lang.CharSequence charSequence = this.f80676g;
        if (charSequence == null) {
            eVar.getClass();
            return;
        }
        eVar.f328581b = charSequence;
        eVar.f328582c = 0;
        eVar.f328583d = charSequence.length();
    }

    @Override // if1.h
    public float getTextSize() {
        return this.f80673d.getTextSize();
    }

    @Override // if1.h
    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        mm0.e eVar = this.f80675f;
        if (truncateAt != null) {
            eVar.f328588i = truncateAt;
        } else {
            eVar.getClass();
        }
    }

    @Override // if1.h
    public void setFakeBoldText(boolean z17) {
        this.f80673d.setFakeBoldText(z17);
    }

    @Override // if1.h
    public void setFontFamily(android.graphics.Typeface typeface) {
        this.f80673d.setTypeface(typeface);
    }

    @Override // if1.h
    public void setFontWeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            com.tencent.mars.xlog.Log.e("luggage.JsApiMeasureTextString", "not support setFontWeight");
        } else {
            this.f80673d.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false));
        }
    }

    @Override // if1.h
    public void setGravity(int i17) {
        this.f80675f.f328587h = i17;
    }

    @Override // if1.h
    public void setLineHeight(int i17) {
        yl1.a aVar = this.f80677h;
        if (aVar != null) {
            if (!(aVar.f462958d != java.lang.Math.round((float) i17))) {
                return;
            }
        }
        this.f80677h = new yl1.a(i17, 16);
        a();
    }

    @Override // if1.h
    public void setSingleLine(boolean z17) {
        mm0.e eVar = this.f80675f;
        if (z17) {
            eVar.f328590k = 1;
        } else {
            eVar.f328590k = Integer.MAX_VALUE;
        }
    }

    @Override // if1.h
    public void setText(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence.equals(this.f80676g)) {
            return;
        }
        this.f80676g = charSequence;
        a();
    }

    @Override // if1.h
    public void setTextColor(int i17) {
        this.f80673d.setColor(i17);
    }

    @Override // if1.h
    public void setTextSize(int i17, float f17) {
        this.f80673d.setTextSize(android.util.TypedValue.applyDimension(i17, f17, this.f80674e.getDisplayMetrics()));
    }
}
