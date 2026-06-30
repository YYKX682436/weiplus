package os3;

/* loaded from: classes8.dex */
public class n2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f429691d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed) {
        this.f429691d = c16936x21d2caed;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        boolean endsWith = charSequence2.endsWith("\n");
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f429691d;
        if (endsWith || charSequence2.endsWith(" ")) {
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed.f236414p;
            c16936x21d2caed.e(charSequence2, true);
        }
        c16936x21d2caed.a();
    }
}
