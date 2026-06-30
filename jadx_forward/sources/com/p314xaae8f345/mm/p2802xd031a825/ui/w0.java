package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.x0 f295793d;

    public w0(com.p314xaae8f345.mm.p2802xd031a825.ui.x0 x0Var) {
        this.f295793d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.x0 x0Var = this.f295793d;
        x0Var.f295801i.mo48632xd46dd964();
        if (x0Var.f295796d) {
            ((android.view.inputmethod.InputMethodManager) x0Var.f295801i.mo55332x76847179().getSystemService("input_method")).showSoftInput(x0Var.f295798f, 0);
        }
    }
}
