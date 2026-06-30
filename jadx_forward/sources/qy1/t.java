package qy1;

/* loaded from: classes13.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f449285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f449286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.i f449287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qy1.b0 b0Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, qy1.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449285e = b0Var;
        this.f449286f = m1Var;
        this.f449287g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy1.t(this.f449285e, this.f449286f, this.f449287g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f449284d;
        qy1.b0 b0Var = this.f449285e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f449284d = 1;
            if (qy1.b0.a(b0Var, this.f449286f, this) == aVar) {
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
        qy1.i iVar = this.f449287g;
        int i18 = iVar.f449265a;
        qy1.m mVar = b0Var.f449246l;
        this.f449284d = 2;
        if (mVar.a(iVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
