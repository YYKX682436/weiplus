package wu3;

/* loaded from: classes10.dex */
public final class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531340d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        this.f531340d = c17042xf8121282;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f531340d;
        if (editable == null) {
            c17042xf8121282.f237542x.setVisibility(8);
            return;
        }
        int length = c17042xf8121282.f237529h - editable.length();
        c17042xf8121282.getConfirm().setEnabled(length >= 0 && c17042xf8121282.f237541w.getLineCount() <= c17042xf8121282.f237530i);
        if (length >= 0) {
            c17042xf8121282.f237542x.setVisibility(8);
        } else {
            c17042xf8121282.f237542x.setVisibility(0);
            c17042xf8121282.f237542x.setText(java.lang.String.valueOf(length));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
