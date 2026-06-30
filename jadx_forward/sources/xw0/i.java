package xw0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539156d;

    /* renamed from: e, reason: collision with root package name */
    public int f539157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xw0.r f539158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sw0.d f539159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xw0.r rVar, sw0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539158f = rVar;
        this.f539159g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xw0.i(this.f539158f, this.f539159g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        fv0.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539157e;
        sw0.d dVar2 = this.f539159g;
        xw0.r rVar = this.f539158f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fv0.d dVar3 = fv0.d.f348494m;
            rVar.r(xw0.r.c(rVar, dVar3, dVar2));
            if (dVar2.f494956b == zu0.i.f557207d) {
                rVar.r(xw0.r.b(rVar, dVar3, dVar2));
                java.lang.String str = dVar2.f494955a.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                this.f539156d = dVar3;
                this.f539157e = 1;
                if (rVar.h(str, this) == aVar) {
                    return aVar;
                }
                dVar = dVar3;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (fv0.d) this.f539156d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rVar.r(xw0.r.a(rVar, dVar, dVar2));
        return jz5.f0.f384359a;
    }
}
