package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class n implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u f164719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l f164720g;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        this.f164720g = lVar;
        this.f164717d = c0Var;
        this.f164718e = i17;
        this.f164719f = uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar = this.f164720g;
        if (i17 != lVar.f164706g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "requestCode(%d) not corrected.", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        boolean z17 = intent != null && intent.getBooleanExtra("KSendGroupToDo", false);
        int intExtra = intent == null ? 0 : intent.getIntExtra("KShowTodoIntroduceView", 0);
        int i19 = this.f164718e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164717d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar = this.f164719f;
        if (i18 != -1) {
            lVar.f164707h = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "resultCode is not RESULT_OK(%d)", java.lang.Integer.valueOf(i18));
            boolean z18 = intent != null && intent.getBooleanExtra("finish_by_forward_to_wework", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult, finishByForwardToWeWork: %b", java.lang.Boolean.valueOf(z18));
            if (z18) {
                str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                c0Var.a(i19, lVar.u(str2, jSONObject));
                return;
            }
            lVar.J(uVar, i18);
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i19, lVar.u(str2, jSONObject2));
            java.lang.String str5 = uVar.f164810w;
            java.lang.String str6 = uVar.f164790c.f387374d;
            lVar.getClass();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12234x2d2366c(stringExtra, str5, str6, z17 ? 1 : 0, intExtra, 1), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v.class);
            return;
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult fail, toUser is null");
            lVar.I(uVar);
            lVar.f164707h = false;
            c0Var.a(i19, lVar.o("fail:selected user is nil"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "result success toUser : %s ", stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        java.lang.String str7 = uVar.f164810w;
        java.lang.String str8 = uVar.f164790c.f387374d;
        lVar.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12234x2d2366c(stringExtra, str7, str8, z17 ? 1 : 0, intExtra, 2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var2 = this.f164717d;
        int i27 = this.f164718e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar2 = this.f164719f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713();
        java.lang.String str9 = stringExtra;
        lVar.G(c12236xd46e1713, stringExtra, stringExtra2, z17, c0Var2, uVar2);
        if (uVar2.f164791d) {
            c12236xd46e1713.J1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r(lVar, c12236xd46e1713, c0Var2, i27, uVar2, str9);
            c12236xd46e1713.d();
            str = str9;
        } else {
            c12236xd46e1713.d();
            lVar.f164707h = false;
            str = str9;
            c0Var2.a(i27, lVar.p("ok", lVar.H(uVar2, c12236xd46e1713, str)));
            lVar.K(false, uVar2, str);
        }
        if (uVar2.f164788a != null) {
            if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.a(uVar2.f164788a, str, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "EnterChattingAfterTrans config disabled, show normal toast for forward");
            android.app.Activity activity = uVar2.f164788a;
            db5.e1.T(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_));
        }
    }
}
