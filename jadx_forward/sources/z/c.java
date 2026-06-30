package z;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f550137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z.e eVar, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f550137d = eVar;
        this.f550138e = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z.c(this.f550137d, this.f550138e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        z.c cVar = (z.c) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        z.e eVar = this.f550137d;
        z.e.b(eVar);
        java.lang.Object a17 = z.e.a(eVar, this.f550138e);
        ((n0.q4) eVar.f550165c.f550344e).mo148714x53d8522f(a17);
        ((n0.q4) eVar.f550167e).mo148714x53d8522f(a17);
        return jz5.f0.f384359a;
    }
}
