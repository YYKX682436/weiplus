package s56;

/* loaded from: classes16.dex */
public final class m implements p56.i {

    /* renamed from: d, reason: collision with root package name */
    public final p56.l f484756d;

    /* renamed from: e, reason: collision with root package name */
    public final r56.e f484757e;

    public m(p56.l lVar, r56.e eVar) {
        this.f484756d = lVar;
        this.f484757e = eVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        p56.r rVar = (p56.r) obj;
        s56.l lVar = new s56.l(rVar, this.f484757e);
        rVar.d(lVar);
        this.f484756d.h(lVar);
    }
}
