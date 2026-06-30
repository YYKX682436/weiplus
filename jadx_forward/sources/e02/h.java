package e02;

/* loaded from: classes5.dex */
public class h implements kq.o {

    /* renamed from: c, reason: collision with root package name */
    public static e02.h f327386c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f327387a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback f327388b = new e02.f(this);

    public static void b(e02.h hVar, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) hVar.f327387a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChannelPatchDownloader", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s, containCallback = %b", str, valueOf, valueOf2, str2, java.lang.Boolean.valueOf(concurrentHashMap.containsKey(str)));
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((e02.g) concurrentHashMap.get(str)).f327384a;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChannelPatchDownloader", "error proxy_callback null");
            } else if (i17 == 3) {
                pVar.a(str, ((e02.g) concurrentHashMap.get(str)).f327385b, z17);
            } else {
                pVar.b(str, i18, z17);
            }
        }
    }

    @Override // kq.o
    public int a(java.lang.String str, java.lang.String str2, int i17, kq.p pVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChannelPatchDownloader", "addDownloadTask: %s filepath:%s", str, str2);
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
        e02.g gVar = new e02.g(null);
        gVar.f327384a = pVar;
        gVar.f327385b = str2;
        ((java.util.concurrent.ConcurrentHashMap) this.f327387a).put(b17, gVar);
        int m37788x8bc93551 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37788x8bc93551(c2CDownloadRequest, this.f327388b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChannelPatchDownloader", "addDownloadTask: " + m37788x8bc93551);
        return m37788x8bc93551;
    }
}
