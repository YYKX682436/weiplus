package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.p f68374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f68375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.q f68376f;

    public n(com.tencent.mm.ipcinvoker.q qVar, com.tencent.mm.ipcinvoker.p pVar, java.lang.String str) {
        this.f68376f = qVar;
        this.f68374d = pVar;
        this.f68375e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.c("IPC.IPCBridgeManager", "on connect timeout(%s, tid : %s)", java.lang.Integer.valueOf(this.f68374d.hashCode()), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (this.f68374d.f68383c) {
            synchronized (this.f68374d) {
                if (this.f68374d.f68383c) {
                    this.f68374d.f68383c = false;
                    this.f68374d.notifyAll();
                    this.f68374d.f68384d = null;
                    synchronized (this.f68376f.f68390c) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f68376f.f68390c).remove(this.f68375e);
                    }
                }
            }
        }
    }
}
