package rv0;

/* loaded from: classes5.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv0.h f481554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(rv0.z6 z6Var, sv0.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481553d = z6Var;
        this.f481554e = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.g6(this.f481553d, this.f481554e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rv0.g6 g6Var = (rv0.g6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        dx0.g gVar;
        dx0.g gVar2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rv0.z6 z6Var = this.f481553d;
        ex0.a0 v76 = z6Var.v7();
        sv0.h hVar = this.f481554e;
        if (v76 != null && (gVar2 = v76.H) != null) {
            gVar2.f(hVar.f494756a);
        }
        ex0.a0 v77 = z6Var.v7();
        if (v77 != null && (gVar = v77.H) != null) {
            gVar.b(hVar.f494756a);
        }
        return jz5.f0.f384359a;
    }
}
