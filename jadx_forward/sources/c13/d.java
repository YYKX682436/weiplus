package c13;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119406d;

    public d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c13.d(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new c13.d((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f119406d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.w wVar = c13.b0.f119397h;
            if (wVar != null) {
                this.f119406d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                if (wVar.f436271d == null) {
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = wVar.f436271d;
                if (c28677x2598ceaa != null) {
                    c28677x2598ceaa.m138403x35cf88("engine_exit", new pi0.v(nVar));
                }
                java.lang.Object a17 = nVar.a();
                if (a17 != aVar) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c13.b0.f119397h = null;
        return f0Var;
    }
}
