package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class l9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 f191794d;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8) {
        this.f191794d = activityC13997x866e3aa8;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8 = this.f191794d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC13997x866e3aa8.f190895e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.clearFocus();
        }
        java.lang.Object systemService = activityC13997x866e3aa8.mo55332x76847179().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC13997x866e3aa8.f190895e;
        inputMethodManager.hideSoftInputFromWindow(c22621x7603e0172 != null ? c22621x7603e0172.getWindowToken() : null, 0);
        return true;
    }
}
