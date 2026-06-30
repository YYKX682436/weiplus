package pk1;

/* loaded from: classes12.dex */
public final class g0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.g0 f436980d = new pk1.g0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436981e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f436982f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f436983g = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f436984h = new java.util.HashMap();

    static {
        pk1.c0.f436968s = pk1.f0.f436977d;
    }

    public final void a(java.lang.String str, int i17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436981e;
        reentrantLock.lock();
        try {
            pk1.e0 e0Var = (pk1.e0) f436982f.remove(str);
            if (e0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "cancelPreDownload result:" + pk1.b.f436949d.a(str));
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f436983g;
                reentrantLock2.lock();
                try {
                    java.util.HashSet hashSet = (java.util.HashSet) f436984h.remove(str);
                    if (hashSet != null) {
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((yz5.q) it.next()).mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(e0Var.f436974b), java.lang.Long.valueOf(e0Var.f436975c));
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "updateTaskInfo downloadId" + str + ", finished:" + j17 + " total:" + j18);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f436981e;
        reentrantLock.lock();
        try {
            pk1.e0 e0Var = (pk1.e0) f436982f.get(str);
            if (e0Var != null) {
                long max = java.lang.Math.max(j17, e0Var.f436974b);
                e0Var.f436974b = max;
                e0Var.f436975c = j18;
                if (max < j18 || e0Var.f436976d < 100) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "mark file download completed");
                pk1.z zVar = pk1.z.f437063a;
                zVar.d(zVar.b(e0Var.f436973a));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (str == null) {
            return;
        }
        b(str, j17, j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onFinish, mediaId: " + str + ", ret: " + i17);
        if (str == null || hVar == null) {
            return;
        }
        b(str, hVar.f69548xe026fea1, hVar.f69523x17c343e7);
        a(str, i17);
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onDataAvailable mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onM3U8Ready mediaId:" + str + " m3u8:" + str2);
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onMoovReady mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }
}
