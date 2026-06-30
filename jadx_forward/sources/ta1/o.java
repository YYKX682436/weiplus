package ta1;

/* loaded from: classes7.dex */
public class o implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.p f498184a;

    public o(ta1.p pVar) {
        this.f498184a = pVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.p pVar = this.f498184a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                pVar.f498191e.a(0, 0, "ok", jSONObject);
            } else {
                pVar.f498191e.a(1, optInt, java.lang.String.format("editorUpdateTrack failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            pVar.f498191e.a(1, -1, "editorUpdateTrack error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            pVar.f498191e.a(1, -1, "editorUpdateTrack error: " + e18.getMessage(), null);
        }
    }
}
