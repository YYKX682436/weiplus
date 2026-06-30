package sz3;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495571e;

    public k(sz3.m mVar, sz3.x0 x0Var) {
        this.f495570d = mVar;
        this.f495571e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495570d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadSuccess isCancelled and ignore");
        } else {
            mVar.f495598a.c(this.f495571e);
        }
    }
}
