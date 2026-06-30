package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public final class h6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 f154208e;

    public h6(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06) {
        this.f154207d = z2Var;
        this.f154208e = c11354x3aa9ae06;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        this.f154207d.b(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str) <= this.f154208e.f154069e * 2);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
