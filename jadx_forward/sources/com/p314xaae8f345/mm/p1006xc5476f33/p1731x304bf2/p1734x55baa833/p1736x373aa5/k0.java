package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes10.dex */
public class k0 extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f220724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f220725e;

    /* renamed from: f, reason: collision with root package name */
    public final int f220726f;

    /* renamed from: g, reason: collision with root package name */
    public final int f220727g;

    /* renamed from: h, reason: collision with root package name */
    public final int f220728h;

    /* renamed from: i, reason: collision with root package name */
    public final int f220729i;

    /* renamed from: m, reason: collision with root package name */
    public final int f220730m;

    /* renamed from: n, reason: collision with root package name */
    public final int f220731n;

    /* renamed from: o, reason: collision with root package name */
    public final int f220732o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(java.lang.String r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            float r1 = (float) r8
            r0.setTextSize(r1)
            int r1 = r5.length()
            r2 = 0
            float r0 = r0.measureText(r5, r2, r1)
            int r0 = (int) r0
            int r0 = r0 + r10
            int r0 = r0 + r11
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r3 = 1
            r1.setBounds(r2, r2, r0, r3)
            r4.<init>(r1, r3)
            r4.f220724d = r5
            r4.f220725e = r6
            r4.f220726f = r7
            r4.f220727g = r8
            r4.f220728h = r9
            r4.f220729i = r10
            r4.f220730m = r11
            r4.f220731n = r12
            r4.f220732o = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k0.<init>(java.lang.String, int, int, int, int, int, int, int, int):void");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        int i29 = this.f220729i;
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint.setTextSize(this.f220727g);
            paint.setAntiAlias(true);
            paint.setColor(this.f220725e);
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.left = f17;
            float f18 = i27;
            rectF.top = (paint.ascent() + f18) - this.f220731n;
            rectF.right = paint.measureText(this.f220724d, i17, i18) + f17 + i29 + this.f220730m;
            rectF.bottom = paint.descent() + f18 + this.f220732o;
            int i37 = this.f220728h;
            canvas.drawRoundRect(rectF, i37, i37, paint);
            paint.setColor(this.f220726f);
            canvas.drawText(this.f220724d, i17, i18, f17 + i29, f18, paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
        } catch (java.lang.Exception unused) {
        }
    }
}
