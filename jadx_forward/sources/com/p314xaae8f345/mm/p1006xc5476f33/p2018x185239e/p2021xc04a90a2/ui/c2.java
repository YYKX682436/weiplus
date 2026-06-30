package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes.dex */
public class c2 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d2 f238191d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d2 d2Var) {
        this.f238191d = d2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d2 d2Var = this.f238191d;
        android.widget.TextView textView = (android.widget.TextView) d2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jnp);
        android.widget.TextView textView2 = (android.widget.TextView) d2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jnq);
        if (textView == null || textView2 == null) {
            return "";
        }
        return textView.getText().toString() + textView2.getText().toString();
    }
}
