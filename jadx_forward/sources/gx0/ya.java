package gx0;

/* loaded from: classes5.dex */
public final class ya extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.za f358759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(gx0.ac acVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, gx0.za zaVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358757e = acVar;
        this.f358758f = c4128x879fba0a;
        this.f358759g = zaVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ya(this.f358757e, this.f358758f, this.f358759g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ya) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358756d;
        gx0.ac acVar = this.f358757e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf c86 = acVar.c8();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a seekTime = this.f358758f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(seekTime, "$seekTime");
            this.f358756d = 1;
            if (gx0.bf.d7(c86, null, seekTime, true, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.kh d86 = acVar.d8();
        java.lang.String string = acVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        d86.r7(string, this.f358759g.f358811b);
        return jz5.f0.f384359a;
    }
}
