package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class vb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f217770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f217771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217771e = nc0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vb0(this.f217771e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vb0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f217770d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f217771e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = nc0Var.m158354x19263085();
            ((dd0.m0) a1Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ox3.l lVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) ((ed0.q0) a17)).f239940d;
            if (lVar != null && (jVar = lVar.f431298e) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ub0 ub0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ub0(nc0Var);
                this.f217770d = 1;
                if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) jVar, ub0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
