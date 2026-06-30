package l0;

/* loaded from: classes14.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f396065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.v f396066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f396067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.m f396068h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z.e eVar, l0.v vVar, float f17, c0.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f396065e = eVar;
        this.f396066f = vVar;
        this.f396067g = f17;
        this.f396068h = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l0.u(this.f396065e, this.f396066f, this.f396067g, this.f396068h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f396064d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z.e eVar = this.f396065e;
            float f17 = ((p2.h) ((n0.q4) eVar.f550167e).mo128745x754a37bb()).f432913d;
            l0.v vVar = this.f396066f;
            c0.m mVar = null;
            if (p2.h.a(f17, vVar.f396083b)) {
                mVar = new c0.r(d1.e.f307156b, null);
            } else if (p2.h.a(f17, vVar.f396085d)) {
                mVar = new c0.i();
            } else if (p2.h.a(f17, vVar.f396086e)) {
                mVar = new c0.d();
            }
            this.f396064d = 1;
            if (l0.b0.a(eVar, this.f396067g, mVar, this.f396068h, this) == aVar) {
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
