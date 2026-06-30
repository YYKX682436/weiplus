package h41;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f360405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f360406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f360407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h41.x xVar, byte[] bArr, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360405e = xVar;
        this.f360406f = bArr;
        this.f360407g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.v(this.f360405e, this.f360406f, this.f360407g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360404d;
        h41.x xVar = this.f360405e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h41.j jVar = xVar.f360418b;
            this.f360404d = 1;
            obj = jVar.c(this.f360406f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar2 = xVar.f360417a;
        if (aVar2 != null) {
            aVar2.W0(this.f360407g, booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
