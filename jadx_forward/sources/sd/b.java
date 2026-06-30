package sd;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public sd.d f488129a;

    /* renamed from: b, reason: collision with root package name */
    public od.g f488130b;

    public b(sd.c cVar) {
    }

    public void a() {
        c("", null);
    }

    public void b(java.lang.String str, java.util.Map map) {
        od.g gVar = this.f488130b;
        gVar.getClass();
        if (str == null) {
            str = "";
        }
        gVar.f426043g = str;
        org.json.JSONObject jSONObject = map != null ? new org.json.JSONObject(map) : null;
        gVar.f426044h = jSONObject;
        int i17 = gVar.f426041e;
        if (i17 == 0 && gVar.f426042f == 0) {
            return;
        }
        gVar.f426037a.a(new od.c(gVar.f426042f, i17, gVar.f426043g, jSONObject, false));
    }

    public void c(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f488130b.a(str, jSONObject);
    }

    public void d(java.util.Map map) {
        b("", map);
    }

    public void e(org.json.JSONObject jSONObject) {
        c("", jSONObject);
    }
}
