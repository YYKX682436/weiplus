package mc1;

/* renamed from: mc1.l$$b */
/* loaded from: classes7.dex */
public final /* synthetic */ class C29140x31a3f6 implements h63.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc1.l f407145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f407147c;

    public /* synthetic */ C29140x31a3f6(mc1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407145a = lVar;
        this.f407146b = c0Var;
        this.f407147c = i17;
    }

    public final void a(int i17, int i18, boolean z17) {
        mc1.l lVar = this.f407145a;
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407146b;
        int i19 = this.f407147c;
        if (!z17) {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("selectedIndex", java.lang.Integer.valueOf(i17));
            hashMap.put("cgiCode", java.lang.Integer.valueOf(i18));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            c0Var.a(i19, lVar.t("ok", hashMap));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareInvitationToLiveRoom", "panel is canceled");
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i19, lVar.u(str2, jSONObject));
    }
}
