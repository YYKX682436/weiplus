package kp;

/* loaded from: classes13.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392390d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f392392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f392393g;

    /* renamed from: h, reason: collision with root package name */
    public int f392394h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392395i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.WifiManager f392396m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392397n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392398o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kp.i1 i1Var, android.net.wifi.WifiManager wifiManager, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392395i = i1Var;
        this.f392396m = wifiManager;
        this.f392397n = str;
        this.f392398o = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.y(this.f392395i, this.f392396m, this.f392397n, this.f392398o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392394h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kp.i1 i1Var = this.f392395i;
            this.f392390d = i1Var;
            android.net.wifi.WifiManager wifiManager = this.f392396m;
            this.f392391e = wifiManager;
            java.lang.String str = this.f392397n;
            this.f392392f = str;
            java.lang.String str2 = this.f392398o;
            this.f392393g = str2;
            this.f392394h = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            i1Var.f392303n = new kp.w(wifiManager, str, i1Var, rVar);
            rVar.m(new kp.x(i1Var));
            if (!wifiManager.isWifiEnabled()) {
                wifiManager.setWifiEnabled(true);
            }
            android.net.wifi.WifiConfiguration wifiConfiguration = new android.net.wifi.WifiConfiguration();
            wifiConfiguration.SSID = str;
            wifiConfiguration.preSharedKey = "\"" + str2 + '\"';
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedProtocols.set(1);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.priority = 100;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "connecting to wifi:" + str);
            int addNetwork = wifiManager.addNetwork(wifiConfiguration);
            if (addNetwork == -1) {
                java.util.List list = (java.util.List) yj0.a.j(wifiManager, "com/tencent/mm/connection/near/WiFiDirectService$connectLegacyWifi$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
                android.net.wifi.WifiConfiguration wifiConfiguration2 = null;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.net.wifi.WifiConfiguration) next).SSID, str)) {
                            wifiConfiguration2 = next;
                            break;
                        }
                    }
                    wifiConfiguration2 = wifiConfiguration2;
                }
                if (wifiConfiguration2 != null) {
                    addNetwork = wifiConfiguration2.networkId;
                }
            }
            if (addNetwork != -1) {
                wifiManager.disconnect();
                wifiManager.enableNetwork(addNetwork, true);
                wifiManager.reconnect();
            } else if (rVar.n()) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: netId not found")));
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
