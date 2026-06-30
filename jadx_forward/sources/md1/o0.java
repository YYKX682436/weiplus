package md1;

/* loaded from: classes7.dex */
public class o0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f407307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ md1.q0 f407309g;

    public o0(md1.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f407309g = q0Var;
        this.f407306d = c0Var;
        this.f407307e = jSONObject;
        this.f407308f = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 121) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission requestCode is not for open voice api");
            return;
        }
        md1.q0 q0Var = this.f407309g;
        int i18 = this.f407308f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407306d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission sys perm denied for open voice api");
            c0Var.a(i18, q0Var.o("fail:system permission denied"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission permission is grant for open voice api");
            q0Var.A(c0Var, this.f407307e, i18);
        }
    }
}
