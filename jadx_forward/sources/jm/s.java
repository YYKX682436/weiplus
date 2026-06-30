package jm;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f381782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.e0 f381783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jm.y f381784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qi3.e0 e0Var, jm.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f381783e = e0Var;
        this.f381784f = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jm.s sVar = new jm.s(this.f381783e, this.f381784f, interfaceC29045xdcb5ca57);
        sVar.f381782d = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jm.s sVar = (jm.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        qi3.e0 e0Var = this.f381783e;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = e0Var.f445230g;
        jm.y yVar = this.f381784f;
        if (c16564xb55e1d5 != null && e0Var.f445231h > 0.0d) {
            yVar.aj().put(c16564xb55e1d5.m66995x9616526c(), new java.lang.Float(e0Var.f445231h));
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) yVar.f381792n).mo141623x754a37bb()).iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            qi3.a0 a0Var = (qi3.a0) ((d75.c) next).get();
            if (a0Var != null) {
                a0Var.L8(e0Var);
            } else {
                a0Var = null;
            }
            if (a0Var == null) {
                it.remove();
            }
        }
        return jz5.f0.f384359a;
    }
}
