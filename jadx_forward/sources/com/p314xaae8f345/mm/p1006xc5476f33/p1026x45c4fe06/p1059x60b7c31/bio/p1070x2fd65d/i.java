package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d;

/* loaded from: classes7.dex */
public class i implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e f161409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j f161412e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j jVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f161412e = jVar;
        this.f161408a = z17;
        this.f161409b = eVar;
        this.f161410c = lVar;
        this.f161411d = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", "onResult");
        if (this.f161408a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j5) this.f161409b).a(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j jVar = this.f161412e;
        int i19 = this.f161411d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161410c;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartFaceAction", "mmOnActivityResult NULL data, appId[%s], callbackId[%d]", lVar.mo48798x74292566(), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.C(jVar, lVar, i19, null, "fail:internal error");
            return true;
        }
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(intent.getIntExtra("err_code", 0));
        int intExtra = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        int intExtra2 = intent.getIntExtra("countFace", 0);
        long longExtra = intent.getLongExtra("totalTime", 0L);
        int intExtra3 = intent.getIntExtra("err_type", 6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", "errCode:%s，scene:%s,countFace:%s,totalTime:%s,errorType:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra3));
        if (i17 != 63) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartFaceAction", "REQUEST_FACE_VERIFY_FOR_PAY resultCode: %d", java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 0, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, 0, java.lang.Integer.valueOf(a17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.C(jVar, lVar, i19, intent.getExtras(), "ok");
            return true;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 3, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, java.lang.Integer.valueOf(intExtra3), java.lang.Integer.valueOf(a17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.C(jVar, lVar, i19, intent.getExtras(), "fail");
            return true;
        }
        if (i18 != 0) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15711, java.lang.Integer.valueOf(intExtra), 2, java.lang.Integer.valueOf(intExtra2), java.lang.Long.valueOf(longExtra), 3, 1, java.lang.Integer.valueOf(a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.C(jVar, lVar, i19, intent.getExtras(), "cancel");
        return true;
    }
}
