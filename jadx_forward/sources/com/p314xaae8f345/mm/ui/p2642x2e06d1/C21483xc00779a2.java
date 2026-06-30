package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMAutoSizeTextView */
/* loaded from: classes4.dex */
public class C21483xc00779a2 extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public float f278844d;

    /* renamed from: e, reason: collision with root package name */
    public float f278845e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f278846f;

    /* renamed from: g, reason: collision with root package name */
    public float f278847g;

    public C21483xc00779a2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }

    public final void a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", str, java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return;
        }
        int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
        float textSize = getTextSize();
        this.f278847g = textSize;
        if (textSize <= this.f278844d) {
            this.f278847g = this.f278845e;
        }
        float f17 = this.f278847g;
        this.f278846f.setTextSize(f17);
        while (true) {
            if (f17 <= this.f278844d || this.f278846f.measureText(str) <= paddingLeft) {
                break;
            }
            f17 -= 1.0f;
            float f18 = this.f278844d;
            if (f17 <= f18) {
                f17 = f18;
                break;
            }
            this.f278846f.setTextSize(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.f278847g), java.lang.Float.valueOf(this.f278846f.measureText(str)), java.lang.Integer.valueOf(paddingLeft));
        setTextSize(0, f17);
    }

    public final void b() {
        setSingleLine();
        setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f278844d = i65.a.b(getContext(), 8);
        this.f278845e = i65.a.b(getContext(), 22);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f278846f = paint;
        paint.set(getPaint());
        float textSize = getTextSize();
        this.f278847g = textSize;
        if (textSize <= this.f278844d) {
            this.f278847g = this.f278845e;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAutoSizeTextView", th6, "", new java.lang.Object[0]);
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

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoSizeTextView", "on size changed");
        if (i17 != i19) {
            a(getText().toString(), i17);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoSizeTextView", "on text changed");
        super.onTextChanged(charSequence, i17, i18, i19);
        a(charSequence.toString(), getWidth());
    }

    public C21483xc00779a2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
