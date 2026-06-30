package a02;

@j95.b
/* loaded from: classes8.dex */
public class g extends i95.w implements com.tencent.mm.plugin.downloader.api.g {

    /* renamed from: d, reason: collision with root package name */
    public h02.b f380d;

    /* renamed from: e, reason: collision with root package name */
    public long f381e = 0;

    public void Ai(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderService", "active: " + z17);
        if (z17 || (java.lang.System.currentTimeMillis() - this.f381e) / 1000 <= 1800) {
            return;
        }
        s75.d.b(new a02.f(this), "checkDownloadFile");
        this.f381e = java.lang.System.currentTimeMillis();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        this.f380d = new h02.b(gm0.j1.u().f273153f);
    }

    public vz.r1 wi() {
        requireAccountInitialized();
        return this.f380d;
    }
}
