package fi5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f344604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi5.f f344605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f344606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f344608h;

    public c(java.lang.String[] strArr, fi5.f fVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f344604d = strArr;
        this.f344605e = fVar;
        this.f344606f = kVar;
        this.f344607g = str;
        this.f344608h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f344604d) {
            ((dk5.s5) tg3.t1.a()).Vi(this.f344605e.m158354x19263085(), str, this.f344606f.g(), 0, "", "", new c01.h7());
            ((dk5.s5) tg3.t1.a()).Ui(this.f344607g, str);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new fi5.b(this.f344608h, this.f344605e));
    }
}
