package bi1;

/* loaded from: classes7.dex */
public final class f implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f102515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102516e;

    public f(java.util.List multiSelectMaterials, java.lang.String materialOrigin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiSelectMaterials, "multiSelectMaterials");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialOrigin, "materialOrigin");
        this.f102515d = multiSelectMaterials;
        this.f102516e = materialOrigin;
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (bi1.h hVar : this.f102515d) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", hVar.f102528a);
                jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, hVar.f102529b);
                jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, hVar.f102530c);
                jSONObject2.put("size", hVar.f102531d);
                jSONObject2.put("content", hVar.f102532e);
                jSONObject2.put("talker", hVar.f102533f);
                jSONObject2.put("timeStamp", hVar.f102534g);
                jSONObject2.put("messageId", hVar.f102535h);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("multiSelectMaterials", jSONArray);
            jSONObject.put("materialOrigin", this.f102516e);
            str = jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandOpenMaterialNativeExtraDataForOpenMsg", "toJsonString fail since " + e17);
            str = "{}";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    public final java.lang.Object b() {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (bi1.h hVar : this.f102515d) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", hVar.f102528a);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, hVar.f102529b);
                jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, hVar.f102530c);
                jSONObject.put("size", hVar.f102531d);
                jSONObject.put("content", hVar.f102532e);
                jSONObject.put("groupOpenID", hVar.f102536i);
                jSONObject.put("timeStamp", hVar.f102534g);
                jSONObject.put("messageId", hVar.f102535h);
                jSONArray.put(jSONObject);
            }
            jSONArray.toString();
            return jSONArray;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandOpenMaterialNativeExtraDataForOpenMsg", "toJsonString fail since " + e17);
            return "{}";
        }
    }
}
