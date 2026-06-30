package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f146634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f146635e;

    /* renamed from: f, reason: collision with root package name */
    public int f146636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ft.b f146637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 f146638h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f146639i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ft.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 c11865xc185f759, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f146637g = bVar;
        this.f146638h = c11865xc185f759;
        this.f146639i = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.q(this.f146637g, this.f146638h, this.f146639i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f146636f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f146639i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ft.b bVar = this.f146637g;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.getF146571d(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 c11865xc185f759 = this.f146638h;
            if (b17) {
                c11865xc185f759.e();
                if (c11865xc185f759.f159549h) {
                    c0Var.f391645d = true;
                }
            } else if (bVar.a()) {
                this.f146634d = bVar;
                this.f146635e = c11865xc185f759;
                this.f146636f = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                java.lang.String f146571d = bVar.getF146571d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f146571d, "processName(...)");
                com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(f146571d, new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.SafeParcelableWrapper(c11865xc185f759), com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.o.f146629d, new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.p(nVar));
                obj = nVar.a();
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
        if (((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d) {
            c0Var.f391645d = true;
        }
        return jz5.f0.f384359a;
    }
}
