package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f280688d;

    public h8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        this.f280688d = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m75458x24dd4e59;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f280688d;
        if (y8Var.f281836x && !y8Var.A0().getBoolean("hide_btn_bubble_guide", false)) {
            y8Var.M0(true);
            return;
        }
        if (y8Var.f281836x) {
            if (y8Var.t0()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = y8Var.v0();
                m75458x24dd4e59 = v07 != null ? v07.m75458x24dd4e59() : null;
                if (m75458x24dd4e59 == null || r26.n0.N(m75458x24dd4e59)) {
                    y8Var.L0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!y8Var.A0().i("show_btn_guide", false)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v08 = y8Var.v0();
            java.lang.String m75458x24dd4e592 = v08 != null ? v08.m75458x24dd4e59() : null;
            if (m75458x24dd4e592 == null || r26.n0.N(m75458x24dd4e592)) {
                y8Var.N0(true);
                return;
            }
        }
        if (y8Var.t0()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v09 = y8Var.v0();
            m75458x24dd4e59 = v09 != null ? v09.m75458x24dd4e59() : null;
            if (m75458x24dd4e59 == null || r26.n0.N(m75458x24dd4e59)) {
                y8Var.L0(true);
                return;
            }
        }
        y8Var.N0(false);
    }
}
