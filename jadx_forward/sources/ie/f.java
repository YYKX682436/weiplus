package ie;

/* loaded from: classes7.dex */
public class f implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 f372487d;

    public f(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399) {
        this.f372487d = c3896xa9b9c399;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return null;
        }
        return com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399.a(this.f372487d, charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableStringBuilder(charSequence.subSequence(i17, i18)));
    }
}
