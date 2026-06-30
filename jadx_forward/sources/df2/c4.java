package df2;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f311390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(df2.d4 d4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311390d = d4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.c4(this.f311390d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.c4 c4Var = (df2.c4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yg2.b m57691xa0fa63f9;
        yg2.b m57691xa0fa63f92;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int h07 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));
        df2.d4 d4Var = this.f311390d;
        xt2.r5 r5Var = d4Var.f311472n;
        if (r5Var == null) {
            r5Var = new xt2.r5(d4Var.O6(), d4Var.getStore().getLiveRoomData(), h07);
        }
        d4Var.f311472n = r5Var;
        xt2.r5 r5Var2 = d4Var.f311472n;
        if (r5Var2 != null) {
            cm2.m0 m0Var = (cm2.m0) d4Var.f311473o.mo3195x754a37bb();
            df2.a4 a4Var = new df2.a4(d4Var);
            r5Var2.w();
            r5Var2.z();
            r5Var2.f538530p = m0Var;
            r5Var2.f538531q = a4Var;
            if (((java.util.ArrayList) r5Var2.f538529o).isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null && (m57691xa0fa63f92 = k0Var.m57691xa0fa63f9()) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f92, null, null, new xt2.p5(r5Var2, null), 3, null);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = dk2.ef.f314913e;
                if (k0Var2 != null && (m57691xa0fa63f9 = k0Var2.m57691xa0fa63f9()) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f9, null, null, new xt2.q5(r5Var2, null), 3, null);
                }
            }
        }
        xt2.r5 r5Var3 = d4Var.f311472n;
        if (r5Var3 != null) {
            r5Var3.f538532r = new df2.b4(d4Var);
        }
        return jz5.f0.f384359a;
    }
}
