package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.s0 f295748e;

    public q0(com.p314xaae8f345.mm.p2802xd031a825.ui.s0 s0Var, android.view.View view) {
        this.f295748e = s0Var;
        this.f295747d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.s0 s0Var = this.f295748e;
        boolean isShown = s0Var.f295762h.f39912xe2ad5320.isShown();
        android.view.View view = this.f295747d;
        if (!isShown && view.isShown()) {
            if (s0Var.f295759e || !s0Var.f295758d) {
                s0Var.f295762h.m83136xb67ebaa8();
            }
            s0Var.f295758d = false;
        }
        s0Var.f295762h.f39912xe2ad5320.m82983xce4186ff(s0Var.f295760f);
        ((android.view.inputmethod.InputMethodManager) s0Var.f295762h.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
