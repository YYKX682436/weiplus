package xw0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539164d;

    /* renamed from: e, reason: collision with root package name */
    public int f539165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sw0.d f539166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xw0.r f539167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sw0.d dVar, xw0.r rVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539166f = dVar;
        this.f539167g = rVar;
        this.f539168h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xw0.k(this.f539166f, this.f539167g, this.f539168h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fv0.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539165e;
        xw0.r rVar = this.f539167g;
        sw0.d dVar2 = this.f539166f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar = dVar2.f494955a.f129756a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getMaterialScene(...)");
            fv0.d c17 = fv0.e.c(gVar);
            rVar.r(xw0.r.c(rVar, c17, dVar2));
            sw0.d dVar3 = this.f539166f;
            zu0.i iVar = dVar3.f494956b;
            if (iVar != zu0.i.f557207d) {
                if (iVar == zu0.i.f557209f) {
                    xw0.r.m(this.f539167g, dVar3, this.f539168h, false, 4, null);
                }
                return jz5.f0.f384359a;
            }
            rVar.r(xw0.r.b(rVar, c17, dVar3));
            java.lang.String str = dVar2.f494955a.f129757b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
            this.f539164d = c17;
            this.f539165e = 1;
            java.lang.Object h17 = rVar.h(str, this);
            if (h17 == aVar) {
                return aVar;
            }
            dVar = c17;
            obj = h17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (fv0.d) this.f539164d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            rVar.r(xw0.r.a(rVar, dVar, dVar2));
            xw0.r.m(this.f539167g, this.f539166f, this.f539168h, false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
