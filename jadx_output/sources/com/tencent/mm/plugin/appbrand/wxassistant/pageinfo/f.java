package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
public class f extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f92285a;

    public f(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
        super(context);
        this.f92285a = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context createDisplayContext(android.view.Display display) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.f(super.createDisplayContext(display), this.f92285a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        return "input_method".equals(str) ? this.f92285a : super.getSystemService(str);
    }
}
