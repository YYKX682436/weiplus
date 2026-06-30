package py0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.y f440540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(py0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f440540e = yVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        py0.p pVar = new py0.p(this.f440540e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        pVar.f440539d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f440539d;
        py0.y yVar = this.f440540e;
        yVar.P6().dismiss();
        if (th6 != null) {
            db5.t7.g(yVar.m80379x76847179(), yVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572310aq5));
        }
        return jz5.f0.f384359a;
    }
}
