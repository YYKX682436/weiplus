package wx0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f532097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wx0.c0 c0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532096e = c0Var;
        this.f532097f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wx0.x(this.f532096e, this.f532097f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532095d;
        wx0.c0 c0Var = this.f532096e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c0Var.e().m47362xc07e953d(new wx0.v(this.f532097f));
            c0Var.e().m47363xab21b54d(new wx0.w(c0Var, null));
            yx0.b8 b8Var = c0Var.f531992g;
            this.f532095d = 1;
            obj = b8Var.O(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        nx0.j2 j2Var = (nx0.j2) obj;
        if (c0Var.f531992g.f548721p0 != yx0.n.f548996e || j2Var != c0Var.e().getF151138m()) {
            c0Var.e().m47361x3a3064cf(j2Var);
        }
        c0Var.e().c();
        return jz5.f0.f384359a;
    }
}
