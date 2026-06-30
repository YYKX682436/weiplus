package dk2;

/* loaded from: classes3.dex */
public final class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f315900a;

    public y3(cm2.f0 f0Var) {
        this.f315900a = f0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (k0Var = dk2.ef.f314913e) != null) {
            qo0.b bVar = qo0.b.N2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 J2 = zl2.r4.f555483a.J2(this.f315900a);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.mo14344x5f01b1f6() : null);
            k0Var.mo46557x60d69242(bVar, bundle);
        }
        return jz5.f0.f384359a;
    }
}
