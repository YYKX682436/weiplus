package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.j4 f272409d;

    public i4(com.p314xaae8f345.mm.p2470x93e71c27.ui.j4 j4Var) {
        this.f272409d = j4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f272409d.f272414d.f271404d.requestFocus();
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.i4$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.j4 j4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.i4.this.f272409d;
                ((android.view.inputmethod.InputMethodManager) j4Var.f272414d.mo55332x76847179().getSystemService("input_method")).showSoftInput(j4Var.f272414d.f271404d, 0);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
    }
}
