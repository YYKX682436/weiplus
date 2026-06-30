package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class a0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241454d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        this.f241454d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f241454d;
        t0Var.getClass();
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_enable_multi_angles, 0) == 1) && t0Var.F && t0Var.D != null) {
            t0Var.x(19);
            t0Var.C = false;
            t0Var.G = true;
            t0Var.M = false;
            java.util.Map<java.lang.String, java.lang.String> m68919xec953c5f = t0Var.m68919xec953c5f();
            str = m68919xec953c5f != null ? m68919xec953c5f.get("lean_forward") : null;
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
            t0Var.f241528x0 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.o(t0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.p(t0Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = t0Var.f241526w;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            t0Var.f241527x = false;
            if (t0Var.t()) {
                t0Var.x(23);
                java.util.Map<java.lang.String, java.lang.String> m68919xec953c5f2 = t0Var.m68919xec953c5f();
                str = m68919xec953c5f2 != null ? m68919xec953c5f2.get("horizontal_screen_timeout_tips") : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = t0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lfa);
                }
            } else {
                t0Var.x(6);
                java.util.Map<java.lang.String, java.lang.String> m68919xec953c5f3 = t0Var.m68919xec953c5f();
                str = m68919xec953c5f3 != null ? m68919xec953c5f3.get("scan_timeout") : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = t0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3c);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 A = db5.e1.A(t0Var.getContext(), str, "", t0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575188n33), t0Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n37), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.y(t0Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.z(t0Var));
            if (A != null) {
                A.setCanceledOnTouchOutside(false);
            }
        }
        return true;
    }
}
