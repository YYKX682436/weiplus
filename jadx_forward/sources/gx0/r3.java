package gx0;

/* loaded from: classes5.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358440d;

    /* renamed from: e, reason: collision with root package name */
    public int f358441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.f f358443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f358444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(ex0.a0 a0Var, ex0.f fVar, gx0.y3 y3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358442f = a0Var;
        this.f358443g = fVar;
        this.f358444h = y3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.r3(this.f358442f, this.f358443g, this.f358444h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358441e;
        gx0.y3 y3Var = this.f358444h;
        ex0.f fVar = this.f358443g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ex0.a0 a0Var = this.f358442f;
            a0Var.I(fVar);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 l17 = fVar.l();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c17 = a0Var.f338630g.c();
            fVar.f338672o = true;
            y3Var.o7().o();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = l17.m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
            fVar.z(m34007xde00a612);
            fVar.y(c17);
            gx0.bf z76 = y3Var.z7();
            this.f358440d = l17;
            this.f358441e = 1;
            if (gx0.bf.d7(z76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
            c4129xdee64553 = l17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4129xdee64553 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553) this.f358440d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a6122 = c4129xdee64553.m34007xde00a612();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a6122, "getEndTime(...)");
        fVar.y(m34007xde00a6122);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a = c4129xdee64553.m34005x51e8b0a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34005x51e8b0a, "getDuration(...)");
        fVar.z(m34005x51e8b0a);
        fVar.f338672o = false;
        y3Var.o7().p();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.i(y3Var.o7(), false, 1, null);
        return jz5.f0.f384359a;
    }
}
