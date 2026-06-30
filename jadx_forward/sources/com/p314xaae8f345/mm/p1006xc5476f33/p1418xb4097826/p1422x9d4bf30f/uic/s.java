package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f183478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 f183479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f183479e = c13667xc5da9466;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.s(this.f183479e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f183478d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g92.b bVar = g92.b.f351302e;
            this.f183478d = 1;
            x17 = bVar.x1(13, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(x17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = this.f183479e;
        if (m143903xa8fbbff4) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            c13667xc5da9466.getClass();
            sr2.l5 l5Var = c13667xc5da9466.f183355s;
            if (l5Var != null) {
                l5Var.O6(0, 0, null, lk2Var);
            }
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(x17);
        if (m143898xd4a2fc34 != null) {
            rm0.j jVar = m143898xd4a2fc34 instanceof rm0.j ? (rm0.j) m143898xd4a2fc34 : null;
            if (jVar != null) {
                c13667xc5da9466.getClass();
                sr2.l5 l5Var2 = c13667xc5da9466.f183355s;
                if (l5Var2 != null) {
                    l5Var2.mo815x76e0bfae(jVar.f478957e, jVar.f478958f, null, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
