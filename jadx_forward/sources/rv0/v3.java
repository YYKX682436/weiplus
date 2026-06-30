package rv0;

/* loaded from: classes5.dex */
public final class v3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(rv0.n1 n1Var, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481826e = n1Var;
        this.f481827f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.v3(this.f481826e, this.f481827f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.v3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481825d;
        rv0.n1 n1Var = this.f481826e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            this.f481825d = 1;
            if (gx0.bf.d7(p76, null, ZeroTime, false, this, 5, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime2, "ZeroTime");
        n1Var.v7(ZeroTime2);
        this.f481827f.g();
        n1Var.r7().a();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10943x503f3e16 r76 = n1Var.r7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime2, "ZeroTime");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(r76, ZeroTime2, false, 2, null);
        n1Var.w7();
        return jz5.f0.f384359a;
    }
}
