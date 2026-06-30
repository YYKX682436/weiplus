package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f170782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f170783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f170784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f170782e = j17;
        this.f170783f = o6Var;
        this.f170784g = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.k(this.f170782e, this.f170783f, this.f170784g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f170781d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f170781d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f170782e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        mi1.f a17 = mi1.c.a(this.f170783f);
        if (a17 != null) {
            a17.k(this.f170784g, mi1.e.TAIL, "trade_custom_blink_handler");
        }
        return jz5.f0.f384359a;
    }
}
