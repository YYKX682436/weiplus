package gx0;

/* loaded from: classes5.dex */
public final class rd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f358461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358461e = c4167x88133861;
        this.f358462f = bfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.rd(this.f358461e, this.f358462f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.rd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358460d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4165x6f849f9c n17 = this.f358461e.n(false);
            if (n17 == null) {
                return java.lang.Boolean.FALSE;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            this.f358460d = 1;
            gx0.bf bfVar = this.f358462f;
            bfVar.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(bfVar.f357786t, new gx0.be(bfVar, false, n17, InvalidTime, true, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
