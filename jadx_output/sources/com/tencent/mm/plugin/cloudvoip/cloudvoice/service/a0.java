package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class a0 {

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f95822f;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f95819c = new java.util.ArrayList(10);

    /* renamed from: d, reason: collision with root package name */
    public long f95820d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f95821e = new java.util.ArrayList(2);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f95817a = new java.util.ArrayList(10);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f95818b = new java.util.ArrayList(10);

    public java.util.Map a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        try {
            java.util.Iterator it = this.f95818b.iterator();
            while (it.hasNext()) {
                fw1.d dVar = (fw1.d) it.next();
                jSONArray.put(dVar.f267070b);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("openId", dVar.f267070b);
                jSONObject.put("memberId", dVar.f267069a);
                jSONObject.put("type", dVar.f267071c);
                jSONArray2.put(jSONObject);
            }
            hashMap.put("openIdList", jSONArray);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceMemberMgr", e17, "", new java.lang.Object[0]);
        }
        return hashMap;
    }

    public java.lang.String b(int i17) {
        java.util.ArrayList arrayList = this.f95817a;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fw1.d dVar = (fw1.d) it.next();
            if (dVar != null && i17 == dVar.f267069a) {
                return dVar.f267070b;
            }
        }
        return null;
    }
}
