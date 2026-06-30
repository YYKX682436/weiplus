package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 f230840d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360) {
        this.f230840d = c16551xff789360;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f230840d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(c16551xff789360.f230733m), java.lang.Boolean.valueOf(c16551xff789360.f230734n));
        if (c16551xff789360.f230733m) {
            return;
        }
        c16551xff789360.f230734n = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 h0Var = c16551xff789360.f230746z;
        if (h0Var != null) {
            h0Var.a();
        }
    }
}
