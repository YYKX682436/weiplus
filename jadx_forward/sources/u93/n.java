package u93;

/* loaded from: classes15.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f507361g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f507362h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final m33.o1 f507363i = new u93.m(this);

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("fail: invalid_data");
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("localIds");
        this.f507361g = jSONObject.optString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e);
        int optInt = jSONObject.optInt("postType");
        this.f507362h = optInt;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiUploadGameMediaFile", "LiteAppJsApiUploadGameMediaFile identifier:%s postType:%d", this.f507361g, java.lang.Integer.valueOf(optInt));
        if (this.f507362h == 0 || optJSONArray == null || optJSONArray.length() == 0) {
            this.f224976f.a("fail: postType or localIds params error");
            return;
        }
        m33.p1 p1Var = (m33.p1) i95.n0.c(m33.p1.class);
        int i17 = this.f507362h;
        m33.o1 o1Var = this.f507363i;
        ((i53.o0) p1Var).getClass();
        i53.v0 v0Var = new i53.v0();
        java.util.LinkedList b17 = r53.f.b(optJSONArray);
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "localIds is null or empty");
        } else if (i17 == 2 || i17 == 1) {
            v0Var.f370286e = o1Var;
            if (i17 == 2) {
                v0Var.f370282a.add((java.lang.String) b17.get(0));
                if (b17.size() > 1) {
                    v0Var.f370290i = (java.lang.String) b17.get(1);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Haowan.GameHaowanUploadTask", "postType == 2 but no thumbnail localId!");
                }
            } else {
                v0Var.f370282a.addAll(b17);
            }
            ((ku5.t0) ku5.t0.f394148d).g(new i53.r0(v0Var, i17));
            z18 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameHaowanUploadTask", "unrecognized posttype:%d", java.lang.Integer.valueOf(i17));
        }
        if (z18) {
            return;
        }
        this.f224976f.a("fail: upload fail before real upload");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
