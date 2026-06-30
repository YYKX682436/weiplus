package gx0;

/* loaded from: classes5.dex */
public final class gb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f357994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f357995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f357996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(gx0.ac acVar, boolean z17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357994e = acVar;
        this.f357995f = z17;
        this.f357996g = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.gb(this.f357994e, this.f357995f, this.f357996g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.gb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ex0.e eVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357993d;
        gx0.ac acVar = this.f357994e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf c86 = acVar.c8();
            this.f357993d = 1;
            if (gx0.bf.t7(c86, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (this.f357995f) {
            ex0.a0 e86 = acVar.e8();
            if (e86 != null && (eVar = e86.I) != null) {
                eVar.f338659d = false;
            }
            gx0.bf.q7(acVar.c8(), this.f357996g, false, 0L, 4, null);
            acVar.g8(this.f357996g);
        }
        return jz5.f0.f384359a;
    }
}
