package nd1;

/* loaded from: classes7.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f417784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f417785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f417788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f417789i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417790m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f417791n;

    public a0(android.app.Activity activity, nd1.c0 c0Var, org.json.JSONObject jSONObject, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17) {
        this.f417784d = activity;
        this.f417785e = c0Var;
        this.f417786f = jSONObject;
        this.f417787g = str;
        this.f417788h = c11809xbc286be4;
        this.f417789i = c12559xbdae8559;
        this.f417790m = yVar;
        this.f417791n = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4;
        java.lang.String str;
        int i17 = this.f417791n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417790m;
        nd1.c0 c0Var = this.f417785e;
        try {
            android.app.Activity activity = this.f417784d;
            if (!((activity == null || activity.isFinishing()) ? false : true)) {
                activity = null;
            }
            if (activity == null) {
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                activity = k17 != null ? (android.app.Activity) k17.get() : null;
            }
            org.json.JSONObject jSONObject = this.f417786f;
            nd1.s sVar = nd1.c0.f417806g;
            android.os.Bundle E = c0Var.E(jSONObject);
            java.lang.String str2 = this.f417787g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 oldConfig = this.f417788h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(oldConfig, "$oldConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = this.f417789i;
            java.lang.Integer valueOf = c12559xbdae8559 != null ? java.lang.Integer.valueOf(c12559xbdae8559.f169323f) : null;
            if (c12559xbdae8559 != null) {
                str = c12559xbdae8559.f169324g;
                c11809xbc286be4 = oldConfig;
            } else {
                c11809xbc286be4 = oldConfig;
                str = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab c12201x3480ccab = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1104x34628f.C12201x3480ccab(str2, E, c11809xbc286be4, valueOf, str);
            java.lang.String str3 = this.f417787g;
            if (activity == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl. ipcInvokeMM url=" + str3);
                uk0.a.b(c12201x3480ccab, new nd1.u(), new nd1.z(yVar, i17, c0Var));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToWC", "halfRestartAppBrandImpl.url=" + str3);
            nd1.s.a(nd1.c0.f417806g, activity, c12201x3480ccab);
            c0Var.getClass();
            java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, c0Var.u(str4, jSONObject2));
        } catch (java.lang.Exception e18) {
            java.lang.String str6 = "fail " + e18.getMessage();
            c0Var.getClass();
            if (android.text.TextUtils.isEmpty(str6)) {
                str6 = "fail:internal error";
            }
            java.lang.String str7 = str6 != null ? str6 : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar.a(i17, c0Var.u(str7, jSONObject3));
        }
    }
}
