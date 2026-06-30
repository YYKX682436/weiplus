package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public class q {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.tencent.mm.ipcinvoker.q f68385g;

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.ipcinvoker.c0 f68386h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.ThreadLocal f68387i;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f68389b;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f68391d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f68392e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f68393f;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f68388a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f68390c = new java.util.concurrent.ConcurrentHashMap();

    public q() {
        com.tencent.mm.ipcinvoker.r0 r0Var = com.tencent.mm.ipcinvoker.r0.f68395b;
        this.f68389b = new android.os.Handler(com.tencent.mm.ipcinvoker.r0.f68397d.getLooper());
        this.f68391d = new java.util.HashMap();
        this.f68393f = new java.util.HashMap();
        this.f68392e = new java.util.HashMap();
    }

    public static com.tencent.mm.ipcinvoker.q b() {
        if (f68385g == null) {
            synchronized (com.tencent.mm.ipcinvoker.q.class) {
                if (f68385g == null) {
                    f68385g = new com.tencent.mm.ipcinvoker.q();
                }
            }
        }
        return f68385g;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ipcinvoker.q.a(java.lang.String, boolean):lk0.c");
    }

    public void c(java.lang.String str) {
        com.tencent.mm.ipcinvoker.p pVar;
        if (com.tencent.mm.ipcinvoker.y.b(str)) {
            rk0.c.c("IPC.IPCBridgeManager", "the same process(%s), do not need to release IPCBridge.", str);
            return;
        }
        synchronized (this.f68390c) {
            pVar = (com.tencent.mm.ipcinvoker.p) ((java.util.concurrent.ConcurrentHashMap) this.f68390c).get(str);
        }
        if (pVar == null) {
            rk0.c.c("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, IPCBridgeWrapper is null.", str);
            return;
        }
        try {
            if (pVar.f68383c) {
                synchronized (pVar) {
                    pVar.f68383c = false;
                    pVar.notifyAll();
                }
            }
            android.content.ServiceConnection serviceConnection = pVar.f68382b;
            if (serviceConnection == null) {
                rk0.c.c("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, ServiceConnection is null.", str);
                synchronized (this.f68390c) {
                    ((java.util.concurrent.ConcurrentHashMap) this.f68390c).remove(str, pVar);
                }
                synchronized (pVar) {
                    pVar.f68381a = null;
                    pVar.f68383c = false;
                    pVar.f68382b = null;
                }
                return;
            }
            try {
                rk0.c.c("IPC.IPCBridgeManager", "unbind service for proc: " + str, new java.lang.Object[0]);
                rk0.c.c("IPC.IPCBridgeManager", "unbind bw(%s) conn(%s)", java.lang.Integer.valueOf(pVar.hashCode()), java.lang.Integer.valueOf(serviceConnection.hashCode()));
                iz5.a.d("IPCInvoker not initialize.", com.tencent.mm.ipcinvoker.y.f68468a);
                com.tencent.mm.ipcinvoker.y.f68468a.unbindService(serviceConnection);
            } catch (java.lang.Exception e17) {
                rk0.c.b("IPC.IPCBridgeManager", "unbindService(%s) error, %s", str, android.util.Log.getStackTraceString(e17));
            }
            synchronized (this.f68390c) {
                ((java.util.concurrent.ConcurrentHashMap) this.f68390c).remove(str, pVar);
            }
            synchronized (pVar) {
                pVar.f68381a = null;
                pVar.f68383c = false;
                pVar.f68382b = null;
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this.f68390c) {
                ((java.util.concurrent.ConcurrentHashMap) this.f68390c).remove(str, pVar);
                synchronized (pVar) {
                    pVar.f68381a = null;
                    pVar.f68383c = false;
                    pVar.f68382b = null;
                    throw th6;
                }
            }
        }
    }
}
