package ai1;

/* loaded from: classes8.dex */
public abstract class d {
    public static final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("materialModel");
            kotlin.jvm.internal.o.f(jSONObject2, "getJSONObject(...)");
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = b(jSONObject2);
            kotlin.jvm.internal.o.d(b17);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("appBrandOpenMaterialModels");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                java.lang.Object obj = jSONArray.get(((kz5.x0) it).b());
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList.add(d((org.json.JSONObject) obj));
            }
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("appBrandOpenMaterialDetailModels");
            e06.k m18 = e06.p.m(0, jSONArray2.length());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m18, 10));
            java.util.Iterator it6 = m18.iterator();
            while (((e06.j) it6).hasNext()) {
                java.lang.Object obj2 = jSONArray2.get(((kz5.x0) it6).b());
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList2.add(c((org.json.JSONObject) obj2));
            }
            return new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection(b17, arrayList, arrayList2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialCollection, fail since " + e17);
            return null;
        }
    }

    public static final com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b(org.json.JSONObject jSONObject) {
        try {
            return new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel(jSONObject.optString("mimeType"), jSONObject.optString("materialExtension"), jSONObject.getString("materialPath"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeMaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel c(org.json.JSONObject jSONObject) {
        try {
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel d17 = d(jSONObject);
            if (d17 == null) {
                return null;
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("categories");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = jSONArray.get(((kz5.x0) it).b());
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((java.lang.String) obj);
            }
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel(d17.f86262d, d17.f86263e, d17.f86264f, d17.f86265g, d17.f86266h, arrayList, (float) jSONObject.getDouble(ya.b.SCORE), jSONObject.getString("functionDesc"), false, "", kz5.p0.f313996d);
            appBrandOpenMaterialDetailModel.f86255d.f86267i = d17.f86267i;
            return appBrandOpenMaterialDetailModel;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialDetailModel, fail since " + e17);
            return null;
        }
    }

    public static final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel d(org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString("appId");
            int i17 = jSONObject.getInt("versionType");
            java.lang.String string2 = jSONObject.getString("enterPath");
            java.lang.String optString = jSONObject.optString("iconUrl");
            kotlin.jvm.internal.o.d(optString);
            boolean z17 = true;
            if (optString.length() == 0) {
                optString = null;
            }
            java.lang.String string3 = jSONObject.getString("functionName");
            java.lang.String optString2 = jSONObject.optString("appName");
            kotlin.jvm.internal.o.d(optString2);
            if (optString2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                optString2 = null;
            }
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = new com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel(string, i17, string2, optString, string3);
            appBrandOpenMaterialModel.f86267i = optString2;
            return appBrandOpenMaterialModel;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "deserializeOpenMaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject e(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mimeType", materialModel.f86269d);
            jSONObject.put("materialExtension", materialModel.f86270e);
            jSONObject.put("materialPath", materialModel.f86271f);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serialize#MaterialModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject f(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel) {
        try {
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel model = appBrandOpenMaterialDetailModel.f86255d;
            kotlin.jvm.internal.o.f(model, "model");
            org.json.JSONObject g17 = g(model);
            if (g17 == null) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List categories = appBrandOpenMaterialDetailModel.f86256e;
            kotlin.jvm.internal.o.f(categories, "categories");
            java.util.Iterator it = categories.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
            g17.put("categories", jSONArray);
            g17.put(ya.b.SCORE, java.lang.Float.valueOf(appBrandOpenMaterialDetailModel.f86257f));
            g17.put("functionDesc", appBrandOpenMaterialDetailModel.f86258g);
            return g17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialDetailModel, fail since " + e17);
            return null;
        }
    }

    public static final org.json.JSONObject g(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", appBrandOpenMaterialModel.f86262d);
            jSONObject.put("versionType", appBrandOpenMaterialModel.f86263e);
            jSONObject.put("enterPath", appBrandOpenMaterialModel.f86264f);
            jSONObject.put("iconUrl", appBrandOpenMaterialModel.f86265g);
            jSONObject.put("functionName", appBrandOpenMaterialModel.f86266h);
            jSONObject.put("appName", appBrandOpenMaterialModel.f86267i);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "serializeOpenMaterialModel, fail since " + e17);
            return null;
        }
    }
}
