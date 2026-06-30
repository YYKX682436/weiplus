package ta1;

/* loaded from: classes7.dex */
public class u implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.v f498220a;

    public u(ta1.v vVar) {
        this.f498220a = vVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.v vVar = this.f498220a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                vVar.f498222e.a(0, 0, "ok", jSONObject);
            } else {
                vVar.f498222e.a(1, optInt, java.lang.String.format("editorRemove failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            vVar.f498222e.a(1, -1, "editorRemove error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            vVar.f498222e.a(1, -1, "editorRemove error: " + e18.getMessage(), null);
        }
    }
}
