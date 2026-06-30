package dl2;

/* loaded from: classes3.dex */
public final class v implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final dl2.v f316796d = new dl2.v();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spanned);
        boolean z17 = false;
        if (r26.n0.j0(spanned, "0", false, 2, null)) {
            return "";
        }
        java.lang.String obj = charSequence.toString();
        java.lang.String obj2 = spanned.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = obj2.substring(0, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        java.lang.String substring2 = obj.substring(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String substring3 = obj2.substring(i27, spanned.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
        sb6.append(substring3);
        java.lang.Integer h17 = r26.h0.h(sb6.toString().toString());
        int intValue = h17 != null ? h17.intValue() : -1;
        if (intValue >= 0 && intValue < 1000) {
            z17 = true;
        }
        return z17 ? charSequence : "";
    }
}
