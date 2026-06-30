package yw3;

/* loaded from: classes9.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.k f548459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f548460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(gk0.k kVar, com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548459d = kVar;
        this.f548460e = repairerImageLoaderDemoUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.x2(this.f548459d, this.f548460e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.x2 x2Var = (yw3.x2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        byte[] bytes = "https://gtimg.wechatpay.cn/pay/img/home/solution/1.jpg".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String d17 = by5.x.d(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        y01.a aVar2 = new y01.a(d17);
        aVar2.f540106b = "https://gtimg.wechatpay.cn/pay/img/home/solution/1.jpg";
        java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(this.f548459d, aVar2);
        i95.m c17 = i95.n0.c(gk0.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        gk0.n0 n0Var = (gk0.n0) c17;
        gk0.k kVar = this.f548459d;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f548460e;
        em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).mo141623x754a37bb();
        if (d3Var.f335764c == null) {
            d3Var.f335764c = (android.widget.ImageView) d3Var.f335762a.findViewById(com.p314xaae8f345.mm.R.id.h5e);
        }
        g75.z x66 = gk0.n0.x6(n0Var, wi6, kVar, d3Var.f335764c, null, 8, null);
        x66.l("KeyCdnParams", aVar2);
        gk0.j.b((gk0.j) ((jz5.n) repairerImageLoaderDemoUI.g).mo141623x754a37bb(), x66, null, 2, null);
        return jz5.f0.f384359a;
    }
}
