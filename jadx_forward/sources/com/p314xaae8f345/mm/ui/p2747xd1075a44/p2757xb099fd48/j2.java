package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes13.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f293380d;

    public j2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var) {
        this.f293380d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        try {
            com.p314xaae8f345.mm.ui.yk.c("MicroMsg.MMDialog", "run on hijack runnable", new java.lang.Object[0]);
            runnable = this.f293380d.f39754x38b79b33;
            runnable.run();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.MMDialog", "protect : " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
