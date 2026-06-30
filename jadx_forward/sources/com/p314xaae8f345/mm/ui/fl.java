package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class fl {

    /* renamed from: a, reason: collision with root package name */
    public static com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa f290138a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f290139b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f290140c;

    /* renamed from: d, reason: collision with root package name */
    public static int[] f290141d = new int[0];

    public static int a(com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa c2831x7b4b60aa, int i17) {
        if (c2831x7b4b60aa != null && c()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                com.p292xb816a1e7.p293xb1e6786a.sdk.p297xc04ba66c.C2834xe8c72797 m21062x7572d733 = c2831x7b4b60aa.m21062x7572d733("magicwindow", "getTaskPosition", jSONObject, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", m21062x7572d733.f9677x2eaded + "");
                int i18 = m21062x7572d733.f9678xc84dc81d.getInt("int");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", "getTaskPosition" + i18);
                return i18;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
            }
        }
        return -1;
    }

    public static void b(android.content.Context context) {
        if (!com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.el(), "initEasyGoManager");
        } else {
            if (f290138a == null) {
                f290138a = new com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            f290139b = f290138a.m21060x316510(new java.lang.String[]{"magicwindow"});
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.huaweiUtil", "initEasyGoManager large device!!");
        }
    }

    public static boolean c() {
        java.util.List list = f290139b;
        boolean z17 = false;
        if (list != null && list.size() > 0) {
            f290139b.get(0);
            if (((java.lang.Integer) f290139b.get(0)).intValue() == 0) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.huaweiUtil", "initSucceed:%s, retList:%s", java.lang.Boolean.valueOf(z17), f290139b);
        return z17;
    }

    public static boolean d(android.content.Context context) {
        java.lang.String configuration = context.getResources().getConfiguration().toString();
        return configuration.contains("hwMultiwindow-magic") || configuration.contains("hw-magic-windows");
    }

    public static boolean e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isHGSPhone Build.MODEL:");
        java.lang.String str = android.os.Build.MODEL;
        sb6.append(str);
        sb6.append(", ");
        sb6.append(fp.e0.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.huaweiUtil", sb6.toString());
        return fp.e0.c() && ("HGS-AL10".equalsIgnoreCase(str) || "HGS-AL10D".equalsIgnoreCase(str) || "GRL-AL10".equalsIgnoreCase(str) || "GRL-AL10D".equalsIgnoreCase(str));
    }

    public static void f(int i17) {
        if (f290138a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.huaweiUtil", "setLoginStatus easyGoManager is null!!");
            return;
        }
        f290140c = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setLoginStatus ret " + f290138a.m21062x7572d733("magicwindow", "setLoginStatus", jSONObject, null).f9677x2eaded);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void g(com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa c2831x7b4b60aa, int i17, int i18) {
        if (c2831x7b4b60aa == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", c2831x7b4b60aa.m21062x7572d733("magicwindow", "setTaskPosition", jSONObject, null).f9677x2eaded + "");
    }
}
