package kp;

/* loaded from: classes13.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.WifiManager f392380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f392383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.net.wifi.WifiManager wifiManager, java.lang.String str, kp.i1 i1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f392380d = wifiManager;
        this.f392381e = str;
        this.f392382f = i1Var;
        this.f392383g = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        p3325xe03a0797.p3326xc267989b.q qVar = this.f392383g;
        kp.i1 i1Var = this.f392382f;
        if (booleanValue) {
            android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(this.f392380d, "com/tencent/mm/connection/near/WiFiDirectService$connectLegacyWifi$2$1$1", "invoke", "(Z)V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wifiInfo != null ? wifiInfo.getSSID() : null, this.f392381e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "connectToGroupCallback: connect success");
                i1Var.f392303n = null;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(true, null, null, 6, null)));
            }
        } else {
            i1Var.f392303n = null;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new gz.a(false, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR, "connectToGroup: connectToGroupCallback: connect failed")));
        }
        return jz5.f0.f384359a;
    }
}
