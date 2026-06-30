package rc3;

/* loaded from: classes7.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f475582e;

    public p0(rc3.w0 w0Var, yz5.a aVar) {
        this.f475581d = w0Var;
        this.f475582e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc3.w0 w0Var = this.f475581d;
        boolean z17 = w0Var.f475634v;
        yz5.a aVar = this.f475582e;
        if (z17 || w0Var.A == null) {
            w0Var.f475633u.m144678xbb8646d7(aVar);
        } else {
            aVar.mo152xb9724478();
        }
    }
}
