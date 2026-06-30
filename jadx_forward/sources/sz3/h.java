package sz3;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.l f495557e;

    public h(sz3.m mVar, xz3.l lVar) {
        this.f495556d = mVar;
        this.f495557e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495556d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskFinish isCancelled and ignore");
        } else {
            mVar.f495598a.j(this.f495557e);
        }
    }
}
