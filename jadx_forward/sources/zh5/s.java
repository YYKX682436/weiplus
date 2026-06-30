package zh5;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f554598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.v f554599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f554600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554601g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f554602h;

    public s(java.lang.String[] strArr, zh5.v vVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f554598d = strArr;
        this.f554599e = vVar;
        this.f554600f = kVar;
        this.f554601g = str;
        this.f554602h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f554598d) {
            ((dk5.s5) tg3.t1.a()).Vi(this.f554599e.m158354x19263085(), str, this.f554600f.g(), 0, "", "", new c01.h7());
            ((dk5.s5) tg3.t1.a()).Ui(this.f554601g, str);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new zh5.r(this.f554602h, this.f554599e));
    }
}
