package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241455d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        this.f241455d = t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.f241515p1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f241455d;
        t0Var.x(7);
        t0Var.f241527x = true;
        t0Var.C = false;
        t0Var.G = true;
        t0Var.M = false;
        java.util.Map<java.lang.String, java.lang.String> m68919xec953c5f = t0Var.m68919xec953c5f();
        java.lang.String str = m68919xec953c5f != null ? m68919xec953c5f.get("lean_forward") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = t0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lna);
        }
        android.widget.TextView textView = t0Var.T;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = t0Var.T;
        if (textView2 != null) {
            textView2.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.p(t0Var);
        t0Var.f241528x0 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.o(t0Var);
    }
}
