package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class k5 {
    public static com.tencent.mm.plugin.appbrand.widget.input.j5[] a(android.widget.TextView textView) {
        if (textView == null || !(textView.getText() instanceof android.text.Spannable)) {
            return null;
        }
        android.text.Spannable spannable = (android.text.Spannable) textView.getText();
        com.tencent.mm.plugin.appbrand.widget.input.j5[] j5VarArr = (com.tencent.mm.plugin.appbrand.widget.input.j5[]) spannable.getSpans(0, spannable.length(), com.tencent.mm.plugin.appbrand.widget.input.j5.class);
        for (com.tencent.mm.plugin.appbrand.widget.input.j5 j5Var : j5VarArr) {
            spannable.removeSpan(j5Var);
        }
        return j5VarArr;
    }
}
