package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149888d;

    public g0(java.lang.String str) {
        this.f149888d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.q b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.q.b();
        b17.getClass();
        java.lang.String str = this.f149888d;
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str)) {
            rk0.c.c("IPC.IPCBridgeManager", "the same process(%s), do not need to build IPCBridge.", str);
        } else {
            b17.a(str, false);
        }
    }
}
