package fl5;

/* loaded from: classes5.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final qa5.c f345489d = new qa5.c();

    /* renamed from: e, reason: collision with root package name */
    public boolean f345490e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Character f345491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22663xdc925b30 f345492g;

    public o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22663xdc925b30 c22663xdc925b30) {
        this.f345492g = c22663xdc925b30;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f345492g.getSizeAnimController().mo159676xae7a2e7a();
        if (editable instanceof android.text.SpannableStringBuilder) {
            if (!this.f345490e) {
                if (editable.length() > 0) {
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) editable;
                    if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.append((char) 8203);
                        return;
                    }
                    return;
                }
                return;
            }
            java.lang.Character ch6 = this.f345491f;
            if (ch6 != null && ch6.charValue() == 8203) {
                if (editable.length() > 0) {
                    android.text.SpannableStringBuilder spannableStringBuilder2 = (android.text.SpannableStringBuilder) editable;
                    if (spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        boolean z17 = i18 > i19;
        this.f345490e = z17;
        if (!z17 || charSequence == null) {
            return;
        }
        this.f345491f = java.lang.Character.valueOf(charSequence.charAt(i17));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
            qa5.c cVar = this.f345489d;
            if (spannableStringBuilder.getSpanStart(cVar) == -1) {
                spannableStringBuilder.removeSpan(cVar);
                spannableStringBuilder.setSpan(cVar, 0, charSequence.length(), 18);
            }
        }
    }
}
