package bm2;

/* loaded from: classes10.dex */
public abstract class p6 {
    public static final android.text.SpannableString a(java.lang.String str, java.lang.String searchKey, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(searchKey, "searchKey");
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        q26.l lVar = new q26.l((q26.m) r26.t.c(new r26.t(searchKey), str, 0, 2, null));
        while (lVar.hasNext()) {
            r26.m mVar = (r26.m) lVar.next();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(i17);
            r26.q qVar = (r26.q) mVar;
            int intValue = qVar.b().h().intValue();
            int i18 = qVar.b().f246210e;
            if (i18 == Integer.MAX_VALUE) {
                throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
            }
            spannableString.setSpan(foregroundColorSpan, intValue, java.lang.Integer.valueOf(i18 + 1).intValue(), 33);
        }
        return spannableString;
    }
}
