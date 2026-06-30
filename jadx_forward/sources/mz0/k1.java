package mz0;

/* loaded from: classes5.dex */
public final class k1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414527f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(mz0.b2 b2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414526e = b2Var;
        this.f414527f = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.k1 k1Var = new mz0.k1(this.f414526e, this.f414527f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        k1Var.f414525d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        k1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f414525d;
        mz0.b2 b2Var = this.f414526e;
        b2Var.f7().dismiss();
        b2Var.s7(th6, this.f414527f);
        if (th6 != null) {
            db5.t7.g(b2Var.m80379x76847179(), b2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572310aq5));
        } else {
            mz0.b2.Q6(b2Var);
        }
        return jz5.f0.f384359a;
    }
}
