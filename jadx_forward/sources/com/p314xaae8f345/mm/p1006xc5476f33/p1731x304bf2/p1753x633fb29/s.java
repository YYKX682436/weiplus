package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f221966a;

    public s(java.lang.String str) {
        this.f221966a = new org.json.JSONObject();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameServerData", "Null or nil json string");
            return;
        }
        try {
            this.f221966a = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameServerData", "Json parsing error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedList a(org.json.JSONArray r10) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.s.a(org.json.JSONArray):java.util.LinkedList");
    }

    public static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
