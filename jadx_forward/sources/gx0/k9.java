package gx0;

/* loaded from: classes5.dex */
public final class k9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f358154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f358155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, gx0.p9 p9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358154e = c0Var;
        this.f358155f = p9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.k9(this.f358154e, this.f358155f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.k9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358153d;
        gx0.p9 p9Var = this.f358155f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f358154e.f391645d) {
                gx0.bf t76 = p9Var.t7();
                this.f358153d = 1;
                if (gx0.bf.d7(t76, null, null, false, this, 7, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.bf t77 = p9Var.t7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.f358153d = 2;
        if (gx0.bf.r7(t77, false, ZeroTime, 0, false, null, this, 29, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
