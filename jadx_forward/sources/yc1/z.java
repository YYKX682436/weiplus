package yc1;

/* loaded from: classes15.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77533x366c91de = 529;

    /* renamed from: NAME */
    public static final java.lang.String f77534x24728b = "operateLocalServicesScan";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f542356g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.net.wifi.WifiManager.MulticastLock f542357h = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "action = " + optString);
        boolean z17 = true;
        if (!android.text.TextUtils.equals("start", optString)) {
            if (!android.text.TextUtils.equals("stop", optString)) {
                lVar.a(i17, o("fail:invalid param"));
                return;
            }
            synchronized (this.f542356g) {
                for (yc1.y yVar : ((java.util.concurrent.ConcurrentHashMap) this.f542356g).values()) {
                    yVar.f542354c.set(i17);
                    uh1.o1.INSTANCE.a(yVar);
                    z17 = false;
                }
                if (z17) {
                    lVar.a(i17, o("fail:task not found"));
                }
                android.net.wifi.WifiManager.MulticastLock multicastLock = this.f542357h;
                if (multicastLock != null) {
                    try {
                        if (multicastLock.isHeld()) {
                            multicastLock.release();
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateLocalServicesScan", e17.getMessage());
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) this.f542356g).clear();
            }
            return;
        }
        java.lang.String optString2 = jSONObject.optString("serviceType");
        if (android.text.TextUtils.isEmpty(optString2)) {
            lVar.a(i17, o("fail:invalid param"));
            return;
        }
        synchronized (this.f542356g) {
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f542356g).keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((java.lang.String) it.next()).contains(lVar.mo48798x74292566())) {
                        lVar.a(i17, o("fail:scan task already exist"));
                        break;
                    }
                } else {
                    android.net.wifi.WifiManager.MulticastLock createMulticastLock = ((android.net.wifi.WifiManager) lVar.mo50352x76847179().getApplicationContext().getSystemService("wifi")).createMulticastLock("MicroMsg.JsApiOperateLocalServicesScan");
                    this.f542357h = createMulticastLock;
                    if (createMulticastLock != null) {
                        createMulticastLock.acquire();
                    }
                    yc1.y yVar2 = new yc1.y(this, lVar);
                    yVar2.f542353b.set(i17);
                    ((java.util.concurrent.ConcurrentHashMap) this.f542356g).put(C(lVar, optString2), yVar2);
                    uh1.o1 o1Var = uh1.o1.INSTANCE;
                    o1Var.getClass();
                    android.net.nsd.NsdManager nsdManager = (android.net.nsd.NsdManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("servicediscovery");
                    uh1.i1 i1Var = new uh1.i1(o1Var, yVar2);
                    ((java.util.concurrent.ConcurrentHashMap) o1Var.f509382d).put(yVar2, i1Var);
                    nsdManager.discoverServices(optString2, 1, i1Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new yc1.w(this, lVar, optString2, yVar2), 30000L);
                }
            }
        }
    }

    public final java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        return lVar.mo48798x74292566() + "#" + str;
    }
}
