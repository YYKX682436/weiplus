package com.google.android.material.textfield;

/* loaded from: classes14.dex */
public class g extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.material.textfield.TextInputLayout f44622e;

    public g(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.f44622e = textInputLayout;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44622e;
        android.widget.EditText editText = textInputLayout.getEditText();
        android.text.Editable text = editText != null ? editText.getText() : null;
        java.lang.CharSequence hint = textInputLayout.getHint();
        java.lang.CharSequence error = textInputLayout.getError();
        java.lang.CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean z17 = !android.text.TextUtils.isEmpty(text);
        boolean z18 = !android.text.TextUtils.isEmpty(hint);
        boolean z19 = !android.text.TextUtils.isEmpty(error);
        boolean z27 = false;
        boolean z28 = z19 || !android.text.TextUtils.isEmpty(counterOverflowDescription);
        if (z17) {
            lVar.v(text);
        } else if (z18) {
            lVar.v(hint);
        }
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f342642a;
        if (z18) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 26) {
                accessibilityNodeInfo.setHintText(hint);
            } else {
                o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hint);
            }
            if (!z17 && z18) {
                z27 = true;
            }
            if (i17 >= 26) {
                accessibilityNodeInfo.setShowingHintText(z27);
            } else {
                lVar.j(4, z27);
            }
        }
        if (z28) {
            if (!z19) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
            accessibilityNodeInfo.setContentInvalid(true);
        }
    }

    @Override // n3.c
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44622e;
        android.widget.EditText editText = textInputLayout.getEditText();
        java.lang.CharSequence text = editText != null ? editText.getText() : null;
        if (android.text.TextUtils.isEmpty(text)) {
            text = textInputLayout.getHint();
        }
        if (android.text.TextUtils.isEmpty(text)) {
            return;
        }
        accessibilityEvent.getText().add(text);
    }
}
