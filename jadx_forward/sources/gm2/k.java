package gm2;

/* loaded from: classes3.dex */
public final class k extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f354954d;

    public k(int i17) {
        this.f354954d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        java.lang.CharSequence charSequence2 = charSequence;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float f18 = ((int) paint.measureText(charSequence, i17, i18)) < this.f354954d ? ((r5 - r1) / 2) + f17 : f17;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        canvas.drawText(charSequence2, i17, i18, f18, i27, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        int measureText = (int) paint.measureText(charSequence, i17, i18);
        int i19 = this.f354954d;
        return measureText < i19 ? i19 : measureText;
    }
}
