package ai4;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ai4.m f86700a = new ai4.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f86701b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f86702c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f86703d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f86704e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f86705f;

    public final void a(int i17, java.lang.String str, java.lang.String str2) {
        try {
            ai4.b0 b0Var = ai4.b0.f86656a;
            if (!ai4.b0.f86659d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "bridgeNotifyObserves: AFF DB disabled, skip (eventId=" + i17 + ')');
                return;
            }
            si4.a G = ai4.m0.f86706a.G();
            if (G instanceof si4.c) {
                qi4.v.f445321a.g(str2);
                ((si4.c) G).y(i17, str, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "bridgeNotifyObserves: current storage is not StatusInfoAffStorage (" + G.getClass().getSimpleName() + "), skip");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StatusStorageEventBridge", th6, "bridgeNotifyObserves: failed, eventId=" + i17 + ", statusId=" + str + ", user=" + str2, new java.lang.Object[0]);
        }
    }

    public final void b(int i17, java.lang.String statusId, java.lang.String userName, long j17) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (statusId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform: empty statusId, skip register (eventId=" + i17 + ", user=" + userName + ')');
            return;
        }
        if (i17 == 5) {
            ai4.g gVar = new ai4.g(statusId, userName);
            synchronized (f86702c) {
                f86700a.c();
                hashMap2 = f86704e;
                ai4.j jVar = (ai4.j) hashMap2.get(gVar);
                if (jVar != null) {
                    jVar.f86689a++;
                    jVar.f86690b = android.os.SystemClock.uptimeMillis() + 30000;
                } else {
                    hashMap2.put(gVar, new ai4.j(1, android.os.SystemClock.uptimeMillis() + 30000));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform(delete): fp=" + gVar + ", pendingDeleteSize=" + hashMap2.size());
            return;
        }
        ai4.h hVar = new ai4.h(i17, statusId, userName, j17);
        synchronized (f86702c) {
            f86700a.c();
            hashMap = f86703d;
            ai4.j jVar2 = (ai4.j) hashMap.get(hVar);
            if (jVar2 != null) {
                jVar2.f86689a++;
                jVar2.f86690b = android.os.SystemClock.uptimeMillis() + 30000;
            } else {
                hashMap.put(hVar, new ai4.j(1, android.os.SystemClock.uptimeMillis() + 30000));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "markWriteFromPlatform: fp=" + hVar + ", pendingSize=" + hashMap.size());
    }

    public final void c() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.Iterator it = f86703d.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (((ai4.j) entry.getValue()).f86690b <= uptimeMillis) {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "purgeExpired: fingerprint TTL expired, fp=" + entry.getKey() + ", pendingSize=" + f86703d.size());
            }
        }
        java.util.Iterator it6 = f86704e.entrySet().iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next2, "next(...)");
            java.util.Map.Entry entry2 = (java.util.Map.Entry) next2;
            if (((ai4.j) entry2.getValue()).f86690b <= uptimeMillis) {
                it6.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusStorageEventBridge", "purgeExpired(delete): fingerprint TTL expired, fp=" + entry2.getKey() + ", pendingDeleteSize=" + f86704e.size());
            }
        }
    }

    public final void d(java.lang.String subId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subId, "subId");
        if (r26.n0.N(subId)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f86701b;
        if (((ai4.i) concurrentHashMap.remove(subId)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "removeObserver: subId=" + subId + ", remain=" + concurrentHashMap.size());
        }
    }

    public final synchronized void e() {
        if (f86705f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "start: already started, skip");
            return;
        }
        try {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117493xd0abb1c0("plugin_textstatus_bridge_aff_sub_id", ai4.l.f86698a);
            f86705f = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusStorageEventBridge", "start: subscribe AFF StatusInfoChange ok, subId=plugin_textstatus_bridge_aff_sub_id");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StatusStorageEventBridge", th6, "start: subscribe AFF StatusInfoChange failed", new java.lang.Object[0]);
        }
    }
}
