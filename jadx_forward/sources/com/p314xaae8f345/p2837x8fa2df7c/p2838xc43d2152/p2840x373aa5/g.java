package com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f296735d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f296736e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f296737f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f296738g;

    public g(java.lang.String str, android.text.TextPaint textPaint) {
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f296735d = textPaint2;
        this.f296738g = false;
        textPaint2.set(textPaint);
        this.f296736e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = new float[this.f296736e.length()];
        this.f296737f = fArr;
        this.f296735d.getTextWidths(this.f296736e, fArr);
        this.f296738g = true;
    }
}
