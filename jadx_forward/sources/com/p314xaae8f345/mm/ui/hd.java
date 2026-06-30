package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class hd {
    public static void a(com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc) {
        java.lang.CharSequence a17 = c23001x9d3a0bdc.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            c23001x9d3a0bdc.b(c(a17));
        }
        java.lang.CharSequence m84151xfb8046fd = c23001x9d3a0bdc.m84151xfb8046fd();
        if (!android.text.TextUtils.isEmpty(m84151xfb8046fd)) {
            c23001x9d3a0bdc.m84169x764b0e09(c(m84151xfb8046fd));
        }
        java.lang.CharSequence contentDescription = c23001x9d3a0bdc.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            return;
        }
        c23001x9d3a0bdc.setContentDescription(c(contentDescription));
    }

    public static void b(android.widget.TextView textView) {
        java.lang.CharSequence text = textView.getText();
        if (!android.text.TextUtils.isEmpty(text)) {
            textView.setText(c(text));
        }
        java.lang.CharSequence hint = textView.getHint();
        if (!android.text.TextUtils.isEmpty(hint)) {
            textView.setHint(c(hint));
        }
        java.lang.CharSequence contentDescription = textView.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            return;
        }
        textView.setContentDescription(c(contentDescription));
    }

    public static java.lang.String c(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        java.lang.String charSequence2 = charSequence.toString();
        return android.text.TextUtils.isEmpty(charSequence2) ? charSequence2 : com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(charSequence2);
    }
}
