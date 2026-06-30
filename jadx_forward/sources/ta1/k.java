package ta1;

/* loaded from: classes7.dex */
public class k implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.l f498168a;

    public k(ta1.l lVar) {
        this.f498168a = lVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.l lVar = this.f498168a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                lVar.f498172e.a(0, 0, "ok", jSONObject);
            } else {
                lVar.f498172e.a(1, optInt, java.lang.String.format("editorGetTrack failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            lVar.f498172e.a(1, -1, "editorGetTrack error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            lVar.f498172e.a(1, -1, "editorGetTrack error: " + e18.getMessage(), null);
        }
    }
}
