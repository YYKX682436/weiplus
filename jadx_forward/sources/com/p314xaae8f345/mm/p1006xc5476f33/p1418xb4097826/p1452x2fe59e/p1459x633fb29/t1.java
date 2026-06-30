package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.x1 f189884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f189885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f189886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f189888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 f189889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.x1 x1Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f189884d = x1Var;
        this.f189885e = fVar;
        this.f189886f = obj;
        this.f189887g = n0Var;
        this.f189888h = j17;
        this.f189889i = c13861xc72e20d8;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t1(this.f189884d, this.f189885e, this.f189886f, this.f189887g, this.f189888h, this.f189889i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.x1 x1Var = this.f189884d;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f189885e;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        java.lang.Object obj2 = this.f189886f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a = x1Var.mo983xfcd2013a(i17, i18, str, (com.p314xaae8f345.mm.p944x882e457a.i) obj2, fVar.f152151d);
        if (mo983xfcd2013a != null) {
            this.f189887g.mo55587xb461ee3d(mo983xfcd2013a);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f189888h;
        boolean z17 = fVar.f152148a == 0 && fVar.f152149b == 0;
        yz5.q qVar = this.f189889i.H;
        if (qVar == null) {
            return null;
        }
        qVar.mo147xb9724478(new java.lang.Integer(((db2.t0) obj2).f309695z), new java.lang.Integer((int) currentTimeMillis), java.lang.Boolean.valueOf(z17));
        return jz5.f0.f384359a;
    }
}
