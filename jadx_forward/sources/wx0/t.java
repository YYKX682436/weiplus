package wx0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532076d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f532077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wx0.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532078f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wx0.t tVar = new wx0.t(this.f532078f, interfaceC29045xdcb5ca57);
        tVar.f532077e = obj;
        return tVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.t) mo148xaf65a0fc((nx0.r1) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532076d;
        wx0.c0 c0Var = this.f532078f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nx0.r1 r1Var = (nx0.r1) this.f532077e;
            yx0.b8 b8Var = c0Var.f531992g;
            this.f532076d = 1;
            if (b8Var.t0(r1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        nx0.r1 f151127f = c0Var.d().getF151127f();
        if (f151127f == null || (str = f151127f.f422743a) == null) {
            str = "";
        }
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.u6(m7Var, str, null), 3, null);
        return jz5.f0.f384359a;
    }
}
