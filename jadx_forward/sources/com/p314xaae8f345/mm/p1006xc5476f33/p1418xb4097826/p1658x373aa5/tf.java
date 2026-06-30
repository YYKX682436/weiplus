package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class tf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f214659d;

    /* renamed from: e, reason: collision with root package name */
    public int f214660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c f214661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f214662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c, r45.zk2 zk2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214661f = c15329xd3ad392c;
        this.f214662g = zk2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tf(this.f214661f, this.f214662g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f214660e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c2 = this.f214661f;
            if (c15329xd3ad392c2.f212866f != null) {
                this.f214659d = c15329xd3ad392c2;
                this.f214660e = 1;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c.a(c15329xd3ad392c2, this.f214662g, true, this) == aVar) {
                    return aVar;
                }
                c15329xd3ad392c = c15329xd3ad392c2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c15329xd3ad392c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c) this.f214659d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        c15329xd3ad392c.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qq.f217262d);
        return jz5.f0.f384359a;
    }
}
