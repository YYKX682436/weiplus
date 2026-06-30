package yw3;

/* loaded from: classes9.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f548474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f548475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548474d = repairerImageLoaderDemoUI;
        this.f548475e = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.z2(this.f548474d, this.f548475e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw3.z2 z2Var = (yw3.z2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        em.d3 d3Var = (em.d3) ((jz5.n) this.f548474d.e).mo141623x754a37bb();
        if (d3Var.f335763b == null) {
            d3Var.f335763b = (android.widget.ImageView) d3Var.f335762a.findViewById(com.p314xaae8f345.mm.R.id.rvt);
        }
        d3Var.f335763b.setImageBitmap(this.f548475e);
        return jz5.f0.f384359a;
    }
}
