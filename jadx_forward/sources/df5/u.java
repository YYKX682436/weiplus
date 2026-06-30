package df5;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.v f313751d;

    public u(df5.v vVar) {
        this.f313751d = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        android.text.SpannableStringBuilder spannableStringBuilder3;
        java.lang.Object[] objArr;
        df5.v vVar = this.f313751d;
        vVar.f313769g = null;
        android.widget.TextView textView = vVar.f313770h;
        if (textView == null || (spannableStringBuilder = vVar.f313771i) == null || (spannableStringBuilder2 = vVar.f313772j) == null) {
            return;
        }
        int i17 = vVar.f313773k;
        int i18 = vVar.f313774l;
        int i19 = 0;
        yz5.a aVar = vVar.f313767e;
        if (i17 >= i18) {
            vVar.f313769g = null;
            vVar.f313770h = null;
            vVar.f313771i = null;
            vVar.f313772j = null;
            vVar.f313773k = 0;
            vVar.f313774l = 0;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        int intValue = ((java.lang.Number) vVar.f313766d.mo152xb9724478()).intValue();
        int intValue2 = ((java.lang.Number) vVar.f313764b.mo152xb9724478()).intValue();
        if (intValue2 < 1) {
            intValue2 = 1;
        }
        int min = java.lang.Math.min(intValue > intValue2 ? ((intValue + intValue2) - 1) / intValue2 : 1, vVar.f313774l - vVar.f313773k);
        int i27 = vVar.f313773k;
        int i28 = min + i27;
        spannableStringBuilder2.append((java.lang.CharSequence) spannableStringBuilder.subSequence(i27, i28).toString());
        java.lang.Object[] spans = spannableStringBuilder.getSpans(i27, i28, java.lang.Object.class);
        int length = spannableStringBuilder2.length();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spans);
        int length2 = spans.length;
        int i29 = 0;
        while (i29 < length2) {
            java.lang.Object obj = spans[i29];
            if ((obj instanceof ua5.a) || (obj instanceof android.text.NoCopySpan)) {
                spannableStringBuilder3 = spannableStringBuilder;
            } else {
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                int spanFlags = spannableStringBuilder.getSpanFlags(obj);
                int max = java.lang.Math.max(spanStart, i19);
                if (max > length) {
                    max = length;
                }
                int min2 = java.lang.Math.min(spanEnd, length);
                if (min2 < max) {
                    min2 = max;
                }
                int spanStart2 = spannableStringBuilder2.getSpanStart(obj);
                if (spanStart2 >= 0) {
                    spannableStringBuilder3 = spannableStringBuilder;
                    if (spannableStringBuilder2.getSpanEnd(obj) != min2 || spanStart2 != max) {
                        spannableStringBuilder2.setSpan(obj, max, min2, spanFlags);
                    }
                } else {
                    spannableStringBuilder3 = spannableStringBuilder;
                    java.lang.Object[] spans2 = spannableStringBuilder2.getSpans(max, min2, obj.getClass());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spans2);
                    objArr = spans;
                    int i37 = 0;
                    for (int length3 = spans2.length; i37 < length3; length3 = length3) {
                        spannableStringBuilder2.removeSpan(spans2[i37]);
                        i37++;
                    }
                    spannableStringBuilder2.setSpan(obj, max, min2, spanFlags);
                    i29++;
                    spannableStringBuilder = spannableStringBuilder3;
                    spans = objArr;
                    i19 = 0;
                }
            }
            objArr = spans;
            i29++;
            spannableStringBuilder = spannableStringBuilder3;
            spans = objArr;
            i19 = 0;
        }
        ua5.a aVar2 = new ua5.a();
        spannableStringBuilder2.setSpan(aVar2, i27, i28, 33);
        textView.requestLayout();
        for (android.view.ViewParent viewParent = textView.getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if ((viewParent instanceof df5.j1) || (viewParent instanceof df5.b0)) {
                ((android.view.View) viewParent).requestLayout();
                break;
            } else {
                if (viewParent instanceof df5.q0) {
                    break;
                }
            }
        }
        ua5.f fVar = vVar.f313763a;
        fVar.getClass();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new ua5.b(aVar2, textView));
        ofFloat.addListener(new ua5.c(fVar));
        ofFloat.start();
        ((java.util.ArrayList) fVar.f507522d).add(ofFloat);
        vVar.f313773k = i28;
        if (i28 < vVar.f313774l) {
            vVar.a();
            return;
        }
        java.lang.Runnable runnable = vVar.f313769g;
        if (runnable != null) {
            vVar.f313768f.removeCallbacks(runnable);
        }
        vVar.f313769g = null;
        vVar.f313770h = null;
        vVar.f313771i = null;
        vVar.f313772j = null;
        vVar.f313773k = 0;
        vVar.f313774l = 0;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
