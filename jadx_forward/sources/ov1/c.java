package ov1;

/* loaded from: classes13.dex */
public class c implements kq.o {

    /* renamed from: c, reason: collision with root package name */
    public static ov1.c f430697c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f430698a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final dn.k f430699b = new ov1.a(this);

    public static void b(ov1.c cVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) cVar.f430698a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileDownloaderWAGameProxy", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((ov1.b) concurrentHashMap.get(str)).f430695a;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FileDownloaderWAGameProxy", "error proxy_callback null");
            } else if (i17 == 3) {
                pVar.a(str, ((ov1.b) concurrentHashMap.get(str)).f430696b, z17);
            } else {
                pVar.b(str, i18, z17);
            }
        }
    }

    @Override // kq.o
    public int a(java.lang.String str, java.lang.String str2, int i17, kq.p pVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileDownloaderWAGameProxy", "addDownloadTask: %s filepath:%s", str, str2);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FileDownloaderWAGameProxy";
        mVar.f69601xaca5bdda = str;
        mVar.f69595x6d25b0d9 = str2;
        mVar.f323344z = str;
        mVar.f69592xf1ebe47b = 50001;
        mVar.f323320f = this.f430699b;
        mVar.A = 60;
        mVar.B = 600;
        mVar.C = false;
        ov1.b bVar = new ov1.b(this, null);
        bVar.f430695a = pVar;
        bVar.f430696b = str2;
        ((java.util.concurrent.ConcurrentHashMap) this.f430698a).put(str, bVar);
        int b17 = hv1.d.f().b(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FileDownloaderWAGameProxy", "addDownloadTask: " + b17);
        return b17;
    }
}
