package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

@j95.b
/* loaded from: classes.dex */
public class e0 extends i95.w implements s43.k {
    public static void wi(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameService", "clearGameCache key:%s", str);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        ew4.c.c().d().z0("wx62d9035fd4fd2059", jSONArray);
    }

    public boolean Ai(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            wi(str);
            return false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.d0.class, null);
        return false;
    }
}
