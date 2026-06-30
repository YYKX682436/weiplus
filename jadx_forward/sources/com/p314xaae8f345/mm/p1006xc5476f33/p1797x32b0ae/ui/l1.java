package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes11.dex */
public class l1 extends java.util.HashMap {
    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.o1 o1Var) {
        put("string", "native string");
        put("int", 123);
        put("double", java.lang.Double.valueOf(123.12d));
        put("list", java.util.Arrays.asList(1, 2, 3, "abc"));
        put("map", new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.k1(this));
        try {
            put("json", new org.json.JSONObject("{'int': 2, 'obj': {'string':'abc', 'double':123.12}}"));
            put("jsonarray", new org.json.JSONArray("[123, {'string':'abc', 'double':123.12}]"));
        } catch (org.json.JSONException unused) {
        }
        put("bool", java.lang.Boolean.TRUE);
        put("null", null);
    }
}
