package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class uh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f196096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f196097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fy2.d f196098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh f196099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(r45.g84 g84Var, boolean z17, fy2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar) {
        super(0);
        this.f196096d = g84Var;
        this.f196097e = z17;
        this.f196098f = dVar;
        this.f196099g = whVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBgDecoration loadDecorationRes:");
        r45.g84 g84Var = this.f196096d;
        sb6.append(g84Var != null ? g84Var.m75945x2fec8307(1) : null);
        sb6.append(" result:");
        boolean z17 = this.f196097e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDecorationPlugin", sb6.toString());
        if (z17) {
            this.f196098f.f348773g = g84Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh whVar = this.f196099g;
            whVar.u1();
            whVar.f446856d.postDelayed(whVar.f196470q, ((java.lang.Number) ae2.in.f85221a.z().r()).longValue() * 1000);
        }
        return jz5.f0.f384359a;
    }
}
