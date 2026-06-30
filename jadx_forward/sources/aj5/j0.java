package aj5;

/* loaded from: classes.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f86985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f86987i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.util.HashMap hashMap, aj5.r0 r0Var, java.util.List list, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86983e = i2Var;
        this.f86984f = hashMap;
        this.f86985g = r0Var;
        this.f86986h = list;
        this.f86987i = i2Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aj5.j0(this.f86983e, this.f86984f, this.f86985g, this.f86986h, this.f86987i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86982d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aj5.i0 i0Var = new aj5.i0(this.f86984f, this.f86985g, this.f86986h, this.f86987i);
            this.f86982d = 1;
            if (this.f86983e.a(i0Var, this) == aVar) {
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
