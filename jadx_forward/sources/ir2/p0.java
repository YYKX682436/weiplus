package ir2;

/* loaded from: classes2.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ir2.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375738e = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.p0(this.f375738e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375737d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ir2.a1 a1Var = this.f375738e;
            ir2.a0 a0Var = a1Var.f375629i;
            if (a0Var != null) {
                ir2.o0 o0Var = new ir2.o0(a1Var, a0Var, null);
                this.f375737d = 1;
                obj = ir2.a1.N6(a1Var, o0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewLoader", "loadMore cost:" + ((java.lang.Number) obj).longValue());
        return jz5.f0.f384359a;
    }
}
