package ho1;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f364354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364355h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364356i;

    public u(java.lang.String str, ho1.v vVar, long j17, long j18, java.lang.String str2, long j19) {
        this.f364351d = str;
        this.f364352e = vVar;
        this.f364353f = j17;
        this.f364354g = j18;
        this.f364355h = str2;
        this.f364356i = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("UploadFileAsync", new ho1.t(this.f364351d, this.f364352e, this.f364353f, this.f364354g, this.f364355h, this.f364356i));
    }
}
