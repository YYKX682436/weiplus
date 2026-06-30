package bu;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f106006a = new java.util.LinkedHashMap();

    public static final bu.b a(int i17) {
        bu.b bVar = new bu.b();
        bVar.f106007a = 3;
        java.lang.String jSONObject = new org.json.JSONObject().put("errCode", i17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        bVar.f106008b = jSONObject;
        return bVar;
    }

    public static final bu.b b(int i17) {
        bu.b bVar = new bu.b();
        bVar.f106007a = 2;
        java.lang.String jSONObject = new org.json.JSONObject().put("errCode", i17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        bVar.f106008b = jSONObject;
        return bVar;
    }

    public static final bu.b c(int i17, int i18, java.lang.String str, int i19) {
        bu.b bVar = new bu.b();
        bVar.f106007a = 5;
        org.json.JSONObject put = new org.json.JSONObject().put("errCode", i17).put("errType", i18);
        if (str == null) {
            str = "";
        }
        java.lang.String jSONObject = put.put("errMsg", str).put("cgiType", i19).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        bVar.f106008b = jSONObject;
        return bVar;
    }

    public static final bu.b d(int i17) {
        bu.b bVar = new bu.b();
        bVar.f106007a = 1;
        java.lang.String jSONObject = new org.json.JSONObject().put("errCode", i17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        bVar.f106008b = jSONObject;
        return bVar;
    }

    public static final void e(long j17, bu.b bVar) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = f106006a;
        if (bVar == null) {
            bVar = new bu.b();
        }
        map.put(valueOf, bVar);
    }
}
