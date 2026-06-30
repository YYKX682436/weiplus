package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes15.dex */
public abstract class a0 {
    public static l3.d a(android.widget.TextView textView) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            return new l3.d(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.y.c(textView));
        }
        android.text.TextPaint textPaint = new android.text.TextPaint(textView.getPaint());
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.a(textView);
        int d17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.d(textView);
        if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
        } else {
            if (i17 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.b(textView) == 1;
                switch (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.c(textView)) {
                    case 2:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z17) {
                            textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = java.lang.Character.getDirectionality(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.y.b(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.w.a(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
            }
        }
        return new l3.d(textPaint, textDirectionHeuristic, a17, d17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(android.widget.TextView textView, int i17, int i18, int i19, int i27) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.x.f(textView, i17, i18, i19, i27);
        } else if (textView instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d) {
            ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d) textView).setAutoSizeTextTypeUniformWithConfiguration(i17, i18, i19, i27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(android.widget.TextView textView, int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.x.h(textView, i17);
        } else if (textView instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d) {
            ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d) textView).setAutoSizeTextTypeWithDefaults(i17);
        }
    }

    public static void d(android.widget.TextView textView, int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.y.d(textView, i17);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i18 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i17 > java.lang.Math.abs(i18)) {
            textView.setPadding(textView.getPaddingLeft(), i17 + i18, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(android.widget.TextView textView, int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i18 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.t.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i17 > java.lang.Math.abs(i18)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i17 - i18);
        }
    }

    public static void f(android.widget.TextView textView, int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i17 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i17 - r0, 1.0f);
        }
    }

    public static android.view.ActionMode.Callback g(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        return (i17 < 26 || i17 > 27 || (callback instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.z) || callback == null) ? callback : new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.z(callback, textView);
    }
}
