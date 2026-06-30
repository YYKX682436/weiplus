package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class m3 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 f163472g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3 f163473h;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3 z3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910) {
        this.f163473h = z3Var;
        this.f163469d = lVar;
        this.f163470e = jSONObject;
        this.f163471f = i17;
        this.f163472g = c12162xc2b17910;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910 = this.f163472g;
        org.json.JSONObject jSONObject = this.f163470e;
        int i18 = this.f163471f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3 z3Var = this.f163473h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163469d;
        if (i17 == 145) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, c12162xc2b17910);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "requestExternalStoragePermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.mo48798x74292566());
                z3Var.f163700g = false;
                return;
            }
        }
        if (i17 == 119) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "requestCameraPermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, c12162xc2b17910);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.mo48798x74292566());
                z3Var.f163700g = false;
                return;
            }
        }
        if (i17 == 120) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "requestAudioPermission permission is grant for choose media");
                z3Var.C(lVar, jSONObject, i18, c12162xc2b17910);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission sys perm denied for choose media");
                lVar.a(i18, z3Var.o("fail:system permission denied"));
                si1.e1.c(lVar.mo48798x74292566());
                z3Var.f163700g = false;
            }
        }
    }
}
