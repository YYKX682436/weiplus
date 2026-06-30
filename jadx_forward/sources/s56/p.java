package s56;

/* loaded from: classes16.dex */
public class p implements r56.a {

    /* renamed from: d, reason: collision with root package name */
    public long f484762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p56.r f484763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p56.p f484764f;

    public p(s56.q qVar, p56.r rVar, p56.p pVar) {
        this.f484763e = rVar;
        this.f484764f = pVar;
    }

    @Override // r56.a
    /* renamed from: call */
    public void mo740x2e7a5e() {
        p56.r rVar = this.f484763e;
        try {
            long j17 = this.f484762d;
            this.f484762d = 1 + j17;
            rVar.a(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            try {
                this.f484764f.c();
            } finally {
                q56.f.c(th6, rVar);
            }
        }
    }
}
