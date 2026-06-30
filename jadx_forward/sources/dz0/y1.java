package dz0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326607e = c11015x5b190a3b;
        this.f326608f = n7Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.y1 y1Var = new dz0.y1(this.f326607e, this.f326608f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        y1Var.f326606d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        y1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Throwable) this.f326606d) == null) {
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326607e;
            boolean z17 = c11015x5b190a3b.C;
            java.util.List list = kz5.p0.f395529d;
            if (z17) {
                dz0.x xVar = c11015x5b190a3b.f151322m;
                az0.n7 n7Var = this.f326608f;
                java.util.List m33396x98ac451d = n7Var.f97275a.m33396x98ac451d();
                if (m33396x98ac451d != null) {
                    list = m33396x98ac451d;
                }
                xVar.b(list);
                dz0.x xVar2 = c11015x5b190a3b.f151322m;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33391x2f60e70 = n7Var.f97275a.m33391x2f60e70();
                if (m33391x2f60e70 == null) {
                    m33391x2f60e70 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44, new java.lang.Object[0]);
                }
                xVar2.a(m33391x2f60e70);
            } else {
                c11015x5b190a3b.f151322m.b(list);
                c11015x5b190a3b.f151322m.a(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44, new java.lang.Object[0]));
            }
        }
        return jz5.f0.f384359a;
    }
}
