package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224388d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224388d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue = ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224388d;
        if (booleanValue) {
            m0Var.f224471j.setVisibility(0);
        } else {
            m0Var.f224471j.setVisibility(8);
        }
        java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_STRING, "");
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_STRING, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m0Var.f224470i.setText(str);
            m0Var.f224469h.setVisibility(0);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            m0Var.f224470i.setText("");
            m0Var.f224469h.setVisibility(8);
        } else {
            m0Var.f224470i.setText(str2);
            m0Var.f224469h.setVisibility(0);
        }
    }
}
