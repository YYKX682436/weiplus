package i02;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f368042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f368043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i02.h f368044f;

    public f(i02.h hVar, h02.a aVar, long j17) {
        this.f368044f = hVar;
        this.f368042d = aVar;
        this.f368043e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        h02.a aVar = this.f368042d;
        i02.h hVar = this.f368044f;
        try {
            int i17 = hVar.j().m104830xc45041ae(aVar.f68411x238eb002).f56062xbec81024;
            if (i17 == 1 || i17 == 2) {
                hVar.j().m104831xb0172743(aVar.f68411x238eb002);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d ", java.lang.Long.valueOf(this.f368043e));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %s", e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloaderImplTMAssistant", e17, "", new java.lang.Object[0]);
        }
    }
}
