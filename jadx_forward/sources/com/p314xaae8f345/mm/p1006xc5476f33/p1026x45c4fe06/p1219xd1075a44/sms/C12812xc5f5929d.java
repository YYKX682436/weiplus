package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText */
/* loaded from: classes7.dex */
public class C12812xc5f5929d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a implements nl1.b {
    public C12812xc5f5929d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559770ee);
    }

    @Override // nl1.b
    public android.view.inputmethod.InputConnection a() {
        return super.onCreateInputConnection(new android.view.inputmethod.EditorInfo());
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return null;
    }

    public C12812xc5f5929d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }
}
