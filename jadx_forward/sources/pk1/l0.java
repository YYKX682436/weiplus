package pk1;

/* loaded from: classes12.dex */
public final class l0 extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f436998s = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f436999d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f437000e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f437001f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a f437002g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437003h;

    /* renamed from: i, reason: collision with root package name */
    public final pk1.v f437004i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f437005m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f437006n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Boolean f437007o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.l f437008p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.p f437009q;

    /* renamed from: r, reason: collision with root package name */
    public final pk1.a0 f437010r;

    public l0(java.lang.String srcUrl, java.lang.String str, yz5.p pVar, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.x1 m18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        this.f436999d = srcUrl;
        this.f437000e = str;
        this.f437001f = pVar;
        this.f437002g = aVar;
        java.lang.String str2 = "MicroMsg.AppBrand.ThumbCdnResourceLoader#" + hashCode();
        this.f437003h = str2;
        pk1.v b17 = pk1.z.f437063a.b(srcUrl);
        this.f437004i = b17;
        pk1.u uVar = b17.f437059a;
        java.lang.String downloadId = uVar.f437056b;
        this.f437005m = downloadId;
        java.lang.String str3 = uVar.f437057c;
        this.f437006n = str3;
        pk1.j0 j0Var = new pk1.j0(this);
        this.f437008p = j0Var;
        pk1.i0 i0Var = new pk1.i0(this);
        this.f437009q = i0Var;
        pk1.k0 k0Var = new pk1.k0(this);
        this.f437010r = k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "<init>, srcUrl: " + srcUrl + ", downloadId: " + downloadId + ", cachePath: " + str3);
        long j17 = 0;
        if (b17.f437059a.f437058d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "<init>, already cached, startRet: true");
            this.f437007o = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j18 = (m19.a() && (m17 = m19.f294799a.m(m19.f294800b)) != null) ? m17.f294766c : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "<init>, already cached, total: " + j18);
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18));
            }
            if (aVar != null) {
                pk1.r rVar = (pk1.r) aVar;
                rVar.f437025d = j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateVideoFileSize:%d", java.lang.Long.valueOf(j18));
            }
            if (aVar != null) {
                pk1.r rVar2 = (pk1.r) aVar;
                java.lang.System.currentTimeMillis();
                rVar2.f437025d = j18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar2.f437019a, "markDownloadFinish videoFileSize:%d", java.lang.Long.valueOf(j18));
            }
        } else {
            pk1.c0 c0Var = pk1.c0.f436956d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "listenDownload, downloadId: ".concat(downloadId));
            java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f436963n;
            reentrantLock.lock();
            try {
                java.util.HashMap hashMap = pk1.c0.f436964o;
                java.lang.Object obj = hashMap.get(downloadId);
                if (obj == null) {
                    obj = new java.util.HashSet();
                    hashMap.put(downloadId, obj);
                }
                ((java.util.HashSet) obj).add(new java.lang.ref.WeakReference(i0Var));
                reentrantLock.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.c0.f436960h;
                reentrantLock2.lock();
                try {
                    java.lang.Boolean bool = (java.lang.Boolean) pk1.c0.f436961i.get(downloadId);
                    if (bool == null) {
                        java.util.HashMap hashMap2 = pk1.c0.f436962m;
                        java.lang.Object obj2 = hashMap2.get(downloadId);
                        if (obj2 == null) {
                            obj2 = new java.util.HashSet();
                            hashMap2.put(downloadId, obj2);
                        }
                        bool = java.lang.Boolean.valueOf(((java.util.HashSet) obj2).add(new java.lang.ref.WeakReference(j0Var)));
                    }
                    reentrantLock2.unlock();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "withLock(...)");
                    bool.booleanValue();
                    java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.c0.f436965p;
                    reentrantLock3.lock();
                    try {
                        java.util.HashMap hashMap3 = pk1.c0.f436966q;
                        java.lang.Object obj3 = hashMap3.get(downloadId);
                        if (obj3 == null) {
                            obj3 = new java.util.HashSet();
                            hashMap3.put(downloadId, obj3);
                        }
                        ((java.util.HashSet) obj3).add(new java.lang.ref.WeakReference(k0Var));
                        reentrantLock3.unlock();
                        pk1.h0 h0Var = pk1.h0.f436986d;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheStart, cacheInfo: " + b17.f437059a);
                        ((ku5.t0) ku5.t0.f394148d).h(new pk1.y(h0Var), "MicroMsg.AppBrand.ThumbCdnCacheManager");
                    } catch (java.lang.Throwable th6) {
                        reentrantLock3.unlock();
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    reentrantLock2.unlock();
                    throw th7;
                }
            } catch (java.lang.Throwable th8) {
                reentrantLock.unlock();
                throw th8;
            }
        }
        if (lVar != null) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
            java.lang.String str5 = a18.f294812f;
            if (str5 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!a18.f294812f.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if (m27.a() && (m18 = m27.f294799a.m(m27.f294800b)) != null) {
                j17 = m18.f294766c;
            }
            lVar.mo146xb9724478(java.lang.Long.valueOf(j17));
        }
    }

    public final void a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str = this.f437003h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRelease");
        if (this.f437004i.f437059a.f437058d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRelease, already cached");
            return;
        }
        c();
        pk1.c0 c0Var = pk1.c0.f436956d;
        yz5.l startCallback = this.f437008p;
        yz5.p progressCallback = this.f437009q;
        pk1.a0 thumbCdnDownloadCallback = this.f437010r;
        java.lang.String downloadId = this.f437005m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startCallback, "startCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressCallback, "progressCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbCdnDownloadCallback, "thumbCdnDownloadCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "unListenDownload, downloadId: ".concat(downloadId));
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f436960h;
        reentrantLock.lock();
        java.util.HashMap hashMap = pk1.c0.f436962m;
        try {
            java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(downloadId);
            java.lang.Object obj3 = null;
            if (hashSet != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj4 : hashSet) {
                    if (((java.lang.ref.WeakReference) obj4).get() == null) {
                        arrayList.add(obj4);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.remove((java.lang.ref.WeakReference) it.next());
                }
                java.util.Iterator it6 = hashSet.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(startCallback, ((java.lang.ref.WeakReference) obj).get())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
                if (weakReference != null) {
                    hashSet.remove(weakReference);
                }
                if (hashSet.isEmpty()) {
                    hashMap.remove(downloadId);
                }
            }
            reentrantLock.unlock();
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = pk1.c0.f436963n;
            reentrantLock2.lock();
            java.util.HashMap hashMap2 = pk1.c0.f436964o;
            try {
                java.util.HashSet hashSet2 = (java.util.HashSet) hashMap2.get(downloadId);
                if (hashSet2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : hashSet2) {
                        if (((java.lang.ref.WeakReference) obj5).get() == null) {
                            arrayList2.add(obj5);
                        }
                    }
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        hashSet2.remove((java.lang.ref.WeakReference) it7.next());
                    }
                    java.util.Iterator it8 = hashSet2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj2 = it8.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(progressCallback, ((java.lang.ref.WeakReference) obj2).get())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) obj2;
                    if (weakReference2 != null) {
                        hashSet2.remove(weakReference2);
                    }
                    if (hashSet2.isEmpty()) {
                        hashMap2.remove(downloadId);
                    }
                }
                reentrantLock2.unlock();
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = pk1.c0.f436965p;
                reentrantLock3.lock();
                java.util.HashMap hashMap3 = pk1.c0.f436966q;
                try {
                    java.util.HashSet hashSet3 = (java.util.HashSet) hashMap3.get(downloadId);
                    if (hashSet3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj6 : hashSet3) {
                            if (((java.lang.ref.WeakReference) obj6).get() == null) {
                                arrayList3.add(obj6);
                            }
                        }
                        java.util.Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            hashSet3.remove((java.lang.ref.WeakReference) it9.next());
                        }
                        java.util.Iterator it10 = hashSet3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it10.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(thumbCdnDownloadCallback, ((java.lang.ref.WeakReference) next).get())) {
                                obj3 = next;
                                break;
                            }
                        }
                        java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) obj3;
                        if (weakReference3 != null) {
                            hashSet3.remove(weakReference3);
                        }
                        if (hashSet3.isEmpty()) {
                            hashMap3.remove(downloadId);
                        }
                    }
                } finally {
                    reentrantLock3.unlock();
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock2.unlock();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            reentrantLock.unlock();
            throw th7;
        }
    }

    public final void b() {
        boolean z17 = this.f437004i.f437059a.f437058d;
        java.lang.String str = this.f437003h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startDownload, already cached");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startDownload");
            pk1.c0.f436956d.a(this, this.f436999d, this.f437000e, this.f437005m, this.f437006n, 0L, -1L);
        }
    }

    public final void c() {
        boolean z17 = this.f437004i.f437059a.f437058d;
        java.lang.String str = this.f437003h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stopDownload, already cached");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stopDownload");
        try {
            pk1.c0.f436956d.b(this, this.f437005m);
        } catch (java.util.ConcurrentModificationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "stopDownload failure, ConcurrentModificationException", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return this.f437006n;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        long j17 = 0;
        if (!this.f437004i.f437059a.f437058d) {
            pk1.c0 c0Var = pk1.c0.f436956d;
            java.lang.String downloadId = this.f437005m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
            java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f436957e;
            reentrantLock.lock();
            try {
                pk1.b0 b0Var = (pk1.b0) pk1.c0.f436958f.get(downloadId);
                if (b0Var != null) {
                    j17 = b0Var.f436954b;
                }
                return j17;
            } finally {
                reentrantLock.unlock();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437003h, "getDataTotalSize, already cached");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f437006n);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
            return m17.f294766c;
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (0 >= j18) {
            return 0;
        }
        pk1.v vVar = this.f437004i;
        boolean z17 = vVar.f437059a.f437058d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar2 = this.f437002g;
        java.lang.String str2 = this.f437003h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onReadData, already cached");
            pk1.z zVar = pk1.z.f437063a;
            pk1.u uVar = vVar.f437059a;
            com.p314xaae8f345.mm.vfs.r6 c17 = zVar.c();
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(uVar.f437056b + ".res", false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var = c17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c17.f294699d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str3 = z7Var.f294812f;
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str3 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
            boolean F = !m17.a() ? false : m17.f294799a.F(m17.f294800b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "checkCacheExist, exists: " + F + ", cacheInfo: " + uVar);
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(z7Var, m17);
            if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                vVar.f437059a = pk1.u.a(uVar, null, null, null, false, 7, null);
            }
            if (F) {
                zVar.e(vVar);
                return (int) j18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onReadData, cache has been delete, startDownload");
            pk1.c0.f436956d.a(this, this.f436999d, this.f437000e, this.f437005m, this.f437006n, j17, j18);
            if (aVar2 == null) {
                return 0;
            }
            ((pk1.r) aVar2).I++;
            return 0;
        }
        pk1.c0 c0Var = pk1.c0.f436956d;
        java.lang.String downloadId = this.f437005m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = pk1.c0.f436957e;
        reentrantLock.lock();
        try {
            pk1.b0 b0Var = (pk1.b0) pk1.c0.f436958f.get(downloadId);
            if (b0Var == null) {
                reentrantLock.unlock();
                i18 = 0;
                aVar = aVar2;
            } else {
                aVar = aVar2;
                long j19 = b0Var.f436954b;
                if (0 != j19) {
                    if (j19 == b0Var.f436953a) {
                        long j27 = j19 - j17;
                        if (j18 <= j27) {
                            j27 = j18;
                        }
                        i18 = (int) j27;
                    }
                }
                reentrantLock.unlock();
                long[] jArr = new long[2];
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37760xcac8ee98(downloadId, j17, jArr) == 0) {
                    long j28 = jArr[0];
                    if (-1 != j28) {
                        if (j28 > j18) {
                            j28 = j18;
                        }
                        i18 = (int) j28;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + downloadId + ", offset: " + j17 + ", expectedLength: " + j18 + ", lengthRet: " + i18);
                    }
                }
                i18 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCachedLength, downloadId: " + downloadId + ", offset: " + j17 + ", expectedLength: " + j18 + ", lengthRet: " + i18);
            }
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onReadData, hasCachedLength: " + i18);
                return i18;
            }
            c0Var.a(this, this.f436999d, this.f437000e, this.f437005m, this.f437006n, j17, j18);
            if (aVar != null) {
                ((pk1.r) aVar).I++;
            }
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        b();
        java.lang.Boolean bool = this.f437007o;
        if (!(bool != null ? bool.booleanValue() : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437003h, "onStartReadData, start fail");
        }
        int andIncrement = f436998s.getAndIncrement();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437003h, "onStartReadData, requestId: " + andIncrement);
        return andIncrement;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return 0;
    }
}
