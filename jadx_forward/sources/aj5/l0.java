package aj5;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f87000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f87001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f87002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f87003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wi5.z f87004i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f87005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f87006n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.util.HashMap hashMap, int i17, aj5.r0 r0Var, wi5.z zVar, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f87000e = i2Var;
        this.f87001f = hashMap;
        this.f87002g = i17;
        this.f87003h = r0Var;
        this.f87004i = zVar;
        this.f87005m = list;
        this.f87006n = i2Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj5.l0(this.f87000e, this.f87001f, this.f87002g, this.f87003h, this.f87004i, this.f87005m, this.f87006n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86999d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aj5.k0 k0Var = new aj5.k0(this.f87001f, this.f87002g, this.f87003h, this.f87004i, this.f87005m, this.f87006n);
            this.f86999d = 1;
            if (this.f87000e.a(k0Var, this) == aVar) {
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
