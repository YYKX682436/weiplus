package ut0;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f512326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f512327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f512328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f512329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f512330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut0.b f512331i;

    public a(com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.vfs.r6 r6Var2, com.p314xaae8f345.mm.vfs.r6 r6Var3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, ut0.b bVar) {
        this.f512326d = r6Var;
        this.f512327e = r6Var2;
        this.f512328f = r6Var3;
        this.f512329g = c0Var;
        this.f512330h = i17;
        this.f512331i = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch in threadpool");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int m48586x6582048 = com.p314xaae8f345.mm.p998xbc2a843b.p999x5e8986d.C11318x7f721ce0.m48586x6582048(this.f512326d.o(), this.f512327e.o(), this.f512328f.o(), 262144L);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        ut0.b bVar = this.f512331i;
        int i17 = this.f512330h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f512329g;
        if (m48586x6582048 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrand.WVA.JsApiApplyHPatch", "HPatch applied failed, cost:" + currentTimeMillis2);
            java.util.Map e17 = kz5.b1.e(new jz5.l("ret", java.lang.Integer.valueOf(m48586x6582048)));
            bVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(e17 instanceof java.util.HashMap)) {
                e17 = new java.util.HashMap(e17);
            }
            e17.put("errno", 4);
            c0Var.a(i17, bVar.t("fail:internal error", e17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch applied success, cost:" + currentTimeMillis2);
        bVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, bVar.u(str2, jSONObject));
    }
}
