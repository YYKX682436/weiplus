package rf4;

/* loaded from: classes5.dex */
public final class b0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476556d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5) {
        this.f476556d = c18481x2b6a00e5;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476556d;
        if (editable == null) {
            c18481x2b6a00e5.f253483w = false;
            c18481x2b6a00e5.f253473m.setVisibility(8);
            return;
        }
        int length = editable.length();
        int i17 = 60 - length;
        c18481x2b6a00e5.f253483w = (editable.length() > 0) && i17 >= 0 && c18481x2b6a00e5.f253470g.getLineCount() <= 10;
        if (length < 55) {
            c18481x2b6a00e5.f253473m.setVisibility(8);
            return;
        }
        c18481x2b6a00e5.f253473m.setVisibility(0);
        c18481x2b6a00e5.f253473m.setText(java.lang.String.valueOf(i17));
        if (i17 >= 0) {
            c18481x2b6a00e5.f253473m.setTextColor(c18481x2b6a00e5.f253484x);
        } else {
            c18481x2b6a00e5.f253473m.setTextColor(c18481x2b6a00e5.f253485y);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
