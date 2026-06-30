package yx0;

/* loaded from: classes5.dex */
public final class b0 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548677a;

    public b0(yx0.b8 b8Var) {
        this.f548677a = b8Var;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.d0
    /* renamed from: onComplete */
    public final void mo9325x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.util.Objects.toString(c4093x6b88526b);
        yx0.b8 b8Var = this.f548677a;
        b8Var.Z();
        mx0.z zVar = b8Var.f548710d;
        if (c4093x6b88526b == null) {
            b8Var.Z();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar;
            c10977x8e40eced.getClass();
            ym5.a1.f(new mx0.a7(c10977x8e40eced));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "aigcFinishCallback: aigc request failed, error code = " + c4093x6b88526b.m33746x130a215f() + ", message = " + c4093x6b88526b.f16057x38eb0007);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced2 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar;
        c10977x8e40eced2.getClass();
        ym5.a1.f(new mx0.z6(c4093x6b88526b, c10977x8e40eced2));
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.a0(b8Var, c4093x6b88526b, null), 3, null);
    }
}
