package xc5;

/* loaded from: classes12.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f534945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f534946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.w f534948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l70.d f534949h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xc5.k1 k1Var, l70.d dVar, mf3.k kVar, mf3.w wVar, l70.d dVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534945d = k1Var;
        this.f534946e = dVar;
        this.f534947f = kVar;
        this.f534948g = wVar;
        this.f534949h = dVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.d1(this.f534945d, this.f534946e, this.f534947f, this.f534948g, this.f534949h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.d1 d1Var = (xc5.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.HashSet g76 = this.f534945d.g7();
        xc5.k1 k1Var = this.f534945d;
        l70.d dVar = this.f534946e;
        mf3.k kVar = this.f534947f;
        mf3.w wVar = this.f534948g;
        l70.d dVar2 = this.f534949h;
        synchronized (g76) {
            if (k1Var.g7().add(dVar.f398337e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar.f398337e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel download image. mediaId=" + kVar.mo2110x5db1b11() + " level=" + wVar);
            }
            if (k1Var.g7().add(dVar2.f398337e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar2.f398337e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel download video. mediaId=" + kVar.mo2110x5db1b11() + " level=" + wVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
