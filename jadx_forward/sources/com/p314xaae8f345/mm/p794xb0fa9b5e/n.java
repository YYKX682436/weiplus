package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p f149907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.q f149909f;

    public n(com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar, java.lang.String str) {
        this.f149909f = qVar;
        this.f149907d = pVar;
        this.f149908e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.c("IPC.IPCBridgeManager", "on connect timeout(%s, tid : %s)", java.lang.Integer.valueOf(this.f149907d.hashCode()), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (this.f149907d.f149916c) {
            synchronized (this.f149907d) {
                if (this.f149907d.f149916c) {
                    this.f149907d.f149916c = false;
                    this.f149907d.notifyAll();
                    this.f149907d.f149917d = null;
                    synchronized (this.f149909f.f149923c) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f149909f.f149923c).remove(this.f149908e);
                    }
                }
            }
        }
    }
}
