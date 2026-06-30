package tb1;

/* loaded from: classes7.dex */
public class h implements bi3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498431a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        this.f498431a = c12042x78b65610;
    }

    @Override // bi3.f
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498431a;
        hashMap.put("cameraId", java.lang.Integer.valueOf(c12042x78b65610.f161706i));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        tb1.d0 d0Var = new tb1.d0();
        d0Var.f163907f = jSONObject;
        c12042x78b65610.f161702e.i(d0Var, null);
    }
}
