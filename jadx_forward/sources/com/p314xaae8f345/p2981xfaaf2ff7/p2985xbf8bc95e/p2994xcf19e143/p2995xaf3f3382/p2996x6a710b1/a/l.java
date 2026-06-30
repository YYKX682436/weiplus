package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes4.dex */
public class l extends android.widget.TextView {

    /* renamed from: a, reason: collision with root package name */
    public int f296939a;

    /* renamed from: b, reason: collision with root package name */
    public int f296940b;

    public l(android.content.Context context) {
        super(context);
        this.f296939a = 0;
        this.f296940b = 0;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.translate(this.f296940b / 2, this.f296939a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = java.lang.Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f296939a = measuredWidth - measuredHeight;
            this.f296940b = 0;
        } else {
            this.f296939a = 0;
            this.f296940b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
