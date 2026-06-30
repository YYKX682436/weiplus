package nu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONArray f421718a = new org.json.JSONArray();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f421719b = new java.lang.Object();

    public final void a(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("aid", i17);
        jSONObject.put("td", this.f421718a.length() + 1);
        if (this.f421718a.toString().length() + jSONObject.toString().length() <= 1000) {
            synchronized (this.f421719b) {
                this.f421718a.put(jSONObject);
            }
        }
    }

    public final java.lang.String b() {
        java.lang.String t17;
        synchronized (this.f421719b) {
            java.lang.String jSONArray = this.f421718a.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
            t17 = r26.i0.t(jSONArray, ",", ";", false);
        }
        return t17;
    }
}
