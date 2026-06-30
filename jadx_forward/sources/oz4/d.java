package oz4;

/* loaded from: classes12.dex */
public class d implements android.text.style.LeadingMarginSpan, oz4.h, oz4.g {

    /* renamed from: f, reason: collision with root package name */
    public static android.graphics.Path f431809f;

    /* renamed from: d, reason: collision with root package name */
    public final int f431810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f431811e;

    public d(int i17, boolean z17, boolean z18, boolean z19) {
        this.f431810d = i17;
        this.f431811e = z17 && z19 && !z18;
        if (f431809f == null) {
            f431809f = new android.graphics.Path();
        }
    }

    @Override // oz4.g
    public oz4.g a() {
        return new oz4.d(this.f431810d, this.f431811e);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, boolean z17, android.text.Layout layout) {
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        if (this.f431811e || spanned.getSpanStart(this) != i29) {
            return;
        }
        android.graphics.Paint.Style style = paint.getStyle();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        f431809f.reset();
        f431809f.addCircle(0.0f, 0.0f, 6, android.graphics.Path.Direction.CW);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i38 = (((fontMetricsInt.descent + i27) + i27) + fontMetricsInt.ascent) / 2;
        canvas.save();
        canvas.translate(i17 + (i18 * 6), i38);
        canvas.drawPath(f431809f, paint);
        canvas.restore();
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f431811e) {
            return 0;
        }
        return this.f431810d;
    }

    @Override // oz4.h
    /* renamed from: getValue */
    public java.lang.Object mo74982x754a37bb() {
        return java.lang.Boolean.TRUE;
    }

    public d(int i17, boolean z17) {
        this.f431810d = i17;
        this.f431811e = z17;
    }
}
