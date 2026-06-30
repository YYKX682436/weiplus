package ul1;

/* loaded from: classes7.dex */
public final class l extends yl1.a {
    public l(float f17) {
        super(f17, 17);
    }

    @Override // yl1.a, android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null && fontMetricsInt.bottom - fontMetricsInt.top <= this.f544491d) {
            super.chooseHeight(charSequence, i17, i18, i19, i27, fontMetricsInt);
        }
    }
}
