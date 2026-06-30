package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.InputPreference */
/* loaded from: classes.dex */
public class C21553x21d0f425 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.EditText L;
    public android.widget.Button M;
    public final android.view.View.OnClickListener N;
    public final android.widget.TextView.OnEditorActionListener P;

    public C21553x21d0f425(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.L = editText;
        editText.setHint((java.lang.CharSequence) null);
        this.L.setOnEditorActionListener(this.P);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.b2z);
        this.M = button;
        button.setText((java.lang.CharSequence) null);
        this.M.setOnClickListener(this.N);
    }

    public C21553x21d0f425(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.u(this);
        this.P = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.v(this);
    }
}
