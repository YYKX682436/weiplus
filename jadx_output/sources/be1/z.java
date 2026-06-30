package be1;

/* loaded from: classes7.dex */
public class z extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 39;
    public static final java.lang.String NAME = "getNetworkType";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f19541g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.reflect.Method f19542h = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f19543i = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f19544m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final be1.x f19545n = new be1.x(this, null);

    public static be1.y E(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        be1.y yVar = be1.y.Unknown;
        try {
            connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetNetworkType", e17, "", new java.lang.Object[0]);
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

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.y F = F(lVar);
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        java.lang.String property2 = java.lang.System.getProperty("https.proxyHost");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "invoke appId:%s, networkType:%s,httpProxyHost:%s,httpsProxyHost:%s", lVar.getAppId(), F, property, property2);
        hashMap.put("networkType", F.f19540d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(property) && com.tencent.mm.sdk.platformtools.t8.K0(property2)) {
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
                if (!this.f19544m.getAndSet(true)) {
                    ((ku5.t0) ku5.t0.f312615d).B(new be1.u(this, lVar));
                }
                be1.x xVar = this.f19545n;
                synchronized (xVar) {
                    z17 = xVar.f19529b;
                }
                if (z17) {
                    sVar.a(this.f19543i);
                    return;
                }
                be1.x xVar2 = this.f19545n;
                synchronized (xVar2) {
                    if (xVar2.f19530c == null) {
                        xVar2.f19530c = new java.util.ArrayList();
                    }
                    xVar2.f19530c.add(sVar);
                }
                return;
            case Wifi:
                be1.t tVar = new be1.t(this, hashMap, lVar, i17);
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    tVar.a(com.tencent.mm.sdk.platformtools.v0.f193027a.h());
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetNetworkType", "getWifiSignalStrength, getConnectionInfo is invalid");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getDbmFallback, dBm: " + cdmaDbm);
        return cdmaDbm;
    }

    public java.util.Map D() {
        return null;
    }

    public be1.y F(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return E(lVar.getContext());
    }
}
