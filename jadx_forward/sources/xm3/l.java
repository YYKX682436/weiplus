package xm3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f536877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f536878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xm3.i f536879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f536880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xm3.n0 f536881h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, xm3.i iVar, int i17, xm3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536878e = c16718x7059cefe;
        this.f536879f = iVar;
        this.f536880g = i17;
        this.f536881h = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xm3.l(this.f536878e, this.f536879f, this.f536880g, this.f536881h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f536877d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f536878e;
            c16718x7059cefe.k(true);
            xm3.i iVar = xm3.i.f536858h;
            xm3.i iVar2 = this.f536879f;
            if (iVar2 == iVar) {
                c16718x7059cefe.f233599p.clear();
            }
            c16718x7059cefe.f233590d.mo10202x3e5a77bb();
            pm0.v.X(new xm3.j(c16718x7059cefe));
            c16718x7059cefe.h(new ym3.o(ym3.p.f544713e, null), 0);
            ym3.f fVar = c16718x7059cefe.f233590d;
            v65.i iVar3 = c16718x7059cefe.f233593g;
            int size = c16718x7059cefe.f233599p.size();
            xm3.n0 n0Var = this.f536881h;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j r17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.r(fVar.a(iVar3, new ym3.c(this.f536880g, size, n0Var.f536892d, n0Var.f536894f)), 1);
            xm3.k kVar = new xm3.k(c16718x7059cefe, iVar2, n0Var);
            this.f536877d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.x0) r17).a(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
