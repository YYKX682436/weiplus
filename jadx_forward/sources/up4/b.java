package up4;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f511386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f511388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f511389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f511390h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, dm.q0 q0Var, com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f511387e = g0Var;
        this.f511388f = q0Var;
        this.f511389g = textureViewSurfaceTextureListenerC22778x581fb68;
        this.f511390h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new up4.b(this.f511387e, this.f511388f, this.f511389g, this.f511390h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f511386d;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f511387e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: true, action: 1");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
            c6893x57fb842b.f142084d = 1;
            c6893x57fb842b.f142093m = 1;
            c6893x57fb842b.k();
            up4.g gVar = up4.g.f511406a;
            byte[] field_composition_info = this.f511388f.f68001x3f4822c8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_composition_info, "field_composition_info");
            g0Var.f391654d = gVar.a(field_composition_info, this.f511389g, this.f511390h);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            up4.a aVar2 = new up4.a(g0Var, null);
            this.f511386d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        up4.h hVar = (up4.h) up4.g.f511407b.get(new java.lang.Long(g0Var.f391654d));
        if (hVar == null) {
            return null;
        }
        hVar.f511408a.o(hVar.f511411d.e());
        return jz5.f0.f384359a;
    }
}
