package dn2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f323456d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f323457e;

    /* renamed from: f, reason: collision with root package name */
    public int f323458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn2.m f323459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f323460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dn2.m mVar, cn2.p0 p0Var, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323459g = mVar;
        this.f323460h = p0Var;
        this.f323461i = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dn2.j(this.f323459g, this.f323460h, this.f323461i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        cn2.p0 p0Var;
        dn2.m mVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f323458f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dn2.m mVar2 = this.f323459g;
            cn2.k kVar = mVar2.f323474d;
            yz5.l lVar = mVar2.f323473c;
            android.view.View view = this.f323461i;
            if (kVar != null && lVar != null) {
                p0Var = this.f323460h;
                cn2.c0 b17 = p0Var.b();
                this.f323456d = p0Var;
                this.f323457e = mVar2;
                this.f323458f = 1;
                if (b17.h(1000L, view, kVar, lVar, this) == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar = (dn2.m) this.f323457e;
        p0Var = (cn2.p0) this.f323456d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (!p0Var.f125132j) {
            mVar.f323473c = null;
            mVar.f323474d = null;
        }
        return jz5.f0.f384359a;
    }
}
