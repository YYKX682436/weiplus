package a5;

/* loaded from: classes13.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f82931d;

    /* renamed from: e, reason: collision with root package name */
    public int f82932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a5.u f82933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.AbstractC1259xaa333856 f82934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a5.u uVar, p012xc85e97e9.p125x37c711.AbstractC1259xaa333856 abstractC1259xaa333856, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82933f = uVar;
        this.f82934g = abstractC1259xaa333856;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a5.j(this.f82933f, this.f82934g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a5.j jVar = (a5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f82932e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f82931d = this.f82933f;
            this.f82932e = 1;
            this.f82934g.getClass();
            throw new java.lang.IllegalStateException("Not implemented");
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a5.u uVar = (a5.u) this.f82931d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        uVar.f82969d.i(obj);
        return jz5.f0.f384359a;
    }
}
