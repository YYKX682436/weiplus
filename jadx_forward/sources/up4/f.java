package up4;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f511402d;

    /* renamed from: e, reason: collision with root package name */
    public int f511403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f511405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f511404f = str;
        this.f511405g = textureViewSurfaceTextureListenerC22778x581fb68;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new up4.f(this.f511404f, this.f511405g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f511403e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playFakeVideo >> workTagId: ");
            java.lang.String str = this.f511404f;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", sb6.toString());
            dm.q0 d17 = zp4.e.f556487a.d(str);
            if ((d17 != null ? d17.f68001x3f4822c8 : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: false, action: 2");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
                c6893x57fb842b.f142084d = 2;
                c6893x57fb842b.f142093m = 2;
                c6893x57fb842b.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> workTagId: " + str + " no in db");
                return new java.lang.Long(-1L);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            up4.e eVar = new up4.e(g0Var2, d17, this.f511405g, null);
            this.f511402d = g0Var2;
            this.f511403e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, eVar, this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.g0) this.f511402d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> id = " + g0Var.f391654d);
        return new java.lang.Long(g0Var.f391654d);
    }
}
