package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hk implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 f228534d;

    public hk(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa1) {
        this.f228534d = c16388xef85efa1;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa1 = this.f228534d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar = c16388xef85efa1.f228029g;
        if (ikVar != null) {
            ikVar.D4(false, c16388xef85efa1.m66200xcc1739d4());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString())) {
            c16388xef85efa1.f228026d.setContentDescription(((java.lang.Object) c16388xef85efa1.f228026d.getText()) + "0" + ((java.lang.Object) c16388xef85efa1.f228028f.getText()));
            return;
        }
        c16388xef85efa1.f228026d.setContentDescription(((java.lang.Object) c16388xef85efa1.f228026d.getText()) + editable.toString() + ((java.lang.Object) c16388xef85efa1.f228028f.getText()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
