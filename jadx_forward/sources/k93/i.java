package k93;

/* loaded from: classes8.dex */
public class i implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f387423d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 f387424e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58) {
        this.f387424e = c16179x5fcf4d58;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(charSequence, i17, i18, cArr, 0);
            for (char c17 : this.f387423d) {
                char c18 = cArr[i28];
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    return "";
                }
                if (c18 == c17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58 = this.f387424e;
                    android.widget.TextView textView = c16179x5fcf4d58.U;
                    if (textView != null) {
                        textView.setText(c16179x5fcf4d58.P);
                        c16179x5fcf4d58.U.setVisibility(0);
                    }
                    return "";
                }
            }
        }
        return null;
    }
}
