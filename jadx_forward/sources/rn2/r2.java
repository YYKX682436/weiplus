package rn2;

/* loaded from: classes15.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(rn2.t2 t2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479368e = t2Var;
        this.f479369f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.r2(this.f479368e, this.f479369f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479367d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gk2.e eVar = gk2.e.f354004n;
            if (eVar == null) {
                return f0Var;
            }
            ld2.i iVar = ld2.i.f399636a;
            rn2.t2 t2Var = this.f479368e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
            java.lang.String str = this.f479369f;
            ml2.l1 l1Var = ml2.l1.f409222p;
            rn2.q2 q2Var = new rn2.q2(t2Var);
            this.f479367d = 1;
            if (iVar.b(abstractActivityC21394xb3d2c0cf, eVar, str, l1Var, q2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
