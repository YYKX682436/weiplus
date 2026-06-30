package com.tencent.mm.plugin.appbrand.widget.sms;

/* loaded from: classes7.dex */
public class VerifyCodeEditText extends androidx.appcompat.widget.AppCompatEditText implements nl1.b {
    public VerifyCodeEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.tencent.mm.R.attr.f478237ee);
    }

    @Override // nl1.b
    public android.view.inputmethod.InputConnection a() {
        return super.onCreateInputConnection(new android.view.inputmethod.EditorInfo());
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return null;
    }

    public VerifyCodeEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.tencent.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }
}
