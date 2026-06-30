package xc1;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f534564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f534565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc1.l f534566f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, xc1.l lVar) {
        this.f534564d = yVar;
        this.f534565e = i17;
        this.f534566f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f534564d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null) {
            mo32091x9a3f0ba2.S();
        }
        xc1.l lVar = this.f534566f;
        lVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(this.f534565e, lVar.u(str, jSONObject));
    }
}
