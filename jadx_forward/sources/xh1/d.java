package xh1;

/* loaded from: classes7.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f536025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh1.g f536026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f536028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f536029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ km5.b f536030i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xh1.g gVar, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, java.lang.Class cls, km5.b bVar, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536026e = gVar;
        this.f536027f = str;
        this.f536028g = fVar;
        this.f536029h = cls;
        this.f536030i = bVar;
        this.f536031m = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xh1.d(this.f536026e, this.f536027f, this.f536028g, this.f536029h, this.f536030i, this.f536031m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xh1.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f536025d;
        km5.b bVar = this.f536030i;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                xh1.g gVar = this.f536026e;
                java.lang.String str = this.f536027f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f536028g;
                java.lang.Class cls = this.f536029h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cls, "null cannot be cast to non-null type java.lang.Class<in com.tencent.mm.protocal.protobuf.ResponseProtoBuf>");
                this.f536025d = 1;
                obj = xh1.g.a(gVar, str, fVar, cls, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            bVar.c((r45.js5) obj);
        } catch (java.lang.Exception e17) {
            bVar.a(e17);
        }
        return jz5.f0.f384359a;
    }
}
