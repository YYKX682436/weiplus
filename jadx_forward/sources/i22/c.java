package i22;

/* loaded from: classes15.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f369481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13371xf8f2bef f369482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13371xf8f2bef c13371xf8f2bef, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369482e = c13371xf8f2bef;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i22.c(this.f369482e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i22.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f369481d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13371xf8f2bef c13371xf8f2bef = this.f369482e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i iVar = c13371xf8f2bef.f180031d;
            this.f369481d = 1;
            obj = iVar.a(false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g) obj) == com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.g.f298173d) {
            c13371xf8f2bef.f180035h = !c13371xf8f2bef.f180031d.b();
            c13371xf8f2bef.f180032e.mo149xb9724478(c13371xf8f2bef.f180031d.f298180d, java.lang.Boolean.FALSE);
        }
        if (c13371xf8f2bef.f180036i) {
            c13371xf8f2bef.f180036i = false;
            c13371xf8f2bef.a();
        }
        c13371xf8f2bef.f180034g = false;
        return jz5.f0.f384359a;
    }
}
