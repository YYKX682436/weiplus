package nr0;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f420614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f420615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nr0.x xVar, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f420613e = xVar;
        this.f420614f = bArr;
        this.f420615g = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.g(this.f420613e, this.f420614f, this.f420615g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420612d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xr0.j jVar = this.f420613e.f420654m.f537709b;
            zr0.p pVar = this.f420613e.f420655n;
            byte[] bArr = this.f420614f;
            int i18 = jVar.f537706a;
            int i19 = jVar.f537707b;
            this.f420612d = 1;
            if (pVar.l(bArr, i18, i19, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f420615g;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f384359a;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        return f0Var;
    }
}
