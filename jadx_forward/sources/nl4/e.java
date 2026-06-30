package nl4;

/* loaded from: classes11.dex */
public final class e implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419738a;

    public e(nl4.r rVar) {
        this.f419738a = rVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        ll4.a aVar2;
        nl4.r rVar = this.f419738a;
        if (aVar != null) {
            rVar.f419765b = aVar.f316003g;
        }
        rVar.f419766c = j17;
        if (rVar.f419768e || (aVar2 = rVar.f419764a) == null) {
            return;
        }
        long j18 = rVar.f419765b;
        kl4.n nVar = (kl4.n) aVar2;
        ((ku5.t0) ku5.t0.f394148d).B(new kl4.m(nVar.f390489a.f390401e, nVar.f390489a, j17, j18));
    }
}
