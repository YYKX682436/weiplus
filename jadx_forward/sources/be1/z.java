package be1;

/* loaded from: classes7.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4242x366c91de = 39;

    /* renamed from: NAME */
    public static final java.lang.String f4243x24728b = "getNetworkType";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f101074g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.reflect.Method f101075h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f101076i = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f101077m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final be1.x f101078n = new be1.x(this, null);

    public static be1.y E(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        be1.y yVar = be1.y.Unknown;
        try {
            connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetNetworkType", e17, "", new java.lang.Object[0]);
        }
        if (connectivityManager == null) {
            return yVar;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return be1.y.Wifi;
            }
            if (activeNetworkInfo.getSubtype() != 2 && activeNetworkInfo.getSubtype() != 1 && activeNetworkInfo.getSubtype() != 4) {
                if (activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13) {
                    return be1.y.Mobile_3g;
                }
                if (activeNetworkInfo.getSubtype() >= 13 && activeNetworkInfo.getSubtype() < 20) {
                    return be1.y.Mobile_4g;
                }
                if (activeNetworkInfo.getSubtype() >= 20) {
                    return be1.y.Mobile_5g;
                }
                return yVar;
            }
            return be1.y.Mobile_2g;
        }
        return be1.y.None;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.y F = F(lVar);
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        java.lang.String property2 = java.lang.System.getProperty("https.proxyHost");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "invoke appId:%s, networkType:%s,httpProxyHost:%s,httpsProxyHost:%s", lVar.mo48798x74292566(), F, property, property2);
        hashMap.put("networkType", F.f101073d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(property2)) {
            hashMap.put("hasSystemProxy", java.lang.Boolean.FALSE);
        } else {
            hashMap.put("hasSystemProxy", java.lang.Boolean.TRUE);
        }
        java.util.Map D = D();
        if (D != null) {
            hashMap.putAll(D);
        }
        switch (F) {
            case None:
            case Unknown:
                lVar.a(i17, p("ok", hashMap));
                return;
            case Mobile_2g:
            case Mobile_3g:
            case Mobile_4g:
            case Mobile_5g:
                be1.s sVar = new be1.s(this, hashMap, lVar, i17);
                if (!this.f101077m.getAndSet(true)) {
                    ((ku5.t0) ku5.t0.f394148d).B(new be1.u(this, lVar));
                }
                be1.x xVar = this.f101078n;
                synchronized (xVar) {
                    z17 = xVar.f101062b;
                }
                if (z17) {
                    sVar.a(this.f101076i);
                    return;
                }
                be1.x xVar2 = this.f101078n;
                synchronized (xVar2) {
                    if (xVar2.f101063c == null) {
                        xVar2.f101063c = new java.util.ArrayList();
                    }
                    xVar2.f101063c.add(sVar);
                }
                return;
            case Wifi:
                be1.t tVar = new be1.t(this, hashMap, lVar, i17);
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    tVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.h());
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetNetworkType", "getWifiSignalStrength, getConnectionInfo is invalid");
                    tVar.a(Integer.MAX_VALUE);
                    return;
                }
            default:
                return;
        }
    }

    public final int C(android.telephony.SignalStrength signalStrength) {
        int cdmaDbm;
        if (signalStrength.isGsm()) {
            int gsmSignalStrength = signalStrength.getGsmSignalStrength();
            cdmaDbm = -1;
            if (gsmSignalStrength == 99) {
                gsmSignalStrength = -1;
            }
            if (gsmSignalStrength != -1) {
                cdmaDbm = (gsmSignalStrength * 2) - 113;
            }
        } else {
            cdmaDbm = signalStrength.getCdmaDbm();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "getDbmFallback, dBm: " + cdmaDbm);
        return cdmaDbm;
    }

    public java.util.Map D() {
        return null;
    }

    public be1.y F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        return E(lVar.mo50352x76847179());
    }
}
