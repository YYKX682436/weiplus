package pi0;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f436150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.q f436151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pi0.u0 u0Var, pi0.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f436150d = u0Var;
        this.f436151e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi0.j(this.f436150d, this.f436151e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pi0.j jVar = (pi0.j) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a = this.f436150d.f436264b.m137439x2173b36a();
        pi0.q qVar = this.f436151e;
        m137439x2173b36a.add(qVar.f436240k);
        m137439x2173b36a.add(qVar.f436241l);
        return jz5.f0.f384359a;
    }
}
