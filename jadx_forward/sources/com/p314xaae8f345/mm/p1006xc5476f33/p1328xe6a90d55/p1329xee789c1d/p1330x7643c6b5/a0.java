package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class a0 {

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f177355f;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f177352c = new java.util.ArrayList(10);

    /* renamed from: d, reason: collision with root package name */
    public long f177353d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f177354e = new java.util.ArrayList(2);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f177350a = new java.util.ArrayList(10);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f177351b = new java.util.ArrayList(10);

    public java.util.Map a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        try {
            java.util.Iterator it = this.f177351b.iterator();
            while (it.hasNext()) {
                fw1.d dVar = (fw1.d) it.next();
                jSONArray.put(dVar.f348603b);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("openId", dVar.f348603b);
                jSONObject.put("memberId", dVar.f348602a);
                jSONObject.put("type", dVar.f348604c);
                jSONArray2.put(jSONObject);
            }
            hashMap.put("openIdList", jSONArray);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoice.OpenVoiceMemberMgr", e17, "", new java.lang.Object[0]);
        }
        return hashMap;
    }

    public java.lang.String b(int i17) {
        java.util.ArrayList arrayList = this.f177350a;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fw1.d dVar = (fw1.d) it.next();
            if (dVar != null && i17 == dVar.f348602a) {
                return dVar.f348603b;
            }
        }
        return null;
    }
}
