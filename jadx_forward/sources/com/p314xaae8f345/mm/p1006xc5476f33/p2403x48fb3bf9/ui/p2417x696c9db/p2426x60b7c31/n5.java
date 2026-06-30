package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n5 {
    public static /* synthetic */ java.lang.String a(java.lang.CharSequence charSequence, java.lang.Iterable iterable) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("delimiter");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb6.append(charSequence);
            }
        }
        return sb6.toString();
    }
}
