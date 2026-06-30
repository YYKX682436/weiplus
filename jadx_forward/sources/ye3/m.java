package ye3;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ye3.m f542759a = new ye3.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f542760b = jz5.h.b(ye3.l.f542758d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f542761c = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f542762d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ye3.n a(java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye3.m.a(java.lang.String, boolean):ye3.n");
    }

    public final void b(ye3.n cache, java.lang.String invokeSource) {
        boolean D0;
        boolean mo880xb970c2b9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        java.lang.String str = cache.f69010xaca5bdda;
        int i17 = 0;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_DB", "[replace] mediaId is isNullOrEmpty, skip. invokeSource=".concat(invokeSource));
            return;
        }
        cache.f69015xa783a79b = c01.id.c();
        c(cache);
        java.lang.String field_mediaId = cache.f69010xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        jz5.g gVar = f542760b;
        ye3.o oVar = (ye3.o) ((jz5.n) gVar).mo141623x754a37bb();
        if (oVar != null) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f542762d;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (field_mediaId.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    D0 = false;
                } else {
                    java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                    readLock2.lock();
                    try {
                        ye3.o oVar2 = (ye3.o) ((jz5.n) gVar).mo141623x754a37bb();
                        D0 = oVar2 != null ? oVar2.D0(field_mediaId) : false;
                    } finally {
                        readLock2.unlock();
                    }
                }
                if (D0) {
                    mo880xb970c2b9 = oVar.J0(cache);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] update success. mediaId=" + field_mediaId + " ret=" + mo880xb970c2b9);
                } else {
                    mo880xb970c2b9 = oVar.mo880xb970c2b9(cache);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] insert success. mediaId=" + field_mediaId + " ret=" + mo880xb970c2b9);
                }
                if (!mo880xb970c2b9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_DB", "[syncMemoryCacheToDbAsync] operation failed. mediaId=" + field_mediaId + " isExist=" + D0 + " cache=" + cache);
                }
            } finally {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[replace] success. invokeSource=" + invokeSource + " mediaId=" + cache.f69010xaca5bdda + " state=" + cache.f69013x29d3a50c + " filePath=" + cache.t0());
    }

    public final void c(ye3.n nVar) {
        java.lang.String str = nVar.f69010xaca5bdda;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f542761c;
        if (concurrentHashMap.size() >= 100 && !concurrentHashMap.containsKey(str)) {
            java.util.Set keySet = concurrentHashMap.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            java.lang.Object W = kz5.n0.W(keySet);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "first(...)");
            java.lang.String str2 = (java.lang.String) W;
            concurrentHashMap.remove(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_DB", "[updateMemoryCache] memory cache full, remove oldest. removed=" + str2 + " size=" + concurrentHashMap.size());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        concurrentHashMap.put(str, nVar);
    }
}
