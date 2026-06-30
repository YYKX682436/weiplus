package h34;

/* renamed from: h34.a$$a */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC28436x2ca3e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.a f360004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f360005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f360006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360007g;

    public /* synthetic */ RunnableC28436x2ca3e0(h34.a aVar, byte[] bArr, long j17, int i17) {
        this.f360004d = aVar;
        this.f360005e = bArr;
        this.f360006f = j17;
        this.f360007g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h34.a aVar = this.f360004d;
        c01.d9.e().g(new h34.l(this.f360005e, (int) this.f360006f, this.f360007g, 0, 0L, aVar.f359992f, aVar.f359995i, 0));
    }
}
