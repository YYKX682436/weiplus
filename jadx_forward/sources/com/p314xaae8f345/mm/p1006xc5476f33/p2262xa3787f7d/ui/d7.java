package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class d7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f254503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f254504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f254505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 f254506h;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, boolean z17, android.view.View.OnFocusChangeListener onFocusChangeListener, int i17, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf402) {
        this.f254502d = activityC18590xc3d8bf2b;
        this.f254503e = z17;
        this.f254504f = onFocusChangeListener;
        this.f254505g = i17;
        this.f254506h = c27998xb3daf402;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254502d;
        activityC18590xc3d8bf2b.mo48674x36654fab();
        boolean isFocused = view.isFocused();
        boolean z18 = this.f254503e;
        if (!isFocused || z18) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c7(activityC18590xc3d8bf2b, z18, this.f254506h), 200L);
        } else {
            java.lang.Object systemService = activityC18590xc3d8bf2b.mo55332x76847179().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.b7(activityC18590xc3d8bf2b, view, this.f254505g), 300L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f254504f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
