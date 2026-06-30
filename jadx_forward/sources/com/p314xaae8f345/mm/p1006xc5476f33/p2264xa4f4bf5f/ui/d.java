package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 f255331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255332e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828, android.content.Context context) {
        this.f255331d = c18609xe5770828;
        this.f255332e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18609xe5770828 c18609xe5770828 = this.f255331d;
        c18609xe5770828.getClass();
        java.lang.Object systemService = this.f255332e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c18609xe5770828.f254941g, 0);
    }
}
