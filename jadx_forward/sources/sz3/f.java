package sz3;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f495549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f495550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495551i;

    public f(sz3.m mVar, sz3.x0 x0Var, int i17, long j17, int i18, java.lang.String str) {
        this.f495546d = mVar;
        this.f495547e = x0Var;
        this.f495548f = i17;
        this.f495549g = j17;
        this.f495550h = i18;
        this.f495551i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495546d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalFailed isCancelled and ignore");
        } else {
            mVar.f495598a.a(this.f495547e, this.f495548f, this.f495549g, this.f495550h, this.f495551i);
        }
    }
}
