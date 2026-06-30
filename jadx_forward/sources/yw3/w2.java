package yw3;

/* loaded from: classes9.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f548450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk0.k f548451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, gk0.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548450d = repairerImageLoaderDemoUI;
        this.f548451e = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.w2(this.f548450d, this.f548451e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.w2 w2Var = (yw3.w2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p75.i0 i17 = dm.c8.f317695y0.i();
        i17.f434190d = dm.c8.f317693p1.i(new java.lang.Integer(3)).c(dm.c8.f317696y1.i(new java.lang.Integer(0)));
        i17.e(dm.c8.f317697z1.u());
        i17.c(1, 0);
        p75.l0 a17 = i17.a();
        l75.k0 k0Var = gm0.j1.u().f354686f;
        if (!k0Var.mo123783xb9a70294()) {
            k0Var = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) a17.o(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9.class);
        if (f9Var != null) {
            java.lang.String r17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? c01.w9.r(f9Var.j()) : f9Var.j();
            j15.d dVar = new j15.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            dVar.m126728xdc93280d(r17);
            java.lang.String str = "RepairerDragComponentDemoUI_" + f9Var.m124847x74d37ac6() + "_mid";
            com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f548450d;
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) repairerImageLoaderDemoUI.i).mo141623x754a37bb(), str).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            y01.a aVar2 = new y01.a(str);
            java.lang.String y17 = dVar.o().y();
            if (y17 == null || r26.n0.N(y17)) {
                java.lang.String k17 = dVar.o().k();
                if (k17 == null) {
                    k17 = "";
                }
                aVar2.f540106b = k17;
                java.lang.String m140203x10626226 = dVar.o().m140203x10626226();
                if (m140203x10626226 == null) {
                    m140203x10626226 = "";
                }
                aVar2.f540107c = m140203x10626226;
                java.lang.String m140205xb5885648 = dVar.o().m140205xb5885648();
                aVar2.f540110f = m140205xb5885648 != null ? m140205xb5885648 : "";
                aVar2.f540111g = dVar.o().m140204x23255ddc();
                aVar2.f540108d = 2;
            } else {
                java.lang.String J2 = dVar.o().J();
                if (J2 == null) {
                    J2 = "";
                }
                aVar2.f540106b = J2;
                java.lang.String m140203x106262262 = dVar.o().m140203x10626226();
                if (m140203x106262262 == null) {
                    m140203x106262262 = "";
                }
                aVar2.f540107c = m140203x106262262;
                aVar2.f540108d = 19;
                java.lang.String m140205xb58856482 = dVar.o().m140205xb5885648();
                aVar2.f540110f = m140205xb58856482 != null ? m140205xb58856482 : "";
                aVar2.f540111g = dVar.o().C();
            }
            aVar2.f540109e = o17;
            rx.h hVar = (rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class));
            gk0.k kVar = this.f548451e;
            java.lang.String wi6 = hVar.wi(kVar, aVar2);
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).mo141623x754a37bb();
            if (d3Var.f335765d == null) {
                d3Var.f335765d = (android.widget.ImageView) d3Var.f335762a.findViewById(com.p314xaae8f345.mm.R.id.bdm);
            }
            g75.z Ui = ((h83.g) n0Var).Ui(wi6, kVar, d3Var.f335765d, o17);
            Ui.l("KeyCdnParams", aVar2);
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a U6 = repairerImageLoaderDemoUI.U6();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(U6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yw3.v2(repairerImageLoaderDemoUI, Ui, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
