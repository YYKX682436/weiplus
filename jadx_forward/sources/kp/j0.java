package kp;

/* loaded from: classes13.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392311e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f392312f;

    /* renamed from: g, reason: collision with root package name */
    public int f392313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pConfig f392315i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pConfig wifiP2pConfig, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392314h = i1Var;
        this.f392315i = wifiP2pConfig;
        this.f392316m = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.j0(this.f392314h, this.f392315i, this.f392316m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392313g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kp.i1 i1Var = this.f392314h;
            this.f392310d = i1Var;
            android.net.wifi.p2p.WifiP2pConfig wifiP2pConfig = this.f392315i;
            this.f392311e = wifiP2pConfig;
            java.lang.String str = this.f392316m;
            this.f392312f = str;
            this.f392313g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            android.net.wifi.p2p.WifiP2pManager.Channel channel = i1Var.f392298f;
            if (channel != null) {
                i1Var.f392297e.connect(channel, wifiP2pConfig, new kp.i0(str, rVar, i1Var));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: Channel is null")));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
