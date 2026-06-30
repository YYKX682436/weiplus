package v26;

/* loaded from: classes14.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f514608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j[] f514609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f514610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f514611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u26.w f514612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p3325xe03a0797.p3326xc267989b.p3328x30012e.j[] jVarArr, int i17, java.util.concurrent.atomic.AtomicInteger atomicInteger, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514609e = jVarArr;
        this.f514610f = i17;
        this.f514611g = atomicInteger;
        this.f514612h = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v26.z(this.f514609e, this.f514610f, this.f514611g, this.f514612h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f514608d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f514611g;
        u26.w wVar = this.f514612h;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j[] jVarArr = this.f514609e;
                int i18 = this.f514610f;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = jVarArr[i18];
                v26.y yVar = new v26.y(wVar, i18);
                this.f514608d = 1;
                if (jVar.a(yVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                u26.x0.a(wVar, null, 1, null);
            }
            return jz5.f0.f384359a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                u26.x0.a(wVar, null, 1, null);
            }
        }
    }
}
