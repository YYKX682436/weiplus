package s56;

/* loaded from: classes16.dex */
public class a0 implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p56.n f484719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s56.b0 f484720e;

    public a0(s56.b0 b0Var, p56.n nVar) {
        this.f484720e = b0Var;
        this.f484719d = nVar;
    }

    @Override // p56.n
    public void d(long j17) {
        s56.b0 b0Var = this.f484720e;
        if (b0Var.f484722h == java.lang.Thread.currentThread()) {
            this.f484719d.d(j17);
        } else {
            b0Var.f484723i.f484726e.d(new s56.z(this, j17));
        }
    }
}
