package ai1;

/* loaded from: classes8.dex */
public abstract class d {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("materialModel");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getJSONObject(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b17 = b(jSONObject2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("appBrandOpenMaterialModels");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                java.lang.Object obj = jSONArray.get(((kz5.x0) it).b());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList.add(d((org.json.JSONObject) obj));
            }
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("appBrandOpenMaterialDetailModels");
            e06.k m18 = e06.p.m(0, jSONArray2.length());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m18, 10));
            java.util.Iterator it6 = m18.iterator();
            while (((e06.j) it6).hasNext()) {
                java.lang.Object obj2 = jSONArray2.get(((kz5.x0) it6).b());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList2.add(c((org.json.JSONObject) obj2));
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5(b17, arrayList, arrayList2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialCollection, fail since " + e17);
            return null;
        }
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b(org.json.JSONObject jSONObject) {
        try {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(jSONObject.optString("mimeType"), jSONObject.optString("materialExtension"), jSONObject.getString("materialPath"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeMaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c(org.json.JSONObject jSONObject) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 d17 = d(jSONObject);
            if (d17 == null) {
                return null;
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("categories");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = jSONArray.get(((kz5.x0) it).b());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((java.lang.String) obj);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21(d17.f167795d, d17.f167796e, d17.f167797f, d17.f167798g, d17.f167799h, arrayList, (float) jSONObject.getDouble(ya.b.f77498x4b14672), jSONObject.getString("functionDesc"), false, "", kz5.p0.f395529d);
            c12474x8b872a21.f167788d.f167800i = d17.f167800i;
            return c12474x8b872a21;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialDetailModel, fail since " + e17);
            return null;
        }
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 d(org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            java.lang.String optString = jSONObject.optString("iconUrl");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            boolean z17 = true;
            if (optString.length() == 0) {
                optString = null;
            }
            java.lang.String string3 = jSONObject.getString("functionName");
            java.lang.String optString2 = jSONObject.optString("appName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (optString2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                optString2 = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2(string, i17, string2, optString, string3);
            c12475x7cfc32b2.f167800i = optString2;
            return c12475x7cfc32b2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mimeType", c12476xea20f622.f167802d);
            jSONObject.put("materialExtension", c12476xea20f622.f167803e);
            jSONObject.put("materialPath", c12476xea20f622.f167804f);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serialize#MaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 model = c12474x8b872a21.f167788d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(model, "model");
            org.json.JSONObject g17 = g(model);
            if (g17 == null) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List categories = c12474x8b872a21.f167789e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(categories, "categories");
            java.util.Iterator it = categories.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
            g17.put("categories", jSONArray);
            g17.put(ya.b.f77498x4b14672, java.lang.Float.valueOf(c12474x8b872a21.f167790f));
            g17.put("functionDesc", c12474x8b872a21.f167791g);
            return g17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialDetailModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", c12475x7cfc32b2.f167795d);
            jSONObject.put("versionType", c12475x7cfc32b2.f167796e);
            jSONObject.put("enterPath", c12475x7cfc32b2.f167797f);
            jSONObject.put("iconUrl", c12475x7cfc32b2.f167798g);
            jSONObject.put("functionName", c12475x7cfc32b2.f167799h);
            jSONObject.put("appName", c12475x7cfc32b2.f167800i);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialModel, fail since " + e17);
            return null;
        }
    }
}
