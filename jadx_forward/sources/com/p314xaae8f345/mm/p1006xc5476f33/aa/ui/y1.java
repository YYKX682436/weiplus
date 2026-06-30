package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 f154427d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 z1Var) {
        this.f154427d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 z1Var = this.f154427d;
        z1Var.f154442i.mo48632xd46dd964();
        if (z1Var.f154437d) {
            ((android.view.inputmethod.InputMethodManager) z1Var.f154442i.mo55332x76847179().getSystemService("input_method")).showSoftInput(z1Var.f154439f, 0);
        }
    }
}
