package sz3;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495554e;

    public g(sz3.m mVar, sz3.x0 x0Var) {
        this.f495553d = mVar;
        this.f495554e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495553d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalSuccess isCancelled and ignore");
        } else {
            mVar.f495598a.h(this.f495554e);
        }
    }
}
