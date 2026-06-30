package zx0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 f558525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f f558526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f558527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 c3997xc4921114, com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f enumC3989x2312e1f, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558525e = c3997xc4921114;
        this.f558526f = enumC3989x2312e1f;
        this.f558527g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx0.c(this.f558525e, this.f558526f, this.f558527g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f558524d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 c3997xc4921114 = this.f558525e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mx0.s sVar = mx0.s.f413830a;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f cancelReason = this.f558526f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cancelReason, "$cancelReason");
            this.f558524d = 1;
            obj = sVar.a(c3997xc4921114, cancelReason, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) obj;
        yx0.b8 b8Var = this.f558527g;
        if (c4093x6b88526b == null) {
            b8Var.H().b(c3997xc4921114.f129393a);
        } else {
            b8Var.H().a(c3997xc4921114.f129393a, c4093x6b88526b);
        }
        return jz5.f0.f384359a;
    }
}
