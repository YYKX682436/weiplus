package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f226756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 f226759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 y1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f226757e = str;
        this.f226758f = str2;
        this.f226759g = y1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d3(this.f226757e, this.f226758f, this.f226759g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f226756d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
            this.f226756d = 1;
            obj = z1Var.c(this.f226757e, this.f226758f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1 s1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s1) obj;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y1 y1Var = this.f226759g;
        if (y1Var != null) {
            y1Var.a(s1Var);
        }
        return jz5.f0.f384359a;
    }
}
