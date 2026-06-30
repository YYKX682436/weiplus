package rn2;

/* loaded from: classes.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f479287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f479288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, r45.dz1 dz1Var, v65.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479286e = context;
        this.f479287f = dz1Var;
        this.f479288g = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.h0(this.f479286e, this.f479287f, this.f479288g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479285d;
        android.content.Context context = this.f479286e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            this.f479285d = 1;
            obj = ((c61.l7) b6Var).sl(context, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) ((jz5.l) obj).f384366d).booleanValue()) {
            rn2.l0 l0Var = rn2.l0.f479325a;
            this.f479285d = 2;
            if (l0Var.e(context, this.f479287f, this) == aVar) {
                return aVar;
            }
        } else {
            this.f479288g.a(new jz5.l("not enough pay", null));
        }
        return jz5.f0.f384359a;
    }
}
