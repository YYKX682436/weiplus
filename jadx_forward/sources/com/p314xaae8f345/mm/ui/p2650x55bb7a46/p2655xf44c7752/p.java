package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p f282787a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f282788b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f282789c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f282790d = new java.util.HashMap();

    public final boolean a(long j17) {
        java.lang.Boolean bool = (java.lang.Boolean) f282790d.get(java.lang.Long.valueOf(j17));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void b() {
        f282789c.writeLock().lock();
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseAll: pausing all downloaders, size=");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f282788b;
            sb6.append(concurrentHashMap.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", sb6.toString());
            java.util.Set keySet = concurrentHashMap.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                fk4.k kVar = (fk4.k) f282788b.get(java.lang.Long.valueOf(longValue));
                if (kVar != null) {
                    if (kVar.f345151f) {
                        c(longValue);
                    } else if (kVar.i()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", "pauseAll: pausing downloader[" + longValue + ']');
                        kVar.l();
                    }
                }
            }
        } finally {
            f282789c.writeLock().unlock();
        }
    }

    public final fk4.k c(long j17) {
        return (fk4.k) f282788b.remove(java.lang.Long.valueOf(j17));
    }
}
