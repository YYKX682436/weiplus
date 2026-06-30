package be1;

/* loaded from: classes7.dex */
public class w extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be1.x f19525a;

    public w(be1.x xVar) {
        this.f19525a = xVar;
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        int C;
        super.onSignalStrengthsChanged(signalStrength);
        be1.z zVar = this.f19525a.f19531d;
        if (!zVar.f19541g.getAndSet(true)) {
            try {
                zVar.f19542h = android.telephony.SignalStrength.class.getMethod("getDbm", new java.lang.Class[0]);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetNetworkType", "getGetDbmMethod, reflect getDbm fail since " + e17);
                zVar.f19542h = null;
            }
        }
        java.lang.reflect.Method method = zVar.f19542h;
        if (method == null) {
            C = zVar.C(signalStrength);
        } else {
            try {
                C = ((java.lang.Integer) method.invoke(signalStrength, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetNetworkType", "getDbm, reflect getDbm fail since " + e18);
                C = zVar.C(signalStrength);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "onSignalStrengthsChanged, dbm: " + C);
        this.f19525a.f19531d.f19543i = C;
        synchronized (this.f19525a) {
            be1.x xVar = this.f19525a;
            if (!xVar.f19529b) {
                xVar.f19529b = true;
                java.util.List list = xVar.f19530c;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((be1.v) it.next()).a(C);
                    }
                    this.f19525a.f19530c.clear();
                    this.f19525a.f19530c = null;
                }
            }
        }
    }
}
