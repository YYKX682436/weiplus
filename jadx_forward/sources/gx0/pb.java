package gx0;

/* loaded from: classes5.dex */
public final class pb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358372d;

    /* renamed from: e, reason: collision with root package name */
    public int f358373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.q f358374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(ex0.q qVar, gx0.ac acVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358374f = qVar;
        this.f358375g = acVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.pb(this.f358374f, this.f358375g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358373e;
        gx0.ac acVar = this.f358375g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ex0.q qVar = this.f358374f;
            k17 = qVar.k();
            acVar.c8().o7(qVar.l(), true);
            gx0.bf c86 = acVar.c8();
            this.f358372d = k17;
            this.f358373e = 1;
            if (gx0.bf.d7(c86, null, k17, false, this, 5, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            k17 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) this.f358372d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = k17;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(acVar.A7(), c4128x879fba0a, false, 2, null);
        gx0.bf c87 = acVar.c8();
        this.f358372d = null;
        this.f358373e = 2;
        if (gx0.bf.r7(c87, false, c4128x879fba0a, 1, false, null, this, 25, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
