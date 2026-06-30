package yu0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.m f547335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yu0.c f547336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yu0.m mVar, yu0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547335e = mVar;
        this.f547336f = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yu0.k(this.f547335e, this.f547336f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547334d;
        yu0.c cVar = this.f547336f;
        yu0.m mVar = this.f547335e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yu0.f fVar = mVar.f547343a;
            this.f547334d = 1;
            obj = fVar.a(cVar, this);
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yu0.e eVar = (yu0.e) obj;
        if (eVar.f547321c) {
            throw new java.util.concurrent.CancellationException("submitTask false");
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) mVar.f547346d.get(cVar.f547314a);
        int incrementAndGet = atomicInteger != null ? atomicInteger.incrementAndGet() : 0;
        java.lang.Integer num = (java.lang.Integer) mVar.f547347e.get(cVar.f547314a);
        if (num != null && incrementAndGet == num.intValue()) {
            p3325xe03a0797.p3326xc267989b.l.d(mVar.f547351i, null, null, new yu0.h(mVar, cVar.f547314a, eVar, null), 3, null);
        }
        mVar.f547344b.decrementAndGet();
        this.f547334d = 2;
        if (yu0.m.a(mVar, "executor submit", this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
