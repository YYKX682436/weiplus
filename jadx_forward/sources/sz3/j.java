package sz3;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.m f495562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f495563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f495565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f495566h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f495567i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495568m;

    public j(sz3.m mVar, sz3.x0 x0Var, int i17, long j17, int i18, int i19, java.lang.String str) {
        this.f495562d = mVar;
        this.f495563e = x0Var;
        this.f495564f = i17;
        this.f495565g = j17;
        this.f495566h = i18;
        this.f495567i = i19;
        this.f495568m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sz3.m mVar = this.f495562d;
        if (mVar.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadFailed isCancelled and ignore");
        } else {
            mVar.f495598a.d(this.f495563e, this.f495564f, this.f495565g, this.f495566h, this.f495567i, this.f495568m);
        }
    }
}
