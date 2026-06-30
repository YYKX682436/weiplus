package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.u f83186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.l f83187g;

    public n(com.tencent.mm.plugin.appbrand.jsapi.share.l lVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        this.f83187g = lVar;
        this.f83184d = c0Var;
        this.f83185e = i17;
        this.f83186f = uVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.share.l lVar = this.f83187g;
        if (i17 != lVar.f83173g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "requestCode(%d) not corrected.", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        boolean z17 = intent != null && intent.getBooleanExtra("KSendGroupToDo", false);
        int intExtra = intent == null ? 0 : intent.getIntExtra("KShowTodoIntroduceView", 0);
        int i19 = this.f83185e;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83184d;
        com.tencent.mm.plugin.appbrand.jsapi.share.u uVar = this.f83186f;
        if (i18 != -1) {
            lVar.f83174h = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "resultCode is not RESULT_OK(%d)", java.lang.Integer.valueOf(i18));
            boolean z18 = intent != null && intent.getBooleanExtra("finish_by_forward_to_wework", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult, finishByForwardToWeWork: %b", java.lang.Boolean.valueOf(z18));
            if (z18) {
                str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i19, lVar.u(str2, jSONObject));
                return;
            }
            lVar.J(uVar, i18);
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i19, lVar.u(str2, jSONObject2));
            java.lang.String str5 = uVar.f83277w;
            java.lang.String str6 = uVar.f83257c.f305841d;
            lVar.getClass();
            com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData(stringExtra, str5, str6, z17 ? 1 : 0, intExtra, 1), com.tencent.mm.plugin.appbrand.jsapi.share.v.class);
            return;
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult fail, toUser is null");
            lVar.I(uVar);
            lVar.f83174h = false;
            c0Var.a(i19, lVar.o("fail:selected user is nil"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "result success toUser : %s ", stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        java.lang.String str7 = uVar.f83277w;
        java.lang.String str8 = uVar.f83257c.f305841d;
        lVar.getClass();
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData(stringExtra, str7, str8, z17 ? 1 : 0, intExtra, 2), com.tencent.mm.plugin.appbrand.jsapi.share.v.class);
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f83184d;
        int i27 = this.f83185e;
        com.tencent.mm.plugin.appbrand.jsapi.share.u uVar2 = this.f83186f;
        com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask = new com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask();
        java.lang.String str9 = stringExtra;
        lVar.G(sendAppMessageTask, stringExtra, stringExtra2, z17, c0Var2, uVar2);
        if (uVar2.f83258d) {
            sendAppMessageTask.J1 = new com.tencent.mm.plugin.appbrand.jsapi.share.r(lVar, sendAppMessageTask, c0Var2, i27, uVar2, str9);
            sendAppMessageTask.d();
            str = str9;
        } else {
            sendAppMessageTask.d();
            lVar.f83174h = false;
            str = str9;
            c0Var2.a(i27, lVar.p("ok", lVar.H(uVar2, sendAppMessageTask, str)));
            lVar.K(false, uVar2, str);
        }
        if (uVar2.f83255a != null) {
            if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                com.tencent.mm.ui.widget.snackbar.j.a(uVar2.f83255a, str, null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "EnterChattingAfterTrans config disabled, show normal toast for forward");
            android.app.Activity activity = uVar2.f83255a;
            db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.j_));
        }
    }
}
