package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f254490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 f254491f;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, boolean z17, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf402) {
        this.f254489d = activityC18590xc3d8bf2b;
        this.f254490e = z17;
        this.f254491f = c27998xb3daf402;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254489d;
        activityC18590xc3d8bf2b.m71653xd46dd964();
        if (this.f254490e) {
            java.lang.Object systemService = activityC18590xc3d8bf2b.mo55332x76847179().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f254491f, 0);
        }
    }
}
