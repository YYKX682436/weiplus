package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.EditPreference */
/* loaded from: classes11.dex */
public class C21545xcb424ea5 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 L;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o M;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 N;
    public java.lang.String P;

    public C21545xcb424ea5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void D(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var) {
        this.L = q0Var;
    }

    public void M() {
        android.content.Context context = this.f279303d;
        android.widget.EditText editText = new android.widget.EditText(context);
        editText.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        editText.setSingleLine(true);
        editText.setText(this.P);
        android.view.ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = editText.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        if (editText.getParent() != null) {
            ((android.view.ViewGroup) editText.getParent()).removeView(editText);
        }
        this.N = db5.e1.r(this.f279303d, this.f279307h.toString(), editText, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.m(this, editText), new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n(this));
    }

    public C21545xcb424ea5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
