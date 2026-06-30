package a02;

@j95.b
/* loaded from: classes8.dex */
public class g extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g {

    /* renamed from: d, reason: collision with root package name */
    public h02.b f81913d;

    /* renamed from: e, reason: collision with root package name */
    public long f81914e = 0;

    public void Ai(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderService", "active: " + z17);
        if (z17 || (java.lang.System.currentTimeMillis() - this.f81914e) / 1000 <= 1800) {
            return;
        }
        s75.d.b(new a02.f(this), "checkDownloadFile");
        this.f81914e = java.lang.System.currentTimeMillis();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        this.f81913d = new h02.b(gm0.j1.u().f354686f);
    }

    public vz.r1 wi() {
        m134976x2690a4ac();
        return this.f81913d;
    }
}
