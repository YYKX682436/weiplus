package dk2;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.b f314761a = new dk2.b();

    public final java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            lo0.a0 a0Var = ko0.l.f391403a.b().f401613e;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (lo0.k kVar : a0Var.f401487e) {
                jSONObject2.put(kVar.f401551a, a06.d.a(kVar.f401565o * 100.0d));
            }
            jSONObject.put("type", a0Var.f401483a);
            jSONObject.put("result", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            return r26.i0.t(jSONObject3, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BeautySuitDataManager", e17.toString());
            return "";
        }
    }
}
