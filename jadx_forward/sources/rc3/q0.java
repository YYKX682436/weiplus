package rc3;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f475587e;

    public q0(rc3.w0 w0Var, yz5.a aVar) {
        this.f475586d = w0Var;
        this.f475587e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc3.w0 w0Var = this.f475586d;
        w0Var.f475634v = false;
        this.f475587e.mo152xb9724478();
        while (!w0Var.f475634v) {
            kz5.q qVar = w0Var.f475633u;
            if (!(!qVar.isEmpty())) {
                return;
            } else {
                ((yz5.a) qVar.m144679xed1b9c8c()).mo152xb9724478();
            }
        }
    }
}
