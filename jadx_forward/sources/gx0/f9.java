package gx0;

/* loaded from: classes5.dex */
public final class f9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f357950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f357951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(gx0.p9 p9Var, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357950e = p9Var;
        this.f357951f = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.f9(this.f357950e, this.f357951f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.f9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357949d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.p9 p9Var = this.f357950e;
            ex0.a0 a0Var = p9Var.u7().f358175r;
            if (a0Var == null) {
                return f0Var;
            }
            for (ex0.r rVar : a0Var.f338630g.f338710e) {
                ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
                if (cVar != null) {
                    cVar.E(this.f357951f);
                }
            }
            p9Var.t7().c7();
            gx0.bf t76 = p9Var.t7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            this.f357949d = 1;
            if (gx0.bf.r7(t76, false, ZeroTime, 0, false, null, this, 29, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
