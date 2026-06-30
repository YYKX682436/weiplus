package wv0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f531436d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f531437e;

    /* renamed from: f, reason: collision with root package name */
    public int f531438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f531439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f531440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f531441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ex0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531439g = a0Var;
        this.f531440h = c3971x241f78;
        this.f531441i = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wv0.e(this.f531439g, this.f531440h, this.f531441i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wv0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        rv0.n1 n1Var;
        ex0.r rVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f531438f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.Iterator it = this.f531439g.f338630g.f338710e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ex0.r) obj2).f338701b, this.f531440h)) {
                    break;
                }
            }
            ex0.r rVar2 = (ex0.r) obj2;
            if (rVar2 != null) {
                n1Var = this.f531441i;
                gx0.bf p76 = n1Var.p7();
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = rVar2.k();
                this.f531436d = n1Var;
                this.f531437e = rVar2;
                this.f531438f = 1;
                if (gx0.bf.d7(p76, null, k17, false, this, 5, null) == aVar) {
                    return aVar;
                }
                rVar = rVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar = (ex0.r) this.f531437e;
        n1Var = (rv0.n1) this.f531436d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        n1Var.v7(rVar.k());
        return jz5.f0.f384359a;
    }
}
