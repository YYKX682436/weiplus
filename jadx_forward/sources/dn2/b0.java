package dn2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f323421d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f323422e;

    /* renamed from: f, reason: collision with root package name */
    public int f323423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn2.d0 f323424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f323425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323426i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dn2.d0 d0Var, cn2.p0 p0Var, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323424g = d0Var;
        this.f323425h = p0Var;
        this.f323426i = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dn2.b0(this.f323424g, this.f323425h, this.f323426i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        cn2.p0 p0Var;
        dn2.d0 d0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f323423f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dn2.d0 d0Var2 = this.f323424g;
            cn2.k kVar = d0Var2.f323437d;
            yz5.l lVar = d0Var2.f323436c;
            android.view.View view = this.f323426i;
            if (kVar != null && lVar != null) {
                p0Var = this.f323425h;
                cn2.c0 b17 = p0Var.b();
                this.f323421d = p0Var;
                this.f323422e = d0Var2;
                this.f323423f = 1;
                if (b17.h(1000L, view, kVar, lVar, this) == aVar) {
                    return aVar;
                }
                d0Var = d0Var2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d0Var = (dn2.d0) this.f323422e;
        p0Var = (cn2.p0) this.f323421d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (!p0Var.f125132j) {
            d0Var.f323436c = null;
            d0Var.f323437d = null;
        }
        return jz5.f0.f384359a;
    }
}
