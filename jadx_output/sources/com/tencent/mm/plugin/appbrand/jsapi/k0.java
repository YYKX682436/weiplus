package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class k0 extends com.tencent.mm.plugin.appbrand.jsapi.h {

    /* renamed from: e, reason: collision with root package name */
    public boolean f81338e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f81339f = Integer.MIN_VALUE;

    public java.lang.String l() {
        return "errMsg";
    }

    public boolean m() {
        return this instanceof com.tencent.mm.plugin.appbrand.jsapi.audio.y;
    }

    public final int n() {
        java.lang.reflect.Field field;
        if (Integer.MIN_VALUE == this.f81339f) {
            try {
                java.lang.Class<?> cls = getClass();
                try {
                    try {
                        field = (java.lang.reflect.Field) d56.b.a(cls.getField("CTRL_INDEX"));
                    } catch (java.lang.NoSuchFieldException e17) {
                        java.lang.Class<?> cls2 = cls;
                        do {
                            try {
                                field = (java.lang.reflect.Field) d56.b.a(cls2.getDeclaredField("CTRL_INDEX"));
                            } catch (java.lang.NoSuchFieldException unused) {
                                cls2 = cls2.getSuperclass();
                            }
                        } while (cls2 != null);
                        throw new d56.c(e17);
                    }
                    this.f81339f = ((java.lang.Integer) new d56.b(field.getType(), field.get(cls)).f226632b).intValue();
                } catch (java.lang.Exception e18) {
                    throw new d56.c(e18);
                }
            } catch (java.lang.Exception e19) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "getCtrlIndex exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e19));
            }
        }
        return this.f81339f;
    }

    public final java.lang.String o(java.lang.String str) {
        if (!this.f81338e || 1492 > n()) {
            return s(str, null);
        }
        throw new java.lang.IllegalArgumentException("makeReturnJson(String) is deprecated for " + k());
    }

    public java.lang.String p(java.lang.String str, java.util.Map map) {
        if (!this.f81338e || 1492 > n()) {
            return t(str, map);
        }
        throw new java.lang.IllegalArgumentException("makeReturnJson(String, Map<String, ? extends Object>) is deprecated for " + k());
    }

    public final java.lang.String q(java.lang.String str, jc1.d dVar, java.util.Map map) {
        int i17 = dVar.f298903a;
        if (str == null) {
            str = dVar.f298904b;
        }
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(map instanceof java.util.HashMap)) {
            map = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        }
        map.put("errno", java.lang.Integer.valueOf(i17));
        return t(str, map);
    }

    public final java.lang.String r(java.lang.String str, jc1.d dVar, org.json.JSONObject jSONObject) {
        int i17 = dVar.f298903a;
        if (android.text.TextUtils.isEmpty(str)) {
            str = dVar.f298904b;
        }
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("errno", i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        return u(str, jSONObject);
    }

    public java.lang.String s(java.lang.String str, org.json.JSONObject jSONObject) {
        if (!this.f81338e || 1492 > n()) {
            return u(str, jSONObject);
        }
        throw new java.lang.IllegalArgumentException("makeReturnJson(String, JSONObject) is deprecated for " + k());
    }

    public final java.lang.String t(java.lang.String str, java.util.Map map) {
        if ("cancel".equals(str)) {
            str = "fail cancel";
        }
        if (!str.startsWith("fail") && !str.startsWith("ok")) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "api[%s] assert, argument [reason] must start with special prefix", k());
            if (this.f81338e) {
                throw new java.lang.IllegalArgumentException(format);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", format);
        }
        java.util.Map hashMap = map instanceof java.util.HashMap ? map : map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        if (map != null && map.containsKey(l())) {
            java.lang.String str2 = "api " + k() + ": Cant put errMsg in res!!!";
            if (this.f81338e) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", str2);
        }
        nf.f.c(hashMap);
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        try {
            jSONObject.putOpt(l(), k() + ":" + str);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public java.lang.String u(java.lang.String str, org.json.JSONObject jSONObject) {
        if ("cancel".equals(str)) {
            str = "fail cancel";
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (jSONObject.has(l())) {
            java.lang.String str2 = "api " + k() + ": Cant put errMsg in res!!!";
            if (this.f81338e) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", str2);
        }
        if (!str.startsWith("fail") && !str.startsWith("ok")) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "api[%s] assert, argument [reason] must start with special prefix", k());
            if (this.f81338e) {
                throw new java.lang.IllegalArgumentException(format);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", format);
        }
        try {
            jSONObject.put(l(), k() + ":" + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errMsg, e=%s", e17);
        }
        return jSONObject.toString();
    }

    public final java.lang.String v(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, java.lang.String str, java.util.Map map) {
        if (!this.f81338e || 1492 > n()) {
            return com.tencent.mm.plugin.appbrand.utils.v3.d(tVar, map, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class)) == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT ? o("fail:convert native buffer parameter fail. native buffer exceed size limit.") : p(str, map);
        }
        throw new java.lang.IllegalArgumentException("makeReturnJsonWithNativeBuffer is deprecated for " + k());
    }

    public final java.lang.String w(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.util.Map map) {
        if (!this.f81338e || 1492 > n()) {
            return com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), map, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class)) == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT ? o("fail:convert native buffer parameter fail. native buffer exceed size limit.") : p(str, map);
        }
        throw new java.lang.IllegalArgumentException("makeReturnJsonWithNativeBuffer is deprecated for " + k());
    }

    public final java.lang.String x(com.tencent.mm.plugin.appbrand.jsapi.l lVar, jc1.d dVar, java.util.Map map) {
        if (com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), map, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class)) != com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
            return q(null, dVar, map);
        }
        java.lang.String str = android.text.TextUtils.isEmpty("fail:convert native buffer parameter fail. native buffer exceed size limit.") ? "fail:native buffer exceed size limit" : "fail:convert native buffer parameter fail. native buffer exceed size limit.";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        return u(str, jSONObject);
    }

    public java.nio.ByteBuffer y(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.v vVar, int i17) {
        return vVar.j0(i17, false);
    }
}
