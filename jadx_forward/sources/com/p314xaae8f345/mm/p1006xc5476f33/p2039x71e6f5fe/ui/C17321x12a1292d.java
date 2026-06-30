package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactUserHeaderPreference */
/* loaded from: classes3.dex */
public class C17321x12a1292d extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public final android.content.Context T;

    public C17321x12a1292d(android.content.Context context) {
        super(context);
        this.T = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.VcardContactUserHeaderPreference", "onbindview");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.owr);
        java.lang.String str = this.P;
        if (str != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ows);
        this.L = textView2;
        java.lang.String str2 = this.Q;
        android.content.Context context = this.T;
        if (str2 != null) {
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5l, str2));
            this.L.setVisibility(0);
        }
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.owt);
        this.M = textView3;
        java.lang.String str3 = this.R;
        if (str3 != null) {
            textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5q, str3));
            this.M.setVisibility(0);
        }
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.owu);
        this.N = textView4;
        java.lang.String str4 = this.S;
        if (str4 != null) {
            textView4.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k5r, str4));
            this.N.setVisibility(0);
        }
    }

    public C17321x12a1292d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = context;
    }

    public C17321x12a1292d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.T = context;
    }
}
