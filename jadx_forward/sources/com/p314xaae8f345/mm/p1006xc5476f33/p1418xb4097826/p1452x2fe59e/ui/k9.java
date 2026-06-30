package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class k9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 f191752d;

    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8) {
        this.f191752d = activityC13997x866e3aa8;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        android.text.Editable editableText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8 = this.f191752d;
        if (z17) {
            java.lang.Object systemService = activityC13997x866e3aa8.mo55332x76847179().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(activityC13997x866e3aa8.f190895e, 2);
        }
        bm2.m2 m2Var = activityC13997x866e3aa8.f190894d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC13997x866e3aa8.f190895e;
        m2Var.y(java.lang.String.valueOf((c22621x7603e017 == null || (editableText = c22621x7603e017.getEditableText()) == null) ? null : r26.n0.u0(editableText)));
    }
}
