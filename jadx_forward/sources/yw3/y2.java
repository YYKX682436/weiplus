package yw3;

/* loaded from: classes11.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f548467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548467d = repairerImageLoaderDemoUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.y2(this.f548467d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.y2 y2Var = (yw3.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        g95.d dVar = g95.e.f351334a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f548467d;
        java.lang.String tag = repairerImageLoaderDemoUI.d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        g17.f434189c = tag;
        g17.f434190d = d17;
        g17.f434192f = dVar.h();
        p75.l0 a18 = g17.a();
        l75.k0 k0Var = gm0.j1.u().f354686f;
        if (!k0Var.mo123783xb9a70294()) {
            k0Var = null;
        }
        java.util.List l17 = a18.l(k0Var);
        java.lang.String str = (java.lang.String) kz5.n0.a0(l17, new java.util.Random().nextInt(((java.util.ArrayList) l17).size()));
        if (str != null) {
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).mo141623x754a37bb();
            if (d3Var.f335766e == null) {
                d3Var.f335766e = (android.widget.ImageView) d3Var.f335762a.findViewById(com.p314xaae8f345.mm.R.id.a9x);
            }
            android.widget.ImageView imageView = d3Var.f335766e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getAvatarContentIv(...)");
            ((hn1.s) b0Var).Ai(imageView, str);
        }
        return jz5.f0.f384359a;
    }
}
