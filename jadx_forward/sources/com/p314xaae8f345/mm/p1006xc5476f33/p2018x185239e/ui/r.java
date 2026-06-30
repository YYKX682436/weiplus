package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f239439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f239440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 f239441f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, android.widget.EditText editText) {
        this.f239441f = b0Var;
        this.f239439d = u1Var;
        this.f239440e = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = this.f239439d;
        if (u1Var.f293531c != null) {
            if (this.f239440e.length() > 0) {
                u1Var.f293531c.B(this.f239441f.f239173a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
                u1Var.f293531c.f(-1).setEnabled(true);
            } else {
                u1Var.f293531c.B(-2141754475);
                u1Var.f293531c.f(-1).setEnabled(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
