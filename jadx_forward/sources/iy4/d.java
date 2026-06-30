package iy4;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f377474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f377475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iy4.g f377476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f377477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f377478m;

    public d(java.lang.String str, long j17, long j18, long j19, iy4.g gVar, long j27, int i17) {
        this.f377472d = str;
        this.f377473e = j17;
        this.f377474f = j18;
        this.f377475g = j19;
        this.f377476h = gVar;
        this.f377477i = j27;
        this.f377478m = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("getChatPackageAsync " + this.f377472d, new iy4.e(this.f377473e, this.f377472d, this.f377474f, this.f377475g, this.f377476h, this.f377477i, this.f377478m));
    }
}
