package ta1;

/* loaded from: classes7.dex */
public class i0 implements com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.j0 f498161a;

    public i0(ta1.j0 j0Var) {
        this.f498161a = j0Var;
    }

    @Override // com.p290xb772556d.p291xca4f91d6.C2827xce297dd6.MediaCallbacker
    /* renamed from: onResult */
    public void mo21053x57429edc(byte[] bArr) {
        ta1.j0 j0Var = this.f498161a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
            ta1.k0 k0Var = new ta1.k0(j0Var.f498167f);
            k0Var.f498169a = jSONObject.optLong("duration", 0L);
            k0Var.f498170b = jSONObject.optLong("size", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "hy: duration is %d, size is %d", java.lang.Long.valueOf(k0Var.f498169a), java.lang.Long.valueOf(k0Var.f498170b));
            j0Var.f498166e.a(0, 0, "ok", k0Var);
        } catch (org.json.JSONException e17) {
            j0Var.f498166e.a(1, -1, "analysis error: " + e17.getMessage(), null);
        } catch (java.lang.Exception e18) {
            j0Var.f498166e.a(1, -1, "analysis error: " + e18.getMessage(), null);
        }
    }
}
