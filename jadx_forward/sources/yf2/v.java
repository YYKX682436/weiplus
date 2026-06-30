package yf2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f543330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf2.z f543332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(mm2.n0 n0Var, java.lang.String str, yf2.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543330e = n0Var;
        this.f543331f = str;
        this.f543332g = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf2.v(this.f543330e, this.f543331f, this.f543332g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543329d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.n0 n0Var = this.f543330e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = n0Var.f410798g;
            yf2.u uVar = new yf2.u(n0Var, this.f543331f, this.f543332g);
            this.f543329d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).a(uVar, this) == aVar) {
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
