package aj5;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f86922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f86923h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wi5.z f86924i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86926n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.util.HashMap hashMap, int i17, aj5.g1 g1Var, wi5.z zVar, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86920e = i2Var;
        this.f86921f = hashMap;
        this.f86922g = i17;
        this.f86923h = g1Var;
        this.f86924i = zVar;
        this.f86925m = list;
        this.f86926n = i2Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj5.a1(this.f86920e, this.f86921f, this.f86922g, this.f86923h, this.f86924i, this.f86925m, this.f86926n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86919d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aj5.z0 z0Var = new aj5.z0(this.f86921f, this.f86922g, this.f86923h, this.f86924i, this.f86925m, this.f86926n);
            this.f86919d = 1;
            if (this.f86920e.a(z0Var, this) == aVar) {
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
