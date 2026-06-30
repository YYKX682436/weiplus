package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1688xc8466c51;

/* renamed from: com.tencent.mm.plugin.finder.widget.record.MarqueeTextView */
/* loaded from: classes5.dex */
public class C15514xec535794 extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f218501d;

    /* renamed from: e, reason: collision with root package name */
    public int f218502e;

    /* renamed from: f, reason: collision with root package name */
    public int f218503f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218504g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218505h;

    /* renamed from: i, reason: collision with root package name */
    public int f218506i;

    /* renamed from: m, reason: collision with root package name */
    public int f218507m;

    public C15514xec535794(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        android.widget.Scroller scroller = this.f218501d;
        if (scroller == null || !scroller.isFinished() || this.f218504g) {
            return;
        }
        if (this.f218506i == 101) {
            android.widget.Scroller scroller2 = this.f218501d;
            if (scroller2 == null) {
                return;
            }
            this.f218503f = 0;
            this.f218504g = true;
            this.f218505h = true;
            scroller2.startScroll(0, 0, 0, 0, 0);
            invalidate();
            return;
        }
        this.f218504g = true;
        this.f218503f = getWidth() * (-1);
        this.f218505h = false;
        if (this.f218504g) {
            setHorizontallyScrolling(true);
            if (this.f218501d == null) {
                android.widget.Scroller scroller3 = new android.widget.Scroller(getContext(), new android.view.animation.LinearInterpolator());
                this.f218501d = scroller3;
                setScroller(scroller3);
            }
            android.text.TextPaint paint = getPaint();
            android.graphics.Rect rect = new android.graphics.Rect();
            java.lang.String charSequence = getText().toString();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            int width = rect.width();
            int i17 = width - this.f218503f;
            int intValue = java.lang.Double.valueOf(((this.f218502e * i17) * 1.0d) / width).intValue();
            if (this.f218505h) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new uy2.a(this, i17, intValue), this.f218507m);
                return;
            }
            this.f218501d.startScroll(this.f218503f, 0, i17, 0, intValue);
            invalidate();
            this.f218504g = false;
        }
    }

    /* renamed from: getRndDuration */
    public int m63446x97168a26() {
        return this.f218502e;
    }

    /* renamed from: getScrollFirstDelay */
    public int m63447x36f2f2d6() {
        return this.f218507m;
    }

    /* renamed from: getScrollMode */
    public int m63448xf2311e06() {
        return this.f218506i;
    }

    /* renamed from: setRndDuration */
    public void m63449x2d7bfd9a(int i17) {
        this.f218502e = i17;
    }

    /* renamed from: setScrollFirstDelay */
    public void m63450xdaef87e2(int i17) {
        this.f218507m = i17;
    }

    /* renamed from: setScrollMode */
    public void m63451x20556c12(int i17) {
        this.f218506i = i17;
    }

    public C15514xec535794(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f218503f = 0;
        this.f218504g = true;
        this.f218505h = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f100088l);
        this.f218502e = obtainStyledAttributes.getInt(1, 10000);
        this.f218506i = obtainStyledAttributes.getInt(2, 100);
        this.f218507m = obtainStyledAttributes.getInt(0, 1000);
        obtainStyledAttributes.recycle();
        setSingleLine();
        setEllipsize(null);
    }
}
