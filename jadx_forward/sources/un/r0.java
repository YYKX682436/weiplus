package un;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.s0 f510857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(un.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510857d = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new un.r0(this.f510857d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        un.r0 r0Var = (un.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        un.s0 s0Var = this.f510857d;
        java.lang.String stringExtra = s0Var.m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(stringExtra);
        p75.n0 n0Var = dm.c8.f317695y0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.c8.f317692l1);
        p75.m c17 = dm.c8.A1.j(stringExtra).c(dm.c8.f317697z1.o(java.lang.Long.valueOf(m07)));
        p75.i0 g17 = dm.c8.f317695y0.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        if (g17.a().h(gm0.j1.u().f354686f) && (O6 = s0Var.O6()) != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new un.q0(s0Var, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
