package aj5;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f86956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f86957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.util.HashMap hashMap, aj5.g1 g1Var, wi5.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86954e = i2Var;
        this.f86955f = hashMap;
        this.f86956g = g1Var;
        this.f86957h = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj5.e1(this.f86954e, this.f86955f, this.f86956g, this.f86957h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86953d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aj5.d1 d1Var = new aj5.d1(this.f86955f, this.f86956g, this.f86957h);
            this.f86953d = 1;
            if (this.f86954e.a(d1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
