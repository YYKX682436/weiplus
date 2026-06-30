package zl2;

/* loaded from: classes3.dex */
public final class h3 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.regex.Pattern f555338d;

    public h3(java.util.regex.Pattern pattern) {
        this.f555338d = pattern;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (this.f555338d.matcher(charSequence).find()) {
            return "";
        }
        return null;
    }
}
