package ix3;

/* loaded from: classes.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx3.e f376897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f376898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(hx3.e eVar, ix3.c4 c4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376897d = eVar;
        this.f376898e = c4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix3.a4(this.f376897d, this.f376898e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ix3.a4 a4Var = (ix3.a4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        hx3.e eVar = this.f376897d;
        boolean z17 = !r26.n0.N(eVar.f367194b);
        ix3.c4 c4Var = this.f376898e;
        if (z17) {
            for (r45.dp5 dp5Var : c4Var.f376913e) {
                java.lang.String m75945x2fec8307 = dp5Var.m75945x2fec8307(1);
                boolean z18 = false;
                if (m75945x2fec8307 != null && r26.n0.B(m75945x2fec8307, eVar.f367194b, true)) {
                    z18 = true;
                }
                if (z18) {
                    linkedList.add(dp5Var);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = c4Var.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new hx3.c(linkedList));
        }
        return jz5.f0.f384359a;
    }
}
