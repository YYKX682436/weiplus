package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 f164691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e f164692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f164693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f164694f;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 j0Var, com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f164689a = e9Var;
        this.f164690b = i17;
        this.f164691c = j0Var;
        this.f164692d = c11127xcc7d6e4e;
        this.f164693e = h0Var;
        this.f164694f = h0Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage onPathResolve localPath: " + str + " isPathCreated:" + z17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        int i17 = this.f164690b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.j0 j0Var = this.f164691c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164689a;
        if (K0) {
            j0Var.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "imagePath is illegal" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", -1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, j0Var.u(str2, jSONObject));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage %s is not image", str);
            com.p314xaae8f345.mm.vfs.w6.h(str);
            j0Var.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "imagePath is illegal" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", -1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, j0Var.u(str2, jSONObject2));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("scene_from", 23);
            intent.putExtra("Retr_Msg_Type", 5);
            intent.putExtra("wxaInfo", this.f164692d);
            intent.putExtra("weAppSourceUserName", (java.lang.String) this.f164693e.f391656d);
            intent.putExtra("Select_Conv_User", (java.lang.String) this.f164694f.f391656d);
            nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h0(j0Var, e9Var, Z0, i17));
            j45.l.v(Z0, ".ui.transmit.MsgRetransmitUI", intent, j0Var.f164697g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiShareEmojiMessage", "shareEmojiMessage fail, context is null");
        j0Var.getClass();
        java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str6 != null ? str6 : "";
        java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var.a(i17, j0Var.u(str2, jSONObject3));
    }
}
