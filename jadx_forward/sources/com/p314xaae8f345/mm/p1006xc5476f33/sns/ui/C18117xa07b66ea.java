package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTextView */
/* loaded from: classes4.dex */
public class C18117xa07b66ea extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public char f248991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f248992e;

    public C18117xa07b66ea(android.content.Context context) {
        super(context);
        this.f248991d = (char) 0;
        this.f248992e = "";
    }

    public final void a(java.lang.CharSequence charSequence, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), android.text.style.MetricAffectingSpan.class);
        if (metricAffectingSpanArr == null || metricAffectingSpanArr.length <= 0) {
            this.f248991d = 'd';
        } else {
            spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(metricAffectingSpanArr[0]) - 1, (java.lang.CharSequence) " ");
            this.f248991d = (char) (this.f248991d + 1);
        }
        setText(spannableStringBuilder);
        onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            int baseline = super.getBaseline();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return baseline;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsTextView", th6, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsTextView", th6, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        int i19 = wo.v1.f529366m.f529291p;
        if (i19 == 1 || i19 == -1) {
            try {
                super.onMeasure(i17, i18);
                this.f248991d = (char) 0;
            } catch (java.lang.IndexOutOfBoundsException e17) {
                char c17 = this.f248991d;
                if (c17 < 3) {
                    try {
                        a(getText(), i17, i18);
                    } catch (java.lang.IndexOutOfBoundsException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTextView", "tryToFix error set origintext " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248992e));
                        setText(this.f248992e);
                        onMeasure(i17, i18);
                        this.f248991d = (char) (this.f248991d + 1);
                    }
                } else {
                    if (c17 != 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                        throw e17;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTextView", "fix error set origintext " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248992e));
                    setText(this.f248992e);
                    onMeasure(i17, i18);
                    this.f248991d = (char) (this.f248991d + 1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                return;
            }
        } else {
            super.onMeasure(i17, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return onPreDraw;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return true;
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        return onTextContextMenuItem;
    }

    /* renamed from: setOriginText */
    public void m70801xac166b75(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        this.f248992e = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public C18117xa07b66ea(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248991d = (char) 0;
        this.f248992e = "";
    }
}
