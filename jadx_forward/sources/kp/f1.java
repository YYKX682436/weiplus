package kp;

/* loaded from: classes13.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f392270f;

    /* renamed from: g, reason: collision with root package name */
    public int f392271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager f392272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f392273i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.net.wifi.p2p.WifiP2pManager wifiP2pManager, android.net.wifi.p2p.WifiP2pManager.Channel channel, kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392272h = wifiP2pManager;
        this.f392273i = channel;
        this.f392274m = i1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.f1(this.f392272h, this.f392273i, this.f392274m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392271g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.net.wifi.p2p.WifiP2pManager wifiP2pManager = this.f392272h;
            this.f392268d = wifiP2pManager;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f392273i;
            this.f392269e = channel;
            kp.i1 i1Var = this.f392274m;
            this.f392270f = i1Var;
            this.f392271g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            try {
                wifiP2pManager.requestDeviceInfo(channel, new kp.e1(i1Var, rVar));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WiFiDirectService", e17, "fetchLocalP2pDeviceNameWithRetry error", new java.lang.Object[0]);
                if (rVar.n()) {
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                }
            }
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
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
