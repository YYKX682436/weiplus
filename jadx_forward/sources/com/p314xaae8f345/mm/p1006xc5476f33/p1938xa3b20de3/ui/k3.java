package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes.dex */
public class k3 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m3 f234194d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m3 m3Var) {
        this.f234194d = m3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.m3 m3Var = this.f234194d;
        android.widget.TextView textView = (android.widget.TextView) m3Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.j97);
        android.widget.TextView textView2 = (android.widget.TextView) m3Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nqv);
        if (textView == null || textView2 == null) {
            return "";
        }
        return textView.getText().toString() + textView2.getText().toString();
    }
}
