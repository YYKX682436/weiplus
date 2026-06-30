package hv1;

/* loaded from: classes12.dex */
public class d implements dn.f {

    /* renamed from: m, reason: collision with root package name */
    public static hv1.d f366807m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f366808d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f366809e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f366810f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f366811g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f366812h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("CdnDownloadNativeService#" + hashCode());

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.l1 f366813i = null;

    public d() {
        new java.util.HashSet();
    }

    public static synchronized hv1.d f() {
        hv1.d dVar;
        synchronized (hv1.d.class) {
            if (f366807m == null) {
                hv1.d dVar2 = new hv1.d();
                f366807m = dVar2;
                dVar2.e();
            }
            dVar = f366807m;
        }
        return dVar;
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f366810f).get(str);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.k kVar = mVar.f323320f;
        if (kVar != null) {
            kVar.O(str, byteArrayOutputStream);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
            return -1;
        }
        if (gVar == null && hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
            return -2;
        }
        boolean z17 = gVar != null ? gVar.f69497x7f197b15 : false;
        java.lang.System.currentTimeMillis();
        this.f366812h.m77784x795fa299(new hv1.b(this, str, gVar, z17, hVar));
        return 0;
    }

    public int b(dn.m mVar) {
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask task info is null");
            return -1;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
            return -1;
        }
        if (mVar.f69591xf9dbbe9c == null) {
            mVar.f69591xf9dbbe9c = "";
        }
        if (mVar.f69575xf11df5f5 == null) {
            mVar.f69575xf11df5f5 = "";
        }
        if (((java.util.LinkedList) this.f366808d).contains(mVar.f69591xf9dbbe9c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
        } else {
            if (((java.util.concurrent.ConcurrentHashMap) this.f366809e).containsKey(mVar.f69591xf9dbbe9c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
            } else {
                if (!((java.util.concurrent.ConcurrentHashMap) this.f366810f).containsKey(mVar.f69591xf9dbbe9c)) {
                    mVar.f323319e = false;
                    this.f366812h.m77784x795fa299(new hv1.a(this, -1, mVar));
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
            }
        }
        return -2;
    }

    public boolean c(java.lang.String str) {
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f366810f).get(str);
        d(str);
        if (mVar == null || mVar.f69595x6d25b0d9 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "cancelGameRecvTask, delete file:" + mVar.f69595x6d25b0d9);
        com.p314xaae8f345.mm.vfs.w6.h(mVar.f69595x6d25b0d9);
        return true;
    }

    public boolean d(java.lang.String str) {
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f366810f).remove(str);
        if (mVar != null) {
            int i17 = mVar.f69592xf1ebe47b;
            if (i17 == 30001 || i17 == 30003 || i17 == 30007) {
                e().w(str);
            } else if (mVar.F) {
                e().v(str);
            } else {
                e().getClass();
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(mVar.f69592xf1ebe47b);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            g0Var.d(10769, -10002, valueOf, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.f69615x1bb3b54a));
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f366809e).remove(str);
        ((java.util.concurrent.ConcurrentHashMap) this.f366811g).remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, 0);
        return true;
    }

    public com.p314xaae8f345.mm.p947xba6de98f.l1 e() {
        if (this.f366813i == null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "use mm process cdn engine.");
                this.f366813i = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "use new cdn engine.");
                this.f366813i = new com.p314xaae8f345.mm.p947xba6de98f.l1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir() + "/NativeCDNInfo", this);
            }
        }
        return this.f366813i;
    }

    public int g(dn.m mVar) {
        if (!((java.util.concurrent.ConcurrentHashMap) this.f366810f).containsKey(mVar.f69601xaca5bdda)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task add new mediaid:%s", mVar.f69601xaca5bdda);
            return b(mVar);
        }
        int m37766x958b0444 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37766x958b0444(mVar.f69601xaca5bdda);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra resumeRecvTask task resume mediaid:%s, ret:%d", mVar.f69601xaca5bdda, java.lang.Integer.valueOf(m37766x958b0444));
        return m37766x958b0444;
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) this.f366810f).get(str);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        dn.k kVar = mVar.f323320f;
        if (kVar != null) {
            return kVar.w(str, bArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        this.f366812h.m77784x795fa299(new hv1.c(this, str, hVar));
        return 0;
    }
}
