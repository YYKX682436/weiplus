package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.CustomFitTextView */
/* loaded from: classes4.dex */
public class C22501x7b566052 extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f291564d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f291565e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f291566f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f291567g;

    /* renamed from: h, reason: collision with root package name */
    public int f291568h;

    /* renamed from: i, reason: collision with root package name */
    public int f291569i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f291570m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f291571n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f291572o;

    /* renamed from: p, reason: collision with root package name */
    public int f291573p;

    public C22501x7b566052(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291566f = new android.graphics.Rect();
        this.f291567g = new java.util.LinkedList();
        this.f291572o = true;
        this.f291573p = 0;
    }

    public final int a() {
        android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        java.util.LinkedList linkedList = this.f291567g;
        return ((int) ((linkedList.size() * ((fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading)) + getPaddingTop() + getPaddingBottom())) + (java.lang.Math.max(0, linkedList.size() - 1) * this.f291573p);
    }

    public final int b(java.lang.String str, int i17, int i18, int i19, int i27) {
        if (i18 <= i17) {
            return i17 + 1;
        }
        float f17 = i19;
        float f18 = i27;
        if (getPaint().measureText(str, i17, i18) + f17 < f18) {
            return i18;
        }
        int length = str.length();
        while (getPaint().measureText(str, i17, i18) + f17 > f18) {
            i18 = (i18 + i17) >> 1;
        }
        while (i18 <= length && getPaint().measureText(str, i17, i18) + f17 < f18) {
            i18++;
        }
        int min = java.lang.Math.min(length, i18) - 1;
        int i28 = min;
        while (i28 >= 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(str.charAt(i28))) {
            i28--;
        }
        return (i28 < 0 || i28 == min) ? i18 - 1 : i28 + 1;
    }

    public final boolean c(java.lang.String str, int i17) {
        if (!this.f291572o || i17 <= 0 || str == null || "".equals(str)) {
            return false;
        }
        java.util.LinkedList linkedList = this.f291567g;
        linkedList.clear();
        int length = str.length();
        int paddingLeft = (i17 - getPaddingLeft()) - getPaddingRight();
        int intrinsicWidth = this.f291571n ? this.f291570m.getIntrinsicWidth() : 0;
        float measureText = getPaint().measureText(str, 0, length) + intrinsicWidth;
        int i18 = this.f291568h;
        if (java.lang.Float.compare(measureText, i18 * paddingLeft) < 0) {
            i18 = (int) java.lang.Math.ceil(measureText / paddingLeft);
        }
        int i19 = i18;
        int i27 = 0;
        for (int i28 = 0; i28 < i19; i28++) {
            if (i28 == i19 - 1) {
                java.lang.String trim = str.substring(i27, b(str, i27, length, intrinsicWidth, paddingLeft)).trim();
                if (linkedList != null && trim != null && !"".equals(trim)) {
                    linkedList.add(trim);
                }
            } else {
                int b17 = b(str, i27, length, 0, paddingLeft);
                java.lang.String trim2 = str.substring(i27, b17).trim();
                if (linkedList != null && trim2 != null && !"".equals(trim2)) {
                    linkedList.add(trim2);
                }
                if (b17 >= length) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
                    return true;
                }
                i27 = b17;
            }
        }
        return true;
    }

    public void d(java.lang.String str, int i17, boolean z17, int i18, int i19) {
        this.f291568h = i17;
        this.f291565e = str;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CustomFitTextView", "ori text is null");
            this.f291565e = "";
        }
        if (this.f291568h <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CustomFitTextView", "maxLines is invalid");
            this.f291568h = 2;
        }
        this.f291573p = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        this.f291571n = z17;
        this.f291569i = i18;
        if (z17) {
            this.f291570m = getResources().getDrawable(this.f291569i);
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f291564d = paint;
        paint.set(getPaint());
        this.f291564d.setAntiAlias(true);
        this.f291564d.setColor(i19);
        c(this.f291565e, getWidth());
        setHeight(java.lang.Math.max(a(), i65.a.b(getContext(), 32)));
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.lang.String str;
        if (!this.f291572o || (str = this.f291565e) == null || "".equals(str)) {
            return;
        }
        java.util.LinkedList linkedList = this.f291567g;
        if (linkedList.size() == 0) {
            return;
        }
        android.graphics.Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f17 = fontMetrics.descent - fontMetrics.ascent;
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            paddingTop += fontMetrics.leading + f17;
            canvas.drawText(str2, paddingLeft, paddingTop, this.f291564d);
        }
        if (this.f291571n) {
            android.text.TextPaint paint = getPaint();
            java.lang.String str3 = (java.lang.String) linkedList.getLast();
            int length = ((java.lang.String) linkedList.getLast()).length();
            android.graphics.Rect rect = this.f291566f;
            paint.getTextBounds(str3, 0, length, rect);
            int paddingLeft2 = getPaddingLeft() + rect.right;
            int intrinsicWidth = this.f291570m.getIntrinsicWidth() + paddingLeft2;
            int i17 = (int) ((paddingTop - f17) - fontMetrics.leading);
            this.f291570m.setBounds(paddingLeft2, i17, intrinsicWidth, this.f291570m.getIntrinsicHeight() + i17);
            this.f291570m.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int b17 = i65.a.b(getContext(), 32);
        if (c(this.f291565e, size)) {
            b17 = java.lang.Math.max(a(), b17);
        }
        setMeasuredDimension(size, b17);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        boolean z17 = (i17 == i19 && i18 == i27) ? false : true;
        this.f291572o = z17;
        if (z17) {
            c(this.f291565e, i17);
        }
    }

    public C22501x7b566052(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291566f = new android.graphics.Rect();
        this.f291567g = new java.util.LinkedList();
        this.f291572o = true;
        this.f291573p = 0;
    }
}
