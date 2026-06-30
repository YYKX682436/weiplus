package pk1;

/* loaded from: classes12.dex */
public final class c0 implements dn.k, dn.n {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.c0 f436956d = new pk1.c0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436957e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f436958f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f436959g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436960h = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f436961i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f436962m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436963n = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f436964o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436965p = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f436966q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436967r = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: s, reason: collision with root package name */
    public static yz5.l f436968s;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCdnAuthInfo, mediaId: " + str);
    }

    public final void a(java.lang.Object caller, java.lang.String srcUrl, java.lang.String str, java.lang.String downloadId, java.lang.String cachePath, long j17, long j18) {
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cachePath, "cachePath");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436957e;
        reentrantLock.lock();
        try {
            java.util.HashMap hashMap = f436958f;
            pk1.b0 b0Var = (pk1.b0) hashMap.get(downloadId);
            reentrantLock.unlock();
            if (b0Var == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436967r;
                reentrantLock2.lock();
                try {
                    yz5.l lVar = f436968s;
                    if (lVar != null) {
                        lVar.mo146xb9724478(downloadId);
                    }
                    pk1.b0 b0Var2 = new pk1.b0(srcUrl, downloadId, cachePath, 0L, 0L, 24, null);
                    str2 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "startDownload, addDownloadTask");
                    pk1.b bVar = pk1.b.f436949d;
                    dn.o oVar = new dn.o();
                    oVar.M1 = srcUrl;
                    oVar.f69601xaca5bdda = downloadId;
                    oVar.f69595x6d25b0d9 = cachePath;
                    oVar.N1 = str;
                    oVar.H1 = 1;
                    pk1.c0 c0Var = f436956d;
                    oVar.f323320f = c0Var;
                    oVar.f323348c2 = c0Var;
                    oVar.f323318d = "task_AppbrandCdnService_2";
                    oVar.Z = 4;
                    str3 = "MicroMsg.AppBrandCdnService";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "addDownloadTask, mediaId: " + oVar.f69601xaca5bdda);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = pk1.b.f436951f;
                    if (concurrentHashMap.putIfAbsent(oVar.f69601xaca5bdda, oVar) == null) {
                        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
                        c2CDownloadRequest.f17792xcd096f43 = oVar.f69601xaca5bdda;
                        c2CDownloadRequest.url = oVar.M1;
                        c2CDownloadRequest.f17823x40acd92d = oVar.N1;
                        c2CDownloadRequest.m37861xfb0731c4(oVar.f69595x6d25b0d9);
                        c2CDownloadRequest.f17793xd428dad6 = 20210;
                        c2CDownloadRequest.f17780x81527598 = 10;
                        c2CDownloadRequest.f17820x5e9d4f82 = oVar.f69608x6ac8fea7;
                        c2CDownloadRequest.f17819x31507f2a = oVar.f323338x;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.N1) || ((java.lang.Boolean) ((jz5.n) pk1.b.f436952g).mo141623x754a37bb()).booleanValue()) {
                            str4 = "User-Agent:" + bVar.b() + "\r\nAccept-Encoding:identity\nContent-Type:\r\n";
                        } else {
                            str4 = "User-Agent:" + bVar.b() + "\r\nAccept-Encoding:identity\nContent-Type:\r\nReferer:" + oVar.N1 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
                        }
                        c2CDownloadRequest.f17782x37c415e = str4;
                        i17 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37787x52efc79(c2CDownloadRequest, bVar, bVar, oVar.H1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "addDownloadTask, startHttpVideoStreamingDownload, result: " + i17 + ", disableRefererHeader:" + ((java.lang.Boolean) ((jz5.n) pk1.b.f436952g).mo141623x754a37bb()).booleanValue());
                        if (i17 != 0) {
                            concurrentHashMap.remove(oVar.f69601xaca5bdda);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "download task has already add");
                        i17 = 0;
                    }
                    if (i17 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "startDownload, addDownloadTask fail");
                        java.util.concurrent.locks.ReentrantLock reentrantLock3 = f436960h;
                        reentrantLock3.lock();
                        try {
                            f436961i.put(downloadId, java.lang.Boolean.FALSE);
                            java.util.HashSet hashSet = (java.util.HashSet) f436962m.get(downloadId);
                            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
                            if (X0 != null) {
                                java.util.Iterator it = X0.iterator();
                                while (it.hasNext()) {
                                    yz5.l lVar2 = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                                    if (lVar2 != null) {
                                        lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                                    }
                                }
                                return;
                            }
                            return;
                        } finally {
                            reentrantLock3.unlock();
                        }
                    }
                    reentrantLock.lock();
                    try {
                        hashMap.put(downloadId, b0Var2);
                        java.util.HashMap hashMap2 = f436959g;
                        java.lang.Object obj = hashMap2.get(downloadId);
                        if (obj == null) {
                            obj = new java.util.HashSet();
                            hashMap2.put(downloadId, obj);
                        }
                        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(caller.hashCode()));
                    } finally {
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            } else {
                str2 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                str3 = "MicroMsg.AppBrandCdnService";
            }
            pk1.b bVar2 = pk1.b.f436949d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "requestVideoData, mediaId: " + downloadId + ", offset: " + j17 + ", length: " + j18 + ", durationMs: 0");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "startDownload, requestVideoData, downloadId: " + downloadId + ", offset: " + j17 + ", length: " + j18 + " result:" + ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(downloadId, j17, j18, 0));
        } finally {
        }
    }

    public final void b(java.lang.Object caller, java.lang.String downloadId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436957e;
        reentrantLock.lock();
        java.util.HashMap hashMap = f436958f;
        try {
            if (((pk1.b0) hashMap.get(downloadId)) == null) {
                return;
            }
            java.util.HashMap hashMap2 = f436959g;
            java.util.HashSet hashSet = (java.util.HashSet) hashMap2.get(downloadId);
            boolean z17 = false;
            if (hashSet != null && true == hashSet.remove(java.lang.Integer.valueOf(caller.hashCode()))) {
                z17 = true;
            }
            if (z17) {
                if (!hashSet.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, callersSet is not empty");
                    return;
                }
                reentrantLock.unlock();
                if (pk1.b.f436949d.a(downloadId) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, cancelDownloadTask fail");
                }
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436960h;
                reentrantLock2.lock();
                try {
                    f436961i.remove(downloadId);
                    java.util.HashSet hashSet2 = (java.util.HashSet) f436962m.get(downloadId);
                    if (hashSet2 != null) {
                        java.util.Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                            if (lVar != null) {
                                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                            }
                        }
                    }
                    reentrantLock.lock();
                    try {
                        hashMap2.remove(downloadId);
                    } finally {
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436960h;
        reentrantLock.lock();
        try {
            f436961i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f436962m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                }
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436963n;
            reentrantLock2.lock();
            java.util.HashMap hashMap = f436964o;
            try {
                java.util.HashSet hashSet2 = j17 >= j18 ? (java.util.HashSet) hashMap.remove(str) : (java.util.HashSet) hashMap.get(str);
                if (hashSet2 != null) {
                    java.util.Iterator it6 = hashSet2.iterator();
                    while (it6.hasNext()) {
                        yz5.p pVar = (yz5.p) ((java.lang.ref.WeakReference) it6.next()).get();
                        if (pVar != null) {
                            pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
                        }
                    }
                }
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = f436957e;
                reentrantLock3.lock();
                try {
                    pk1.b0 b0Var = (pk1.b0) f436958f.get(str);
                    if (b0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onProgress, taskInfo is null");
                    } else {
                        b0Var.f436953a = j17;
                        b0Var.f436954b = j18;
                    }
                } finally {
                    reentrantLock3.unlock();
                }
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, mediaId: " + str + ", ret: " + i17);
        if (str == null || hVar == null) {
            return;
        }
        boolean z17 = i17 == 0;
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436960h;
        reentrantLock.lock();
        try {
            f436961i.put(str, java.lang.Boolean.valueOf(z17));
            java.util.HashSet hashSet = (java.util.HashSet) f436962m.remove(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
                    }
                }
            }
            long j17 = hVar.f69523x17c343e7;
            if (z17) {
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436963n;
                reentrantLock2.lock();
                try {
                    java.util.HashSet hashSet2 = (java.util.HashSet) f436964o.remove(str);
                    if (hashSet2 != null) {
                        java.util.Iterator it6 = hashSet2.iterator();
                        while (it6.hasNext()) {
                            yz5.p pVar = (yz5.p) ((java.lang.ref.WeakReference) it6.next()).get();
                            if (pVar != null) {
                                pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17));
                            }
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
            if (pk1.b.f436949d.a(str) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, cancelDownloadTask fail");
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock3 = f436957e;
            reentrantLock3.lock();
            try {
                f436959g.remove(str);
                if (z17) {
                    java.util.concurrent.locks.ReentrantLock reentrantLock4 = f436965p;
                    reentrantLock4.lock();
                    try {
                        java.util.HashSet hashSet3 = (java.util.HashSet) f436966q.remove(str);
                        java.util.Set X02 = hashSet3 != null ? kz5.n0.X0(hashSet3) : null;
                        if (X02 != null) {
                            java.util.Iterator it7 = X02.iterator();
                            while (it7.hasNext()) {
                                pk1.a0 a0Var = (pk1.a0) ((java.lang.ref.WeakReference) it7.next()).get();
                                if (a0Var != null) {
                                    pk1.l0 l0Var = ((pk1.k0) a0Var).f436993a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f437003h, "onFinish: total: " + j17);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = l0Var.f437002g;
                                    if (aVar != null) {
                                        pk1.r rVar = (pk1.r) aVar;
                                        java.lang.System.currentTimeMillis();
                                        rVar.f437025d = j17;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "markDownloadFinish videoFileSize:%d", java.lang.Long.valueOf(j17));
                                    }
                                }
                            }
                        }
                    } finally {
                        reentrantLock4.unlock();
                    }
                }
            } finally {
                reentrantLock3.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onDataAvailable, mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436960h;
        reentrantLock.lock();
        try {
            f436961i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f436962m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", m3u8: " + str2);
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436960h;
        reentrantLock.lock();
        try {
            f436961i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f436962m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                }
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436965p;
            reentrantLock2.lock();
            try {
                java.util.HashSet hashSet2 = (java.util.HashSet) f436966q.get(str);
                java.util.Set X02 = hashSet2 != null ? kz5.n0.X0(hashSet2) : null;
                if (X02 != null) {
                    java.util.Iterator it6 = X02.iterator();
                    while (it6.hasNext()) {
                        pk1.a0 a0Var = (pk1.a0) ((java.lang.ref.WeakReference) it6.next()).get();
                        if (a0Var != null) {
                            pk1.l0 l0Var = ((pk1.k0) a0Var).f436993a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f437003h, "onMoovReady: offset: " + j17 + ", length: " + j18);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = l0Var.f437002g;
                            if (aVar != null) {
                                pk1.r rVar = (pk1.r) aVar;
                                if (j18 > 0 && rVar.M > 0) {
                                    rVar.L = java.lang.System.currentTimeMillis() - rVar.M;
                                    rVar.f437018J = j18;
                                    rVar.K = j17;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "setMoovInfo offset:%d, moovSize:%d， moovCostTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(rVar.L));
                            }
                        }
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "callback, mediaId: " + mediaId + ", startRet: " + i17);
        if (i17 == 0) {
            return 0;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436960h;
        reentrantLock.lock();
        try {
            f436961i.put(mediaId, java.lang.Boolean.FALSE);
            java.util.HashSet hashSet = (java.util.HashSet) f436962m.get(mediaId);
            if (hashSet == null) {
                return 0;
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "decodePrepareResponse, mediaId: " + str);
        return new byte[0];
    }
}
