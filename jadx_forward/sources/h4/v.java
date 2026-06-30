package h4;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360233d;

    /* renamed from: e, reason: collision with root package name */
    public int f360234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f360235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360235f = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        h4.v vVar = new h4.v(this.f360235f, interfaceC29045xdcb5ca57);
        vVar.f360233d = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.v) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360234e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h4.u uVar = new h4.u(this, (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f360233d);
            this.f360234e = 1;
            if (this.f360235f.a(uVar, this) == aVar) {
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
