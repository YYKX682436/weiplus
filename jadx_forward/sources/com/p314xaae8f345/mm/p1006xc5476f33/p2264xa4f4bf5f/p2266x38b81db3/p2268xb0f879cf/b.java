package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i f254756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f254757e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar, android.content.Context context) {
        this.f254756d = iVar;
        this.f254757e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f254757e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar = this.f254756d;
        iVar.getClass();
        java.lang.Object systemService = context.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(iVar.f254771i, 0);
    }
}
