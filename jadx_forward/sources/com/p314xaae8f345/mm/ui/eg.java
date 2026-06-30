package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public abstract class eg {

    /* renamed from: a, reason: collision with root package name */
    public static qb.a f289933a;

    public static int a(int i17) {
        if (f289933a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                rb.a a17 = f289933a.a("compactWindow", "getTaskPosition", jSONObject, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPPOUtil", " getTaskPos ret " + a17.f475091a);
                int i18 = a17.f475092b.getInt("int");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", "getTaskPosition" + i18);
                return i18;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
        return -1;
    }

    public static boolean b() {
        qb.b bVar;
        qb.a aVar = f289933a;
        return (aVar == null || (bVar = aVar.f442672b) == null || !bVar.f442675c) ? false : true;
    }

    public static void c(android.content.Context context) {
        if (((e() && com.p314xaae8f345.mm.ui.bk.Y()) || com.p314xaae8f345.mm.ui.bk.Z()) && f289933a == null) {
            f289933a = new qb.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    public static boolean d(int i17) {
        if (f289933a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                rb.a a17 = f289933a.a("compactWindow", "isInCompactWindowMode", jSONObject, null);
                boolean z17 = a17.f475092b.getBoolean(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPPOUtil", " isMagicWindow ret " + a17.f475091a + "isMagicWindow " + z17);
                return z17;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
        return false;
    }

    public static boolean e() {
        return fp.e0.e() || fp.e0.d() || fp.e0.f();
    }

    public static void f(int i17, int i18) {
        if (f289933a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                jSONObject.put("@int:targetPosition", i18);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OPPOUtil", " setTaskPos ret " + f289933a.a("compactWindow", "setTaskPosition", jSONObject, null).f475091a);
        }
    }
}
