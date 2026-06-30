package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* loaded from: classes7.dex */
public class e implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e f161404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.f f161407e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.f fVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f161407e = fVar;
        this.f161403a = z17;
        this.f161404b = eVar;
        this.f161405c = lVar;
        this.f161406d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (this.f161403a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) this.f161404b).a(true);
        }
        int intExtra = intent != null ? intent.getIntExtra("err_code", 90199) : 90199;
        if (i17 != 1000 && i17 != 1001) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiFaceAsyncBaseV2", "requestFacialVerify V2 errCode: %d", java.lang.Integer.valueOf(intExtra));
        int i19 = this.f161406d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161405c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.f fVar = this.f161407e;
        if (intExtra == 0) {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "ok");
        } else if (intExtra == 90100) {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "cancel");
        } else {
            fVar.C(lVar, i19, intent != null ? intent.getExtras() : null, "fail");
        }
        return true;
    }
}
