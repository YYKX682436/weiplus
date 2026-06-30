package uv0;

/* loaded from: classes5.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.k f512881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f512882f;

    public s(uv0.u uVar, vv0.k kVar, int i17) {
        this.f512880d = uVar;
        this.f512881e = kVar;
        this.f512882f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f512881e.f521921d;
        uv0.u uVar = this.f512880d;
        uVar.P(i17);
        uv0.u.N(uVar, this.f512882f);
    }
}
