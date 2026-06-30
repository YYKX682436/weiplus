package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class s2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272173a;

    public s2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272173a = c19666xfd6e2f33;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void a() {
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        this.f272173a.B0();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272173a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
        if (k5Var != null) {
            k5Var.d(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "onSendMsg listener is null !!!");
        }
        c19666xfd6e2f33.f271520g.n();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.gb
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272173a;
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a5 a5Var = c19666xfd6e2f33.R2;
            if (a5Var != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xo) a5Var).a(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.a5 a5Var2 = c19666xfd6e2f33.R2;
        if (a5Var2 != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xo) a5Var2).a(java.lang.Boolean.FALSE);
        }
    }
}
