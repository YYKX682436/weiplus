package vn2;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f519900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f519901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.p pVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519900e = hVar;
        this.f519901f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.r0(this.f519900e, interfaceC29045xdcb5ca57, this.f519901f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519899d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f519900e).f535914b;
            yz5.p pVar = this.f519901f;
            if (pVar != null) {
                this.f519899d = 1;
                if (pVar.mo149xb9724478(aVar2, this) == aVar) {
                    return aVar;
                }
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
