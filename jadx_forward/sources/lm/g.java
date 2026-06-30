package lm;

/* loaded from: classes9.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.p f400836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm.r f400837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w65.p pVar, lm.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400836e = pVar;
        this.f400837f = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        lm.g gVar = new lm.g(this.f400836e, this.f400837f, interfaceC29045xdcb5ca57);
        gVar.f400835d = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        lm.g gVar = (lm.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        w65.p pVar = this.f400836e;
        double d17 = pVar.f524898d;
        lm.r rVar = this.f400837f;
        if (d17 > 0.0d) {
            ((lm.o) ((jz5.n) rVar.f400864o).mo141623x754a37bb()).put(pVar.f524896b.id(), new java.lang.Float(pVar.f524898d));
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) rVar.f400863n).mo141623x754a37bb()).iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            w65.o oVar = (w65.o) ((d75.c) next).get();
            if (oVar != null) {
                oVar.P2(pVar);
            } else {
                oVar = null;
            }
            if (oVar == null) {
                it.remove();
            }
        }
        return jz5.f0.f384359a;
    }
}
