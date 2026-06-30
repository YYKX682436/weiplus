package k91;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public k91.i f387155a;

    public static k91.j a(org.json.JSONObject jSONObject, k91.j jVar) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("rendererOptions")) == null) {
            return jVar;
        }
        k91.j jVar2 = new k91.j();
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("skyline");
        if (optJSONObject2 != null) {
            k91.i iVar = jVar != null ? jVar.f387155a : null;
            k91.i iVar2 = new k91.i();
            jVar2.f387155a = iVar2;
            iVar2.f387145a = optJSONObject2.optBoolean("disableABTest", iVar != null && iVar.f387145a);
            jVar2.f387155a.f387146b = optJSONObject2.optString("sdkVersionBegin", iVar != null ? iVar.f387146b : "");
            jVar2.f387155a.f387147c = optJSONObject2.optString("sdkVersionEnd", iVar != null ? iVar.f387147c : "");
            jVar2.f387155a.f387148d = optJSONObject2.optString("androidVersionBegin", iVar != null ? iVar.f387148d : "");
            jVar2.f387155a.f387149e = optJSONObject2.optString("androidVersionEnd", iVar != null ? iVar.f387149e : "");
        }
        return jVar2;
    }
}
