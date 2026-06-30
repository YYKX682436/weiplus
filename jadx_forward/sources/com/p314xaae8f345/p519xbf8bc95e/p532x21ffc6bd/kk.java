package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kk {
    private static void a(android.view.View view, float f17) {
        view.setAlpha(f17);
    }

    private static boolean b(java.lang.String str, java.lang.String str2, int i17) {
        return a(str, str2, i17) > 0;
    }

    private static boolean c(java.lang.String str, java.lang.String str2, int i17) {
        return a(str, str2, i17) == 0;
    }

    private static void a(android.view.View view, float f17, float f18) {
        view.setScaleX(f17);
        view.setScaleY(f18);
    }

    private static void a(java.lang.Object obj, java.lang.String str, int i17, float... fArr) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(obj, str, fArr[0], fArr[1]);
        ofFloat.setDuration(i17);
        ofFloat.start();
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        return a(str, str2, 3) < 0;
    }

    public static int a(java.lang.String str, java.lang.String str2, int i17) {
        int i18 = 0;
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str) || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str2) || str.equals(str2)) {
            return 0;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int i19 = 0;
        while (i18 < i17) {
            try {
                i19 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(i18 < split.length ? split[i18] : "0")).compareTo(java.lang.Integer.valueOf(java.lang.Integer.parseInt(i18 < split2.length ? split2[i18] : "0")));
            } catch (java.lang.Exception unused) {
            }
            if (i19 != 0) {
                break;
            }
            i18++;
        }
        return i19;
    }
}
