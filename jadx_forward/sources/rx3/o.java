package rx3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f482578d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.g f482580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ox3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482580f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rx3.o oVar = new rx3.o(this.f482580f, interfaceC29045xdcb5ca57);
        oVar.f482579e = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f482578d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f482579e;
            rx3.n nVar = new rx3.n(this.f482580f, null);
            this.f482579e = kVar;
            this.f482578d = 1;
            obj = p3325xe03a0797.p3326xc267989b.a4.c(5000L, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f482579e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f482579e = null;
        this.f482578d = 2;
        if (kVar.mo771x2f8fd3(obj, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
