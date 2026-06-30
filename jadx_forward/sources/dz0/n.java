package dz0;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f326474f;

    /* renamed from: g, reason: collision with root package name */
    public int f326475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az0.d f326477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dz0.v f326478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326479n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.d dVar, dz0.v vVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326476h = c11015x5b190a3b;
        this.f326477i = dVar;
        this.f326478m = vVar;
        this.f326479n = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.n(this.f326476h, this.f326477i, this.f326478m, this.f326479n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        az0.n7 n7Var;
        dz0.v vVar;
        yz5.l lVar;
        az0.n7 n7Var2;
        yz5.l lVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326475g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n7Var = this.f326476h.f151316d;
            if (n7Var != null) {
                az0.d dVar = this.f326477i;
                vVar = this.f326478m;
                lVar = this.f326479n;
                if (dVar != null) {
                    this.f326472d = vVar;
                    this.f326473e = lVar;
                    this.f326474f = n7Var;
                    this.f326475g = 1;
                    java.lang.Object c17 = ((dz0.k0) dVar).c(this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    n7Var2 = n7Var;
                    obj = c17;
                    lVar2 = lVar;
                }
                vVar.f326565d = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
                dz0.m mVar = new dz0.m(vVar, lVar);
                n7Var.getClass();
                n7Var.f97275a.m33367x6165208b(new az0.n5(mVar));
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n7Var2 = (az0.n7) this.f326474f;
        lVar2 = (yz5.l) this.f326473e;
        vVar = (dz0.v) this.f326472d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        n7Var = n7Var2;
        lVar = lVar2;
        vVar.f326565d = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
        dz0.m mVar2 = new dz0.m(vVar, lVar);
        n7Var.getClass();
        n7Var.f97275a.m33367x6165208b(new az0.n5(mVar2));
        return jz5.f0.f384359a;
    }
}
