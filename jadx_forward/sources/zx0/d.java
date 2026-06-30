package zx0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 f558529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f558530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx0.f f558531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 c3997xc4921114, yx0.b8 b8Var, zx0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558529e = c3997xc4921114;
        this.f558530f = b8Var;
        this.f558531g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx0.d(this.f558529e, this.f558530f, this.f558531g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f558528d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 c3997xc4921114 = this.f558529e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mx0.s sVar = mx0.s.f413830a;
            this.f558528d = 1;
            obj = sVar.f(c3997xc4921114, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        rx0.c cVar = (rx0.c) obj;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = cVar.f482442a;
        yx0.b8 b8Var = this.f558530f;
        if (c4093x6b88526b == null) {
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b H = b8Var.H();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3990xb891c88 c3990xb891c88 = cVar.f482443b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c3990xb891c88);
            H.d(c3990xb891c88);
            zx0.f fVar = this.f558531g;
            rx0.a aVar2 = (rx0.a) fVar.f558537b.mo3195x754a37bb();
            fVar.f558537b.mo7808x76db6cb1(new rx0.a(rx0.b.f482440e, aVar2 != null ? aVar2.f482437b : null, cVar));
        } else {
            b8Var.H().c(c3997xc4921114.f129393a, cVar.f482442a);
        }
        return jz5.f0.f384359a;
    }
}
