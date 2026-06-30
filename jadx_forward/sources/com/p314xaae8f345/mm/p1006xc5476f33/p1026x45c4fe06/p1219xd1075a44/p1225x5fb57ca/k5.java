package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class k5 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j5[] a(android.widget.TextView textView) {
        if (textView == null || !(textView.getText() instanceof android.text.Spannable)) {
            return null;
        }
        android.text.Spannable spannable = (android.text.Spannable) textView.getText();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j5[] j5VarArr = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j5[]) spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j5.class);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j5 j5Var : j5VarArr) {
            spannable.removeSpan(j5Var);
        }
        return j5VarArr;
    }
}
