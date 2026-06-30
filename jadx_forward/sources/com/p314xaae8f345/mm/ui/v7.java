package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p284x36a29809.p285xb1e6786a.sdk.C2821x7b4b60aa f292641a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f292642b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f292643c;

    public static int a(com.p284x36a29809.p285xb1e6786a.sdk.C2821x7b4b60aa c2821x7b4b60aa, int i17) {
        if (c2821x7b4b60aa == null || !c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HonorUtil", "getTaskPos return -1!");
            return -1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            com.p284x36a29809.p285xb1e6786a.sdk.p289xc04ba66c.C2824xe8c72797 m20994x7572d733 = c2821x7b4b60aa.m20994x7572d733("magicwindow", "getTaskPosition", jSONObject, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", m20994x7572d733.f9486x2eaded + "");
            int i18 = m20994x7572d733.f9487xc84dc81d.getInt("int");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", "getTaskPosition" + i18);
            return i18;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
            return -1;
        }
    }

    public static void b(android.content.Context context) {
        if (fp.e0.b()) {
            if (!com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.u7(), "initEasyGoManager");
            } else {
                if (f292641a == null) {
                    f292641a = new com.p284x36a29809.p285xb1e6786a.sdk.C2821x7b4b60aa(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                }
                f292642b = f292641a.m20992x316510(new java.lang.String[]{"magicwindow"});
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HonorUtil", "initEasyGoManager large device!!");
            }
        }
    }

    public static boolean c() {
        java.util.List list = f292642b;
        boolean z17 = false;
        if (list != null && list.size() > 0) {
            f292642b.get(0);
            if (((java.lang.Integer) f292642b.get(0)).intValue() == 0) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HonorUtil", "initSucceed:%s, retList:%s", java.lang.Boolean.valueOf(z17), f292642b);
        return z17;
    }

    public static boolean d(android.content.Context context) {
        if (!fp.e0.b()) {
            return false;
        }
        boolean contains = context.getResources().getConfiguration().toString().contains("hn-magic-windows");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HonorUtil", "isExpandStatus:%s", java.lang.Boolean.valueOf(contains));
        return contains;
    }

    public static void e(int i17) {
        if (f292641a == null || !c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HonorUtil", "setLoginStatus easyGoManager is null!!");
            return;
        }
        f292643c = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:loginStatus", i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setLoginStatus ret " + f292641a.m20994x7572d733("magicwindow", "setLoginStatus", jSONObject, null).f9486x2eaded);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
    }

    public static void f(com.p284x36a29809.p285xb1e6786a.sdk.C2821x7b4b60aa c2821x7b4b60aa, int i17, int i18) {
        if (c2821x7b4b60aa == null || !c()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("@int:taskId", i17);
            jSONObject.put("@int:targetPosition", i18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", c2821x7b4b60aa.m20994x7572d733("magicwindow", "setTaskPosition", jSONObject, null).f9486x2eaded + "");
    }
}
