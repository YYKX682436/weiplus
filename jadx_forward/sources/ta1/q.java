package ta1;

/* loaded from: classes7.dex */
public class q implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.r f498195a;

    public q(ta1.r rVar) {
        this.f498195a = rVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.r rVar = this.f498195a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                rVar.f498205e.a(0, 0, "ok", jSONObject);
            } else {
                rVar.f498205e.a(1, optInt, java.lang.String.format("editorRemoveTrack failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            rVar.f498205e.a(1, -1, "editorRemoveTrack error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            rVar.f498205e.a(1, -1, "editorRemoveTrack error: " + e18.getMessage(), null);
        }
    }
}
