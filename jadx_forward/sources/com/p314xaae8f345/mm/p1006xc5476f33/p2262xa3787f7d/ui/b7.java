package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f254474f;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, android.view.View view, int i17) {
        this.f254472d = activityC18590xc3d8bf2b;
        this.f254473e = view;
        this.f254474f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254472d;
        android.view.View view = activityC18590xc3d8bf2b.f254443q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mKBLayout");
            throw null;
        }
        boolean isShown = view.isShown();
        android.view.View view2 = this.f254473e;
        if (!isShown && view2.isShown()) {
            activityC18590xc3d8bf2b.m71654x8022ec1f();
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3 = activityC18590xc3d8bf2b.f254442p;
        if (c27990xda3033a3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mKeyboard");
            throw null;
        }
        c27990xda3033a3.m121476x53eb72f9(this.f254474f);
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a32 = activityC18590xc3d8bf2b.f254442p;
        if (c27990xda3033a32 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mKeyboard");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.widget.EditText");
        c27990xda3033a32.m121469xce4186ff((android.widget.EditText) view2);
        java.lang.Object systemService = activityC18590xc3d8bf2b.mo55332x76847179().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }
}
