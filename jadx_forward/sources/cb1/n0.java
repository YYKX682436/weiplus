package cb1;

/* loaded from: classes.dex */
public class n0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.o0 f121811c;

    public n0(cb1.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121811c = o0Var;
        this.f121809a = v5Var;
        this.f121810b = i17;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public void mo14598x57429edc(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "mmOnActivityResult resultCode:%d", java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        cb1.o0 o0Var = this.f121811c;
        int i18 = this.f121810b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121809a;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth ok");
            java.lang.String stringExtra = intent.getStringExtra("intent_auth_token");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                v5Var.a(i18, o0Var.p("fail", hashMap));
                return;
            }
            hashMap.put("errCode", 0);
            hashMap.put("auth_token", stringExtra);
            v5Var.a(i18, o0Var.p("ok", hashMap));
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth cancel");
            v5Var.a(i18, o0Var.o("cancel"));
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth fail");
            if (intent == null) {
                v5Var.a(i18, o0Var.p("fail", hashMap));
                return;
            }
            int intExtra = intent.getIntExtra("intent_err_code", -1);
            java.lang.String stringExtra2 = intent.getStringExtra("intent_err_msg");
            hashMap.put("errCode", java.lang.Integer.valueOf(intExtra));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            v5Var.a(i18, o0Var.p("fail:".concat(stringExtra2 == null ? "" : stringExtra2), hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth errCode:%d, errMsg:%s", java.lang.Integer.valueOf(intExtra), stringExtra2);
        }
    }
}
