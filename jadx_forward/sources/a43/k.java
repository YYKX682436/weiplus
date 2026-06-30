package a43;

/* loaded from: classes5.dex */
public class k implements kq.o {

    /* renamed from: c, reason: collision with root package name */
    public static a43.k f82755c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f82756a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback f82757b = new a43.i(this);

    public static void b(a43.k kVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) kVar.f82756a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagCdnDownloader", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((a43.j) concurrentHashMap.get(str)).f82753a;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PagCdnDownloader", "error proxy_callback null");
            } else if (i17 == 3) {
                pVar.a(str, ((a43.j) concurrentHashMap.get(str)).f82754b, z17);
            } else {
                pVar.b(str, i18, z17);
            }
        }
    }

    @Override // kq.o
    public int a(java.lang.String str, java.lang.String str2, int i17, kq.p pVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagCdnDownloader", "addDownloadTask: %s filepath:%s", str, str2);
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17821x8c50294f = 60;
        c2CDownloadRequest.f17841x86986d5f = 60;
        c2CDownloadRequest.f17840xf3a4da4a = currentTimeMillis;
        c2CDownloadRequest.f17792xcd096f43 = b17;
        c2CDownloadRequest.url = str;
        c2CDownloadRequest.m37861xfb0731c4(str2);
        a43.j jVar = new a43.j(null);
        jVar.f82753a = pVar;
        jVar.f82754b = str2;
        ((java.util.concurrent.ConcurrentHashMap) this.f82756a).put(b17, jVar);
        int m37788x8bc93551 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37788x8bc93551(c2CDownloadRequest, this.f82757b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PagCdnDownloader", "addDownloadTask: " + m37788x8bc93551);
        return m37788x8bc93551;
    }
}
