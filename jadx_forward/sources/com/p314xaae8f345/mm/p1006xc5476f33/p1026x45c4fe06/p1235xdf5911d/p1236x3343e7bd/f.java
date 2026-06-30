package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* loaded from: classes7.dex */
public class f extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f173818a;

    public f(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
        super(context);
        this.f173818a = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context createDisplayContext(android.view.Display display) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.f(super.createDisplayContext(display), this.f173818a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        return "input_method".equals(str) ? this.f173818a : super.getSystemService(str);
    }
}
