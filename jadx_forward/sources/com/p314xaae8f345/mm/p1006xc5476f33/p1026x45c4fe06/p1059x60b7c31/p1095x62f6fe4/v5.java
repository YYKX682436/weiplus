package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes.dex */
public final class v5 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 f163636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f163638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f163639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163640e;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, boolean z17, java.lang.String str) {
        this.f163636a = y5Var;
        this.f163637b = yVar;
        this.f163638c = i17;
        this.f163639d = z17;
        this.f163640e = str;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, requestCode: " + i17 + ", resultCode: " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var = this.f163636a;
        if (y5Var.f163690g != i17) {
            return false;
        }
        if (-1 != i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f163637b;
            int i19 = this.f163638c;
            y5Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i19, y5Var.u(str2, jSONObject));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
        if (c16991x15ced046 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, editResultModel is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f163637b;
            int i27 = this.f163638c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var2 = this.f163636a;
            y5Var2.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            yVar2.a(i27, y5Var2.u(str2, jSONObject2));
            return true;
        }
        java.lang.String str5 = c16991x15ced046.f237195f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath: " + str5);
        if (!(str5 == null || str5.length() == 0)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str5);
            java.lang.String str6 = a17.f294812f;
            if (str6 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                ik1.b0 b0Var = new ik1.b0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = this.f163637b.mo50354x59eafec1();
                if (mo50354x59eafec1 != null) {
                    mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str5)), com.p314xaae8f345.mm.vfs.w6.n(str5), true, b0Var);
                }
                java.lang.String str7 = (java.lang.String) b0Var.f373357a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath: " + str7);
                if (str7 == null || str7.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath is not exist");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar3 = this.f163637b;
                    int i28 = this.f163638c;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var3 = this.f163636a;
                    y5Var3.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    yVar3.a(i28, y5Var3.u(str2, jSONObject3));
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar4 = this.f163637b;
                int i29 = this.f163638c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var4 = this.f163636a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
                java.util.HashMap i37 = kz5.c1.i(new jz5.l("tempFilePath", str7));
                y5Var4.getClass();
                java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                i37.put("errno", 0);
                yVar4.a(i29, y5Var4.t("ok", i37));
                if (this.f163639d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiEditImage", "onResult, delete created resolved file");
                    com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(this.f163640e);
                    java.lang.String str10 = a18.f294812f;
                    if (str10 != null) {
                        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str10, false, false);
                        if (!a18.f294812f.equals(l18)) {
                            a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                    if (m18.a()) {
                        m18.f294799a.d(m18.f294800b);
                    }
                }
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath is not exist");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar5 = this.f163637b;
        int i38 = this.f163638c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y5 y5Var5 = this.f163636a;
        y5Var5.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        yVar5.a(i38, y5Var5.u(str2, jSONObject4));
        return true;
    }
}
