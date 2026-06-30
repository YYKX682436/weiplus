package hv1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.g f366800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f366801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f366802g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hv1.d f366803h;

    public b(hv1.d dVar, java.lang.String str, dn.g gVar, boolean z17, dn.h hVar) {
        this.f366803h = dVar;
        this.f366799d = str;
        this.f366800e = gVar;
        this.f366801f = z17;
        this.f366802g = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv1.d dVar = this.f366803h;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) dVar.f366810f;
        java.lang.String str = this.f366799d;
        dn.m mVar = (dn.m) concurrentHashMap.get(str);
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", str);
            return;
        }
        dn.g gVar = this.f366800e;
        if (gVar != null) {
            gVar.f323297a = str;
            java.lang.Long valueOf = java.lang.Long.valueOf(gVar.f69500x8ab84c59);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(gVar.f69496x83ec3dd);
            java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(gVar.f69498xe0f25a29);
            java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(mVar.f323319e);
            java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(gVar.f69497x7f197b15);
            boolean z17 = this.f366801f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "MTL: total:%d, cur:%d, mtl:%b, isSend:%b, isUploadTask:%b(%b)", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Boolean.valueOf(z17));
            if (z17 != mVar.f323319e) {
                return;
            }
        }
        dn.h hVar = this.f366802g;
        if (hVar != null) {
            hVar.f323299a = str;
        }
        if (mVar.f323320f != null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (hVar == null && gVar != null && !gVar.f69498xe0f25a29 && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40071x6a054172(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1) {
                return;
            }
            mVar.f69599x715d36da = currentTimeMillis;
            mVar.f323320f.r4(this.f366799d, 0, this.f366800e, this.f366802g, mVar.f69607x9bef5d80);
        }
        dVar.getClass();
        if (gVar == null || gVar.f69496x83ec3dd == gVar.f69500x8ab84c59) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f366811g).remove(str);
        }
        if (hVar != null) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f366810f).remove(str);
            if (hVar.f69553xb5f54fe9 == -5103011) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn ERR_VALIDATE_AUTHKEY");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(546L, 4L, 1L, true);
                dVar.e().m48081x73a07b7f(999);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m134175x9616526c() {
        return super.toString() + "|callback";
    }
}
