package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class n6 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214228d;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214228d = c15270x6d877a34;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        android.text.Spanned spanned = dest;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            if (i28 >= spanned.length()) {
                break;
            }
            if (spanned.charAt(i28) == '\n') {
                i29++;
            }
            i28++;
        }
        int i37 = 0;
        for (int i38 = 0; i38 < source.length(); i38++) {
            if (source.charAt(i38) == '\n') {
                i37++;
            }
        }
        int i39 = i37 + i29;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214228d;
        if (i39 < c15270x6d877a34.getCommentTextLineLimit()) {
            return source;
        }
        db5.t7.m123883x26a183b(c15270x6d877a34.getContext(), c15270x6d877a34.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cps), 0).show();
        int commentTextLineLimit = c15270x6d877a34.getCommentTextLineLimit() - i29;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        int i47 = 0;
        int i48 = -1;
        int i49 = -1;
        while (i47 < commentTextLineLimit) {
            int K = r26.n0.K(source, '\n', i48 + 1, false, 4, null);
            if (K == -1) {
                break;
            }
            i47++;
            i49 = K;
            i48 = K + 1;
        }
        return i49 > 0 ? source.subSequence(0, i49) : i49 == 0 ? "" : source;
    }
}
