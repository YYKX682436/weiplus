package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public abstract class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static com.miui.easygo.sdk.EasyGo f292747a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f292748b;

    public static int a(com.miui.easygo.sdk.EasyGo easyGo, int i17) {
        if (easyGo == null) {
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            try {
                com.miui.easygo.sdk.module.EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "getTaskPosition", jSONObject, (android.os.Bundle) null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", invokeSync.code + "");
                int i18 = invokeSync.result.getInt("int");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", "getTaskPosition" + i18);
                return i18;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", th6.getMessage());
                return -1;
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
            return -1;
        }
    }

    public static void b(android.content.Context context) {
        if (com.p314xaae8f345.mm.ui.bk.V() || com.p314xaae8f345.mm.ui.bk.X()) {
            try {
                if (f292747a == null) {
                    f292747a = new com.miui.easygo.sdk.EasyGo(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
                f292748b = f292747a.init(new java.lang.String[]{"magicwindow"});
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("EasyGo", th6, null, new java.lang.Object[0]);
            }
        }
    }

    public static boolean c(android.content.Context context) {
        return context.getResources().getConfiguration().toString().contains("miui-magic-windows");
    }

    public static void d(int i17) {
        if (f292747a == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setLoginStatus ret " + f292747a.invokeSync("magicwindow", "setLoginStatus", jSONObject, (android.os.Bundle) null).code);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", th6.getMessage());
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void e(com.miui.easygo.sdk.EasyGo easyGo, int i17, int i18) {
        if (easyGo == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", easyGo.invokeSync("magicwindow", "setTaskPosition", jSONObject, (android.os.Bundle) null).code + "");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", th6.getMessage());
        }
    }
}
