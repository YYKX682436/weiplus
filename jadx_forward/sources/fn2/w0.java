package fn2;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345960d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f345963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f345964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, fn2.q1 q1Var, fn2.h1 h1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345962f = i17;
        this.f345963g = q1Var;
        this.f345964h = h1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fn2.w0 w0Var = new fn2.w0(this.f345962f, this.f345963g, this.f345964h, interfaceC29045xdcb5ca57);
        w0Var.f345961e = obj;
        return w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.w0) mo148xaf65a0fc((com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        java.lang.Object d17;
        r45.kx1 kx1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f345960d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) this.f345961e;
            int i18 = this.f345962f;
            if (i18 == 1) {
                fn2.q1 q1Var = this.f345963g;
                java.lang.Integer num = new java.lang.Integer(0);
                this.f345960d = 1;
                b17 = fn2.q1.b(q1Var, gVar, false, num, this, 2, null);
                if (b17 == aVar) {
                    return aVar;
                }
                kx1Var = (r45.kx1) b17;
            } else if (i18 != 2) {
                kx1Var = null;
            } else {
                fn2.q1 q1Var2 = this.f345963g;
                java.lang.Integer num2 = new java.lang.Integer(0);
                this.f345960d = 2;
                d17 = fn2.q1.d(q1Var2, gVar, false, num2, this, 2, null);
                if (d17 == aVar) {
                    return aVar;
                }
                kx1Var = (r45.kx1) d17;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
            kx1Var = (r45.kx1) b17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d17 = obj;
            kx1Var = (r45.kx1) d17;
        }
        fn2.h1 h1Var = this.f345964h;
        bm2.k7 k7Var = h1Var.f345805i;
        if (k7Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvAdapter");
            throw null;
        }
        java.util.List list = kx1Var != null ? kx1Var.f460547d : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) k7Var.f103578q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            size = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bm2.v6(bm2.w6.f103946f, (r45.yx1) it.next(), null, 4, null));
        }
        arrayList.addAll(size, arrayList2);
        k7Var.m8153xd399a4d9(size, list.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = h1Var.f345802f;
        if (dvVar != null) {
            dvVar.d();
        }
        return new jz5.l(kx1Var != null ? kx1Var.f460548e : null, new java.lang.Integer(kx1Var != null ? kx1Var.f460549f : 0));
    }
}
