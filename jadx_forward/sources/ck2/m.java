package ck2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck2.o f123960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.dn f123961f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f123962g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f123963h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ck2.o oVar, df2.dn dnVar, r45.f02 f02Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123960e = oVar;
        this.f123961f = dnVar;
        this.f123962g = f02Var;
        this.f123963h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ck2.m(this.f123960e, this.f123961f, this.f123962g, this.f123963h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ck2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f123959d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.ln lnVar = (df2.ln) this.f123960e.m56789x25fe639c(df2.ln.class);
            if (lnVar != null) {
                df2.dn dnVar = this.f123961f;
                r45.f02 f02Var = this.f123962g;
                boolean z17 = pm0.v.z(f02Var.f455414g, 1);
                yz5.l lVar = this.f123963h;
                this.f123959d = 1;
                if (lnVar.b7(dnVar, f02Var, z17, true, lVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
