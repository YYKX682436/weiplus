package h41;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h41.x f360352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f360353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f360354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h41.x xVar, boolean z17, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360352e = xVar;
        this.f360353f = z17;
        this.f360354g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.k(this.f360352e, this.f360353f, this.f360354g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360351d;
        h41.x xVar = this.f360352e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h41.j jVar = xVar.f360418b;
            this.f360351d = 1;
            if (jVar.a(this.f360353f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.a aVar2 = xVar.f360417a;
        if (aVar2 != null) {
            aVar2.Y(this.f360354g);
        }
        return jz5.f0.f384359a;
    }
}
