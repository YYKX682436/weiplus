package wx0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f531984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f531985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f531986f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(wx0.c0 c0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531985e = c0Var;
        this.f531986f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wx0.a0(this.f531985e, this.f531986f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f531984d;
        wx0.c0 c0Var = this.f531985e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c0Var.f().m47370xc07e953d(new wx0.y(this.f531986f));
            c0Var.f().m47371xa9d20a1e(new wx0.z(c0Var, null));
            yx0.b8 b8Var = c0Var.f531992g;
            this.f531984d = 1;
            obj = b8Var.P(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        nx0.c3 c3Var = (nx0.c3) obj;
        if (c0Var.f531992g.f548721p0 != yx0.n.f548997f || c3Var != c0Var.f().getF151146i()) {
            c0Var.f().m47369x4aa9b1de(c3Var);
        }
        c0Var.f().b();
        return jz5.f0.f384359a;
    }
}
