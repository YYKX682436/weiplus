package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class lh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f280967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh f280969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f280970g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh nhVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f280968e = f9Var;
        this.f280969f = nhVar;
        this.f280970g = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lh(this.f280968e, this.f280969f, this.f280970g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lh) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f280967d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280968e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
            this.f280967d = 1;
            ((ot.g) g0Var).getClass();
            obj = pu.f0.f439833m.a().T6(c16564xb55e1d5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessBoxComponentKt", "doFileRevoke() called cancelResult:" + booleanValue);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh nhVar = this.f280969f;
        if (booleanValue) {
            boolean b17 = w11.c1.f523522a.b(f9Var, true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f280970g;
            if (b17) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah) ((sb5.e1) nhVar.f281125a.f542241c.a(sb5.e1.class))).m0(f9Var, nhVar.f281125a.x());
                cd0.c0.b(1, f9Var, 1);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ih ihVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ih(u3Var, nhVar, null);
                this.f280967d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, ihVar, this) == aVar) {
                    return aVar;
                }
            } else {
                p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jh jhVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jh(f9Var, nhVar, u3Var, null);
                this.f280967d = 3;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, jhVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var3 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kh khVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kh(nhVar, f9Var, null);
            this.f280967d = 4;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var3, khVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
