package cb1;

/* loaded from: classes.dex */
public class n0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.o0 f40278c;

    public n0(cb1.o0 o0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40278c = o0Var;
        this.f40276a = v5Var;
        this.f40277b = i17;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "mmOnActivityResult resultCode:%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        cb1.o0 o0Var = this.f40278c;
        int i18 = this.f40277b;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40276a;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth ok");
            java.lang.String stringExtra = intent.getStringExtra("intent_auth_token");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                v5Var.a(i18, o0Var.p("fail", hashMap));
                return;
            }
            hashMap.put("errCode", 0);
            hashMap.put("auth_token", stringExtra);
            v5Var.a(i18, o0Var.p("ok", hashMap));
            return;
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth cancel");
            v5Var.a(i18, o0Var.o("cancel"));
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth fail");
            if (intent == null) {
                v5Var.a(i18, o0Var.p("fail", hashMap));
                return;
            }
            int intExtra = intent.getIntExtra("intent_err_code", -1);
            java.lang.String stringExtra2 = intent.getStringExtra("intent_err_msg");
            hashMap.put("errCode", java.lang.Integer.valueOf(intExtra));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            v5Var.a(i18, o0Var.p("fail:".concat(stringExtra2 == null ? "" : stringExtra2), hashMap));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth errCode:%d, errMsg:%s", java.lang.Integer.valueOf(intExtra), stringExtra2);
        }
    }
}
