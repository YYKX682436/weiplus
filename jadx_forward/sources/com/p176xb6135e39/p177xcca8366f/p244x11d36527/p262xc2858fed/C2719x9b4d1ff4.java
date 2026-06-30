package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* renamed from: com.google.android.material.textfield.TextInputEditText */
/* loaded from: classes15.dex */
public class C2719x9b4d1ff4 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a {
    public C2719x9b4d1ff4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559770ee);
    }

    /* renamed from: getHintFromLayout */
    private java.lang.CharSequence m20383x34dd6251() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 m20384x466ae5f1 = m20384x466ae5f1();
        if (m20384x466ae5f1 != null) {
            return m20384x466ae5f1.m20404xfb8046fd();
        }
        return null;
    }

    /* renamed from: getTextInputLayout */
    private com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 m20384x466ae5f1() {
        for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07) {
                return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 m20384x466ae5f1 = m20384x466ae5f1();
        return (m20384x466ae5f1 == null || !m20384x466ae5f1.f126110s) ? super.getHint() : m20384x466ae5f1.m20404xfb8046fd();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = m20383x34dd6251();
        }
        return onCreateInputConnection;
    }

    public C2719x9b4d1ff4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
