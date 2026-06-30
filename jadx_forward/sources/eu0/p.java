package eu0;

/* loaded from: classes5.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final eu0.q a(org.json.JSONObject jSONObject) {
        eu0.o oVar = null;
        if (jSONObject == null) {
            return null;
        }
        eu0.q qVar = new eu0.q();
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "reedit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        qVar.f338263a = optString;
        qVar.f338264b = jSONObject.optString("template_id", "");
        qVar.f338265c = jSONObject.optString("aigc_task_id", "");
        qVar.f338266d = jSONObject.optString("aigc_service_id", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("refer_url");
        if (optJSONArray != null) {
            e06.k m17 = e06.p.m(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String optString2 = optJSONArray.optString(((kz5.x0) it).b());
                if (optString2 != null) {
                    arrayList.add(optString2);
                }
            }
            qVar.f338267e = arrayList;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("rawInfos");
        if (optJSONObject != null) {
            java.lang.String optString3 = optJSONObject.optString("finder_tab_context_id", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject.optString("finder_context_id", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            oVar = new eu0.o(optString3, optString4);
        }
        qVar.f338268f = oVar;
        return qVar;
    }
}
