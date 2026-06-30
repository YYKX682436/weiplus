package f12;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f340140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f12.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340140e = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f12.g0(this.f340140e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f340139d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        f12.j0 j0Var = this.f340140e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringLuckyEggViewModel", "load egg");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            f12.f0 f0Var2 = new f12.f0(j0Var, null);
            this.f340139d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, f0Var2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        f21.e eVar = (f21.e) obj;
        if ((eVar != null ? eVar.f340412o : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpringLuckyEggViewModel", "couldn't find the luck egg");
            j0Var.f340156m.mo523x53d8522f(d12.a.f307244g);
            return f0Var;
        }
        j0Var.f340161r.mo523x53d8522f(eVar.f340412o);
        j0Var.f340157n.mo523x53d8522f(eVar.f340412o.f340392n);
        j0Var.f340152f = eVar.f340412o.f340385d;
        this.f340139d = 2;
        return f12.j0.N6(j0Var, this) == aVar ? aVar : f0Var;
    }
}
