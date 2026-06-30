package k91;

/* loaded from: classes7.dex */
public class f extends k91.q {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f387110t;

    /* renamed from: u, reason: collision with root package name */
    public final k91.j f387111u;

    public f(org.json.JSONObject jSONObject, k91.q qVar, k91.j jVar) {
        super(jSONObject, qVar, false);
        org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("window") : null;
        this.f387110t = optJSONObject != null ? optJSONObject.optString("handleWebviewPreload") : "";
        this.f387111u = k91.j.a(optJSONObject, jVar);
    }
}
