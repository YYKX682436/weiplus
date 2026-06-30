package sz3;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f495545g;

    public e(sz3.m mVar, sz3.c1 c1Var, sz3.x0 x0Var, yz5.l lVar) {
        this.f495542d = mVar;
        this.f495543e = c1Var;
        this.f495544f = x0Var;
        this.f495545g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495542d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onAddScanProductResultForFullImage isCancelled and ignore");
            return;
        }
        mVar.f495598a.f(this.f495543e, this.f495544f, this.f495545g);
    }
}
