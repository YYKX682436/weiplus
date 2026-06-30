package ai4;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ai4.m f5167a = new ai4.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f5168b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f5169c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f5170d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f5171e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f5172f;

    public final void a(int i17, java.lang.String str, java.lang.String str2) {
        try {
            ai4.b0 b0Var = ai4.b0.f5123a;
            if (!ai4.b0.f5126d) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "bridgeNotifyObserves: AFF DB disabled, skip (eventId=" + i17 + ')');
                return;
            }
            si4.a G = ai4.m0.f5173a.G();
            if (G instanceof si4.c) {
                qi4.v.f363788a.g(str2);
                ((si4.c) G).y(i17, str, str2);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "bridgeNotifyObserves: current storage is not StatusInfoAffStorage (" + G.getClass().getSimpleName() + "), skip");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StatusStorageEventBridge", th6, "bridgeNotifyObserves: failed, eventId=" + i17 + ", statusId=" + str + ", user=" + str2, new java.lang.Object[0]);
        }
    }

    public final void b(int i17, java.lang.String statusId, java.lang.String userName, long j17) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (statusId.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform: empty statusId, skip register (eventId=" + i17 + ", user=" + userName + ')');
            return;
        }
        if (i17 == 5) {
            ai4.g gVar = new ai4.g(statusId, userName);
            synchronized (f5169c) {
                f5167a.c();
                hashMap2 = f5171e;
                ai4.j jVar = (ai4.j) hashMap2.get(gVar);
                if (jVar != null) {
                    jVar.f5156a++;
                    jVar.f5157b = android.os.SystemClock.uptimeMillis() + 30000;
                } else {
                    hashMap2.put(gVar, new ai4.j(1, android.os.SystemClock.uptimeMillis() + 30000));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform(delete): fp=" + gVar + ", pendingDeleteSize=" + hashMap2.size());
            return;
        }
        ai4.h hVar = new ai4.h(i17, statusId, userName, j17);
        synchronized (f5169c) {
            f5167a.c();
            hashMap = f5170d;
            ai4.j jVar2 = (ai4.j) hashMap.get(hVar);
            if (jVar2 != null) {
                jVar2.f5156a++;
                jVar2.f5157b = android.os.SystemClock.uptimeMillis() + 30000;
            } else {
                hashMap.put(hVar, new ai4.j(1, android.os.SystemClock.uptimeMillis() + 30000));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform: fp=" + hVar + ", pendingSize=" + hashMap.size());
    }

    public final void c() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.Iterator it = f5170d.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (((ai4.j) entry.getValue()).f5157b <= uptimeMillis) {
                it.remove();
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "purgeExpired: fingerprint TTL expired, fp=" + entry.getKey() + ", pendingSize=" + f5170d.size());
            }
        }
        java.util.Iterator it6 = f5171e.entrySet().iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            kotlin.jvm.internal.o.f(next2, "next(...)");
            java.util.Map.Entry entry2 = (java.util.Map.Entry) next2;
            if (((ai4.j) entry2.getValue()).f5157b <= uptimeMillis) {
                it6.remove();
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusStorageEventBridge", "purgeExpired(delete): fingerprint TTL expired, fp=" + entry2.getKey() + ", pendingDeleteSize=" + f5171e.size());
            }
        }
    }

    public final void d(java.lang.String subId) {
        kotlin.jvm.internal.o.g(subId, "subId");
        if (r26.n0.N(subId)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f5168b;
        if (((ai4.i) concurrentHashMap.remove(subId)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "removeObserver: subId=" + subId + ", remain=" + concurrentHashMap.size());
        }
    }

    public final synchronized void e() {
        if (f5172f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "start: already started, skip");
            return;
        }
        try {
            com.tencent.wechat.aff.status.StatusStorageManager.getInstance().subscribeStatusInfoChangeEvent("plugin_textstatus_bridge_aff_sub_id", ai4.l.f5165a);
            f5172f = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "start: subscribe AFF StatusInfoChange ok, subId=plugin_textstatus_bridge_aff_sub_id");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StatusStorageEventBridge", th6, "start: subscribe AFF StatusInfoChange failed", new java.lang.Object[0]);
        }
    }
}
