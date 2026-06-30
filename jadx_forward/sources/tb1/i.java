package tb1;

/* loaded from: classes7.dex */
public class i implements bi3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498432a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        this.f498432a = c12042x78b65610;
    }

    @Override // bi3.e
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498432a;
        c12042x78b65610.Q = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "InitDoneCallback");
        tb1.c0 c0Var = new tb1.c0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cameraId", java.lang.Integer.valueOf(c12042x78b65610.f161706i));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
        float[] m66783xa63a1d3c = c16529x1336da53 != null ? c16529x1336da53.m66783xa63a1d3c() : null;
        if (m66783xa63a1d3c != null && m66783xa63a1d3c.length > 0) {
            c12042x78b65610.R = m66783xa63a1d3c[m66783xa63a1d3c.length - 1];
        }
        hashMap.put("maxZoom", java.lang.Float.valueOf(c12042x78b65610.R));
        c0Var.f163907f = new org.json.JSONObject(hashMap).toString();
        c12042x78b65610.f161702e.i(c0Var, null);
        java.util.List list = c12042x78b65610.W;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            ((java.util.ArrayList) c12042x78b65610.W).clear();
        }
        tb1.z zVar = c12042x78b65610.D;
        if (zVar != null) {
            zVar.mo166108xc39adf8f();
        }
    }
}
