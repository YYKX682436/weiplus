package mh2;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f407978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407978e = c14229xb3dcfb39;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mh2.r(this.f407978e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407977d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            throw new jz5.d();
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39 = this.f407978e;
        lj2.v0 v0Var = c14229xb3dcfb39.f193202m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar != null && (j2Var = ((om2.e) wVar.P0(om2.e.class)).f427823f) != null) {
            mh2.p pVar = new mh2.p(c14229xb3dcfb39);
            this.f407977d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(pVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        if (wVar == null || (f3Var = ((om2.g) wVar.P0(om2.g.class)).A) == null) {
            return jz5.f0.f384359a;
        }
        mh2.q qVar = new mh2.q(c14229xb3dcfb39);
        this.f407977d = 2;
        if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) f3Var).a(qVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
