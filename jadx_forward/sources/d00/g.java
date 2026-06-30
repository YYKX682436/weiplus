package d00;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d00.d f306791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d00.d f306792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d00.d f306793f;

    public g(d00.d dVar, d00.d dVar2, d00.d dVar3) {
        this.f306791d = dVar;
        this.f306792e = dVar2;
        this.f306793f = dVar3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object a17 = this.f306792e.a(this.f306791d.a(jz5.f0.f384359a));
        ((ku5.t0) ku5.t0.f394148d).B(new d00.f(this.f306793f, a17));
    }
}
