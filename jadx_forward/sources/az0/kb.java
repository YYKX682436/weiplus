package az0;

/* loaded from: classes5.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(az0.xb xbVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97178e = xbVar;
        this.f97179f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.kb(this.f97178e, this.f97179f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.kb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97177d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yz5.l lVar = this.f97179f;
            az0.xb xbVar = this.f97178e;
            az0.jb jbVar = new az0.jb(xbVar, lVar);
            this.f97177d = 1;
            if (xbVar.Q0("1008", jbVar, this) == aVar) {
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
