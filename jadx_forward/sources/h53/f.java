package h53;

/* loaded from: classes8.dex */
public class f extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360577a;

    public f(h53.j jVar, java.lang.String str) {
        this.f360577a = str;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f360577a);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onJsCoreLifeChange";
    }
}
