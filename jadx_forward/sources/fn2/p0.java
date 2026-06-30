package fn2;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345880d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f345882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f345883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(sf2.d3 d3Var, fn2.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345882f = d3Var;
        this.f345883g = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fn2.p0 p0Var = new fn2.p0(this.f345882f, this.f345883g, interfaceC29045xdcb5ca57);
        p0Var.f345881e = obj;
        return p0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.p0) mo148xaf65a0fc((com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345880d;
        fn2.s0 s0Var = this.f345883g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) this.f345881e;
            java.lang.Integer num = new java.lang.Integer(s0Var.f345929r.f458689d);
            r45.ch6 ch6Var = s0Var.f345927p;
            java.lang.Integer num2 = ch6Var != null ? new java.lang.Integer(ch6Var.f453088d) : null;
            this.f345880d = 1;
            obj = this.f345882f.m7(num, num2, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.zw1 zw1Var = (r45.zw1) obj;
        bm2.o6 o6Var = s0Var.f345921g;
        if (o6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = zw1Var != null ? zw1Var.f473948d : null;
        java.util.List list2 = kz5.p0.f395529d;
        if (list == null) {
            list = list2;
        }
        java.util.LinkedList linkedList = zw1Var != null ? zw1Var.f473952h : null;
        if (linkedList != null) {
            list2 = linkedList;
        }
        o6Var.E(list, list2, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = s0Var.f345924m;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(zw1Var != null ? zw1Var.f473949e : null, new java.lang.Integer(zw1Var != null ? zw1Var.f473950f : 0));
    }
}
