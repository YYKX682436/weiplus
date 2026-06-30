package ta1;

/* loaded from: classes7.dex */
public class s implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.t f498207a;

    public s(ta1.t tVar) {
        this.f498207a = tVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.t tVar = this.f498207a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                tVar.f498218e.a(0, 0, "ok", jSONObject);
            } else {
                tVar.f498218e.a(1, optInt, java.lang.String.format("editorExport failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            tVar.f498218e.a(1, -1, "editorExport error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            tVar.f498218e.a(1, -1, "editorExport error: " + e18.getMessage(), null);
        }
    }
}
