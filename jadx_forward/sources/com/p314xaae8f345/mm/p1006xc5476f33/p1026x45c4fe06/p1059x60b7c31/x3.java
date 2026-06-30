package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f165436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b4 f165437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f165438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b4 b4Var, yz5.l lVar2) {
        super(1);
        this.f165436d = lVar;
        this.f165437e = b4Var;
        this.f165438f = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        r45.gh ghVar = (r45.gh) obj;
        yz5.l lVar = this.f165436d;
        if (ghVar == null) {
            lVar.mo146xb9724478("get contact fail response is null");
        } else {
            k91.w5.f387346b.getClass();
            try {
                byte[] mo14344x5f01b1f6 = ghVar.mo14344x5f01b1f6();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("CONTENT_KEY_BATCH_SYNC_SCENE", (java.lang.Integer) 107);
                contentValues.put("CONTENT_KEY_BATCH_SYNC_PROTO", mo14344x5f01b1f6);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().insert(k91.w5.f387345a, contentValues);
                z17 = true;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaAttrsContentResolver", "batchUpdateWithProto insert failed");
                z17 = false;
            }
            if (z17) {
                java.util.List a17 = k91.w5.f387346b.a(this.f165437e.f161361c, new java.lang.String[0]);
                if (a17 != null) {
                    this.f165438f.mo146xb9724478(a17);
                } else {
                    a17 = null;
                }
                if (a17 == null) {
                    lVar.mo146xb9724478("get contact fail");
                }
            } else {
                lVar.mo146xb9724478("update contacts fail");
            }
        }
        return jz5.f0.f384359a;
    }
}
