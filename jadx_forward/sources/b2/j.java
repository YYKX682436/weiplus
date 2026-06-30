package b2;

/* loaded from: classes14.dex */
public abstract class j {
    public static final android.graphics.Rect a(android.text.TextPaint textPaint, java.lang.CharSequence text, int i17, int i18) {
        int i19 = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (text instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) text;
            if (spanned.nextSpanTransition(i19 + (-1), i18, android.text.style.MetricAffectingSpan.class) != i18) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i19 < i18) {
                    int nextSpanTransition = spanned.nextSpanTransition(i19, i18, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] spans = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i19, nextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "spans");
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : spans) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        b2.i.a(textPaint2, text, i19, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(text.toString(), i19, nextSpanTransition, rect2);
                    }
                    rect.right += rect2.width();
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i19 = nextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            b2.i.a(textPaint, text, i19, i18, rect3);
        } else {
            textPaint.getTextBounds(text.toString(), i19, i18, rect3);
        }
        return rect3;
    }
}
