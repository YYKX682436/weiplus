package yl1;

/* loaded from: classes7.dex */
public class a implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public int f544491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f544492e;

    public a(float f17, int i17) {
        this.f544492e = i17 & 112;
        this.f544491d = java.lang.Math.round(f17);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        int i28 = fontMetricsInt.ascent;
        int i29 = -i28;
        int i37 = this.f544491d;
        if (i29 > i37) {
            int i38 = -i37;
            fontMetricsInt.ascent = i38;
            fontMetricsInt.top = i38;
            fontMetricsInt.descent = 0;
            fontMetricsInt.bottom = 0;
            return;
        }
        int i39 = fontMetricsInt.descent;
        if ((-i28) + i39 > i37) {
            int i47 = fontMetricsInt.bottom;
            fontMetricsInt.descent = i47;
            int i48 = i47 - i37;
            fontMetricsInt.ascent = i48;
            fontMetricsInt.top = i48;
            return;
        }
        int i49 = fontMetricsInt.bottom;
        if ((-i28) + i49 > i37) {
            fontMetricsInt.top = i28;
            fontMetricsInt.bottom = i28 + i37;
            return;
        }
        int i57 = fontMetricsInt.top;
        if ((-i57) + i49 > i37) {
            fontMetricsInt.top = i49 - i37;
            return;
        }
        int i58 = i37 - ((-i28) + i39);
        int i59 = this.f544492e;
        if (i59 == 48) {
            fontMetricsInt.descent = i39 + i58;
            fontMetricsInt.bottom = i49 + i58;
            return;
        }
        if (i59 == 80) {
            fontMetricsInt.top = i57 - i58;
            fontMetricsInt.ascent = i28 - i58;
        } else if (i59 == 16) {
            int round = java.lang.Math.round(i58 / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.ascent -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.descent += round;
        }
    }
}
