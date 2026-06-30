package df2;

/* loaded from: classes3.dex */
public final class je extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f312006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f312007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(java.util.List list, df2.qe qeVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312006e = list;
        this.f312007f = qeVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df2.je jeVar = new df2.je(this.f312006e, this.f312007f, interfaceC29045xdcb5ca57);
        jeVar.f312005d = obj;
        return jeVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.je jeVar = (df2.je) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jeVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f312005d;
        for (r45.xm1 xm1Var : this.f312006e) {
            dk2.ef efVar = dk2.ef.f314905a;
            java.lang.String str = (java.lang.String) dk2.ef.f314943y.get(new java.lang.Integer(xm1Var.m75939xb282bd08(0)));
            if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new df2.ie(xm1Var, this.f312007f, null), 3, null)).mo143976x68ac462();
            }
        }
        return jz5.f0.f384359a;
    }
}
