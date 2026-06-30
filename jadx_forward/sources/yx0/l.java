package yx0;

/* loaded from: classes5.dex */
public final class l implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f548957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548958b;

    public l(boolean z17, yx0.b8 b8Var) {
        this.f548957a = z17;
        this.f548958b = b8Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0
    /* renamed from: onComplete */
    public final void mo9325x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginAITemplate: updateAIGCResult: err: ");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", sb6.toString());
        yx0.b8 b8Var = this.f548958b;
        if (c4093x6b88526b != null && this.f548957a) {
            p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.k(b8Var, c4093x6b88526b, null), 3, null);
            return;
        }
        mx0.z zVar = b8Var.f548710d;
        b8Var.Z();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar;
        c10977x8e40eced.getClass();
        ym5.a1.f(new mx0.a7(c10977x8e40eced));
    }
}
