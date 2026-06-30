package nd1;

/* loaded from: classes.dex */
public final class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f417960f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, nd1.c0 c0Var) {
        this.f417958d = yVar;
        this.f417959e = i17;
        this.f417960f = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d;
        nd1.c0 c0Var = this.f417960f;
        int i17 = this.f417959e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417958d;
        if (!z17) {
            c0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty("fail: ipcInvoke.") ? "fail:internal error" : "fail: ipcInvoke.";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, c0Var.u(str, jSONObject));
            return;
        }
        c0Var.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, c0Var.u(str3, jSONObject2));
    }
}
