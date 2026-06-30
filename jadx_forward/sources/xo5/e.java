package xo5;

/* loaded from: classes7.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537312d;

    /* renamed from: e, reason: collision with root package name */
    public int f537313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xo5.n f537314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xo5.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537314f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xo5.e(this.f537314f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xo5.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 d17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f537313e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xo5.n nVar = this.f537314f;
            p3325xe03a0797.p3326xc267989b.r2 d18 = p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) nVar.f537330h.mo141623x754a37bb(), null, null, new xo5.c(nVar, null), 3, null);
            d17 = p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) nVar.f537332m.mo141623x754a37bb(), null, null, new xo5.d(nVar, null), 3, null);
            this.f537312d = d17;
            this.f537313e = 1;
            if (((p3325xe03a0797.p3326xc267989b.c3) d18).C(this) == aVar) {
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
            d17 = (p3325xe03a0797.p3326xc267989b.r2) this.f537312d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f537312d = null;
        this.f537313e = 2;
        if (d17.C(this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
