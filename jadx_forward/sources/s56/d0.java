package s56;

/* loaded from: classes16.dex */
public final class d0 implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.q f484732d;

    /* renamed from: e, reason: collision with root package name */
    public final p56.l f484733e;

    public d0(p56.l lVar, p56.q qVar) {
        this.f484732d = qVar;
        this.f484733e = lVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        p56.p mo157871x6217339a = this.f484732d.mo157871x6217339a();
        rVar.d(mo157871x6217339a);
        mo157871x6217339a.d(new s56.c0(this, rVar, mo157871x6217339a));
    }
}
