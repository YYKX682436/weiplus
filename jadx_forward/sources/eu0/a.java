package eu0;

/* loaded from: classes5.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final eu0.b a(org.json.JSONObject jSONObject) {
        eu0.o oVar = null;
        if (jSONObject == null) {
            return null;
        }
        eu0.b bVar = new eu0.b();
        bVar.f338228a = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "");
        bVar.f338229b = jSONObject.optString("transitionID", "");
        bVar.f338230c = jSONObject.optString("prompt", "");
        bVar.f338231d = jSONObject.optString("aigcTaskID", "");
        bVar.f338238k = jSONObject.optString("aigcServiceID", "");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("assetInfos");
        if (optJSONArray != null) {
            e06.k m17 = e06.p.m(0, optJSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.String optString = optJSONArray.optString(((kz5.x0) it).b());
                if (optString != null) {
                    arrayList.add(optString);
                }
            }
            bVar.f338232e = arrayList;
        }
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("effectsInfos");
        if (optJSONArray2 != null) {
            e06.k m18 = e06.p.m(0, optJSONArray2.length());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = m18.iterator();
            while (it6.hasNext()) {
                java.lang.String optString2 = optJSONArray2.optString(((kz5.x0) it6).b());
                if (optString2 != null) {
                    arrayList2.add(optString2);
                }
            }
            bVar.f338233f = arrayList2;
        }
        bVar.f338235h = eu0.n.f338252h.a(jSONObject.optJSONObject("musicInfo"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("templateVersionInfo");
        bVar.f338237j = optJSONObject == null ? null : new eu0.r(optJSONObject.optInt("ios_sdk_version_min", 0), optJSONObject.optInt("ios_sdk_version_max", 0), optJSONObject.optInt("android_sdk_version_min", 0), optJSONObject.optInt("android_sdk_version_max", 0), optJSONObject.optInt("harmony_sdk_version_min", 0), optJSONObject.optInt("harmony_sdk_version_max", 0));
        bVar.f338234g = jSONObject.optString("templateJsonFilePath", "");
        bVar.f338239l = jSONObject.optString("templateURL", "");
        bVar.f338240m = jSONObject.optString("templateID", "");
        bVar.f338236i = jSONObject.optInt("templateType", 0);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("rawInfos");
        if (optJSONObject2 != null) {
            java.lang.String optString3 = optJSONObject2.optString("finder_tab_context_id", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject2.optString("finder_context_id", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            oVar = new eu0.o(optString3, optString4);
        }
        bVar.f338241n = oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC", "MJCCParamTrace Build CamParams，json=" + jSONObject);
        return bVar;
    }
}
