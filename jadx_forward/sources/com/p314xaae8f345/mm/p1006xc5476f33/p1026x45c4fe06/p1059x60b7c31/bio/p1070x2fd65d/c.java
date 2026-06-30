package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* loaded from: classes7.dex */
public class c implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e f161399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d f161402e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d dVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f161402e = dVar;
        this.f161398a = z17;
        this.f161399b = eVar;
        this.f161400c = lVar;
        this.f161401d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f161398a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) this.f161399b).a(true);
        }
        int intExtra = intent != null ? intent.getIntExtra("err_code", 90199) : 90199;
        int i19 = this.f161401d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161400c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d dVar = this.f161402e;
        if (i17 == 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFaceAsyncBase", "requestWxFacePictureVerify errCode: %d", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "ok");
            } else if (intExtra == 90100) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "fail");
            }
            return true;
        }
        if (i17 != 1001) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "ok");
        } else if (intExtra == 90100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.d.C(dVar, lVar, i19, intent != null ? intent.getExtras() : null, "fail");
        }
        return true;
    }
}
