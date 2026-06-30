package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f149864e;

    public a0(java.lang.String str, java.lang.Runnable runnable) {
        this.f149863d = str;
        this.f149864e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.c("IPC.IPCInvokeLogic", "getThreadPoolDelegate", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p794xb0fa9b5e.h hVar = com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150003c;
        java.lang.Runnable runnable = this.f149864e;
        java.lang.String str = this.f149863d;
        if (str != null && !str.isEmpty() && hVar != null) {
            ((ku5.t0) ((p65.C29968x30bb37) hVar).f433979a).h(runnable, str);
        } else {
            if (runnable == null) {
                return;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.r0.a(runnable);
        }
    }
}
