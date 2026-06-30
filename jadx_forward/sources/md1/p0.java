package md1;

/* loaded from: classes7.dex */
public class p0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f407313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ md1.q0 f407315g;

    public p0(md1.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f407315g = q0Var;
        this.f407312d = c0Var;
        this.f407313e = jSONObject;
        this.f407314f = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 122) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission requestCode is not for open voice api");
            return;
        }
        md1.q0 q0Var = this.f407315g;
        int i18 = this.f407314f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407312d;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission sys perm denied for open voice api");
            c0Var.a(i18, q0Var.o("fail:system permission denied"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission permission is grant for open voice api");
            q0Var.A(c0Var, this.f407313e, i18);
        }
    }
}
