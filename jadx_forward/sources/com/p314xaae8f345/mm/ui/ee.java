package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class ee {
    public static boolean a(android.content.Context context) {
        if (!fp.h.c(30)) {
            return false;
        }
        android.graphics.Rect bounds = ((android.view.WindowManager) context.getSystemService("window")).getCurrentWindowMetrics().getBounds();
        float height = bounds.height();
        float width = bounds.width();
        return ((height > width ? 1 : (height == width ? 0 : -1)) > 0 ? height / width : width / height) <= 1.67f;
    }

    public static boolean b(int i17) {
        com.p292xb816a1e7.p293xb1e6786a.sdk.C2831x7b4b60aa c2831x7b4b60aa = com.p314xaae8f345.mm.ui.fl.f290138a;
        if (c2831x7b4b60aa != null && com.p314xaae8f345.mm.ui.fl.a(c2831x7b4b60aa, i17) == 1) {
            return true;
        }
        com.miui.easygo.sdk.EasyGo easyGo = com.p314xaae8f345.mm.ui.w9.f292747a;
        if (easyGo != null && com.p314xaae8f345.mm.ui.w9.a(easyGo, i17) == 1) {
            return true;
        }
        if (com.p314xaae8f345.mm.ui.rk.f291287b != null && (com.p314xaae8f345.mm.ui.bk.g0() || com.p314xaae8f345.mm.ui.bk.f0()) && com.p314xaae8f345.mm.ui.rk.a(i17) == 1) {
            return true;
        }
        return com.p314xaae8f345.mm.ui.eg.f289933a != null && com.p314xaae8f345.mm.ui.eg.a(i17) == 1;
    }

    public static void c(int i17) {
        if ((com.p314xaae8f345.mm.ui.bk.U() || com.p314xaae8f345.mm.ui.bk.S()) && com.p314xaae8f345.mm.ui.fl.f290138a != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:landMode", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setLandscapeMode ret " + com.p314xaae8f345.mm.ui.fl.f290138a.m21062x7572d733("magicwindow", "setLandScapeMode", jSONObject, null).f9677x2eaded + " mode: " + i17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.S() && com.p314xaae8f345.mm.ui.v7.f292641a != null && com.p314xaae8f345.mm.ui.v7.c()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:landMode", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setLandscapeMode ret " + com.p314xaae8f345.mm.ui.v7.f292641a.m20994x7572d733("magicwindow", "setLandScapeMode", jSONObject2, null).f9486x2eaded + " mode: " + i17);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e18.getMessage());
            }
        }
    }

    public static void d(int i17) {
        com.p314xaae8f345.mm.ui.fl.f(i17);
        com.p314xaae8f345.mm.ui.v7.e(i17);
        com.p314xaae8f345.mm.ui.w9.d(i17);
        if ((com.p314xaae8f345.mm.ui.bk.g0() || com.p314xaae8f345.mm.ui.bk.f0()) && com.p314xaae8f345.mm.ui.rk.f291287b != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:loginStatus", i17);
                com.p314xaae8f345.mm.ui.rk.f291287b.invoke(com.p314xaae8f345.mm.ui.rk.f291286a, "com.tencent.mm", "setLoginStatus", jSONObject.toString(), null);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | org.json.JSONException unused) {
            }
        }
        if (com.p314xaae8f345.mm.ui.eg.f289933a == null || !com.p314xaae8f345.mm.ui.eg.e()) {
            return;
        }
        if ((com.p314xaae8f345.mm.ui.bk.Y() || com.p314xaae8f345.mm.ui.bk.Z()) && com.p314xaae8f345.mm.ui.eg.b()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:loginStatus", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPPOUtil", " setLoginStatus ret " + com.p314xaae8f345.mm.ui.eg.f289933a.a("compactWindow", "setLoginStatus", jSONObject2, null).f475091a);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
    }

    public static void e(int i17, int i18) {
        if ((com.p314xaae8f345.mm.ui.bk.U() || com.p314xaae8f345.mm.ui.bk.R()) && com.p314xaae8f345.mm.ui.fl.f290138a != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:nightMode", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setNightMode ret " + com.p314xaae8f345.mm.ui.fl.f290138a.m21062x7572d733("magicwindow", "setNightMode", jSONObject, null).f9677x2eaded + " mode: " + i17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e17.getMessage());
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.S() && com.p314xaae8f345.mm.ui.v7.f292641a != null && com.p314xaae8f345.mm.ui.v7.c()) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("@int:nightMode", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EasyGo", " setNightMode ret " + com.p314xaae8f345.mm.ui.v7.f292641a.m20994x7572d733("magicwindow", "setNightMode", jSONObject2, null).f9486x2eaded + " mode: " + i17);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EasyGo", e18.getMessage());
            }
        }
        if ((com.p314xaae8f345.mm.ui.bk.Y() || com.p314xaae8f345.mm.ui.bk.Z()) && com.p314xaae8f345.mm.ui.eg.f289933a != null && com.p314xaae8f345.mm.ui.eg.e() && com.p314xaae8f345.mm.ui.eg.b()) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("@int:taskId", i18);
                jSONObject3.put("@int:customUIMode", i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPPOUtil", " setNightMode ret " + com.p314xaae8f345.mm.ui.eg.f289933a.a("compactWindow", "setCustomUIMode", jSONObject3, null).f475091a + " mode: " + i17);
            } catch (org.json.JSONException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", e19.getMessage());
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.f0() || com.p314xaae8f345.mm.ui.bk.g0()) {
            try {
                if (com.p314xaae8f345.mm.ui.rk.f291287b == null) {
                    return;
                }
                java.lang.Class<?> cls = java.lang.Class.forName("android.app.Application");
                java.lang.reflect.Method method = cls.getMethod("getApplicationInstance", new java.lang.Class[0]);
                java.lang.reflect.Method method2 = cls.getMethod("setWechatDarkModeStatus", java.lang.Integer.TYPE);
                method.setAccessible(true);
                method2.setAccessible(true);
                method2.invoke(method.invoke(null, new java.lang.Object[0]), java.lang.Integer.valueOf(i17));
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("@int:darkModeStatus", i17);
                com.p314xaae8f345.mm.ui.rk.f291287b.invoke(com.p314xaae8f345.mm.ui.rk.f291286a, "com.tencent.mm", "setWechatDarkModeStatus", jSONObject4.toString(), null);
            } catch (java.lang.Exception e27) {
                e27.toString();
            }
        }
    }

    public static void f(int i17, com.p314xaae8f345.mm.ui.de deVar) {
        if (com.p314xaae8f345.mm.ui.bk.z(i17)) {
            com.p314xaae8f345.mm.ui.fl.g(com.p314xaae8f345.mm.ui.fl.f290138a, i17, 0);
            com.p314xaae8f345.mm.ui.v7.f(com.p314xaae8f345.mm.ui.v7.f292641a, i17, 0);
            com.p314xaae8f345.mm.ui.w9.e(com.p314xaae8f345.mm.ui.w9.f292747a, i17, 0);
            com.p314xaae8f345.mm.ui.rk.c(i17, 0);
            com.p314xaae8f345.mm.ui.eg.f(i17, 0);
            if (deVar != null) {
                deVar.b();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.fl.g(com.p314xaae8f345.mm.ui.fl.f290138a, i17, 2);
        com.p314xaae8f345.mm.ui.v7.f(com.p314xaae8f345.mm.ui.v7.f292641a, i17, 2);
        com.p314xaae8f345.mm.ui.w9.e(com.p314xaae8f345.mm.ui.w9.f292747a, i17, 2);
        com.p314xaae8f345.mm.ui.rk.c(i17, 2);
        com.p314xaae8f345.mm.ui.eg.f(i17, 2);
        if (deVar != null) {
            deVar.a();
        }
    }

    public static void g(int i17, int i18) {
        com.p314xaae8f345.mm.ui.fl.g(com.p314xaae8f345.mm.ui.fl.f290138a, i17, i18);
        com.p314xaae8f345.mm.ui.v7.f(com.p314xaae8f345.mm.ui.v7.f292641a, i17, i18);
        com.p314xaae8f345.mm.ui.w9.e(com.p314xaae8f345.mm.ui.w9.f292747a, i17, i18);
        com.p314xaae8f345.mm.ui.rk.c(i17, i18);
        com.p314xaae8f345.mm.ui.eg.f(i17, i18);
    }
}
