package ix0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f376813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix0.g f376814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f376815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f376816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f376817h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ix0.g gVar, dw0.c cVar, java.util.List list, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376814e = gVar;
        this.f376815f = cVar;
        this.f376816g = list;
        this.f376817h = c4190xd8dd3713;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix0.b(this.f376814e, this.f376815f, this.f376816g, this.f376817h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f376813d;
        ix0.g gVar = this.f376814e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f376813d = 1;
            obj = ix0.g.i(gVar, this.f376815f, this.f376816g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = (java.util.List) obj;
        ug.m C = this.f376817h.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        gVar.getClass();
        if (!list.isEmpty()) {
            gVar.f376839b.p7(C, list);
        }
        return jz5.f0.f384359a;
    }
}
