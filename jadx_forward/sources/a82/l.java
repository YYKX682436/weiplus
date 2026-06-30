package a82;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83599d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f83601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.t f83603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, java.lang.String str, a82.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83601f = n2Var;
        this.f83602g = str;
        this.f83603h = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        a82.l lVar = new a82.l(this.f83601f, this.f83602g, this.f83603h, interfaceC29045xdcb5ca57);
        lVar.f83600e = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83599d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f83600e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f83601f;
            if (n2Var == null) {
                return jz5.f0.f384359a;
            }
            a82.k kVar = new a82.k(this.f83602g, y0Var, this.f83603h);
            this.f83599d = 1;
            if (n2Var.a(kVar, this) == aVar) {
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
