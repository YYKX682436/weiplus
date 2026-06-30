package dl4;

/* loaded from: classes3.dex */
public final class y0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f317030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o11.g f317033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f317034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p11.k f317035f;

    public y0(long j17, java.lang.String str, java.lang.String str2, o11.g gVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, p11.k kVar) {
        this.f317030a = j17;
        this.f317031b = str;
        this.f317032c = str2;
        this.f317033d = gVar;
        this.f317034e = w1Var;
        this.f317035f = kVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        long j17 = this.f317030a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingImageLoader", "loadImage session: %s, download success and try decode", java.lang.Long.valueOf(j17));
            pm0.v.X(new dl4.w0(this.f317030a, this.f317031b, this.f317032c, this.f317033d, this.f317034e, this.f317035f));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingImageLoader", "loadImage session: %s, download failed", java.lang.Long.valueOf(j17));
            pm0.v.X(new dl4.x0(this.f317035f, this.f317031b, objArr));
        }
    }
}
