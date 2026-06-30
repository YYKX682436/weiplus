package xz0;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xz0.b f539704a = new xz0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final yz0.b f539705b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f539706c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f539707d;

    static {
        cf0.z zVar = (cf0.z) i95.n0.c(cf0.z.class);
        zVar.getClass();
        gm0.j1.b().c();
        yz0.b bVar = zVar.f122401m;
        if (bVar == null) {
            zVar.m134976x2690a4ac();
            zVar.Ai();
            d95.b0 b0Var = zVar.f122399h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            bVar = new yz0.b(b0Var);
        }
        zVar.f122401m = bVar;
        f539705b = bVar;
        f539706c = new java.util.concurrent.ConcurrentHashMap(100);
        f539707d = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yz0.a a(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "mediaId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L1a
            yz0.a r11 = new yz0.a
            r11.<init>()
            r11.f69132xaca5bdda = r10
            return r11
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = xz0.b.f539706c
            java.lang.Object r3 = r0.get(r10)
            yz0.a r3 = (yz0.a) r3
            java.lang.String r4 = ", memoryCache size:"
            java.lang.String r5 = "[query] mediaId="
            java.lang.String r6 = "Finder.MediaCacheLogic"
            if (r3 == 0) goto L53
            java.lang.Object r3 = r0.get(r10)
            yz0.a r3 = (yz0.a) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r10)
            java.lang.String r8 = " hit memory cache:"
            r7.append(r8)
            r7.append(r3)
            r7.append(r4)
            int r8 = r0.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7)
            if (r3 != 0) goto L8a
        L53:
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = xz0.b.f539707d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r3.readLock()
            r3.lock()
            yz0.b r7 = xz0.b.f539705b     // Catch: java.lang.Throwable -> Le8
            yz0.a r7 = r7.y0(r10)     // Catch: java.lang.Throwable -> Le8
            r3.unlock()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r10)
            java.lang.String r8 = " hit db cache:"
            r3.append(r8)
            r3.append(r7)
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r3)
            r0.put(r10, r7)
            r3 = r7
        L8a:
            if (r11 == 0) goto Le7
            java.lang.String r11 = r3.t0()
            int r11 = r11.length()
            if (r11 <= 0) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            if (r1 == 0) goto Le7
            java.lang.String r11 = r3.t0()
            boolean r11 = com.p314xaae8f345.mm.vfs.w6.j(r11)
            if (r11 != 0) goto Le7
            r0 = 0
            r3.f69125x799e9d9e = r0
            r3.f69138x78351860 = r0
            r3.f69131x84cd6908 = r2
            java.lang.String r11 = ""
            r3.f69136x42ba17f7 = r11
            r3.f69126xc56863e8 = r2
            r3.f69133x84465715 = r2
            r3.f69124xa78549dc = r2
            r3.f69142xfd4dbd97 = r2
            r3.f69130xbb1b16e8 = r2
            r3.f69134x928511b1 = r11
            r11 = -2
            r3.f69137x29d3a50c = r11
            java.lang.String r11 = "query"
            r9.b(r3, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            r11.append(r10)
            java.lang.String r10 = " not found file. cache:"
            r11.append(r10)
            r11.append(r3)
            java.lang.String r10 = " filePath="
            r11.append(r10)
            java.lang.String r10 = r3.t0()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r10)
        Le7:
            return r3
        Le8:
            r10 = move-exception
            r3.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xz0.b.a(java.lang.String, boolean):yz0.a");
    }

    public final void b(yz0.a cache, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        cache.f69139xa783a79b = c01.id.c();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f539706c;
        java.lang.String field_mediaId = cache.f69132xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        concurrentHashMap.put(field_mediaId, cache);
        java.lang.String field_mediaId2 = cache.f69132xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId2, "field_mediaId");
        pm0.v.N("FinderMediaCacheUpdateThread", false, new xz0.a(cache, field_mediaId2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaced ");
        sb6.append(invokeSource);
        sb6.append(" isExist=");
        java.lang.String field_mediaId3 = cache.f69132xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId3, "field_mediaId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f539707d.readLock();
        readLock.lock();
        try {
            boolean D0 = f539705b.D0(field_mediaId3);
            readLock.unlock();
            sb6.append(D0);
            sb6.append(' ');
            sb6.append(cache);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", sb6.toString());
        } catch (java.lang.Throwable th6) {
            readLock.unlock();
            throw th6;
        }
    }

    public final void c(java.lang.String mediaId, java.lang.String originalMediaId, java.lang.String url, int i17, java.lang.String specFormat, int i18, long j17, long j18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalMediaId, "originalMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specFormat, "specFormat");
        yz0.a a17 = a(mediaId, false);
        a17.f69132xaca5bdda = mediaId;
        a17.f69135xbaadf794 = originalMediaId;
        a17.f69140x4b6e88aa = url;
        a17.f69136x42ba17f7 = specFormat;
        a17.f69126xc56863e8 = i17;
        a17.f69129xc0e4813d = i18;
        a17.f69125x799e9d9e = j17;
        a17.f69138x78351860 = j18;
        a17.f69137x29d3a50c = i19;
        a17.f69128xa7075739 = i27;
        a17.f69141xe3521b6f = str;
        a17.f69127xb953508c = str2;
        b(a17, "store");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "store mediaId:" + mediaId + " cache:" + a17);
    }
}
