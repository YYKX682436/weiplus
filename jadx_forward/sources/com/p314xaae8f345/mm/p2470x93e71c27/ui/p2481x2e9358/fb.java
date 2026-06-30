package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class fb implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f271855d;

    public fb(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar) {
        this.f271855d = ibVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f271855d;
        if (ibVar.T.size() < 2 || ((ibVar.f271944n.getText() != null && ibVar.f271944n.getText().length() > 0) || (ibVar.f271944n.getHint() != null && ibVar.f271944n.getHint().length() > 0))) {
            ibVar.f271940h.setVisibility(8);
        } else {
            ibVar.f271940h.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
