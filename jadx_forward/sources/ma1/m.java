package ma1;

/* loaded from: classes7.dex */
public final class m extends ma1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72805x366c91de = 1169;

    /* renamed from: NAME */
    public static final java.lang.String f72806x24728b = "shareGameRecorderVideo";

    @Override // ma1.f
    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env, int i17, ma1.c editSrc, java.lang.String title, org.json.JSONArray shareOptions, ta1.n0 data, org.json.JSONObject jsonObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i18;
        jz5.f0 f0Var;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08;
        xi1.g mo50261xee5260a9;
        xi1.p mo51612x60543150;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editSrc, "editSrc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareOptions, "shareOptions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderShare", "startEdit");
        int a17 = cf.b.a(this);
        android.app.Activity Z0 = env.Z0();
        if (Z0 == null) {
            env.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        nf.g.a(Z0).f(new ma1.k(a17, env, i17, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = env.V0();
        xi1.o a18 = (V0 == null || (mo50261xee5260a9 = V0.mo50261xee5260a9()) == null || (mo51612x60543150 = mo50261xee5260a9.mo51612x60543150()) == null) ? null : mo51612x60543150.a();
        int i27 = a18 == null ? -1 : ma1.j.f406730a[a18.ordinal()];
        java.lang.Class cls = i27 != -1 ? (i27 == 1 || i27 == 2) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.class : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12731x6248249d.class : null;
        if (cls != null) {
            android.content.Intent intent = new android.content.Intent(Z0, (java.lang.Class<?>) cls);
            intent.putExtra("k_ext_absFilePath", editSrc.f406685a);
            intent.putExtra("k_ext_appid", env.mo48798x74292566());
            intent.putExtra("k_ext_configJson", jsonObject.optString("configJson"));
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            try {
                cf.f.b(shareOptions, new ma1.l(arrayList));
                i19 = 4;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameJsApiScreenRecorderShare", e17, "", new java.lang.Object[0]);
                java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                java.lang.String str6 = str5 == null ? "" : str5;
                java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                i19 = 4;
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                env.a(i17, u(str6, jSONObject));
            }
            intent.putIntegerArrayListExtra("k_ext_share_options", arrayList);
            intent.putExtra("k_ext_appName", (env.t3() == null || env.t3().E0() == null) ? "" : env.t3().E0().f387374d);
            intent.putExtra("k_ext_share_title", jsonObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
            intent.putExtra("k_ext_share_desc", jsonObject.optString("desc"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = env.t3();
            intent.putExtra("k_ext_app_version", (t37 == null || (u08 = t37.u0()) == null) ? 0 : u08.L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t38 = env.t3();
            intent.putExtra("k_ext_app_version_type", (t38 == null || (u07 = t38.u0()) == null) ? 0 : u07.f158814g);
            intent.putExtra("k_ext_is_dev_edited", jsonObject.optInt("isDevRequestEdit", 0));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(a17));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            i18 = i19;
            str = "";
            str2 = "errno";
            str3 = "makeReturnJson with JSONObject, put errno, e=%s";
            str4 = "MicroMsg.AppBrandJsApi";
            yj0.a.k(Z0, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderShare", "startEdit", "(Lcom/tencent/mm/plugin/appbrand/service/AppBrandServiceWC;ILcom/tencent/mm/plugin/appbrand/game/jsapi/screenrecorder/WAGameJsApiScreenRecorderBase$WxaFile;Ljava/lang/String;Lorg/json/JSONArray;Lcom/tencent/mm/plugin/appbrand/game/screenrecorder/GameRecorderMgr$RemuxResult;Lorg/json/JSONObject;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            f0Var = jz5.f0.f384359a;
        } else {
            str = "";
            str2 = "errno";
            str3 = "makeReturnJson with JSONObject, put errno, e=%s";
            str4 = "MicroMsg.AppBrandJsApi";
            i18 = 4;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            java.lang.String str9 = str8 == null ? str : str8;
            java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(str2, i18);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, str3, e19);
            }
            env.a(i17, u(str9, jSONObject2));
        }
    }
}
