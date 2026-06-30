package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes11.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f225697a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f225698b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public long f225699c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r f225700d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225701e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f225702f;

    public s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65372x7420eb55();
    }

    public static java.lang.Object a(java.lang.String str) {
        if (str.startsWith("{")) {
            return new org.json.JSONObject(str);
        }
        if (str.startsWith("[")) {
            return new org.json.JSONArray(str);
        }
        if (str.equals("true")) {
            return java.lang.Boolean.TRUE;
        }
        if (str.equals("false")) {
            return java.lang.Boolean.FALSE;
        }
        if (!str.equals("null") && !str.equals("undefined")) {
            return (!str.startsWith("\"") || str.length() < 2) ? str.indexOf(".") >= 0 ? java.lang.Double.valueOf(java.lang.Double.parseDouble(str)) : java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)) : str.substring(1, str.length() - 1);
        }
        return null;
    }

    public static java.lang.String b(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return str;
        }
        if (obj instanceof java.util.Map) {
            return new org.json.JSONObject((java.util.Map) obj).toString();
        }
        if (obj instanceof java.util.List) {
            return new org.json.JSONArray((java.util.Collection) obj).toString();
        }
        if (!(obj instanceof java.lang.String)) {
            return obj.toString();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put((java.lang.String) obj);
        java.lang.String jSONArray2 = jSONArray.toString();
        return jSONArray2.substring(1, jSONArray2.length() - 1);
    }

    public void c(long j17, int i17, java.lang.String str) {
        ((java.util.HashSet) this.f225697a).remove(java.lang.String.format("%d_%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65499xdd68ad86(this.f225699c, j17, i17, "json", str);
    }

    public void d(java.util.Map map) {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        int i17 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            strArr[i17] = (java.lang.String) entry.getKey();
            java.lang.String b17 = b(entry.getValue(), "");
            strArr2[i17] = b17;
            this.f225698b.put(strArr[i17], b17);
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65500xb4182f0b(this.f225699c, this.f225701e, strArr, strArr2);
    }
}
