package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class e6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 f228397d;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 c16369x7101dda7) {
        this.f228397d = c16369x7101dda7;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 c16369x7101dda7 = this.f228397d;
        if (K0) {
            c16369x7101dda7.f227677d.m66155xa2132e2f("");
        } else {
            c16369x7101dda7.f227677d.m66155xa2132e2f(c16369x7101dda7.f227682i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar = c16369x7101dda7.f227680g;
        if (ikVar != null) {
            ikVar.D4(false, c16369x7101dda7.m66175xcc1739d4());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString())) {
            c16369x7101dda7.f227678e.setContentDescription(((java.lang.Object) c16369x7101dda7.f227678e.getText()) + "0" + c16369x7101dda7.f227682i);
            return;
        }
        c16369x7101dda7.f227678e.setContentDescription(((java.lang.Object) c16369x7101dda7.f227678e.getText()) + editable.toString() + c16369x7101dda7.f227682i);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
