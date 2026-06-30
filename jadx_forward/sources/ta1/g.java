package ta1;

/* loaded from: classes7.dex */
public class g implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.h f498152a;

    public g(ta1.h hVar) {
        this.f498152a = hVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.h hVar = this.f498152a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                hVar.f498156e.a(0, 0, "ok", jSONObject);
            } else {
                hVar.f498156e.a(1, optInt, java.lang.String.format("remux failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            hVar.f498156e.a(1, -1, "remux error: " + e17.getMessage(), new org.json.JSONObject());
        } catch (java.lang.Exception e18) {
            hVar.f498156e.a(1, -1, "remux error: " + e18.getMessage(), new org.json.JSONObject());
        }
    }
}
