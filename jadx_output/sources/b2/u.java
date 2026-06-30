package b2;

/* loaded from: classes14.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.l f17322a = new jz5.l(0, 0);

    public static final android.text.TextDirectionHeuristic a(int i17) {
        if (i17 == 0) {
            android.text.TextDirectionHeuristic LTR = android.text.TextDirectionHeuristics.LTR;
            kotlin.jvm.internal.o.f(LTR, "LTR");
            return LTR;
        }
        if (i17 == 1) {
            android.text.TextDirectionHeuristic RTL = android.text.TextDirectionHeuristics.RTL;
            kotlin.jvm.internal.o.f(RTL, "RTL");
            return RTL;
        }
        if (i17 == 2) {
            android.text.TextDirectionHeuristic FIRSTSTRONG_LTR = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.o.f(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i17 == 3) {
            android.text.TextDirectionHeuristic FIRSTSTRONG_RTL = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            kotlin.jvm.internal.o.f(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i17 == 4) {
            android.text.TextDirectionHeuristic ANYRTL_LTR = android.text.TextDirectionHeuristics.ANYRTL_LTR;
            kotlin.jvm.internal.o.f(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i17 != 5) {
            android.text.TextDirectionHeuristic FIRSTSTRONG_LTR2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            kotlin.jvm.internal.o.f(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        android.text.TextDirectionHeuristic LOCALE = android.text.TextDirectionHeuristics.LOCALE;
        kotlin.jvm.internal.o.f(LOCALE, "LOCALE");
        return LOCALE;
    }
}
