package fn2;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345791d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fn2.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345793f = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fn2.g gVar = new fn2.g(this.f345793f, interfaceC29045xdcb5ca57);
        gVar.f345792e = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.g) mo148xaf65a0fc((com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345791d;
        fn2.s sVar = this.f345793f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) this.f345792e;
            if (sVar.f345916v.length() == 0) {
                return new jz5.l(null, new java.lang.Integer(0));
            }
            sf2.d3 d3Var = sVar.f345903f;
            java.lang.String str = sVar.f345916v;
            this.f345791d = 1;
            obj = d3Var.t7(str, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.ux1 ux1Var = (r45.ux1) obj;
        bm2.o6 o6Var = sVar.f345910p;
        java.util.List list = ux1Var != null ? ux1Var.f469246d : null;
        java.util.List list2 = kz5.p0.f395529d;
        if (list == null) {
            list = list2;
        }
        java.util.LinkedList linkedList = ux1Var != null ? ux1Var.f469249g : null;
        if (linkedList != null) {
            list2 = linkedList;
        }
        o6Var.E(list, list2, sVar.f345916v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = sVar.f345913s;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(ux1Var != null ? ux1Var.f469247e : null, new java.lang.Integer(ux1Var != null ? ux1Var.f469248f : 0));
    }
}
