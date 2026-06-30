package yu0;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.d f547323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yu0.m f547324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yu0.d dVar, yu0.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547323e = dVar;
        this.f547324f = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yu0.g(this.f547323e, this.f547324f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547322d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yu0.d dVar = this.f547323e;
            if (!dVar.f547318b.isEmpty()) {
                yu0.m mVar = this.f547324f;
                mVar.f547346d.put(dVar.f547317a, new java.util.concurrent.atomic.AtomicInteger(0));
                mVar.f547347e.put(dVar.f547317a, new java.lang.Integer(dVar.f547318b.size()));
                mVar.f547348f.put(dVar.f547317a, dVar);
                this.f547322d = 1;
                if (yu0.m.a(mVar, "start submit", this) == aVar) {
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
