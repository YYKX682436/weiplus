package vc1;

/* loaded from: classes13.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static double f516491a = -85.0d;

    /* renamed from: b, reason: collision with root package name */
    public static double f516492b = -1000.0d;

    /* renamed from: c, reason: collision with root package name */
    public static double f516493c = -85.0d;

    /* renamed from: d, reason: collision with root package name */
    public static double f516494d = -1000.0d;

    public static double a(double d17, double d18) {
        double d19;
        f516493c = d17;
        f516494d = d18;
        double d27 = f516491a;
        if (d27 != -85.0d) {
            double d28 = f516492b;
            if (d28 != -1000.0d) {
                d19 = (java.lang.Math.atan2(d18 - d28, d17 - d27) * 180.0d) / 3.141592d;
                f516491a = f516493c;
                f516492b = f516494d;
                return d19;
            }
        }
        d19 = 0.0d;
        f516491a = f516493c;
        f516492b = f516494d;
        return d19;
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        int c17 = c(jSONObject);
        if (c17 == -1) {
            return "invalid_map_id";
        }
        return lVar.mo50260x9f1221c2() + "&" + c17;
    }

    public static int c(org.json.JSONObject jSONObject) {
        try {
            return jSONObject.optInt("mapId");
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static int d(java.util.Map map, java.lang.String str, int i17) {
        java.lang.Integer valueOf;
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.Integer) {
            valueOf = (java.lang.Integer) obj;
        } else if (obj instanceof java.lang.Number) {
            valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        } else {
            if (obj instanceof java.lang.String) {
                try {
                    valueOf = java.lang.Integer.valueOf((int) java.lang.Double.parseDouble((java.lang.String) obj));
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i17;
    }

    public static java.lang.String e(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj = map.get(str);
        java.lang.String valueOf = obj instanceof java.lang.String ? (java.lang.String) obj : obj != null ? java.lang.String.valueOf(obj) : null;
        return valueOf != null ? valueOf : str2;
    }

    public static double f(double d17, double d18, double d19, double d27) {
        double d28 = (d17 * 3.141592653589793d) / 180.0d;
        double d29 = (d19 * 3.141592653589793d) / 180.0d;
        return java.lang.Math.round(((java.lang.Math.asin(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.sin((d28 - d29) / 2.0d), 2.0d) + ((java.lang.Math.cos(d28) * java.lang.Math.cos(d29)) * java.lang.Math.pow(java.lang.Math.sin((((d18 - d27) * 3.141592653589793d) / 180.0d) / 2.0d), 2.0d)))) * 2.0d) * 6378137.0d) * 10000.0d) / com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
    }
}
