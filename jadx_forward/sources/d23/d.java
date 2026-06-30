package d23;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f307420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f307421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f307423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d23.g f307424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p944x882e457a.o oVar, java.lang.String str, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, d23.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f307421e = oVar;
        this.f307422f = str;
        this.f307423g = c20976x6ba6452a;
        this.f307424h = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new d23.d(this.f307421e, this.f307422f, this.f307423g, this.f307424h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((d23.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f307420d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            o01.c cVar = o01.d.f423424a;
            com.p314xaae8f345.mm.p944x882e457a.o commReqResp = this.f307421e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commReqResp, "$commReqResp");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = cVar.a(commReqResp);
            d23.c cVar2 = new d23.c(this.f307422f, this.f307423g, this.f307424h);
            this.f307420d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.r) a17).a(cVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
