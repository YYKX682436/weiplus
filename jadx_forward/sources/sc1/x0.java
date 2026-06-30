package sc1;

/* loaded from: classes7.dex */
public class x0 extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f76764x366c91de = 360;

    /* renamed from: NAME */
    public static final java.lang.String f76765x24728b = "insertLivePusher";

    /* renamed from: g, reason: collision with root package name */
    public int f487268g;

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        sc1.m1.a();
        if (lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)).g4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "wx assistant is enabled, return");
            str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        if (lVar.mo50352x76847179() instanceof android.app.Activity) {
            this.f487268g = 0;
            P((android.app.Activity) lVar.mo50352x76847179(), lVar, jSONObject, i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertLivePusher", "invokeAfterRequestPermission pageContext not activity");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, u(str, jSONObject3));
        si1.e1.c(lVar.mo48798x74292566());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("livePusherId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(tVar.mo50352x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e(tVar.mo50352x76847179()));
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onInsertView livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p2926x359365.C25481x77f18081.m94465x74dac979(java.lang.String.format("weixin_%s", tVar.mo48798x74292566()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e.class);
        if (c12151x47b5a23e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "pusherView null");
            return;
        }
        sc1.h0 h0Var = new sc1.h0(this, c12151x47b5a23e);
        sc1.i0 i0Var = new sc1.i0(this, c12151x47b5a23e);
        sc1.j0 j0Var = new sc1.j0(this, c12151x47b5a23e, tVar);
        sc1.k0 k0Var = new sc1.k0(this, c12151x47b5a23e, tVar, j0Var);
        tVar.U(h0Var);
        tVar.R(i0Var);
        tVar.w(k0Var);
        c12151x47b5a23e.m51030xb553a473(new sc1.l0(this, tVar, h0Var, i0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(tVar.mo48798x74292566(), j0Var);
        c12151x47b5a23e.m51031xc4842493(new sc1.m0(this, i17, tVar));
        c12151x47b5a23e.m51028x2ea741c3(new sc1.n0(this, i17, tVar));
        c12151x47b5a23e.m51029x6954c27b(new sc1.o0(this, i17, tVar));
        c12151x47b5a23e.m51027xcc5c238b(new sc1.p0(this, i17, tVar));
        if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac)) {
            c12151x47b5a23e.f163102h = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, c12151x47b5a23e.f163102h);
            jSONObject.optString("filterImageMd5", null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12151x47b5a23e.f163102h)) {
                try {
                    jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, "");
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertLivePusher", "parseFilterImage, ignore exception:%s", e17);
                }
            } else if (c12151x47b5a23e.f163102h.startsWith("http://") || c12151x47b5a23e.f163102h.startsWith("https://")) {
                jSONObject.remove(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
            }
        }
        sc1.k1 n17 = ((sc1.q1) c12151x47b5a23e.f163103i).n(c12151x47b5a23e, sc1.n1.b(jSONObject));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "onInsert code:%d info:%s", java.lang.Integer.valueOf(n17.f487221a), n17.f487222b);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2);
        java.lang.String optString2 = jSONObject.optString("backgroundMD5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, url is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, optString, optString2, new sc1.a0(this, c12151x47b5a23e, optString));
        }
        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "convertFilterImageToLocalPath, url is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, optString3, null, new sc1.b0(this, c12151x47b5a23e, optString3));
        }
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15532xbc3ed888);
        java.lang.String optString5 = jSONObject.optString("watermarkMD5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "convertWatermarkImageToLocalPath, url is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, optString4, optString5, new sc1.c0(this, c12151x47b5a23e));
        }
        c12151x47b5a23e.setContentDescription(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571554ip));
    }

    public final void P(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18 = this.f487268g;
        this.f487268g = i18 + 1;
        if (i18 > 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, avoid dead loop");
            return;
        }
        si1.e1.a(lVar.mo48798x74292566(), new sc1.e0(this, activity, lVar, jSONObject, i17));
        si1.e1.a(lVar.mo48798x74292566(), new sc1.g0(this, activity, lVar, jSONObject, i17));
        if (!nf.t.a(activity, lVar, "android.permission.CAMERA", 117, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retCameraPermission");
        } else if (!nf.t.a(activity, lVar, "android.permission.RECORD_AUDIO", 118, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retMicrophonePermission");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
            B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
        }
    }
}
