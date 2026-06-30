package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r f221961a;

    public static void a(java.util.List list, boolean z17) {
        org.json.JSONArray jSONArray;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return;
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_FUNCTION_MSG_DELETED_STRING, "");
        if (str == null) {
            str = "";
        }
        try {
            jSONArray = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? new org.json.JSONArray(str) : new org.json.JSONArray();
        } catch (org.json.JSONException e17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_FUNCTION_MSG_DELETED_STRING, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameControlCmdParser", e17, "", new java.lang.Object[0]);
            jSONArray = null;
        }
        if (jSONArray == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (jSONArray.length() > 100) {
                jSONArray.remove(0);
            }
            jSONArray.put(str2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().h(str2, z17);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_FUNCTION_MSG_DELETED_STRING, jSONArray2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameControlCmdParser", "gamelog.srv_msg, service, ctrl_msg, delete_msg, deleted msg list:%s", jSONArray2);
    }

    public static java.util.List b(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String str3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 == 0) {
                str3 = str + "." + str2;
            } else {
                str3 = str + "." + str2 + i17;
            }
            if (!map.containsKey(str3)) {
                return arrayList;
            }
            i17++;
            java.lang.String str4 = (java.lang.String) map.get(str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                arrayList.add(str4);
            }
        }
    }

    public static void c(java.lang.String str, java.util.Map map, org.json.JSONObject jSONObject) {
        java.lang.String str2 = ".sysmsg.control_command.auto_run_switch." + str;
        if (map.containsKey(str2)) {
            try {
                jSONObject.put(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2), 0));
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
