package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class m implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n f164163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f164165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164167e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, long j17, java.lang.String str, int i17) {
        this.f164163a = nVar;
        this.f164164b = c0Var;
        this.f164165c = j17;
        this.f164166d = str;
        this.f164167e = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        int i19;
        java.lang.Object obj;
        jc1.d dVar;
        org.json.JSONObject put;
        org.json.JSONObject put2;
        rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] requestCode: " + i17, new java.lang.Object[0]);
        if (this.f164163a.f164168g != i17) {
            return false;
        }
        rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] match requestCode", new java.lang.Object[0]);
        str = "cancel";
        str2 = "";
        if (i18 != -1) {
            rk0.c.b("MicroMsg.JsApiCollectWepalm", "[ActivityResult] callback failed", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164164b;
            int i27 = this.f164167e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n nVar = this.f164163a;
            nVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i27, nVar.u(str2, jSONObject));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31121, this.f164166d, -999999, "callback failed", "palm_js_result");
            return true;
        }
        if (intent != null) {
            i19 = intent.getIntExtra("palm_error_code", 88888);
            str = intent.getStringExtra("palm_error_msg");
            if (str == null) {
                str = "";
            }
            java.lang.String stringExtra = intent.getStringExtra("palm_stats_file_path");
            if (stringExtra == null) {
                stringExtra = "";
            }
            str6 = intent.getStringExtra("palm_register_image_path");
            if (str6 == null) {
                str6 = "";
            }
            str7 = intent.getStringExtra("palm_register_image_md5");
            if (str7 == null) {
                str7 = "";
            }
            str8 = intent.getStringExtra("palm_live_image_path");
            if (str8 == null) {
                str8 = "";
            }
            str9 = intent.getStringExtra("palm_live_image_md5");
            if (str9 == null) {
                str9 = "";
            }
            str5 = intent.getStringExtra("palm_video_path");
            if (str5 == null) {
                str5 = "";
            }
            str4 = intent.getStringExtra("palm_video_md5");
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("phone_type");
            str3 = stringExtra2 != null ? stringExtra2 : "";
            str2 = stringExtra;
        } else {
            str3 = "";
            str4 = str3;
            str5 = str4;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            i19 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = this.f164164b.mo50354x59eafec1();
        ik1.b0 b0Var = new ik1.b0();
        if (!(str2.length() > 0) || mo50354x59eafec1 == null) {
            obj = "palm_js_result";
        } else {
            obj = "palm_js_result";
            mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2)), com.p314xaae8f345.mm.vfs.w6.n(str2), true, b0Var);
        }
        ik1.b0 b0Var2 = new ik1.b0();
        if ((str6.length() > 0) && mo50354x59eafec1 != null) {
            mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str6)), com.p314xaae8f345.mm.vfs.w6.n(str6), true, b0Var2);
        }
        ik1.b0 b0Var3 = new ik1.b0();
        if ((str8.length() > 0) && mo50354x59eafec1 != null) {
            mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str8)), com.p314xaae8f345.mm.vfs.w6.n(str8), true, b0Var3);
        }
        ik1.b0 b0Var4 = new ik1.b0();
        if ((str5.length() > 0) && mo50354x59eafec1 != null) {
            mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str5)), com.p314xaae8f345.mm.vfs.w6.n(str5), true, b0Var4);
        }
        org.json.JSONObject put3 = new org.json.JSONObject().put("md5", str7);
        org.json.JSONObject put4 = put3 != null ? put3.put("image", b0Var2.f373357a) : null;
        org.json.JSONObject put5 = new org.json.JSONObject().put("md5", str9);
        org.json.JSONObject put6 = put5 != null ? put5.put("image", b0Var3.f373357a) : null;
        org.json.JSONObject put7 = new org.json.JSONObject().put("md5", str4);
        org.json.JSONObject put8 = put7 != null ? put7.put("video", b0Var4.f373357a) : null;
        org.json.JSONObject put9 = new org.json.JSONObject().put("imgInfo", put4);
        org.json.JSONObject put10 = (put9 == null || (put = put9.put("liveImgInfo", put6)) == null || (put2 = put.put("liveVideoInfo", put8)) == null) ? null : put2.put("statsInfo", b0Var.f373357a);
        if (put10 == null) {
            put10 = new org.json.JSONObject();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f164165c;
        rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] callback success, errorCode:" + i19 + ", errormsg:" + str + ", collectTimeCost:" + currentTimeMillis + ", resultPalmInfo:" + put10 + ", phoneType:" + str3, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31121, this.f164166d, java.lang.Integer.valueOf(i19), str, obj, java.lang.Long.valueOf(currentTimeMillis));
        if (i19 == 0) {
            rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] callback success, result: ok", new java.lang.Object[0]);
            dVar = jc1.f.f380445a;
        } else if (i19 != 1) {
            rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] callback success, result: failed", new java.lang.Object[0]);
            dVar = new jc1.d(i19, "fail: ".concat(str));
        } else {
            rk0.c.c("MicroMsg.JsApiCollectWepalm", "[ActivityResult] callback success, result: cancel", new java.lang.Object[0]);
            dVar = jc1.f.f380446b;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("palmInfo", put10);
        hashMap.put("dataVersion", "VERSION_2");
        hashMap.put("phoneType", str3);
        this.f164164b.a(this.f164167e, this.f164163a.q(null, dVar, hashMap));
        return true;
    }
}
