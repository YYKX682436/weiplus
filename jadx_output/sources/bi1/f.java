package bi1;

/* loaded from: classes7.dex */
public final class f implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f20982d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20983e;

    public f(java.util.List multiSelectMaterials, java.lang.String materialOrigin) {
        kotlin.jvm.internal.o.g(multiSelectMaterials, "multiSelectMaterials");
        kotlin.jvm.internal.o.g(materialOrigin, "materialOrigin");
        this.f20982d = multiSelectMaterials;
        this.f20983e = materialOrigin;
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (bi1.h hVar : this.f20982d) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", hVar.f20995a);
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, hVar.f20996b);
                jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, hVar.f20997c);
                jSONObject2.put("size", hVar.f20998d);
                jSONObject2.put("content", hVar.f20999e);
                jSONObject2.put("talker", hVar.f21000f);
                jSONObject2.put("timeStamp", hVar.f21001g);
                jSONObject2.put("messageId", hVar.f21002h);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("multiSelectMaterials", jSONArray);
            jSONObject.put("materialOrigin", this.f20983e);
            str = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("AppBrandOpenMaterialNativeExtraDataForOpenMsg", "toJsonString fail since " + e17);
            str = "{}";
        }
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    public final java.lang.Object b() {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (bi1.h hVar : this.f20982d) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", hVar.f20995a);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, hVar.f20996b);
                jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, hVar.f20997c);
                jSONObject.put("size", hVar.f20998d);
                jSONObject.put("content", hVar.f20999e);
                jSONObject.put("groupOpenID", hVar.f21003i);
                jSONObject.put("timeStamp", hVar.f21001g);
                jSONObject.put("messageId", hVar.f21002h);
                jSONArray.put(jSONObject);
            }
            jSONArray.toString();
            return jSONArray;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("AppBrandOpenMaterialNativeExtraDataForOpenMsg", "toJsonString fail since " + e17);
            return "{}";
        }
    }
}
