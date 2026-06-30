package cu2;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.x f303982a = new cu2.x();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x90 f303983b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x90) ((c61.l7) i95.n0.c(c61.l7.class)).B.mo141623x754a37bb();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f303984c = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f303985d = new java.util.concurrent.ConcurrentHashMap(100);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f303986e = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public static void b(cu2.x xVar, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 604800000;
        }
        xVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        p75.n0 n0Var = dm.w4.f322311J;
        n0Var.getClass();
        p75.m0 x17 = dm.w4.K.x(java.lang.Long.valueOf(currentTimeMillis));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.b();
        p75.h hVar = (p75.h) x17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 k0Var = f303983b.f209829d;
        int mo70514xb06685ab = k0Var != null ? k0Var.mo70514xb06685ab(table, b17, e17) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "[deleteExpired] before=" + currentTimeMillis + " ret=" + mo70514xb06685ab + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + "ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r13 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static so2.i3 c(cu2.x r7, java.lang.String r8, boolean r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.x.c(cu2.x, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):so2.i3");
    }

    public static void h(cu2.x xVar, long j17, java.lang.String mediaId, java.lang.String originalMediaId, java.lang.String url, int i17, java.lang.String specFormat, int i18, long j18, long j19, int i19, int i27, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i28, java.lang.Object obj) {
        boolean z19 = (i28 & 8192) != 0 ? false : z17;
        boolean z27 = (i28 & 16384) != 0 ? false : z18;
        xVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalMediaId, "originalMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specFormat, "specFormat");
        so2.i3 c17 = c(xVar, mediaId, false, false, false, 12, null);
        c17.f68975xf9a02e3e = j17;
        c17.f68981xaca5bdda = mediaId;
        c17.f68984xbaadf794 = originalMediaId;
        c17.f68992x4b6e88aa = url;
        c17.f68987x74535930 = i17;
        c17.f68976xe1500f8 = specFormat;
        c17.f68971xc0e4813d = i18;
        c17.f68968x799e9d9e = j18;
        c17.f68989x78351860 = j19;
        c17.f68988x29d3a50c = i19;
        c17.f68970xa7075739 = i27;
        c17.f68993xe3521b6f = str;
        c17.f68969xb953508c = str2;
        if (z19) {
            c17.f68982x84465715 = true;
        }
        c17.f68980xb45ee2bb = z27;
        xVar.g(c17, "store");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "store feedId:" + pm0.v.u(j17) + " mediaId:" + mediaId + " cache:" + c17);
    }

    /* JADX WARN: Finally extract failed */
    public final boolean a() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f303986e;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i17 = 0; i17 < readHoldCount; i17++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x90 x90Var = f303983b;
            int mo70514xb06685ab = x90Var.f209829d.mo70514xb06685ab(x90Var.mo145255x88e404c3(), "rowid >= ?", new java.lang.String[]{"0"});
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.lock();
            }
            writeLock.unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "[deleteAll] ret=" + mo70514xb06685ab);
            f303984c.clear();
            return mo70514xb06685ab >= 0;
        } catch (java.lang.Throwable th6) {
            for (int i19 = 0; i19 < readHoldCount; i19++) {
                readLock.lock();
            }
            writeLock.unlock();
            throw th6;
        }
    }

    public final java.util.List d(java.lang.String originalMediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalMediaId, "originalMediaId");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f303986e.readLock();
        readLock.lock();
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f303985d;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) concurrentHashMap.get(originalMediaId);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList(f303983b.D0(originalMediaId));
                concurrentHashMap.put(originalMediaId, copyOnWriteArrayList);
            }
            return copyOnWriteArrayList;
        } finally {
            readLock.unlock();
        }
    }

    public final float e(java.lang.String mediaId, java.lang.String originalMediaId, long j17) {
        float f17;
        int i17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalMediaId, "originalMediaId");
        if (android.text.TextUtils.isEmpty(mediaId)) {
            java.lang.Object obj = null;
            if (!android.text.TextUtils.isEmpty(originalMediaId)) {
                java.util.Iterator it = d(originalMediaId).iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j18 = ((so2.i3) obj).f68991xa783a79b;
                        do {
                            java.lang.Object next = it.next();
                            long j19 = ((so2.i3) next).f68991xa783a79b;
                            if (j18 < j19) {
                                obj = next;
                                j18 = j19;
                            }
                        } while (it.hasNext());
                    }
                }
                so2.i3 i3Var = (so2.i3) obj;
                if (i3Var != null) {
                    f17 = i3Var.f68986xa6baeca6;
                    i17 = i3Var.f68970xa7075739;
                    f18 = i17;
                }
                return 0.0f;
            }
            if (j17 != 0) {
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f303986e.readLock();
                readLock.lock();
                try {
                    java.util.LinkedList y07 = f303983b.y0(j17);
                    readLock.unlock();
                    java.util.Iterator it6 = y07.iterator();
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (it6.hasNext()) {
                            long j27 = ((so2.i3) obj).f68991xa783a79b;
                            do {
                                java.lang.Object next2 = it6.next();
                                long j28 = ((so2.i3) next2).f68991xa783a79b;
                                if (j27 < j28) {
                                    obj = next2;
                                    j27 = j28;
                                }
                            } while (it6.hasNext());
                        }
                    }
                    so2.i3 i3Var2 = (so2.i3) obj;
                    if (i3Var2 != null) {
                        f17 = i3Var2.f68986xa6baeca6;
                        i17 = i3Var2.f68970xa7075739;
                        f18 = i17;
                    }
                } catch (java.lang.Throwable th6) {
                    readLock.unlock();
                    throw th6;
                }
            }
            return 0.0f;
        }
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        f18 = c17.f68986xa6baeca6;
        f17 = c17.f68970xa7075739;
        return f18 * f17;
    }

    public final jz5.l f(long j17) {
        float f17;
        int i17;
        java.lang.Object obj;
        if (j17 != 0) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = f303986e.readLock();
            readLock.lock();
            try {
                java.util.LinkedList y07 = f303983b.y0(j17);
                readLock.unlock();
                java.util.Iterator it = y07.iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        long j18 = ((so2.i3) next).f68991xa783a79b;
                        do {
                            java.lang.Object next2 = it.next();
                            long j19 = ((so2.i3) next2).f68991xa783a79b;
                            if (j18 > j19) {
                                next = next2;
                                j18 = j19;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                so2.i3 i3Var = (so2.i3) obj;
                if (i3Var != null) {
                    float f18 = i3Var.f68986xa6baeca6;
                    i17 = i3Var.f68970xa7075739;
                    f17 = f18 * i17;
                    return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
                }
            } catch (java.lang.Throwable th6) {
                readLock.unlock();
                throw th6;
            }
        }
        f17 = 0.0f;
        i17 = 0;
        return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
    }

    public final void g(so2.i3 cache, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        cache.f68991xa783a79b = c01.id.c();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f303984c;
        java.lang.String field_mediaId = cache.f68981xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        concurrentHashMap.put(field_mediaId, cache);
        java.lang.String field_mediaId2 = cache.f68981xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId2, "field_mediaId");
        i(field_mediaId2, cache, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "replaced " + invokeSource + ' ' + cache + ' ');
    }

    public final void i(java.lang.String str, so2.i3 i3Var, boolean z17) {
        pm0.v.N("FinderMediaCacheUpdateThread", false, new cu2.w(i3Var, z17, str));
    }

    public final void j(java.lang.String mediaId, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        if (num != null) {
            c17.f68987x74535930 = num.intValue();
        }
        if (str != null) {
            c17.f68976xe1500f8 = str;
        }
        i(mediaId, c17, false);
    }

    public final so2.i3 k(java.lang.String mediaId, java.lang.String fileFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        c17.f68982x84465715 = true;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.f68976xe1500f8, fileFormat)) {
            c17.f68976xe1500f8 = fileFormat;
        }
        i(mediaId, c17, false);
        return c17;
    }

    public final void l(java.lang.String mediaId, java.lang.String profile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(profile, "profile");
        if (profile.length() == 0) {
            return;
        }
        try {
            so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", "[netprofile] update " + mediaId + " with " + profile);
            c17.f68983x928511b1 = profile;
            f303983b.P0(c17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MediaCacheLogic", "[netprofile] update " + mediaId + " failed " + e17.getLocalizedMessage());
        }
    }

    public final void m(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        if (!java.lang.Boolean.valueOf(valueOf.longValue() > 0).booleanValue()) {
            valueOf = null;
        }
        c17.f68986xa6baeca6 = valueOf != null ? java.lang.Float.valueOf((((float) j17) * 1.0f) / ((float) valueOf.longValue())).floatValue() : 0.0f;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = cu2.z.f303990a;
        float f17 = c17.f68986xa6baeca6;
        long j19 = c17.f68975xf9a02e3e;
        x.g gVar = cu2.z.f303991b;
        java.lang.Float f18 = (java.lang.Float) gVar.get(java.lang.Long.valueOf(j19));
        if (f18 == null) {
            f18 = java.lang.Float.valueOf(0.0f);
        }
        if (f17 > f18.floatValue()) {
            gVar.put(java.lang.Long.valueOf(j19), java.lang.Float.valueOf(f17));
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h), null, null, new cu2.y(c17, f17, null), 3, null);
        }
        i(mediaId, c17, false);
    }

    public final so2.i3 n(java.lang.String mediaId, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        so2.i3 c17 = c(this, mediaId, false, false, false, 14, null);
        c17.f68968x799e9d9e = j17;
        c17.f68989x78351860 = j18;
        c17.f68988x29d3a50c = i17;
        i(mediaId, c17, false);
        return c17;
    }
}
