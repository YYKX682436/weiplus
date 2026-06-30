package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class q {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p794xb0fa9b5e.q f149918g;

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p794xb0fa9b5e.c0 f149919h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.ThreadLocal f149920i;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f149922b;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f149924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f149925e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f149926f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f149921a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f149923c = new java.util.concurrent.ConcurrentHashMap();

    public q() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
        this.f149922b = new android.os.Handler(com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149930d.getLooper());
        this.f149924d = new java.util.HashMap();
        this.f149926f = new java.util.HashMap();
        this.f149925e = new java.util.HashMap();
    }

    public static com.p314xaae8f345.mm.p794xb0fa9b5e.q b() {
        if (f149918g == null) {
            synchronized (com.p314xaae8f345.mm.p794xb0fa9b5e.q.class) {
                if (f149918g == null) {
                    f149918g = new com.p314xaae8f345.mm.p794xb0fa9b5e.q();
                }
            }
        }
        return f149918g;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lk0.c a(java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p794xb0fa9b5e.q.a(java.lang.String, boolean):lk0.c");
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p pVar;
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.y.b(str)) {
            rk0.c.c("IPC.IPCBridgeManager", "the same process(%s), do not need to release IPCBridge.", str);
            return;
        }
        synchronized (this.f149923c) {
            pVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p) ((java.util.concurrent.ConcurrentHashMap) this.f149923c).get(str);
        }
        if (pVar == null) {
            rk0.c.c("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, IPCBridgeWrapper is null.", str);
            return;
        }
        try {
            if (pVar.f149916c) {
                synchronized (pVar) {
                    pVar.f149916c = false;
                    pVar.notifyAll();
                }
            }
            android.content.ServiceConnection serviceConnection = pVar.f149915b;
            if (serviceConnection == null) {
                rk0.c.c("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, ServiceConnection is null.", str);
                synchronized (this.f149923c) {
                    ((java.util.concurrent.ConcurrentHashMap) this.f149923c).remove(str, pVar);
                }
                synchronized (pVar) {
                    pVar.f149914a = null;
                    pVar.f149916c = false;
                    pVar.f149915b = null;
                }
                return;
            }
            try {
                rk0.c.c("IPC.IPCBridgeManager", "unbind service for proc: " + str, new java.lang.Object[0]);
                rk0.c.c("IPC.IPCBridgeManager", "unbind bw(%s) conn(%s)", java.lang.Integer.valueOf(pVar.hashCode()), java.lang.Integer.valueOf(serviceConnection.hashCode()));
                iz5.a.d("IPCInvoker not initialize.", com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150001a);
                com.p314xaae8f345.mm.p794xb0fa9b5e.y.f150001a.unbindService(serviceConnection);
            } catch (java.lang.Exception e17) {
                rk0.c.b("IPC.IPCBridgeManager", "unbindService(%s) error, %s", str, android.util.Log.getStackTraceString(e17));
            }
            synchronized (this.f149923c) {
                ((java.util.concurrent.ConcurrentHashMap) this.f149923c).remove(str, pVar);
            }
            synchronized (pVar) {
                pVar.f149914a = null;
                pVar.f149916c = false;
                pVar.f149915b = null;
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this.f149923c) {
                ((java.util.concurrent.ConcurrentHashMap) this.f149923c).remove(str, pVar);
                synchronized (pVar) {
                    pVar.f149914a = null;
                    pVar.f149916c = false;
                    pVar.f149915b = null;
                    throw th6;
                }
            }
        }
    }
}
