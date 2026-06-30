package oh4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh4.n f427012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph4.b f427013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rs4 f427014f;

    public l(oh4.n nVar, ph4.b bVar, r45.rs4 rs4Var) {
        this.f427012d = nVar;
        this.f427013e = bVar;
        this.f427014f = rs4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f427012d.e(this.f427013e, this.f427014f);
    }
}
