package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f183469d;

    /* renamed from: e, reason: collision with root package name */
    public int f183470e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f183471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f f183472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183472g = c13669xe2583a4f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.p1(this.f183472g, interfaceC29045xdcb5ca57);
        p1Var.f183471f = obj;
        return p1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f183470e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f183471f;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityTabUIC", "CgiFutureTask");
            long c17 = c01.id.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f = this.f183472g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o1(c13669xe2583a4f);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            u92.e eVar = new u92.e(o1Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), c13669xe2583a4f.m158354x19263085(), null, 8, null);
            this.f183471f = c0Var2;
            this.f183469d = c17;
            this.f183470e = 1;
            obj = ay1.l.k(eVar, true, this);
            if (obj == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            j17 = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f183469d;
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f183471f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityTabUIC", "CgiFutureTask:" + (c01.id.c() - j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f c13669xe2583a4f2 = this.f183472g;
        pf5.e.m158344xbe96bc24(c13669xe2583a4f2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.n1((com.p314xaae8f345.mm.p944x882e457a.f) obj, c13669xe2583a4f2, c0Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}
