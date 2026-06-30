package b53;

/* loaded from: classes8.dex */
public class k extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.rk4 f18092a;

    public k(b53.l lVar, r45.rk4 rk4Var) {
        this.f18092a = rk4Var;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("itemId", this.f18092a.f384964d);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onCustomGameMenuClicked";
    }
}
