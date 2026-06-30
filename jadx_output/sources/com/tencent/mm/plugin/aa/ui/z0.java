package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class z0 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72903a;

    public z0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72903a = aARemittanceUI;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72903a;
            aARemittanceUI.f72468x = null;
            aARemittanceUI.k7();
        } else {
            this.f72903a.f72468x = charSequence.toString();
            this.f72903a.k7();
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.aa.ui.y0 y0Var = new com.tencent.mm.plugin.aa.ui.y0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(y0Var, 300L, false);
        return true;
    }
}
