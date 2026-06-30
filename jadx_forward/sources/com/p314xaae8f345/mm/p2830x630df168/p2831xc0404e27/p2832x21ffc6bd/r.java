package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 f296606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f296606e = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.r(this.f296606e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f296605d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = this.f296606e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = m0Var.f296535k;
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q qVar = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.q(m0Var);
            this.f296605d = 1;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var;
            q2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(q2Var, qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
