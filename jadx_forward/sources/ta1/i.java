package ta1;

/* loaded from: classes7.dex */
public class i implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.j f498160a;

    public i(ta1.j jVar) {
        this.f498160a = jVar;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.j jVar = this.f498160a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            int optInt = jSONObject.optInt("errCode", 601);
            if (optInt == 0) {
                jVar.f498163e.a(0, 0, "ok", jSONObject);
            } else {
                jVar.f498163e.a(1, optInt, java.lang.String.format("editorCreate failed!: errCode: %d", java.lang.Integer.valueOf(optInt)), jSONObject);
            }
        } catch (org.json.JSONException e17) {
            jVar.f498163e.a(1, -1, "editorCreate error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            jVar.f498163e.a(1, -1, "editorCreate error: " + e18.getMessage(), null);
        }
    }
}
