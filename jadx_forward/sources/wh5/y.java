package wh5;

/* loaded from: classes12.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f527641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f527642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wh5.v f527643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l70.d f527644g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wh5.g0 g0Var, l70.d dVar, wh5.v vVar, l70.d dVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527641d = g0Var;
        this.f527642e = dVar;
        this.f527643f = vVar;
        this.f527644g = dVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wh5.y(this.f527641d, this.f527642e, this.f527643f, this.f527644g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wh5.y yVar = (wh5.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.HashSet d76 = this.f527641d.d7();
        wh5.g0 g0Var = this.f527641d;
        l70.d dVar = this.f527642e;
        wh5.v vVar = this.f527643f;
        l70.d dVar2 = this.f527644g;
        synchronized (d76) {
            if (g0Var.d7().add(dVar.f398337e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar.f398337e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatLiveStateManager", "cancel download image, mediaInfo id: " + vVar.mo2110x5db1b11() + " level: " + vVar.f527631c + " downloadMediaId: " + dVar.f398337e);
            }
            if (g0Var.d7().add(dVar2.f398337e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar2.f398337e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatLiveStateManager", "cancel download video, mediaInfo id: " + vVar.mo2110x5db1b11() + " level: " + vVar.f527631c + " downloadMediaId: " + dVar2.f398337e);
            }
        }
        return jz5.f0.f384359a;
    }
}
