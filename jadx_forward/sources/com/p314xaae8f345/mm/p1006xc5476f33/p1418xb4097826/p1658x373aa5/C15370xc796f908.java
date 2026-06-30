package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/LiveMarqueeTextView;", "Landroid/view/View;", "", "value", "p", "F", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "", "q", "I", "setTextColor", "(I)V", "textColor", "r", "setLineSpacing", "lineSpacing", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.LiveMarqueeTextView */
/* loaded from: classes2.dex */
public final class C15370xc796f908 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f213062d;

    /* renamed from: e, reason: collision with root package name */
    public int f213063e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f213064f;

    /* renamed from: g, reason: collision with root package name */
    public float f213065g;

    /* renamed from: h, reason: collision with root package name */
    public float f213066h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f213067i;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f213068m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f213069n;

    /* renamed from: o, reason: collision with root package name */
    public long f213070o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float textSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public float lineSpacing;

    /* renamed from: s, reason: collision with root package name */
    public final long f213074s;

    /* renamed from: t, reason: collision with root package name */
    public final long f213075t;

    /* renamed from: u, reason: collision with root package name */
    public int f213076u;

    /* renamed from: v, reason: collision with root package name */
    public final int f213077v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Paint f213078w;

    /* renamed from: x, reason: collision with root package name */
    public final float f213079x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15370xc796f908(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15370xc796f908 c15370xc796f908) {
        if (c15370xc796f908.f213076u < c15370xc796f908.f213077v + 1) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, c15370xc796f908.f213066h);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gr(c15370xc796f908));
            ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ir(c15370xc796f908));
            ofFloat.start();
            c15370xc796f908.f213067i = ofFloat;
            return;
        }
        android.animation.ValueAnimator valueAnimator = c15370xc796f908.f213068m;
        if (valueAnimator != null) {
            valueAnimator.start();
            return;
        }
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, c15370xc796f908.f213066h);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jr(c15370xc796f908));
        ofFloat2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.lr(c15370xc796f908));
        ofFloat2.start();
        c15370xc796f908.f213068m = ofFloat2;
    }

    /* renamed from: setLineSpacing */
    private final void m62450xf5e6bed(float f17) {
        this.lineSpacing = f17;
    }

    /* renamed from: setTextColor */
    private final void m62451x1c5c5ff4(int i17) {
        this.textColor = i17;
        this.f213064f.setColor(i17);
    }

    /* renamed from: setTextSize */
    private final void m62452x3abfd950(float f17) {
        this.textSize = f17;
        this.f213064f.setTextSize(f17);
    }

    public final void b() {
        this.f213062d.clear();
        android.animation.ValueAnimator valueAnimator = this.f213067i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f213068m;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f213076u = 1;
        this.f213063e = 0;
        this.f213065g = 0.0f;
        invalidate();
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        this.f213067i = null;
        this.f213068m = null;
        setVisibility(8);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        java.util.List list = this.f213062d;
        if (((java.util.ArrayList) list).isEmpty()) {
            canvas.restoreToCount(saveLayer);
            return;
        }
        int i17 = this.f213076u;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = this.f213063e + i18;
            float height = getHeight();
            float f17 = this.f213066h;
            float f18 = (((height + f17) - (((this.f213076u - i18) - 1) * f17)) - (this.lineSpacing / 2)) - this.f213065g;
            if (f18 >= 0.0f && f18 <= getHeight() + this.lineSpacing + this.f213066h && i19 < ((java.util.ArrayList) list).size()) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = getContext();
                java.lang.CharSequence charSequence = (java.lang.CharSequence) ((java.util.ArrayList) list).get(i19);
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence);
                android.text.TextPaint textPaint = new android.text.TextPaint(this.f213064f);
                float measureText = textPaint.measureText("...");
                float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                float desiredWidth = android.text.Layout.getDesiredWidth(i27, 0, i27.length(), textPaint);
                android.text.Spanned spanned = i27;
                if (desiredWidth > width) {
                    int length = i27.length();
                    while (length > 0 && android.text.Layout.getDesiredWidth(i27, 0, length, textPaint) + measureText > width) {
                        length--;
                    }
                    spanned = new android.text.SpannableStringBuilder(i27.subSequence(0, length)).append((java.lang.CharSequence) "...");
                }
                android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(spanned, 0, ((android.text.GetChars) spanned).length(), new android.text.TextPaint(textPaint), (getWidth() - getPaddingLeft()) - getPaddingRight()).build();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
                canvas.save();
                canvas.translate(getPaddingLeft(), f18 - build.getHeight());
                build.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f213077v > 1 && (paint = this.f213078w) != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.f213079x, paint);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.graphics.Paint paint = this.f213064f;
        this.f213066h = java.lang.Math.abs(paint.getFontMetrics().bottom - paint.getFontMetrics().top) + this.lineSpacing;
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), (int) (this.f213066h * this.f213077v));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f213079x, 0, -1, android.graphics.Shader.TileMode.CLAMP));
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f213078w = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15370xc796f908(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213062d = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f213064f = paint;
        java.lang.String str = "LiveMarqueeTextView_" + hashCode();
        this.f213069n = str;
        this.textSize = 40.0f;
        this.textColor = -16777216;
        this.lineSpacing = 20.0f;
        this.f213074s = 1000L;
        this.f213075t = 800L;
        this.f213076u = 1;
        this.f213077v = 3;
        this.f213079x = 100.0f;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f100087k, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            m62452x3abfd950(obtainStyledAttributes.getDimension(1, 40.0f));
            m62451x1c5c5ff4(obtainStyledAttributes.getColor(0, -16777216));
            m62450xf5e6bed(obtainStyledAttributes.getDimension(2, 20.0f));
            obtainStyledAttributes.recycle();
        }
        m62452x3abfd950(this.textSize * i65.a.j(context));
        paint.setAntiAlias(true);
        paint.setTextSize(this.textSize);
        paint.setColor(this.textColor);
        ae2.in inVar = ae2.in.f85221a;
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.H).mo141623x754a37bb()).r()).intValue();
        this.f213074s = intValue;
        long intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.G).mo141623x754a37bb()).r()).intValue();
        this.f213075t = intValue2;
        int intValue3 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.A).mo141623x754a37bb()).r()).intValue();
        this.f213077v = intValue3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstScrollInterval: " + intValue + ", scrollInterval: " + intValue2 + ", maxVisibleCount: " + intValue3);
    }
}
