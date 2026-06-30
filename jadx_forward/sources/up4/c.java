package up4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f511391d;

    /* renamed from: e, reason: collision with root package name */
    public int f511392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f511393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f511394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f511395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f511396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, boolean z17, int i18, com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f511393f = i17;
        this.f511394g = z17;
        this.f511395h = i18;
        this.f511396i = textureViewSurfaceTextureListenerC22778x581fb68;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new up4.c(this.f511393f, this.f511394g, this.f511395h, this.f511396i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((up4.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f511392e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playFakeVideo >> snsLocalId: ");
            int i18 = this.f511393f;
            sb6.append(i18);
            sb6.append(", isMute: ");
            sb6.append(this.f511394g);
            sb6.append(", snsCreateTime: ");
            int i19 = this.f511395h;
            sb6.append(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", sb6.toString());
            dm.q0 c17 = zp4.e.f556487a.c(i18, i19);
            if ((c17 != null ? c17.f68001x3f4822c8 : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: false, action: 1");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
                c6893x57fb842b.f142084d = 1;
                c6893x57fb842b.f142093m = 2;
                c6893x57fb842b.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> snsLocalId: " + i18 + " no in db");
                return new java.lang.Long(-1L);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            up4.b bVar = new up4.b(g0Var2, c17, this.f511396i, this.f511394g, null);
            this.f511391d = g0Var2;
            this.f511392e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, bVar, this) == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.g0) this.f511391d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> id = " + g0Var.f391654d);
        return new java.lang.Long(g0Var.f391654d);
    }
}
