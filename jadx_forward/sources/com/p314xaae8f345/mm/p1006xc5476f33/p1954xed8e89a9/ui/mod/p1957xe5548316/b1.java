package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes9.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b f235416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1 f235417e;

    public b1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b c21525x1d56253b, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k1 k1Var) {
        this.f235416d = c21525x1d56253b;
        this.f235417e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b c21525x1d56253b = this.f235416d;
        android.text.Editable text = c21525x1d56253b.getText();
        c21525x1d56253b.setSelection(text != null ? text.length() : 0);
        java.lang.Object systemService = this.f235417e.m158354x19263085().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c21525x1d56253b, 0);
    }
}
