package tr2;

/* loaded from: classes8.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.pw0 f502939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr2.v f502940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.pw0 pw0Var, tr2.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502939d = pw0Var;
        this.f502940e = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr2.p(this.f502939d, this.f502940e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        tr2.p pVar = (tr2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (this.f502939d.m75939xb282bd08(1) == 2) {
            tr2.v vVar = this.f502940e;
            vVar.f502947e = 0;
            vVar.f502946d = null;
            vVar.O6(null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = vVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).M7(vVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogr), sr2.z2.f493358f);
            dq.b b17 = cq.k1.b();
            b17.c(null);
            b17.b(null);
        }
        return jz5.f0.f384359a;
    }
}
