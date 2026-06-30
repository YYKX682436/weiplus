package fj1;

/* loaded from: classes7.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f344657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj1.y f344658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fj1.n f344659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f344660h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, fj1.y yVar, fj1.n nVar, lc3.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344657e = k0Var;
        this.f344658f = yVar;
        this.f344659g = nVar;
        this.f344660h = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fj1.m(this.f344657e, this.f344658f, this.f344659g, this.f344660h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fj1.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f344656d;
        java.lang.Object obj2 = this.f344657e;
        fj1.y yVar = this.f344658f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) obj2;
            fj1.b0 b0Var = yVar.f344684k;
            if (b0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsapiInvokePermissionController");
                throw null;
            }
            this.f344656d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            si1.j b17 = b0Var.f344639b.b(b0Var.f344638a.d(), fVar, "", "", 0, new fj1.a0(rVar));
            if (b17.f489803a != -2 && rVar.n()) {
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(b17));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        si1.j jVar = (si1.j) obj;
        int i18 = jVar.f489803a;
        fj1.n nVar = this.f344659g;
        if (i18 == 0) {
            int b07 = yVar.d().b0(nVar.s());
            if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff(null, yVar.d(), this.f344660h, null, b07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApiEx<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g) obj2).h(ffVar);
            } else {
                boolean z17 = obj2 instanceof yc1.c;
                lc3.a0 a0Var = this.f344660h;
                if (z17) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) obj2).B(yVar.d(), a0Var, b07, yVar.d().getF229341e());
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) obj2).A(yVar.d(), a0Var, b07);
                }
            }
        } else {
            yz5.l s17 = nVar.s();
            lc3.a0 c17 = fj1.q.c(jVar.f489805c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "errorsInfoToJson(...)");
            s17.mo146xb9724478(c17);
        }
        return jz5.f0.f384359a;
    }
}
