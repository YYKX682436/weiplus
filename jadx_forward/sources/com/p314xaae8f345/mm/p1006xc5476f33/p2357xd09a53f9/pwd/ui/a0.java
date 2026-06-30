package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes.dex */
public class a0 implements yz5.l {
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.b0 b0Var) {
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.beb);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565132be3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (textView != null) {
            sb6.append(textView.getText());
        }
        if (textView2 != null) {
            sb6.append("," + ((java.lang.Object) textView2.getText()));
        }
        return sb6.toString();
    }
}
