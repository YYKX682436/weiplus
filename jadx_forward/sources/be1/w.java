package be1;

/* loaded from: classes7.dex */
public class w extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be1.x f101058a;

    public w(be1.x xVar) {
        this.f101058a = xVar;
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        int C;
        super.onSignalStrengthsChanged(signalStrength);
        be1.z zVar = this.f101058a.f101064d;
        if (!zVar.f101074g.getAndSet(true)) {
            try {
                zVar.f101075h = android.telephony.SignalStrength.class.getMethod("getDbm", new java.lang.Class[0]);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetNetworkType", "getGetDbmMethod, reflect getDbm fail since " + e17);
                zVar.f101075h = null;
            }
        }
        java.lang.reflect.Method method = zVar.f101075h;
        if (method == null) {
            C = zVar.C(signalStrength);
        } else {
            try {
                C = ((java.lang.Integer) method.invoke(signalStrength, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetNetworkType", "getDbm, reflect getDbm fail since " + e18);
                C = zVar.C(signalStrength);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "onSignalStrengthsChanged, dbm: " + C);
        this.f101058a.f101064d.f101076i = C;
        synchronized (this.f101058a) {
            be1.x xVar = this.f101058a;
            if (!xVar.f101062b) {
                xVar.f101062b = true;
                java.util.List list = xVar.f101063c;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((be1.v) it.next()).a(C);
                    }
                    this.f101058a.f101063c.clear();
                    this.f101058a.f101063c = null;
                }
            }
        }
    }
}
