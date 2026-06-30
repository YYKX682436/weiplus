package cx4;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306123i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f306124m;

    public e(cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, int i19) {
        this.f306118d = mVar;
        this.f306119e = str;
        this.f306120f = i17;
        this.f306121g = i18;
        this.f306122h = str2;
        this.f306123i = str3;
        this.f306124m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306118d.f306167a, "doReport url=" + this.f306119e + ", scene=" + this.f306120f + ", keyWordScanTime=" + this.f306121g);
        fo3.s.INSTANCE.Tb(this.f306119e, this.f306122h, this.f306123i, this.f306124m, this.f306120f);
    }
}
