package kp;

/* loaded from: classes13.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f392349f;

    /* renamed from: g, reason: collision with root package name */
    public int f392350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f392353m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str, kp.i1 i1Var, android.net.wifi.p2p.WifiP2pManager.Channel channel, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392351h = str;
        this.f392352i = i1Var;
        this.f392353m = channel;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.q0(this.f392351h, this.f392352i, this.f392353m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392350g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f392351h;
            this.f392347d = str;
            kp.i1 i1Var = this.f392352i;
            this.f392348e = i1Var;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f392353m;
            this.f392349f = channel;
            this.f392350g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            kp.p0 p0Var = new kp.p0(i1Var, rVar);
            if (str != null) {
                android.net.wifi.p2p.WifiP2pConfig.Builder builder = new android.net.wifi.p2p.WifiP2pConfig.Builder();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DIRECT-WX-");
                i1Var.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                int length = str.length();
                int i18 = 0;
                for (int i19 = 0; i19 < length; i19++) {
                    char charAt = str.charAt(i19);
                    byte[] bytes = java.lang.String.valueOf(charAt).getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    i18 += bytes.length;
                    if (i18 > 18) {
                        break;
                    }
                    sb7.append(charAt);
                }
                java.lang.String sb8 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                sb6.append(sb8);
                sb6.append('-');
                sb6.append(kp.i1.wi(i1Var, 3));
                android.net.wifi.p2p.WifiP2pConfig build = builder.setNetworkName(sb6.toString()).setPassphrase(kp.i1.wi(i1Var, 8)).build();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "createGroup deviceName=".concat(str));
                i1Var.f392297e.createGroup(channel, build, p0Var);
            } else {
                i1Var.f392297e.createGroup(channel, p0Var);
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
