package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kd0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f194754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f194755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f194756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fy2.d f194757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(r45.g84 g84Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, fy2.d dVar) {
        super(0);
        this.f194754d = g84Var;
        this.f194755e = z17;
        this.f194756f = nd0Var;
        this.f194757g = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAvatarDecoration loadDecorationRes:");
        r45.g84 g84Var = this.f194754d;
        sb6.append(g84Var != null ? g84Var.m75945x2fec8307(1) : null);
        sb6.append(" result:");
        boolean z17 = this.f194755e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", sb6.toString());
        if (z17) {
            ym5.l2 l2Var = ym5.l2.f544957a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f194756f;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = nd0Var.f195152t;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.E));
            fy2.d dVar = this.f194757g;
            java.lang.String N6 = dVar.N6(g84Var);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = nd0Var.f195152t;
            c22789xd23e9a9b2.mo82567x3e3ac3e8(N6);
            c22789xd23e9a9b2.m82583xcde73672(-1);
            c22789xd23e9a9b2.g();
            dVar.f348772f = g84Var;
        }
        return jz5.f0.f384359a;
    }
}
