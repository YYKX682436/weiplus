package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.QTextView */
/* loaded from: classes13.dex */
public class C17991xb1b018e3 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f248116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f248117e;

    /* renamed from: f, reason: collision with root package name */
    public int f248118f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248119g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f248120h;

    /* renamed from: i, reason: collision with root package name */
    public int f248121i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f248122m;

    /* renamed from: n, reason: collision with root package name */
    public int f248123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248125p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 f248126q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 f248127r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f248128s;

    /* renamed from: t, reason: collision with root package name */
    public int f248129t;

    /* renamed from: u, reason: collision with root package name */
    public int f248130u;

    static {
        new java.util.HashMap();
    }

    public C17991xb1b018e3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248117e = "";
        this.f248129t = -1;
        this.f248130u = 0;
        this.f248128s = context;
        b();
    }

    public final int a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (this.f248125p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var = this.f248126q;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8.f249429h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            java.lang.String str = b8Var.f249436g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var2 = this.f248126q;
                java.lang.String str2 = this.f248117e;
                int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
                android.text.TextPaint textPaint = this.f248116d;
                b8Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                int a17 = b8Var2.a(str2, null, null, -1, paddingLeft, textPaint);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("breakText", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                this.f248130u = a17;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var3 = this.f248127r;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8.f249429h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            java.lang.String str3 = b8Var3.f249436g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                this.f248130u = this.f248127r.a(this.f248117e, this.f248119g, this.f248120h, this.f248121i, (i17 - getPaddingLeft()) - getPaddingRight(), this.f248116d);
            }
        }
        int paddingLeft2 = this.f248130u + getPaddingLeft() + getPaddingRight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("breakWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        return paddingLeft2;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248125p = false;
        this.f248122m = true;
        this.f248124o = false;
        this.f248121i = -1;
        this.f248119g = "...";
        this.f248120h = "";
        this.f248123n = -16776961;
        this.f248126q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8();
        this.f248127r = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f248116d = textPaint;
        textPaint.setAntiAlias(true);
        if (this.f248129t == -1) {
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this.f248128s, 12.0f);
            this.f248129t = d17;
            this.f248116d.setTextSize(d17);
        } else {
            this.f248116d.setTextSize(13.0f);
        }
        this.f248116d.setColor(-16777216);
        this.f248116d.setTextAlign(android.graphics.Paint.Align.LEFT);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: getIsExpanded */
    public boolean m70671x4b640bf9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        boolean z17 = this.f248125p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIsExpanded", "com.tencent.mm.plugin.sns.ui.QTextView");
        return z17;
    }

    /* renamed from: getText */
    public java.lang.String m70672xfb85ada3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        java.lang.String str = this.f248117e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getText", "com.tencent.mm.plugin.sns.ui.QTextView");
        return str;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var;
        java.util.List b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
        super.onDraw(canvas);
        if (this.f248125p) {
            b8Var = this.f248126q;
            b17 = b8Var.b();
        } else {
            b8Var = this.f248127r;
            b17 = b8Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var2 = b8Var;
        java.util.List list = b17;
        float paddingLeft = getPaddingLeft();
        char c17 = 0;
        float paddingTop = getPaddingTop() + (-this.f248118f);
        int i17 = 0;
        while (i17 < list.size()) {
            int[] iArr = (int[]) list.get(i17);
            int i18 = i17;
            canvas.drawText(this.f248117e, iArr[c17], iArr[1] + 1, paddingLeft, paddingTop, (android.graphics.Paint) this.f248116d);
            if (i18 == list.size() - 1) {
                b8Var2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                boolean z17 = b8Var2.f249430a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequiredEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                if (z17) {
                    java.lang.String str = this.f248119g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    float f17 = b8Var2.f249432c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLengthLastEllipsizedLine", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                    canvas.drawText(str, f17 + paddingLeft, paddingTop, this.f248116d);
                    if (this.f248122m) {
                        int color = this.f248116d.getColor();
                        this.f248116d.setColor(this.f248123n);
                        if (this.f248124o) {
                            java.lang.String str2 = this.f248120h;
                            float width = canvas.getWidth();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            float f18 = b8Var2.f249434e;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLengthEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas.drawText(str2, width - ((f18 + getPaddingRight()) + getPaddingLeft()), paddingTop, this.f248116d);
                        } else {
                            java.lang.String str3 = this.f248120h;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            float f19 = b8Var2.f249432c + b8Var2.f249433d;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLengthLastEllipsizedLinePlusEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
                            canvas.drawText(str3, f19 + paddingLeft, paddingTop, this.f248116d);
                        }
                        this.f248116d.setColor(color);
                    }
                }
            }
            paddingTop += (-this.f248118f) + this.f248116d.descent();
            if (paddingTop > canvas.getHeight()) {
                break;
            }
            i17 = i18 + 1;
            c17 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == 1073741824) {
            a(size);
        } else if (mode == Integer.MIN_VALUE) {
            size = java.lang.Math.min(a(size), size);
        } else {
            a(size);
            size = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureWidth", "com.tencent.mm.plugin.sns.ui.QTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        this.f248118f = (int) this.f248116d.ascent();
        if (mode2 != 1073741824) {
            int size3 = ((this.f248125p ? ((java.util.ArrayList) this.f248126q.b()).size() : ((java.util.ArrayList) this.f248127r.b()).size()) * ((int) ((-this.f248118f) + this.f248116d.descent()))) + getPaddingTop() + getPaddingBottom();
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(size3, size2) : size3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measureHeight", "com.tencent.mm.plugin.sns.ui.QTextView");
        setMeasuredDimension(size, size2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setColorEllpsizeMore */
    public void m70673x3f90b322(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248123n = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setColorEllpsizeMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setDrawEllipsizeMoreString */
    public void m70674xa09c378d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248122m = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDrawEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setEllipsis */
    public void m70675x81d1ff53(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248119g = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEllipsis", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setEllipsisMore */
    public void m70676x3f70cd48(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248120h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEllipsisMore", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setMaxLines */
    public void m70677x8dd5167d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248121i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxLines", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setRightAlignEllipsizeMoreString */
    public void m70678xe76eb7e8(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248124o = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRightAlignEllipsizeMoreString", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setText */
    public void m70679x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248117e)) {
            this.f248117e = "";
        }
        this.f248117e = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var = this.f248126q;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8.f249429h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        b8Var.f249436g = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b8 b8Var2 = this.f248127r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        b8Var2.f249436g = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.QTextView$LineBreaker");
        requestLayout();
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setTextColor */
    public void m70680x1c5c5ff4(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248116d.setColor(i17);
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextColor", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    /* renamed from: setTextSize */
    public void m70681x3abfd950(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
        this.f248116d.setTextSize(i17);
        requestLayout();
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextSize", "com.tencent.mm.plugin.sns.ui.QTextView");
    }

    public C17991xb1b018e3(android.content.Context context) {
        super(context);
        this.f248117e = "";
        this.f248129t = -1;
        this.f248130u = 0;
        this.f248128s = context;
        b();
    }
}
