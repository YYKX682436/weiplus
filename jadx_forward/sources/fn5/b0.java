package fn5;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fn5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f346176d = n0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        fn5.b0 b0Var = new fn5.b0(this.f346176d, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyPersonReq on completion: " + java.lang.Thread.currentThread().getName());
        pm0.v.X(new fn5.a0(this.f346176d));
        return jz5.f0.f384359a;
    }
}
