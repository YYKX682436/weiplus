package jm;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c0 f381768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jm.m f381769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qi3.c0 c0Var, jm.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f381768e = c0Var;
        this.f381769f = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jm.k kVar = new jm.k(this.f381768e, this.f381769f, interfaceC29045xdcb5ca57);
        kVar.f381767d = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jm.k kVar = (jm.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qi3.c0 c0Var = this.f381768e;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = c0Var.f445212a;
        if (c16564xb55e1d5 != null) {
            double d17 = c0Var.f445213b;
            jm.m mVar = this.f381769f;
            if (d17 > 0.0d) {
                ((java.util.HashMap) ((jz5.n) mVar.f381773o).mo141623x754a37bb()).put(c16564xb55e1d5.m66995x9616526c(), new java.lang.Float(c0Var.f445213b));
            }
            java.util.Iterator it = ((java.util.HashSet) ((jz5.n) mVar.f381772n).mo141623x754a37bb()).iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                qi3.z zVar = (qi3.z) ((d75.c) next).get();
                if (zVar != null) {
                    ut.b bVar = (ut.b) zVar;
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = c0Var.f445212a;
                    java.lang.String a17 = c16564xb55e1d52 != null ? c16564xb55e1d52.a() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d53 = c0Var.f445212a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(a17, c16564xb55e1d53 != null ? c16564xb55e1d53.f231013d : 0L);
                    if (k17 != null && k17.n2()) {
                        if (c0Var.f445214c) {
                            bVar.V6(k17, 4, false);
                        } else {
                            float f17 = c0Var.f445213b;
                            if (f17 >= 1.0f) {
                                bVar.V6(k17, 0, false);
                            } else if (f17 > 0.0f) {
                                bVar.V6(k17, 3, true);
                            }
                        }
                    }
                } else {
                    zVar = null;
                }
                if (zVar == null) {
                    it.remove();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
